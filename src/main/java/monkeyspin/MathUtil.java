package monkeyspin;

import monkeyspin.platform.*;

public final class MathUtil {
   public static int[] field_386 = new int[6];
   private static int[] field_387;
   private static long field_388;
   private static int field_389 = (int)System.currentTimeMillis();

   public MathUtil() {
   }

   public static final int method_153(int var0) {
      int var1;
      int var2 = (var1 = var0 * var0 >> 12) * var0 >> 12;
      int[] var3 = field_386;
      return (
            ((-field_386[0] + var3[2]) * var0 >> 12)
                  + (((var3[0] << 1) - 5 * var3[1] + (var3[2] << 2) - var3[3]) * var1 >> 12)
                  + ((-var3[0] + 3 * (var3[1] - var3[2]) + var3[3]) * var2 >> 12)
               >> 1
         )
         + var3[1];
   }

   public static final int method_154(int var0, int var1) {
      if (var0 < 500) {
         return 0;
      } else {
         return var0 > var1 ? 1024 : (var0 - 500 << 10) / (var1 - 500);
      }
   }

   public static final int method_155(int var0, int var1, int var2) {
      var1 = var2;
      if (var2 == 0) {
         var1 = 1;
      }

      if ((var0 = (var0 << 10) / var1) < 0) {
         return 0;
      } else {
         return var0 > 1024 ? 1024 : (var0 * var0 >> 10) * (3072 - (var0 << 11 >> 10)) >> 10;
      }
   }

   public static final int method_156(int var0, int var1) {
      if (var0 < 0) {
         return 0;
      } else {
         return var0 > var1 ? var1 : var0;
      }
   }

   public static final void method_157() {
      int var0 = 0;
      int var1 = 4096;
      if (field_387 == null) {
         field_387 = new int[1024];

         for (int var2 = 0; var2 < 1024; var2++) {
            field_387[var2] = var0;
            var1 -= var0 * 25 >> 12;
            var0 += var1 * 25 >> 12;
         }
      }
   }

   public static final int method_158(int var0) {
      return field_387[var0 & 1023];
   }

   public static final int method_159(int var0) {
      return field_387[var0 + 256 & 1023];
   }

   public static int method_160(int var0, int var1) {
      if (var0 == 0) {
         var0 = 1;
      }

      long var2 = 536870912L;
      long var4 = 1610612736L;
      long var6 = var0 < 0 ? -var0 : var0;
      long var10;
      if (var1 >= 0) {
         long var8 = (var1 - var6 << 32) / (var1 + var6);
         var10 = var2 - (var2 * var8 >> 32);
      } else {
         long var12 = (var1 + var6 << 32) / (var6 - var1);
         var10 = var4 - (var2 * var12 >> 32);
      }

      if (var0 < 0) {
         var10 = -var10;
      }

      return (int)((var10 >> 16) + 65536L) & 65535;
   }

   public static final void method_161(long var0) {
      field_388 = (var0 ^ 25214903917L) & 281474976710655L;
   }

   public static final int method_162() {
      return (int)((field_388 = field_388 * 25214903917L + 11L & 281474976710655L) >>> 16) & 16777215;
   }

   public static final int method_163(int var0) {
      field_389 = -1644122275 * field_389 + -1644122275;
      return var0 * (field_389 & 65535) >>> 16;
   }

   public static int method_164(int var0, int var1) {
      var1 = Math.abs(var1);
      int var2;
      return Math.max(var2 = Math.abs(var0), var1) + (Math.min(var2, var1) * 53 >> 7);
   }

   public static final int method_165(int var0, int var1, int var2, int var3) {
      var0 -= var2;
      var1 -= var3;
      return (var0 < 0 ? -var0 : var0) + (var1 < 0 ? -var1 : var1);
   }

   public static final boolean method_166(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      return var1 + var3 > var5 && var1 < var5 + var7 && var0 + var2 > var4 && var0 < var4 + var6;
   }

   public static final int method_167(int var0, int var1, int var2, int var3, int var4, int var5) {
      var2 -= var0;
      var3 -= var1;
      int var6 = var2 < 0 ? -var2 : var2;
      int var7 = var3 < 0 ? -var3 : var3;
      var6 = Math.max(var6, var7) + (Math.min(var6, var7) * 53 >> 7);
      var0 -= var4;
      var1 -= var5;
      int var9;
      return (var9 = (var2 * var1 - var0 * var3) / var6) < 0 ? -var9 : var9;
   }

   public static int method_168(int var0, int var1, int var2) {
      if (var2 <= 0) {
         return var0;
      } else {
         return var2 >= 255
            ? var1
            : Math.min(Math.max(18 + (var2 * 196 >> 8), 0), 255) << 16
               | Math.min(Math.max(104 + (var2 * 138 >> 8), 0), 255) << 8
               | Math.min(Math.max(179 + (var2 * 62 >> 8), 0), 255);
      }
   }

   public static final int method_169(class_20 var0, int var1, int var2) {
      if (var2 == 5) {
         return var0.method_324().length;
      } else {
         class_19 var3 = var0.method_325(var1);
         if (var2 == 0) {
            return var3.field_718;
         } else if (var2 == 1) {
            return var3.field_714;
         } else if (var2 == 2) {
            return var3.field_715;
         } else {
            return var2 == 3 ? var3.field_716 : var3.field_717;
         }
      }
   }
}
