package monkeyspin;

import monkeyspin.platform.*;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Vector;

public final class GameCanvas extends ScreenCanvas {
   private static GameApp field_739;
   private static boolean field_740;
   private static boolean field_741;
   private static int field_742;
   private static String field_743;
   private static Img field_744;
   private static int field_745;
   private static int field_746;
   private static String field_747;
   private static Img field_748;
   private static int field_749;
   private static Hashtable field_750;
   private static Fnt field_751;
   private static boolean field_752;
   private static GameCanvas field_753;
   private static int[] field_754;
   private static int field_755;
   private static int[] field_756;
   private static int field_757;
   private static int[] field_758;
   private static int field_759;
   private static int[] field_760;
   private static int field_761;
   private static boolean field_762 = false;
   private static boolean field_763 = false;
   private static boolean field_764 = false;
   private static BitmapFont field_765;
   private static int field_766;
   private static final String[] field_767 = new String[]{"audio/midi", "audio/wav", "audio/amr", "audio/mpeg"};
   private static Hashtable field_768;
   private static SoundPlayer field_769;
   private static int field_770;
   private static int field_771;
   private static int field_772;
   private static String field_773;
   private static byte[] field_774;
   private static int field_775;
   private static String[] field_776;
   private static String[][] field_777;
   private static String[] field_778;
   private static boolean field_779;
   private static PromoScreen field_780;

   public GameCanvas() {
      field_754 = new int[5];
      field_756 = new int[5];
      field_758 = new int[5];
      field_760 = new int[5];
      field_755 = -1;
      field_757 = -1;
      field_759 = -1;
      field_761 = -1;
   }

   protected final void keyPressed(int var1) {
      if (++field_755 >= field_754.length) {
         int[] var2 = field_754;
         field_754 = new int[field_754.length + 1];
         System.arraycopy(var2, 0, field_754, 0, var2.length);
      }

      field_754[field_755] = var1;
      if (field_757 < 4) {
         field_756[++field_757] = var1;
      }

      field_762 = true;
   }

   private static void method_362(SoundPlayer var0) {
      if (var0 != null) {
         try {
            var0.stop();
            return;
         } catch (Exception var1) {
         }
      }
   }

   public static int method_363() {
      return field_753.getHeight();
   }

   public static DataInputStream method_364(int var0) {
      return var0 != -1 ? new DataInputStream(new ByteArrayInputStream(method_366(var0))) : null;
   }

   public static byte[] method_365(String var0) {
      GameApp.field_12 = true;
      return Storage.read(var0);
   }

   public static byte[] method_366(int var0) {
      byte[] var1 = null;
      if (var0 != -1) {
         int var3 = var0 >>> 16;
         var0 &= 65535;
         String var10000 = "r" + var3;
         Object var4 = null;
         method_385(var10000);
         var1 = method_370(var0);
      }

      return var1;
   }

   private static SoundPlayer method_367(int var0, int var1, int var2) {
      SoundPlayer var3 = null;

      try {
         if ((var3 = (SoundPlayer)field_768.get(new Integer(var0))) == null || var3.getState() == SoundPlayer.CLOSED) {
            var3 = method_399(var0);
         }

         if (var3.getState() != SoundPlayer.PREFETCHED) {
            var3.prefetch();
         }

         var3.setLoopCount(var1);
         var3.setVolume(var2 * 20);
         var3.start();
      } catch (Exception var4) {
      }

      return var3;
   }

   public static int method_368() {
      return field_775;
   }

   public static String[][] method_369() {
      return field_777;
   }

   private static byte[] method_370(int var0) {
      int var1 = field_774.length;
      int var2 = method_396(4);
      int var3 = method_396(8 + (var0 << 2));
      if (var0 == var2 - 1) {
         var1 -= var3;
      } else {
         var1 = method_396(8 + (var0 << 2) + 4) - var3;
      }

      byte[] var4 = new byte[var1];
      System.arraycopy(field_774, var3, var4, 0, var1);
      return var4;
   }

   public static String method_371(String var0, String[] var1) {
      try {
         if (var1.length == 1) {
            var0 = method_395(var0, "%U", var1[0]);
         } else {
            for (int var2 = 0; var2 < var1.length; var2++) {
               var0 = method_395(var0, "%" + var2 + "U", var1[var2]);
            }
         }
      } catch (Exception var3) {
      }

      return var0;
   }

   public static void method_372() {
      if (field_762) {
         for (int var0 = 0; var0 <= field_757; var0++) {
            method_403(3);
            int var1;
            if ((var1 = field_756[var0]) == -6) {
               if (field_742 != -1) {
                  field_739.method_2(field_742, 3);
               }
            } else if (var1 == -7) {
               if (field_746 != -1) {
                  field_739.method_2(field_746, 3);
               }
            } else {
               field_739.method_2(var1, 0);
            }
         }

         field_762 = false;
         field_757 = -1;
      }

      if (field_763) {
         for (int var4 = 0; var4 <= field_759; var4++) {
            int var6 = field_758[var4];
            int var2 = 0;

            for (int var3 = 0; var3 <= field_755; var3++) {
               if (field_754[var3] == var6) {
                  var2++;
               }

               if (var3 + var2 <= field_755) {
                  field_754[var3] = field_754[var3 + var2];
               }
            }

            field_755 -= var2;
            if (var6 != -6 && var6 != -7) {
               field_739.method_2(var6, 1);
            }
         }

         field_763 = false;
         field_759 = -1;
      }

      if (field_764) {
         for (int var5 = 0; var5 <= field_761; var5++) {
            int var7 = field_760[var5];
            field_739.method_2(var7, 2);
         }

         field_764 = false;
         field_761 = -1;
      }
   }

   public static void method_373() {
      field_752 = true;
      field_753.repaint();
      field_753.serviceRepaints();
      field_752 = false;
   }

   public static void method_374() {
      field_779 = true;
   }

   protected final void showNotify() {
      try {
         if (field_741) {
            field_741 = false;
         } else {
            field_739.startApp();
         }
      } catch (Throwable var1) {
      }
   }

   public static Img method_375(int var0) {
      Img var1 = null;
      if (var0 != -1) {
         byte[] var2;
         var1 = Img.createImage(var2 = method_366(var0), 0, var2.length);
      }

      return var1;
   }

   public static void method_376() {
      field_742 = -1;
      field_744 = null;
      field_743 = null;
      field_746 = -1;
      field_748 = null;
      field_747 = null;
   }

   public static int method_377(int var0) {
      if (var0 >= 97 && var0 <= 122 || var0 >= 65 && var0 <= 90) {
         int var1 = var0;
         int var10000;
         if (var0 >= 48 && var0 <= 57) {
            var10000 = var0 - 48;
         } else if (var0 >= 97 && var0 <= 122 || var0 >= 65 && var0 <= 90) {
            if (var0 >= 65 && var0 <= 90) {
               var1 = var0 + 32;
            }

            var10000 = var1 == 114
               ? 1
               : (
                  var1 == 116
                     ? 2
                     : (
                        var1 == 121
                           ? 3
                           : (
                              var1 == 102
                                 ? 4
                                 : (var1 == 103 ? 5 : (var1 == 104 ? 6 : (var1 == 118 ? 7 : (var1 == 98 ? 8 : (var1 == 110 ? 9 : (var1 == 109 ? 0 : -1))))))
                           )
                     )
               );
         } else {
            var10000 = -1;
         }

         var1 = var10000;
         if (var10000 != -1) {
            var0 = var1 + 48;
         }
      }

      if (var0 == 74 || var0 == 106) {
         var0 = 35;
      }

      if (var0 == 85 || var0 == 117) {
         var0 = 42;
      }

      if ((var0 < 48 || var0 > 57) && var0 != 42 && var0 != 35) {
         int var4 = 0;

         try {
            var4 = field_753.getGameAction(var0);
         } catch (Exception var2) {
         }

         if (var4 != 0) {
            int var5;
            if (var4 == 8) {
               var5 = 53;
            } else if (var4 == 1) {
               var5 = 50;
            } else if (var4 == 6) {
               var5 = 56;
            } else if (var4 == 2) {
               var5 = 52;
            } else if (var4 == 5) {
               var5 = 54;
            } else {
               var5 = 0;
            }

            return var5;
         } else {
            return 0;
         }
      } else {
         return var0;
      }
   }

   public static int method_378() {
      return field_766;
   }

   public static int method_379() {
      return field_771;
   }

   public static void method_380(int var0, int var1, Img var2, int var3) {
      field_750.put(new Integer(0 | var0), new Integer(var1));
      field_750.put(new Integer(16777216 | var0), method_381(var1));
      if (var2 != null) {
         field_750.put(new Integer(33554432 | var0), var2);
      }

      field_750.put(new Integer(50331648 | var0), new Integer(var3));
   }

   public static String method_381(int var0) {
      String var1 = null;
      if (var0 == -1) {
         return null;
      } else if (var0 == -2) {
         return "";
      } else {
         try {
            int var2 = var0 >>> 16;
            var0 &= 65535;
            method_385("l" + field_775 + "_" + var2);
            byte[] var5 = method_370(var0);
            DataInputStream var6;
            var1 = (var6 = new DataInputStream(new ByteArrayInputStream(var5))).readUTF();
            var6.close();
         } catch (Exception var3) {
         }

         return var1;
      }
   }

   public static int method_382(int var0) {
      return (Integer)field_750.get(new Integer(50331648 | var0));
   }

   public static int method_383() {
      return field_753.getWidth();
   }

   public static void method_384(int var0, int var1) {
      if (field_771 != 0 && var0 != -1) {
         method_398();
         field_772 = var1;
         field_769 = method_367(var0, var1, field_771);
         field_770 = var0;
      }
   }

   private static boolean method_385(String var0) {
      boolean var1 = false;
      if (var0.equals(field_773)) {
         var1 = true;
      } else {
         GameApp.field_12 = true;
         field_773 = null;
         field_774 = null;

         try {
            field_774 = new byte[4];
            InputStream var2;
            if ((var2 = GameCanvas.class.getResourceAsStream("/" + var0)) != null) {
               var2.read(field_774, 0, 4);
               int var3 = method_396(0);
               int var4 = 4;
               field_774 = new byte[var3];

               while (var4 < var3) {
                  var4 += var2.read(field_774, var4, var3 - var4);
               }

               var2.close();
               field_773 = var0;
               var1 = true;
            }
         } catch (Exception var5) {
         }
      }

      return var1;
   }

   public static String method_386(int var0) {
      String var3 = null;
      int[][] var1 = new int[][]{{-1, -2, -2, -2, -2}, {-1, -2, -2, -2, -1}, {-1, 278, -2, 279, 280}};
      boolean var2 = false;
      String var5;
      if ((var5 = field_778[21]) != null) {
         var0 = Integer.parseInt(var5);
         if ((var3 = method_381(var1[2][var0])) != null && var3.length() == 1) {
            var3 = null;
         }
      }

      return var3 != null ? var3 : "";
   }

   public static void method_387(BitmapFont var0) {
      field_765 = var0;
      int var1;
      if (var0 != null && (var1 = field_765.method_313() + 2 + 2) > field_766) {
         field_766 = var1;
      }
   }

   public static void method_388(int var0, int var1) {
      String var2 = (String)field_750.get(new Integer(16777216 | var0));
      Img var3 = (Img)field_750.get(new Integer(33554432 | var0));
      int var4 = (Integer)field_750.get(new Integer(50331648 | var0));
      boolean var5 = true;
      int var6 = -1;
      if (var1 == 0) {
         if (var4 != 0 && var4 != 1) {
            if (field_746 == -1) {
               var5 = false;
            } else if (var4 > field_749) {
               var6 = field_746;
               var5 = false;
            }
         } else if (field_742 != -1) {
            if (var4 < field_745) {
               var6 = field_742;
            } else {
               var5 = false;
            }
         }

         if (var6 != -1) {
            method_376();
            if (var5) {
               method_388(var6, 3);
            } else {
               method_388(var6, 1);
            }
         }
      } else if (var1 != 1) {
         var5 = false;
      }

      if (var5) {
         field_742 = var0;
         field_744 = var3;
         field_743 = var2;
         field_745 = var4;
      } else {
         field_746 = var0;
         field_748 = var3;
         field_747 = var2;
         field_749 = var4;
      }
   }

   public static void method_389() {
      if (field_769 != null) {
         method_362(field_769);
      }
   }

   public static void method_390(int var0) {
      field_775 = var0;
   }

   public static void method_391(boolean var0) {
      field_740 = false;
      field_741 = true;
      GameCanvas var1 = field_753;
      Host.setCurrent(var1);
   }

   public static void method_392() {
      method_362(null);
   }

   protected final void keyRepeated(int var1) {
      if (var1 != -6 && var1 != -7) {
         if (field_761 < 4) {
            field_760[++field_761] = var1;
         }

         field_764 = true;
      }
   }

   public final void paint(Gfx var1) {
      if (field_752) {
         field_739.method_0(var1);
         int var6 = field_753.getWidth();
         int var2 = field_753.getHeight();
         var1.setClip(0, 0, var6, var2);
         var2 -= 2;
         var1.setFont(field_751);
         if (field_742 != -1) {
            if (field_744 != null) {
               var1.drawImage(field_744, 2, var2 - field_744.getHeight(), 20);
            } else if (field_765 != null) {
               field_765.method_314(var1, field_743, 2, var2, 36);
            } else {
               boolean var3 = false;
               int var4 = var2 - 1;
               var1.setColor(0);
               var1.drawString(field_743, 2, var4, 36);
               var1.drawString(field_743, 3, var4 - 1, 36);
               var1.drawString(field_743, 4, var4, 36);
               var1.drawString(field_743, 3, var4 + 1, 36);
               var1.setColor(16777215);
               var1.drawString(field_743, 3, var4, 36);
            }
         }

         if (field_746 != -1) {
            if (field_748 != null) {
               var1.drawImage(field_748, var6 - 2 - field_748.getWidth(), var2 - field_748.getHeight(), 20);
               return;
            }

            if (field_765 != null) {
               field_765.method_314(var1, field_747, field_753.getWidth() - 2 - field_765.method_311(field_747), var2, 36);
               return;
            }

            int var8 = var6 - 2;
            int var9 = var2 - 1;
            var1.setColor(0);
            var1.drawString(field_747, var8 - 1, var9, 40);
            var1.drawString(field_747, var8, var9 - 1, 40);
            var1.drawString(field_747, var8 + 1, var9, 40);
            var1.drawString(field_747, var8, var9 + 1, 40);
            var1.setColor(16777215);
            var1.drawString(field_747, var8, var9, 40);
         }
      }
   }

   protected final void keyReleased(int var1) {
      int var3 = 0;

      for (int var2 = 0; var2 <= field_755; var2++) {
         if (field_754[var2] == var1) {
            var3++;
         }

         if (var2 + var3 <= field_755) {
            field_754[var2] = field_754[var2 + var3];
         }
      }

      field_755 -= var3;
      if (field_759 < 4) {
         field_758[++field_759] = var1;
      }

      field_763 = true;
   }

   public static void method_393(String var0, byte[] var1, int var2) {
      GameApp.field_12 = true;
      if (!field_779 || var2 == 1) {
         if (var1 != null) {
            Storage.write(var0, var1);
         } else {
            Storage.delete(var0);
         }
      }
   }

   public static void method_394(int var0) {
      field_771 = var0;
      if (var0 == 0) {
         method_398();
      } else {
         method_362(field_769);
         if (field_771 != 0 && field_769 != null) {
            field_769 = method_367(field_770, field_772, field_771);
         }
      }
   }

   private static String method_395(String var0, String var1, String var2) {
      int var3;
      return (var3 = var0.indexOf(var1)) >= 0 ? var0.substring(0, var3) + var2 + var0.substring(var3 + var1.length()) : var0;
   }

   private static int method_396(int var0) {
      return (field_774[var0] & 0xFF) << 24 | (field_774[var0 + 1] & 0xFF) << 16 | (field_774[var0 + 2] & 0xFF) << 8 | field_774[var0 + 3] & 0xFF;
   }

   public static void method_397(GameApp var0) {
      if (field_753 == null) {
         field_753 = new GameCanvas();
      }

      field_739 = var0;
   }

   public static void method_398() {
      method_362(field_769);
      field_770 = -1;
      field_769 = null;
   }

   protected final void hideNotify() {
      try {
         field_739.pauseApp();
      } catch (Throwable var1) {
      }
   }

   private static SoundPlayer method_399(int var0) {
      try {
         byte[] var10000 = method_366(var0);
         int var10002;
         switch (var0) {
            case 131080:
            case 196608:
               var10002 = 1;
               break;
            default:
               var10002 = 0;
         }

         return SoundPlayer.create(var10000, field_767[var10002]);
      } catch (Exception var1) {
         return null;
      }
   }

   public static void method_400() {
      GameApp.field_12 = true;
      field_778 = new String[24];

      try {
         InputStream var0;
         if ((var0 = GameCanvas.class.getResourceAsStream("/p")) != null) {
            DataInputStream var1 = new DataInputStream(var0);

            try {
               while (true) {
                  int var9 = var1.readByte();
                  field_778[var9 - 1] = var1.readUTF();
               }
            } catch (EOFException var5) {
               var1.close();
            }
         }
      } catch (Exception var6) {
      }

      for (int var7 = 1; var7 <= 24; var7++) {
         String var10;
         if ((var10 = System.getProperty("DCHOC-" + var7)) != null) {
            field_778[var7 - 1] = var10;
         }
      }

      int var8 = 0;
      Vector var11 = new Vector();

      do {
         boolean var2 = false;
         field_775 = var8;
         var11.addElement(method_381(0));
         var11.addElement(method_381(1));
         var11.addElement(method_381(3));
      } while (method_385("l" + ++var8 + "_0"));

      field_777 = new String[var8][2];
      field_776 = new String[var8];
      int var12 = 0;
      int var3 = 0;

      for (int var4 = 0; var4 < var8; var4++) {
         field_777[var4][0] = (String)var11.elementAt(var12++);
         field_776[var4] = (String)var11.elementAt(var12++);
         if (field_776[var4].equals(field_778[6])) {
            var3 = var4;
         }

         field_777[var4][1] = (String)var11.elementAt(var12++);
      }

      field_775 = var3;
      field_750 = new Hashtable();
      field_742 = -1;
      field_746 = -1;
      field_766 = (field_751 = Fnt.getFont(32, 1, 8)).getHeight() + 2 + 2 + 2;
      field_768 = new Hashtable();
   }

   public static void method_401(String var0) {
      field_750.put(new Integer(16777216), var0);
      if (field_742 == 0) {
         field_743 = var0;
      }

      if (field_746 == 0) {
         field_747 = var0;
      }
   }

   public static String method_402(int var0) {
      return field_778[var0 - 1];
   }

   public static void method_403(int var0) {
      if (var0 == 0) {
         for (int var1 = 0; var1 <= field_755; var1++) {
            field_739.method_2(field_754[var1], 1);
         }

         field_755 = -1;
      }
   }

   public static PromoScreen method_404() {
      if (field_780 == null) {
         field_780 = new PromoScreen();
      }

      return field_780;
   }

   static {
      String[] var10000 = new String[]{".mid", ".wav", ".amr", ".mp3"};
      char[] var0 = new char[]{'#', '−', '-'};
   }
}
