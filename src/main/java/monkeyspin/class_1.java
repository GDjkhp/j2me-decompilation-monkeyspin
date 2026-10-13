package monkeyspin;

import monkeyspin.platform.*;

public final class class_1 {
   int field_25;
   int field_26;
   private int field_27;
   private int field_28;
   class_13[] field_29;
   int[] field_30;
   int[] field_31;
   byte[] field_32;
   int field_33 = 2147483647;
   boolean field_34;
   boolean field_35;
   class_8[] field_36;
   int field_37;
   int field_38;
   int field_39;
   int field_40;

   public class_1(int var1, boolean var2) {
      if (var1 == -1) {
         this.field_29 = new class_13[1];
         this.field_29[0] = new class_13(true);
         this.field_32 = new byte[]{0};
         this.field_30 = new int[]{2147483647};
         this.field_31 = new int[1];
      } else {
         if (!var2) {
            Assets.method_343();
         }

         byte[] var11;
         boolean var3 = ((var11 = GameCanvas.method_366(var1))[0] & 1) == 0;
         boolean var4 = (var11[0] & 2) == 0;
         int var5 = var11[1] & 255;
         this.field_30 = new int[var5];
         this.field_31 = new int[var5];
         this.field_29 = new class_13[var5];
         this.field_32 = new byte[var5];
         this.field_34 = var11[2] == 1;
         this.field_35 = var11[3] == 1;
         int var6 = 8;
         if (var3) {
            this.field_25 = var11[4];
            this.field_26 = var11[5];
            this.field_27 = (short)(var11[6] & 255);
            this.field_28 = (short)(var11[7] & 255);
         } else {
            this.field_25 = (short)(var11[4] << 8 | var11[5] & 255);
            this.field_26 = (short)(var11[6] << 8 | var11[7] & 255);
            this.field_27 = (short)(var11[8] << 8 | var11[9] & 255);
            this.field_28 = (short)(var11[10] << 8 | var11[11] & 255);
            var6 = 12;
         }

         for (int var7 = 0; var7 < var5; var7++) {
            this.field_32[var7] = var11[var6++];
            int var10000 = this.field_32[var7] & 255;
            boolean var8 = false;
            if (var10000 == 255) {
               this.field_29[var7] = new class_13(false);
            }
         }

         boolean var24 = false;
         int var25 = 0;

         for (int var9 = 0; var9 < var5; var9++) {
            int var10;
            if (var4) {
               var10 = var11[var6++] & 255;
            } else {
               var10 = (var11[var6++] & 255) << 8 | var11[var6++] & 255;
            }

            if (var10 == 0) {
               var10 = 2147483647;
               var24 = true;
            }

            this.field_30[var9] = var10;
            this.field_31[var9] = var25;
            var25 += var10;
         }

         if (!var24) {
            this.field_33 = this.field_31[var5 - 1] + this.field_30[var5 - 1];
         }

         this.field_37 = this.field_25;
         this.field_38 = this.field_26;
         this.field_39 = this.field_27;
         this.field_40 = this.field_28;
         if (var11[var6++] == 1) {
            if (var3) {
               this.field_37 = var11[var6++];
               this.field_38 = var11[var6++];
               this.field_39 = (short)(var11[var6++] & 255);
               this.field_40 = (short)(var11[var6++] & 255);
            } else {
               this.field_37 = (short)(var11[var6++] << 8 | var11[var6++] & 255);
               this.field_38 = (short)(var11[var6++] << 8 | var11[var6++] & 255);
               this.field_39 = (short)(var11[var6++] << 8 | var11[var6++] & 255);
               this.field_40 = (short)(var11[var6++] << 8 | var11[var6++] & 255);
            }

            this.field_36 = new class_8[6];

            for (int var28 = 0; var28 < 6; var28++) {
               this.field_36[var28] = new class_8(var28, this.field_33);
               var6 = this.field_36[var28].method_170(var11, var6, var3);
            }
         }

         for (int var26 = 0; var26 < var5; var26++) {
            int var32 = this.field_32[var26] & 255;
            boolean var29 = false;
            if (var32 == 255) {
               var6 = this.field_29[var26].method_260(var11, var6, var3, var2);
            }
         }

         for (int var27 = 0; var27 < var5; var27++) {
            int var30;
            if ((var30 = this.field_32[var27] & 255) != 255) {
               this.field_29[var27] = this.field_29[var30];
            }
         }
      }
   }

   public final int method_8(int var1, int var2, boolean unused) {
      class_8 var6;
      if ((var6 = this.field_36[var1]).field_392.length == 0) {
         if (var6.field_390 == 0) {
            return -8355712;
         } else {
            return var6.field_390 != 3 && var6.field_390 != 4 ? 0 : 1024;
         }
      } else {
         int var4 = var2;
         class_8 var10 = var6;
         int var5 = var6.field_392.length;

         int var14;
         while (true) {
            if (--var5 >= 0) {
               if (var4 < var10.field_392[var5]) {
                  continue;
               }

               var14 = var5;
               break;
            }

            var14 = -1;
            break;
         }

         int var3 = var14;
         if (var6.field_393[var3] == 1) {
            return var6.field_391[var3];
         } else {
            var1 = var2 - var6.field_392[var3];
            if ((var5 = var3 + 1) == var6.field_392.length) {
               if (var3 == 0) {
                  return var6.field_391[var3];
               }

               var5 = 0;
               var4 = var6.field_394 - var6.field_392[var3];
            } else {
               var4 = var6.field_392[var5] - var6.field_392[var3];
            }

            if (var6.field_393[var3] == 0) {
               return var6.field_390 == 0
                  ? Assets.method_360(var6.field_391[var3], var6.field_391[var5], var1, var4)
                  : Assets.method_361(var6.field_391[var3], var6.field_391[var5], var1, var4);
            } else {
               return -1;
            }
         }
      }
   }
}
