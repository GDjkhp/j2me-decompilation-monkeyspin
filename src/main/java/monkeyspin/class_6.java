package monkeyspin;

import monkeyspin.platform.*;


public final class class_6 implements Runnable {
   static class_3 field_371;
   static class_3[] field_372;
   static String field_373;
   static int field_374;
   static int field_375;
   static int field_376;
   public static int field_377;
   static String[] field_378;
   static class_3 field_379;
   static class_3 field_380;
   static Img field_381;
   static Img field_382;
   static int field_383;
   static int[][] field_384;
   static int field_385;

   public class_6() {
   }

   public final void run() {
      if (!GameApp.method_5(field_373)) {
         field_375 = -1;
      }
   }

   public static String[] method_151() {
      String var0;
      if ((var0 = GameCanvas.method_402(5)) == null) {
         return new String[]{"none"};
      } else {
         int var1 = 0;
         int var2 = 0;

         while (var2 < var0.length()) {
            var1++;
            int var3;
            if ((var3 = var0.indexOf("!.!", var2)) == -1) {
               break;
            }

            var2 = var3 + "!.!".length();
         }

         String[] var9 = new String[var1];
         var2 = 0;
         String var4 = GameCanvas.method_381(283);

         for (int var5 = 0; var5 < var1; var5++) {
            int var6;
            if ((var6 = var0.indexOf("!.!", var2)) == -1) {
               var6 = var0.length();
            }

            if (var2 < var6) {
               String var8 = var0.substring(var2, var6);
               if ("none".equals(var8)) {
                  var9[var5] = null;
               } else if (!"nolink".equals(var8)) {
                  if (var8.indexOf("aid=") == -1) {
                     var8 = var8 + "&aid=4";
                  }

                  if (var8.indexOf("clk=") == -1) {
                     var8 = var8 + "&clk=0";
                  }

                  if (var8.indexOf("car=") == -1) {
                     var8 = var8 + "&car=" + GameCanvas.method_402(2);
                  }

                  if (var8.indexOf("lng") == -1) {
                     var8 = var8 + "&lng=" + var4;
                  }

                  var9[var5] = var8;
               } else {
                  var9[var5] = "nolink";
               }
            } else {
               var9[var5] = "nolink";
            }

            var2 = var6 + "!.!".length();
         }

         return var9;
      }
   }

   public static void method_152(int[] var0, int[] var1, int[] var2, int[] var3, String[] var4, int var5, int var6) {
      String[] var20 = new String[var5 = var0.length];
      Img[] var7 = new Img[var5];
      String[] var8 = new String[var5];
      Img[] var9 = new Img[var5];

      for (int var10 = 0; var10 < var5; var10++) {
         var20[var10] = GameCanvas.method_381(var0[var10]);
         var7[var10] = GameCanvas.method_375(var1[var10]);
         var8[var10] = GameCanvas.method_381(var2[var10]);
         var9[var10] = GameCanvas.method_375(var3[var10]);
      }

      Img[] var17 = var9;
      String[] var16 = var8;
      Img[] var15 = var7;
      String[] var14 = var20;
      field_378 = var4;
      field_385 = 0;

      for (int var22 = 0; var22 < var4.length; var22++) {
         if (var4[var22] != null) {
            field_385++;
         }
      }

      field_383 = 34;
      int var23 = 0;
      if (field_385 > 1) {
         field_381 = GameCanvas.method_375(327681);
         field_382 = GameCanvas.method_375(327682);
         var23 = field_381.getWidth() + field_382.getWidth() + 10;
      }

      field_378 = new String[field_385];
      field_372 = new class_3[field_385];
      int var24 = 0;

      for (int var25 = 0; var25 < var4.length; var25++) {
         if (var4[var25] != null) {
            field_378[var24] = var4[var25];
            int var27 = 0;
            Img var19 = null;
            if (var15[var25] != null) {
               var19 = var15[var25];
            }

            String var21 = null;
            if (var14[var25] != null) {
               var21 = var14[var25];
            }

            Img var11 = null;
            if (var17[var25] != null) {
               var11 = var17[var25];
               var27 = 1;
            }

            String var12 = null;
            if (var16[var25] != null) {
               var12 = var16[var25];
               var12 = var12 + GameCanvas.method_386(2);
            }

            class_3 var13;
            (var13 = new class_3()).method_86(1, 2, var27);
            var13.method_88(var21, var19, 1);
            if (var11 != null) {
               var13.method_89(0, 1, null, new Img[]{var11}, 0);
               var13.method_89(1, 1, var12, null, 0);
            } else {
               var13.method_89(0, 1, var12, null, 0);
            }

            var13.field_306[0] = 34;
            var13.field_306[1] = 5;
            var13.method_95(GameCanvas.method_383() - var23, GameCanvas.method_363());
            field_372[var24] = var13;
            var24++;
         }
      }

      String var26 = GameCanvas.method_381(47);
      (field_380 = new class_3()).method_86(1, 1, 0);
      field_380.method_88(var26, null, 1);
      field_380.method_89(0, 1, GameCanvas.method_381(284), null, 0);
      field_380.field_306[0] = 1;
      field_380.method_95(GameCanvas.method_383(), GameCanvas.method_363());
      (field_379 = new class_3()).method_86(1, 1, 0);
      field_379.method_88(var26, null, 1);
      field_379.method_89(0, 1, GameCanvas.method_381(285), null, 0);
      field_379.field_306[0] = 1;
      field_379.method_95(GameCanvas.method_383(), GameCanvas.method_363());
   }
}
