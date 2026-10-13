package monkeyspin;

import monkeyspin.platform.*;


public final class class_13 {
   class_19[] field_628;
   int[][] field_629;

   public class_13(boolean var1) {
      if (var1) {
         this.field_628 = new class_19[0];
         this.field_629 = new int[0][];
      }
   }

   public final int method_260(byte[] var1, int var2, boolean var3, boolean var4) {
      if (var3) {
         var2++;
         var2++;
      } else {
         var2++;
         var2++;
         var2++;
         var2++;
      }

      int var5 = var1[var2++] & 255;
      this.field_628 = new class_19[var5];

      for (int var6 = 0; var6 < var5; var6++) {
         int var11 = var1[var2++] & 255;
         short var7;
         short var8;
         int var9;
         int var10;
         if (var3) {
            var7 = var1[var2++];
            var8 = var1[var2++];
            var9 = var1[var2++] & 255;
            var10 = var1[var2++] & 255;
         } else {
            var7 = (short)(var1[var2++] << 8 | var1[var2++] & 255);
            var8 = (short)(var1[var2++] << 8 | var1[var2++] & 255);
            var9 = (short)(var1[var2++] << 8 | var1[var2++] & 255);
            var10 = (short)(var1[var2++] << 8 | var1[var2++] & 255);
         }

         this.field_628[var6] = new class_19(var7, var8, var9, var10, var11);
      }

      var5 = var1[var2++] & 255;
      this.field_629 = new int[var5][];
      int[] var59 = new int[2];

      for (int var60 = 0; var60 < var5; var60++) {
         int var61 = var1[var2++];
         int[] var62 = null;
         if (var61 == 1) {
            var62 = new int[5];
            if (var3) {
               var62[1] = var1[var2++];
               var62[2] = var1[var2++];
            } else {
               var62[1] = (short)(var1[var2++] << 8 | var1[var2++] & 255);
               var62[2] = (short)(var1[var2++] << 8 | var1[var2++] & 255);
            }

            int var66;
            int var68 = ((var66 = var1[var2++] & 255) >> 4) + 1;
            var66 &= 15;
            int var69 = var1[var2++] << 24 | (var1[var2++] & 255) << 16 | (var1[var2++] & 255) << 8 | var1[var2++] & 255;
            int var13 = 0;
            var13 = var1[var2++] & 255;
            Assets.method_348(var69, var13, var66, var68, var4, var59);
            var62[3] = var59[0];
            var62[4] = var59[1];
         } else if (var61 == 9) {
            var62 = new int[5];
            if (var3) {
               var62[1] = var1[var2++];
               var62[2] = var1[var2++];
            } else {
               var62[1] = (short)(var1[var2++] << 8 | var1[var2++] & 255);
               var62[2] = (short)(var1[var2++] << 8 | var1[var2++] & 255);
            }

            var62[3] = var1[var2++];
            int var65 = var1[var2++] << 24 | (var1[var2++] & 255) << 16 | (var1[var2++] & 255) << 8 | var1[var2++] & 255;
            var62[4] = Assets.method_357(var65);
         } else {
            int var64 = 0xFF000000 | (var1[var2++] & 255) << 16 | (var1[var2++] & 255) << 8 | var1[var2++] & 255;
            var62 = new int[6];
            if (var3) {
               var62[2] = var1[var2++];
               var62[3] = var1[var2++];
               var62[4] = var1[var2++] & 255;
               var62[5] = var1[var2++] & 255;
            } else {
               for (int var12 = 0; var12 < 4; var12++) {
                  var62[var12 + 2] = (short)(var1[var2++] << 8 | var1[var2++] & 255);
               }
            }

            var62[1] = var64;
         }

         var62[0] = var61;
         this.field_629[var60] = var62;
      }

      return var2;
   }

   public final void method_261(Gfx var1, int var2, int var3, int var4) {
      int var5 = this.field_629.length;

      for (int var7 = 0; var7 < var5; var7++) {
         int[] var8;
         int var9;
         if ((var9 = (var8 = this.field_629[var7])[0]) == 1) {
            var9 = var8[1] + var2;
            int var10 = var8[2] + var3;
            int var11 = var8[3];
            int var13 = var8[4];
            Img var18 = Assets.method_358(var11);
            if (var13 == 0) {
               var1.drawImage(var18, var9, var10, 20);
            } else {
               short var12 = 0;
               if ((var13 & 1) != 0) {
                  var12 = 8192;
               }

               if ((var13 & 2) != 0) {
                  var12 |= 16384;
               }

               var1.drawImage(var18, var9, var10, 20, var12);
            }
         } else if (var9 == 9) {
            var9 = var8[1] + var2;
            int var17 = var8[2] + var3;
            int var10000 = var8[4];
            boolean var19 = false;
            class_20 var14;
            class_1 var20 = (var14 = Assets.method_359(var10000)).method_323();
            if (var9 - var20.field_37 + var20.field_39 > var1.getClipX()
               && var17 - var20.field_38 + var20.field_40 > var1.getClipY()
               && var9 - var20.field_37 < var1.getClipX() + var1.getClipWidth()
               && var17 - var20.field_38 < var1.getClipY() + var1.getClipHeight()) {
               var14.method_330(0, -2, false);
               var14.method_326(var4);
               var14.method_329(var1, var9, var17);
            }
         } else {
            var1.setColor(var8[1]);
            if (var9 == 2) {
               var1.fillRect(var2 + var8[2], var3 + var8[3], var8[4], var8[5]);
            }
         }
      }
   }
}
