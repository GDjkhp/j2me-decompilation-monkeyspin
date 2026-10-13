package monkeyspin;

import monkeyspin.platform.*;

import java.util.Vector;

public final class Assets {
   private static int[] field_726;
   private static int[] field_727;
   private static int field_728;
   private static int field_729;
   private static Vector field_730 = new Vector(720, 720);
   private static short[] field_731 = new short[720];
   private static int[] field_732 = new int[720];
   private static byte[] field_733 = new byte[720];
   private static short[] field_734 = new short[720];
   private static int[][] field_735;
   private static Vector field_736;
   private static short[] field_737;
   private static int[] field_738;

   public Assets() {
   }

   public static void method_342() {
      byte[] var0;
      int var1;
      field_735 = new int[var1 = (var0 = GameCanvas.method_366(3538947)).length >> 2][];
      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         int var12 = var0[var2++] << 24 | (var0[var2++] & 255) << 16 | (var0[var2++] & 255) << 8 | var0[var2++] & 255;
         boolean var4 = false;
         byte[] var9;
         int var5 = (var9 = GameCanvas.method_366(var12)).length / 3;
         field_735[var3] = new int[var5];

         while (--var5 >= 0) {
            field_735[var3][var5] = var9[var5 * 3] << 16 | (var9[var5 * 3 + 1] & 255) << 8 | var9[var5 * 3 + 2] & 255 | 0xFF000000;
         }

         field_735[var3][0] = 0;
      }
   }

   public static void method_343() {
      field_729 = 0;
   }

   private static class_1 method_344(int var0, boolean var1) {
      field_729 = 0;
      return new class_1(var0, false);
   }

   public static class_1 method_345(int var0) {
      return method_344(var0, false);
   }

   public static class_1[] method_346(int[] var0) {
      boolean var3 = false;
      int[] var4 = var0;
      class_1[] var1 = new class_1[var0.length];

      for (int var2 = 0; var2 < var4.length; var2++) {
         var1[var2] = method_344(var4[var2], false);
      }

      return var1;
   }

   public static Img method_347(int var0) {
      Img var1 = null;
      if (var0 != -1) {
         byte[] var3;
         int var5 = (((var3 = GameCanvas.method_366(var0))[0] & 255) >> 4) + 1;
         int var2 = var3[1] << 24 | (var3[2] & 255) << 16 | (var3[3] & 255) << 8 | var3[4] & 255;
         var0 = var3[5] & 255;
         var1 = method_351(var2, var0, 0, var5 << 10);
      }

      return var1;
   }

   public static void method_348(int var0, int var1, int var2, int var3, boolean var4, int[] var5) {
      boolean var6 = true;
      int var7 = 0;
      var5[1] = 0;
      if (var1 == 255) {
         var7 = var2;
         var6 = false;
      }

      int var8 = var3 - 1 << 8 | var7;
      int var9;
      if ((var9 = method_353(var0, var1, var8)) != -1) {
         var5[0] = var9;
         if (var6) {
            var5[1] = var2;
         }
      } else {
         if ((var9 = method_353(-1, 0, 0)) == -1) {
            if ((var9 = field_730.size()) == field_732.length) {
               int[] var10 = new int[var9 << 1];
               byte[] var11 = new byte[var9 << 1];
               short[] var12 = new short[var9 << 1];
               short[] var13 = new short[var9 << 1];
               System.arraycopy(field_732, 0, var10, 0, var9);
               System.arraycopy(field_733, 0, var11, 0, var9);
               System.arraycopy(field_731, 0, var12, 0, var9);
               System.arraycopy(field_734, 0, var13, 0, var9);
               field_732 = var10;
               field_733 = var11;
               field_731 = var12;
               field_734 = var13;
            }

            field_731[var9] = 0;
         }

         field_732[var9] = var0;
         field_733[var9] = (byte)var1;
         field_734[var9] = (short)var8;
         if (var9 == field_730.size()) {
            field_730.addElement(null);
         }

         if (var4) {
            field_730.setElementAt(method_351(var0, var1, var7, var3 << 10), var9);
         } else {
            if (field_727 == null) {
               field_727 = new int[3600];
            }

            if ((var8 = field_728 * 5) == field_727.length) {
               int[] var21 = new int[field_727.length << 1];
               System.arraycopy(field_727, 0, var21, 0, var8);
               field_727 = var21;
            }

            field_727[var8] = var9;
            field_727[var8 + 1] = var0;
            field_727[var8 + 2] = var1;
            field_727[var8 + 3] = var7;
            field_727[var8 + 4] = var3;
            field_728++;

            while (var8 > 0 && field_727[var8 + 1] < field_727[var8 + 1 - 5]) {
               int var10002 = var8 - 5;
               int var4count = 5;
               var3 = var10002;
               var1 = var8;

               for (int[] var14 = field_727; --var4count >= 0; var3++) {
                  var7 = var14[var1];
                  var14[var1] = var14[var3];
                  var14[var3] = var7;
                  var1++;
               }

               var8 -= 5;
            }
         }

         var5[0] = var9;
         if (var6) {
            var5[1] = var2;
         }
      }
   }

   public static int method_349() {
      return field_728;
   }

   public static void method_350() {
      int var0 = field_729 * 5;
      int var1;
      if (method_358(var1 = field_727[var0++]) == null) {
         int var2 = field_727[var0++];
         int var3 = field_727[var0++];
         int var4 = field_727[var0++];
         var0 = field_727[var0];
         field_730.setElementAt(method_351(var2, var3, var4, var0 << 10), var1);
      }

      if (++field_729 == field_728) {
         field_727 = null;
         field_729 = 0;
         field_728 = 0;
      }
   }

   private static Img method_351(int var0, int var1, int var2, int var3) {
      if (var1 == 253) {
         return GameCanvas.method_375(var0);
      } else {
         byte[] var9;
         int var4 = (var9 = GameCanvas.method_366(var0))[0] << 8 | var9[1] & 255;
         int[] var7 = null;
         int var5;
         int var8;
         int var11;
         if (var1 != 254 && var1 != 255) {
            var5 = 10;
            var11 = (var9.length - 10) / var4;
            var7 = field_735[var1];
            var8 = -1;
         } else {
            var8 = var1;
            var5 = 2;
            var11 = (var9.length - 2) / var4;
            if (var1 == 254) {
               var11 /= 3;
            } else {
               var11 >>= 2;
            }
         }

         byte[] var10;
         return Img.createImage(var10 = method_354(var7, var9, var4, var11, var8, var5, var2, var3), 0, var10.length);
      }
   }

   public static void method_352(class_1 var0, int var1) {
      if (var0 != null) {
         int[][] var3 = null;
         int var2 = var0.field_29.length;

         while (--var2 >= 0) {
            if (var0.field_32[var2] != 255) {
               var3 = var0.field_29[var2].field_629;
               int var4 = var0.field_29[var2].field_629.length;

               while (--var4 >= 0) {
                  int[] var5;
                  int var6;
                  if ((var6 = (var5 = var3[var4])[0]) == 1) {
                     int var8 = var5[3];
                     if ((var6 = field_731[var8] + var1) < 0) {
                        var6 = 0;
                     }

                     field_731[var8] = (short)var6;
                  } else if (var6 == 9) {
                     int var9 = var5[4];
                     field_737[var9] = (short)(field_737[var9] + var1);
                     if (field_737[var9] <= 0) {
                        field_737[var9] = 0;
                        class_20 var11;
                        if ((var11 = method_359(var9)) != null) {
                           var11.method_340();
                           field_736.setElementAt(null, var9);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static int method_353(int var0, int var1, int var2) {
      int var3 = field_730.size();

      while (--var3 >= 0) {
         if (field_732[var3] == var0 && (var0 == -1 || var1 == (field_733[var3] & 255) && var2 == field_734[var3])) {
            return var3;
         }
      }

      return -1;
   }

   public static byte[] method_354(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      boolean var8 = (var6 & 1) != 0;
      boolean var9 = (var6 & 2) != 0;
      boolean var10 = var4 == -1 && var5 != 0;
      int var11 = 4;
      int var12 = 4;
      int var13 = 0;
      if (var4 == -1) {
         var11 = 1;
         var12 = 1;
         var13 = 3 * var0.length + 4 + 4 + 4 + 1 + 4 + 4 + 4;
      } else if (var4 == 254) {
         var12 = 3;
      }

      int var14 = var2;
      int var27;
      var2 = (var27 = var2 * var7 >> 10) > 0 ? var27 : 1;
      int var29;
      var3 = (var29 = var3 * var7 >> 10) > 0 ? var29 : 1;
      int var15 = 65531;
      var15 = 65531 - 65531 % (var2 * var11 + 1);
      int var16;
      int var17 = ((var16 = var2 * var3 * var11 + var3) - 1) / var15 + 1;
      int var18;
      byte[] var34;
      (var34 = new byte[(var18 = var16 + 6 + var17 * 5) + 57 + var13])[0] = -119;
      var34[1] = 80;
      var34[2] = 78;
      var34[3] = 71;
      var34[4] = 13;
      var34[5] = 10;
      var34[6] = 26;
      var34[7] = 10;
      var34[11] = 13;
      var34[12] = 73;
      var34[13] = 72;
      var34[14] = 68;
      var34[15] = 82;
      var34[18] = (byte)(var2 >> 8);
      var34[19] = (byte)var2;
      var34[22] = (byte)(var3 >> 8);
      var34[23] = (byte)var3;
      var34[24] = 8;
      var34[25] = (byte)(var4 == -1 ? 3 : 6);
      int var19 = method_355(var34, 12, 17);
      var34[29] = (byte)(var19 >> 24);
      var34[30] = (byte)(var19 >> 16);
      var34[31] = (byte)(var19 >> 8);
      var34[32] = (byte)var19;
      int var49 = 33;
      if (var4 == -1) {
         var19 = var0.length * 3;
         var34[35] = (byte)(var19 >> 8);
         var34[36] = (byte)var19;
         var34[37] = 80;
         var34[38] = 76;
         var34[39] = 84;
         var34[40] = 69;
         var49 = 41;

         for (int var21 = 0; var21 < var0.length; var21++) {
            var34[var49++] = (byte)(var0[var21] >> 16);
            var34[var49++] = (byte)(var0[var21] >> 8);
            var34[var49++] = (byte)var0[var21];
         }

         var19 = method_355(var34, var49 - var19 - 4, var19 + 4);
         var34[var49++] = (byte)(var19 >> 24);
         var34[var49++] = (byte)(var19 >>> 16);
         var34[var49++] = (byte)(var19 >>> 8);
         var34[var49++] = (byte)var19;
         var49 += 3;
         var34[var49++] = 1;
         var34[var49++] = 116;
         var34[var49++] = 82;
         var34[var49++] = 78;
         var34[var49++] = 83;
         var49++;
         var19 = method_355(var34, var49 - 5, 5);
         var34[var49++] = (byte)(var19 >> 24);
         var34[var49++] = (byte)(var19 >>> 16);
         var34[var49++] = (byte)(var19 >>> 8);
         var34[var49++] = (byte)var19;
      }

      var34[var49++] = (byte)(var18 >> 24);
      var34[var49++] = (byte)(var18 >> 16);
      var34[var49++] = (byte)(var18 >> 8);
      var34[var49++] = (byte)var18;
      var19 = var49;
      var34[var49++] = 73;
      var34[var49++] = 68;
      var34[var49++] = 65;
      var34[var49++] = 84;
      var34[var49++] = 120;
      var34[var49++] = 1;
      int var96 = 1;
      int var26 = var15;
      var18 = 0;
      boolean var31 = var7 == 1024 && var6 == 0 && var10;
      var11 *= var2;

      for (int var32 = 0; var32 < var17; var32++) {
         if (var32 == var17 - 1) {
            var34[var49] = 1;
            var26 = (var16 - 1) % var15 + 1;
         }

         int var139 = ++var49;
         var49++;
         var34[var139] = (byte)var26;
         var34[var49++] = (byte)(var26 >> 8);
         int var22 = var26 ^ 65535;
         var34[var49++] = (byte)var22;
         var34[var49++] = (byte)(var22 >> 8);

         for (int var98 = 0; var18 < var3 && var98 < var26; var18++) {
            var98++;
            var49++;
            int var23 = var9 ? var3 - var18 - 1 : var18;
            if (var7 != 1024) {
               var23 = (var23 << 10) / var7;
            }

            var23 = var23 * var14 * var12 + var5;
            if (var4 == -1 && var7 == 1024) {
               if (var8) {
                  int var104 = var23 + var2 - 1;
                  int var112 = var2;

                  while (--var112 >= 0) {
                     var34[var49++] = var1[var104--];
                  }
               } else {
                  int var103 = var23;
                  int var111 = var2;

                  while (--var111 >= 0) {
                     var34[var49++] = var1[var103++];
                  }
               }
            } else {
               for (int var24 = 0; var24 < var2; var24++) {
                  int var25 = var8 ? var2 - var24 - 1 : var24;
                  if (var7 != 1024) {
                     var25 = (var25 << 10) / var7;
                  }

                  var25 = var23 + var25 * var12;
                  var34[var49++] = var1[var25];
                  if (var4 != -1) {
                     var34[var49++] = var1[++var25];
                     var34[var49++] = var1[++var25];
                     var34[var49++] = var4 == 255 ? var1[++var25] : -1;
                  }
               }
            }

            var98 += var11;
         }

         if (!var31) {
            var22 = var49 - var26;
            byte[] var97 = var34;
            int var113 = var96 >>> 16;
            int var106 = var96 & 65535;

            for (int var102 = var26 + var22; var22 < var102; var22++) {
               var106 = (var106 + (var97[var22] & 255)) % 65521;
               var113 = (var113 + var106) % 65521;
            }

            var96 = (var113 << 16) + var106;
         }
      }

      if (var31) {
         var34[var49++] = var1[2];
         var34[var49++] = var1[3];
         var34[var49++] = var1[4];
         var34[var49++] = var1[5];
         var34[var49++] = var1[6];
         var34[var49++] = var1[7];
         var34[var49++] = var1[8];
         var34[var49] = var1[9];
      } else {
         var34[var49++] = (byte)(var96 >> 24);
         var34[var49++] = (byte)(var96 >>> 16);
         var34[var49++] = (byte)(var96 >>> 8);
         var34[var49++] = (byte)var96;
         var19 = method_355(var34, var19, var49 - var19);
         var34[var49++] = (byte)(var19 >> 24);
         var34[var49++] = (byte)(var19 >>> 16);
         var34[var49++] = (byte)(var19 >>> 8);
         var34[var49] = (byte)var19;
      }

      var49 += 5;
      var34[var49++] = 73;
      var34[var49++] = 69;
      var34[var49++] = 78;
      var34[var49++] = 68;
      var34[var49++] = -82;
      var34[var49++] = 66;
      var34[var49++] = 96;
      var34[var49] = -126;
      return var34;
   }

   private static int method_355(byte[] var0, int var1, int var2) {
      if (field_726 == null) {
         field_726 = new int[256];

         for (int var4 = 0; var4 < 256; var4++) {
            int var3 = var4;

            for (int var5 = 0; var5 < 8; var5++) {
               if ((var3 & 1) != 0) {
                  var3 = -306674912 ^ var3 >>> 1;
               } else {
                  var3 >>>= 1;
               }

               field_726[var4] = var3;
            }
         }
      }

      int var7 = -1;

      for (int var6 = var2 + var1; var1 < var6; var1++) {
         var7 = field_726[(var7 ^ var0[var1]) & 0xFF] ^ var7 >>> 8;
      }

      return ~var7;
   }

   public static void method_356() {
      int var0 = field_730.size();

      while (--var0 >= 0) {
         if (field_731[var0] == 0 && method_358(var0) != null) {
            field_730.setElementAt(null, var0);
            field_732[var0] = -1;
         }
      }
   }

   public static int method_357(int var0) {
      if (field_738 == null) {
         field_738 = new int[720];
         field_737 = new short[720];
         field_736 = new Vector(720);
      }

      int var1 = field_736.size();

      for (int var2 = 0; var2 < var1; var2++) {
         if (var0 == field_738[var2] && method_359(var2) != null) {
            return var2;
         }
      }

      int var6 = 0;

      while (var6 < var1 && method_359(var6) != null) {
         var6++;
      }

      if (var6 >= field_738.length) {
         int var3;
         short[] var4 = new short[var3 = field_738.length << 1];
         int[] var5 = new int[var3];
         System.arraycopy(field_737, 0, var4, 0, var3);
         System.arraycopy(field_738, 0, var5, 0, var3);
         field_737 = var4;
         field_738 = var5;
      }

      if (var6 == var1) {
         field_736.addElement(null);
      }

      field_736.setElementAt(new class_20(), var6);
      field_738[var6] = var0;
      class_1 var7 = method_344(var0, false);
      field_736.setElementAt(new class_20(var7), var6);
      return var6;
   }

   public static Img method_358(int var0) {
      return (Img)field_730.elementAt(var0);
   }

   public static class_20 method_359(int var0) {
      return (class_20)field_736.elementAt(var0);
   }

   public static int method_360(int var0, int var1, int var2, int var3) {
      int var4 = method_361(var0 >>> 24, var1 >>> 24, var2, var3);
      int var5 = method_361(var0 >> 16 & 0xFF, var1 >> 16 & 0xFF, var2, var3);
      int var6 = method_361(var0 & 0xFF00, var1 & 0xFF00, var2, var3);
      var0 = method_361(var0 & 0xFF, var1 & 0xFF, var2, var3);
      return var4 << 24 | var5 << 16 | var6 & 0xFF00 | var0;
   }

   public static int method_361(int var0, int var1, int var2, int var3) {
      return var0 + (var1 - var0) * var2 / var3;
   }
}
