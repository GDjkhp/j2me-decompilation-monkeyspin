package monkeyspin;

import monkeyspin.platform.*;

public final class class_8 {
   int field_390;
   int[] field_391;
   int[] field_392;
   byte[] field_393;
   int field_394;

   public class_8(int var1, int var2) {
      this.field_390 = var1;
      this.field_394 = var2;
   }

   public final int method_170(byte[] var1, int var2, boolean var3) {
      int var4 = var1[var2++] & 255;
      this.field_391 = new int[var4];
      this.field_392 = new int[var4];
      this.field_393 = new byte[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         int var10000 = (var1[var2++] & 255) << 24;
         int var6 = 0;
         var6 = var10000 | (var1[var2++] & 255) << 16 | (var1[var2++] & 255) << 8 | var1[var2++] & 255;
         this.field_392[var5] = var6;
         this.field_393[var5] = var1[var2++];
         var6 = -1;
         if (this.field_390 == 0 || this.field_390 == 3 || this.field_390 == 4) {
            var6 = (var1[var2++] & 255) << 24 | (var1[var2++] & 255) << 16 | (var1[var2++] & 255) << 8 | var1[var2++] & 255;
         } else if (this.field_390 != 1 && this.field_390 != 2) {
            if (this.field_390 == 5) {
               var6 = (short)(var1[var2++] << 8 | var1[var2++] & 255) << 8;
            }
         } else if (var3) {
            var6 = var1[var2++];
         } else {
            var6 = (short)(var1[var2++] << 8 | var1[var2++] & 255);
         }

         this.field_391[var5] = var6;
      }

      return var2;
   }
}
