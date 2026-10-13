package monkeyspin;

import monkeyspin.platform.*;

public final class class_5 {
   private static class_15[] field_367 = new class_15[150];
   private static short field_368;
   private static short field_369;
   public static boolean field_370;

   public class_5() {
   }

   public static final void method_127() {
      method_128();
   }

   public static final void method_128() {
      class_15.field_638 = 1;
      field_368 = 0;
      field_369 = 0;

      for (short var0 = 0; var0 < 150; var0++) {
         field_367[var0] = new class_15();
      }
   }

   public static final void method_129(int var0) {
      boolean var5 = false;

      for (short var1 = 0; var1 < field_368; var1++) {
         if ((field_367[var1].field_660 & 1) == 0) {
            var5 = true;
         } else {
            class_15 var2;
            field_367[var1].field_645 = (var2 = field_367[var1]).field_643;
            var2.field_646 = var2.field_644;
            if (var2.field_651 != 0) {
               class_2.method_26(var2);
            }

            switch (var2.field_642) {
               case 1:
                  if (!var2.method_295(16) || !var2.method_295(32)) {
                     break;
                  }

                  var2.field_655 += 33;
                  var2.field_644 += 660;
                  var2.field_646 = var2.field_644;
                  if (class_2.field_139 == 1 && class_2.field_143.field_641 == var2.field_641) {
                     var2.field_655 = 1800;
                  } else if (var2.field_655 > 6800) {
                     var2.field_643 = var2.field_653 << 8;
                     var2.field_644 = var2.field_654 << 8;
                     var2.field_655 = 0;
                     var2.method_294(8, false);
                     var2.method_294(32, false);
                  }
                  break;
               case 32:
               case 33:
               case 34:
                  if (var2.method_295(8) && var2.field_650 > 15000) {
                     class_14.method_271(var2, 0, 0);
                     var2.method_294(8, false);
                  }
                  break;
               case 65:
                  class_2.method_53(var2);
                  break;
               case 66:
                  class_2.method_51(var2);
                  break;
               case 67:
                  class_2.method_56(var2);
                  break;
               case 69:
                  var2.field_644 += 40;
                  int var3 = var2.field_643 + (var2.field_643 - var2.field_653);
                  int var4 = var2.field_644 + (var2.field_644 - var2.field_654);
                  var2.field_653 = var2.field_643;
                  var2.field_654 = var2.field_644;
                  var2.field_643 = var3;
                  var2.field_644 = var4;
                  if (var2.field_644 - var2.field_654 > 800) {
                     var2.field_654 = var2.field_644 - 800;
                  }

                  if (var2.field_644 > class_2.field_83 + 50 << 8) {
                     var2.method_294(1, false);
                  }
                  break;
               case 100:
               case 101:
               case 102:
               case 103:
               case 104:
                  if (var2.field_655 != 0 && var2.field_650 >= var2.field_655) {
                     var2.method_294(8, false);
                     var2.field_655 = 0;
                  }

                  if (var2.method_295(2048) && var2.field_650 >= 867) {
                     var2.method_294(2048, false);
                     var2.method_294(8, false);
                  }
            }

            var2.field_650 += 33;
         }
      }

      if (var5) {
         for (int var7 = 0; var7 < field_368; var7++) {
            if ((field_367[var7].field_660 & 1) == 0) {
               field_368--;
               class_15 var6 = field_367[var7];
               field_367[var7] = field_367[field_368];
               field_367[field_368] = var6;
               var7--;
            }
         }
      }
   }

   public static final class_15 method_130(byte var0, int var1, int var2) {
      if (field_368 >= 150) {
         return null;
      } else {
         if (var0 == 1) {
            field_369++;
         }

         class_15 var4;
         (var4 = field_367[field_368++]).method_293();
         var4.field_641 = class_15.field_638++;
         var4.field_660 = 0;
         var4.field_642 = var0;
         var4.field_643 = var1 << 8;
         var4.field_644 = var2 << 8;
         var4.field_645 = var4.field_643;
         var4.field_646 = var4.field_644;
         var4.field_653 = var1;
         var4.field_654 = var2;
         var4.field_650 = 0;
         var4.field_647 = 5;
         var4.field_639 = 256;
         var4.field_640 = 0;
         var4.field_655 = 0;
         var4.field_651 = 0;
         var4.field_652 = 0;
         var4.method_294(1, true);
         return field_367[field_368 - 1];
      }
   }

   public static final int method_131() {
      return field_368;
   }

   public static final class_15[] method_132() {
      return field_367;
   }

   public static final void method_133(int var0, int var1, int var2, int var3) {
      for (int var7 = 0; var7 < field_368; var7++) {
         class_15 var6;
         if (!(var6 = field_367[var7]).method_295(8)) {
            var6.method_296();
            switch (var6.field_640) {
               case 0:
                  if (MathUtil.method_166(var0, var1, 24, 24, class_15.field_656, class_15.field_657, class_15.field_658, class_15.field_659)) {
                     class_2.method_37(var6);
                  } else if (class_2.field_147 == var6.field_641) {
                     class_2.field_147 = -1;
                  }
                  break;
               case 1:
                  if (MathUtil.method_166(var0, var1, 24, 24, class_15.field_656, class_15.field_657, class_15.field_658, class_15.field_659)) {
                     int var8 = var6.field_643 >> 8;
                     int var9 = var6.field_644 >> 8;
                     if (MathUtil.method_164(var8 - (var0 + 12), var9 - (var1 + 12)) < var6.field_647 + 12) {
                        class_2.method_37(var6);
                     }
                  } else if (class_2.field_147 == var6.field_641) {
                     class_2.field_147 = -1;
                  }
                  break;
               case 2:
                  if (MathUtil.method_166(var0, var1, 24, 24, class_15.field_656, class_15.field_657, class_15.field_658, class_15.field_659)
                     && MathUtil.method_167(var6.field_643 >> 8, var6.field_644 >> 8, var6.field_648 >> 8, var6.field_649 >> 8, var0 + 12, var1 + 12) < 24) {
                     class_2.method_37(var6);
                  } else if (class_2.field_139 == 0 && class_2.field_147 == var6.field_641) {
                     class_2.field_147 = -1;
                  }
                  break;
               case 3:
               case 4:
                  if (MathUtil.method_166(var0, var1, 24, 24, class_15.field_656, class_15.field_657, class_15.field_658, class_15.field_659)) {
                     int var4 = var6.field_643 >> 8;
                     int var5 = var6.field_644 >> 8;
                     if (MathUtil.method_164(var4 - (var0 + 12), var5 - (var1 + 12)) < var6.field_647 + 12) {
                        class_2.method_37(var6);
                     }
                  } else if (var1 < class_15.field_657 + class_15.field_659 * 3 / 4 && var1 + 24 > class_15.field_657 + class_15.field_659 / 4) {
                     if (var6.field_640 == 3) {
                        if (var0 < class_15.field_656) {
                           class_2.method_37(var6);
                        }
                     } else if (var6.field_640 == 4 && var0 > class_15.field_656 + class_15.field_658) {
                        class_2.method_37(var6);
                     }
                  }
            }
         }
      }
   }

   public static class_15 method_134(int var0, int var1, int var2, int var3, int var4) {
      var2 >>= 8;
      var3 >>= 8;
      int var5 = 2147483647;
      class_15 var6 = null;

      for (int var8 = 0; var8 < field_368; var8++) {
         class_15 var7;
         if (((var7 = field_367[var8]).field_642 == 1 || var7.field_642 == 13 || var7.field_642 == 12) && !var7.method_295(8)) {
            var4 = var0 - var7.field_643 >> 8;
            int var9 = var1 - var7.field_644 >> 8;
            if (var4 * var2 + var9 * var3 < 0 && (var4 = var4 * var4 + var9 * var9) < 30625 && var4 < var5) {
               var6 = var7;
               var5 = var4;
            }
         }
      }

      return var6;
   }

   public static class_15 method_135(int var0, int var1, class_15 var2) {
      int var3 = class_2.method_49();
      int var5 = 2147483647;
      class_15 var6 = null;

      for (int var8 = 0; var8 < field_368; var8++) {
         int var4;
         class_15 var7;
         if ((var7 = field_367[var8]) != var2
            && (var7.field_642 == 1 || var7.field_642 == 12)
            && !var7.method_295(8)
            && var7.field_644 >> 8 < var3
            && (var4 = MathUtil.method_164(var0 - var7.field_643, var1 - var7.field_644)) < var5) {
            var6 = var7;
            var5 = var4;
         }
      }

      return var6;
   }

   public static final class_15 method_136(class_15 var0, boolean unused) {
      var0.method_296();
      int var1 = class_15.field_656;
      int var2 = class_15.field_657;
      int var3 = class_15.field_658;
      int var4 = class_15.field_659;
      int var5 = var0.field_647;

      for (int var7 = 0; var7 < field_368; var7++) {
         class_15 var6;
         if ((var6 = field_367[var7]).field_642 == 1
            && !var6.method_295(8)
            && var6.method_295(16)
            && var6.method_295(32)
            && (class_2.field_139 != 1 || class_2.field_143 != var6)) {
            var6.method_296();
            if (MathUtil.method_166(var1, var2, var3, var4, class_15.field_656, class_15.field_657, class_15.field_658, class_15.field_659)) {
               int var8 = MathUtil.method_164(var0.field_643 - var6.field_643 >> 8, var0.field_644 - var6.field_644 >> 8);
               if (var0.field_644 > var6.field_644 && var8 < var6.field_647 + var5) {
                  return var6;
               }
            }
         }
      }

      return null;
   }

   public static final boolean method_137() {
      for (int var1 = 0; var1 < field_368; var1++) {
         class_15 var0;
         if ((var0 = field_367[var1]).field_642 == 12 && !var0.method_295(256)) {
            return false;
         }
      }

      return true;
   }

   public static final boolean method_138() {
      for (int var1 = 0; var1 < field_368; var1++) {
         class_15 var0;
         if ((var0 = field_367[var1]).field_642 == 12 && var0.method_295(256)) {
            var0.field_650 = 0;
         }
      }

      return true;
   }

   public static final boolean method_139() {
      for (int var1 = 0; var1 < field_368; var1++) {
         class_15 var0;
         if ((var0 = field_367[var1]).field_642 == 1 && var0.method_295(16)) {
            var0.field_643 = var0.field_653 << 8;
            var0.field_644 = var0.field_654 << 8;
            var0.field_655 = 0;
            var0.method_294(8, false);
            var0.method_294(32, false);
         }

         if (var0.field_642 == 12) {
            var0.method_294(256, false);
         }

         if (var0.field_642 == 33 || var0.field_642 == 32 || var0.field_642 == 34) {
            var0.method_294(8, false);
         }
      }

      return true;
   }

   public static final class_15 method_140(int var0, int var1, int var2, int var3) {
      for (int var5 = 0; var5 < field_368; var5++) {
         class_15 var4;
         if ((var4 = field_367[var5]).field_642 == 1 || var4.field_642 == 12 || var4.field_642 == 13) {
            int var6 = var4.field_643 >> 8;
            int var7 = var4.field_644 >> 8;
            if (MathUtil.method_166(var0, var1, var2, var3, var6, var7, 1, 1)) {
               return var4;
            }
         }
      }

      return null;
   }

   public static final void method_141() {
      boolean var0 = false;
      class_9.method_189(false);

      int var2;
      for (var2 = 0; var2 < field_368; var2++) {
         class_15 var1 = field_367[var2];
         if (class_2.field_216) {
            if (var1.field_642 == 1 && var1.method_295(32768)) {
               class_9.method_188(var1);
               var1.method_294(65536, true);
               var0 = true;
            }
         } else if (var1.field_642 == 1 && var1.method_295(4096)) {
            class_9.method_188(var1);
            var1.method_294(65536, true);
            var0 = true;
         }
      }

      for (; var2 < field_368; var2++) {
         class_15 var3;
         if ((var3 = field_367[var2]).field_642 == 65 || var3.field_642 == 66 || var3.field_642 == 67 || var3.field_642 == 36) {
            var0 = true;
            class_9.method_188(var3);
         }
      }

      if (!var0) {
         class_9.method_190();
      }
   }

   public static final void method_142(int var0) {
      class_9.method_189(true);

      for (int var2 = 0; var2 < field_368; var2++) {
         class_15 var1;
         if ((var1 = field_367[var2]).field_652 == var0) {
            class_9.method_188(var1);
         }
      }
   }

   private static class_15 method_143() {
      int var0 = MathUtil.method_163(field_369);

      for (int var2 = 0; var2 < field_368; var2++) {
         class_15 var1;
         if ((var1 = field_367[var2]).field_642 == 1) {
            if (--var0 <= 0) {
               return var1;
            }
         }
      }

      return null;
   }

   public static final void method_144(int var0, int var1, int var2, int var3) {
      for (int var4 = 0; var4 < field_368; var4++) {
         class_15 var5;
         if ((var5 = field_367[var4]).field_642 == 1
            && var0 < var5.field_643
            && var0 + var2 > var5.field_643
            && var1 < var5.field_644
            && var1 + var3 > var5.field_644) {
            var5.method_294(8192, true);
            class_2.field_218++;
         }
      }
   }

   public static final boolean method_145() {
      for (int var0 = 0; var0 < field_368; var0++) {
         class_15 var1;
         if ((var1 = field_367[var0]).field_642 == 1 && var1.method_295(8192) && !var1.method_295(16384)) {
            return false;
         }
      }

      return true;
   }

   public static final void method_146(int var0) {
      for (int var2 = 0; var2 < field_368; var2++) {
         class_15 var1;
         if ((var1 = field_367[var2]).field_642 == 69) {
            var1.method_294(1, false);
         }
      }
   }

   public static final class_15 method_147(int var0, int var1) {
      int var2 = 2147483647;
      class_15 var4 = null;

      for (int var5 = 0; var5 < field_368; var5++) {
         class_15 var3;
         if ((var3 = field_367[var5]).field_642 == 1) {
            int var6 = (var3.field_643 >> 8) - var0;
            int var7 = (var3.field_644 >> 8) - var1;
            if ((var6 = MathUtil.method_164(var6, var7)) < var2) {
               var2 = var6;
               var4 = var3;
            }
         }
      }

      return var4;
   }

   public static final void method_148() {
      class_15 var1 = method_143();

      while (var1 == class_2.field_172) {
         var1 = method_143();
      }

      class_15 var0;
      if (var1 != null && (var0 = method_130((byte)100, 0, 0)) != null) {
         int var2 = MathUtil.method_162() & 1023;
         var0.field_648 = 32;
         var0.field_649 = 32;
         var0.field_643 = var1.field_643 + (MathUtil.method_158(var2) * 40 >> 4) - (var0.field_648 << 7);
         var0.field_644 = var1.field_644 + (MathUtil.method_159(var2) * 40 >> 4) - (var0.field_649 << 7);
         var0.method_294(8, false);
         class_14.method_271(var0, var0.field_648 >> 1, var0.field_649 >> 1);
         class_2.field_88++;
      }
   }

   public static final void method_149(int var0, int var1, int var2) {
      class_15 var3 = method_135(var1, var2, null);
      class_15 var4 = method_135(var1, var2, var3);
      int var5 = 0;
      int var6 = (MathUtil.method_163(8) << 10) / 8;
      int var10 = 0;
      int var11 = 0;
      if (var3 != null && var4 != null) {
         for (; var11 < field_368; var11++) {
            class_15 var9;
            if ((var9 = field_367[var11]).method_295(8)
               && !var9.method_295(2048)
               && (var9.field_642 == 104 || var9.field_642 == 100 || var9.field_642 == 102 || var9.field_642 == 103 || var9.field_642 == 101)) {
               int var7 = var10 % 3;
               int var8 = 0;
               if (var10 > 2) {
                  var3 = var4;
                  if ((var8 = var0 - 3) == 0) {
                     var8 = 1;
                  }
               } else {
                  var8 = 3;
               }

               int var14;
               var7 = MathUtil.method_158(var14 = (var7 << 10) / var8 + var6) * 30 >> 4;
               var8 = MathUtil.method_159(var14) * 30 >> 4;
               var9.field_643 = var3.field_643 + var7 - (var9.field_648 >> 1 << 8);
               var9.field_644 = var3.field_644 + var8 - (var9.field_649 >> 1 << 8);
               var9.method_294(2048, true);
               var9.field_650 = 0;
               var10++;
               class_14.method_272(
                  var1, var2, var9.field_642 - 100, (var9.field_643 >> 8) + (var9.field_648 >> 1), (var9.field_644 >> 8) + (var9.field_649 >> 1)
               );
               var5++;
               if (var10 >= var0) {
                  break;
               }
            }
         }
      }

      class_2.field_89 -= var5;
   }

   public static final int method_150(int var0, int var1, int var2, int var3) {
      if (var1 + 10 > class_2.field_83) {
         return var1 + 10 - class_2.field_83;
      } else {
         for (int var5 = 0; var5 < field_368; var5++) {
            class_15 var4;
            if (!(var4 = field_367[var5]).method_295(8)) {
               switch (var4.field_640) {
                  case 0:
                     if (var4.field_642 == 3) {
                        var4.method_296();
                        if (MathUtil.method_166(var0, var1, 44, 10, class_15.field_656, class_15.field_657, class_15.field_658, class_15.field_659)) {
                           return var1 + 10 - class_15.field_657;
                        }
                     }
               }
            }
         }

         return -1;
      }
   }
}
