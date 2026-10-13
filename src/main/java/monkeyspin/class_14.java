package monkeyspin;

import monkeyspin.platform.*;


public final class class_14 {
   private static final int[][] field_631 = new int[][]{
      {0, -16, 5, 0, -5, 0}, {-15, -6, 0, -6, 0, 6}, {15, -6, 0, -6, 0, 6}, {-10, 13, -3, -6, 6, 0}, {10, 13, 3, -6, -6, 0}
   };
   private static class_20 field_632;
   private static final int[][] field_633 = new int[][]{
      {0, -1},
      {1000, 1},
      {800, 1},
      {1250, 1},
      {1250, 1},
      {1250, 1},
      {1250, 1},
      {1250, 1},
      {400, 1},
      {20000, 1},
      {800, 1},
      {800, 1},
      {2700, 1},
      {1000, 1},
      {1250, 1},
      {1200, 1},
      {1200, 1},
      {900, 1},
      {900, 1},
      {900, 1},
      {900, 1},
      {900, 1},
      {1200, 1},
      {510, 1},
      {10000, 1},
      {1200, 1},
      {1024, 1},
      {1500, 1},
      {1250, 1},
      {2500, 1},
      {2500, 1},
      {2500, 1}
   };
   private static final int[] field_634 = new int[]{
      -1,
      524369,
      524444,
      524322,
      524322,
      524322,
      524322,
      524322,
      524378,
      524389,
      524326,
      524334,
      524396,
      524349,
      524402,
      -1,
      -1,
      524322,
      -1,
      -1,
      -1,
      -1,
      -1,
      -1,
      589829,
      -1,
      -1,
      -1,
      524366,
      589837,
      589838,
      589836
   };
   private static int[] field_635;
   private static class_20[] field_636;
   private static int field_637;

   public class_14() {
   }

   public static final void method_262() {
      field_635 = new int[1050];
      field_637 = 0;
      field_632 = class_9.method_179(524357);
      field_636 = new class_20[32];

      for (int var0 = 0; var0 < 32; var0++) {
         if (field_634[var0] != -1) {
            field_636[var0] = class_9.method_179(field_634[var0]);
            field_636[var0].method_330(0, field_633[var0][1], false);
         }
      }
   }

   public static final void method_263() {
      if (field_635 != null) {
         for (int var0 = 0; var0 < 1050; var0 += 7) {
            int var1;
            if ((var1 = field_635[var0] & 0xFF) == 3 || var1 == 4 || var1 == 5 || var1 == 6 || var1 == 7 || var1 == 14 || var1 == 28) {
               class_2.method_78(var1);
            }

            for (int var2 = 0; var2 < 7; var2++) {
               field_635[var0 + var2] = 0;
            }
         }
      }
   }

   public static final void method_264(int var0) {
      for (int var2 = 0; var2 < 1050; var2 += 7) {
         int var1;
         if ((var1 = field_635[var2] & 0xFF) != 0) {
            field_635[var2 + 5] = field_635[var2 + 5] + var0;
            if (field_635[var2 + 5] > field_633[var1][0]) {
               if (var1 == 3 || var1 == 4 || var1 == 5 || var1 == 6 || var1 == 7 || var1 == 14 || var1 == 28) {
                  class_2.method_78(var1);
               }

               for (int var8 = 0; var8 < 7; var8++) {
                  field_635[var2 + var8] = 0;
               }
            } else if (var1 == 17 || var1 == 18 || var1 == 19 || var1 == 20 || var1 == 21) {
               var1 = field_635[var2 + 3] >> 16;
               int var3 = field_635[var2 + 4] >> 16;
               int var4 = field_635[var2 + 6] >> 16;
               int var9 = field_635[var2 + 6] & 65535;
               int var6 = MathUtil.method_155(field_635[var2 + 5], 0, 900);
               field_635[var2 + 1] = var1 + ((var4 - var1) * var6 >> 10) << 16;
               field_635[var2 + 2] = var3 + ((var9 - var3) * var6 >> 10) << 16;
            } else if (var1 != 3 && var1 != 4 && var1 != 5 && var1 != 6 && var1 != 7 && var1 != 14 && var1 != 28) {
               if (var1 == 1 || var1 == 10) {
                  field_635[var2 + 3] = field_635[var2 + 3] - (field_635[var2 + 3] * var0 >> 10);
                  field_635[var2 + 4] = field_635[var2 + 4] - (field_635[var2 + 4] * var0 >> 10);
               }

               if (var1 == 8) {
                  field_635[var2 + 2] = field_635[var2 + 2] + var0 * 3000;
               }

               if (var1 == 29 || var1 == 30 || var1 == 31) {
                  field_635[var2 + 3] = field_635[var2 + 3] * 127 >> 7;
                  field_635[var2 + 4] = field_635[var2 + 4] * 127 >> 7;
                  field_635[var2 + 4] = field_635[var2 + 4] + var0 * 3;
               }

               if (var1 == 23) {
                  field_635[var2 + 4] = field_635[var2 + 4] + var0 * 6;
               }

               if (var1 == 15 || var1 == 16 || var1 == 22 || var1 == 25) {
                  field_635[var2 + 4] = field_635[var2 + 4] + var0 * 3;
               }

               if (var1 == 11 || var1 == 24) {
                  field_635[var2 + 4] = field_635[var2 + 4] + var0 * 24;
               }

               field_635[var2 + 1] = field_635[var2 + 1] + field_635[var2 + 3] * var0;
               field_635[var2 + 2] = field_635[var2 + 2] + field_635[var2 + 4] * var0;
            } else {
               int var5 = (field_635[var2 + 5] << 12) / 1250;
               MathUtil.field_386[0] = field_635[var2 + 3] + (MathUtil.method_158(var2 + 1 << 7) >> 4);
               MathUtil.field_386[1] = field_635[var2 + 3];
               MathUtil.field_386[2] = 10;
               MathUtil.field_386[3] = 10 - (MathUtil.method_158(var2 + 213 << 12) >> 4);
               field_635[var2 + 1] = MathUtil.method_153(var5);
               MathUtil.field_386[0] = field_635[var2 + 4] + (MathUtil.method_158(var2 + 7 << 7) >> 3);
               MathUtil.field_386[1] = field_635[var2 + 4];
               MathUtil.field_386[2] = 10;
               MathUtil.field_386[3] = 10 - (MathUtil.method_158(var2 + 9 << 8) >> 5);
               field_635[var2 + 2] = MathUtil.method_153(var5);
            }
         }
      }
   }

   public static final void method_265(Gfx var0) {
      int var1 = class_9.field_546;
      int var2 = class_9.field_547;

      for (int var5 = 0; var5 < 1050; var5 += 7) {
         int var6;
         if ((var6 = field_635[var5] & 0xFF) != 0) {
            int var3 = field_635[var5 + 1] >> 16 << 7 >> 7;
            int var4 = field_635[var5 + 2] >> 16 << 7 >> 7;
            var3 -= var1;
            var4 -= var2;
            if (var6 == 3 || var6 == 4 || var6 == 5 || var6 == 6 || var6 == 7) {
               var3 = field_635[var5 + 1];
               var4 = field_635[var5 + 2];
            }

            if (var6 != 14 && var6 != 28) {
               if (var6 == 1) {
                  int var18 = field_636[var6].method_320() - 1;
                  field_636[var6].method_333(var18 - var18 * field_635[var5 + 5] / field_633[1][0]);
               } else {
                  if (var6 == 27) {
                     method_292(var0, var3, var4, field_635[var5 + 5], field_635[var5 + 6]);
                     continue;
                  }

                  if (var6 == 26) {
                     var0.setColor(16777088);
                     var6 = MathUtil.method_158(field_635[var5 + 5] << 10 >> 11) * 255 >> 12;
                     int var17 = class_2.field_73;

                     for (int var8 = 0; var8 < 5; var8++) {
                        class_9.method_213(
                           var0,
                           var3
                              + (((MathUtil.method_159(var17) * field_631[var8][0] >> 12) + (MathUtil.method_158(var17) * field_631[var8][1] >> 12)) * var6 >> 8),
                           var4
                              + ((-(MathUtil.method_158(var17) * field_631[var8][1] >> 12) + (MathUtil.method_159(var17) * field_631[var8][1] >> 12)) * var6 >> 8),
                           var3
                              + (((MathUtil.method_159(var17) * field_631[var8][2] >> 12) + (MathUtil.method_158(var17) * field_631[var8][3] >> 12)) * var6 >> 8),
                           var4
                              + ((-(MathUtil.method_158(var17) * field_631[var8][3] >> 12) + (MathUtil.method_159(var17) * field_631[var8][3] >> 12)) * var6 >> 8),
                           var3
                              + (((MathUtil.method_159(var17) * field_631[var8][4] >> 12) + (MathUtil.method_158(var17) * field_631[var8][5] >> 12)) * var6 >> 8),
                           var4
                              + ((-(MathUtil.method_158(var17) * field_631[var8][5] >> 12) + (MathUtil.method_159(var17) * field_631[var8][5] >> 12)) * var6 >> 8)
                        );
                     }
                     continue;
                  }

                  if (var6 == 24) {
                     var3 = field_635[var5 + 1] >> 16;
                     var4 = field_635[var5 + 2] >> 16;
                     var3 -= var1;
                     var4 -= var2;
                     int var16 = field_635[var5 + 6];
                     field_636[var6].method_333(var16);
                  } else {
                     if (var6 == 15 || var6 == 16 || var6 == 23 || var6 == 22 || var6 == 25) {
                        if (var6 == 23) {
                           var0.setColor(MathUtil.method_168(1206451, 14086897, field_635[var5 + 5] >> 1));
                           var3 = field_635[var5 + 1] >> 16;
                           var4 = field_635[var5 + 2] >> 16;
                           int var14 = 2;
                           if (field_635[var5 + 5] > 300) {
                              var14 = 1;
                           }

                           var0.fillRect(var3, var4, var14, var14);
                        } else if (var6 == 16) {
                           var0.setColor(16777215);
                        } else if (var6 == 22) {
                           var0.setColor(0);
                        } else if (var6 == 25) {
                           var0.setColor(11364159);
                        } else {
                           var0.setColor(13257304);
                        }

                        int var15 = 2;
                        if (field_635[var5 + 5] > 850) {
                           var15 = 1;
                        }

                        var0.fillRect(var3, var4, var15, var15);
                        continue;
                     }

                     field_636[var6].method_333(0);
                     int var7 = field_635[var5 + 5];
                     if (var6 != 9 && var7 > 0) {
                        field_636[var6].method_327(var7);
                     }
                  }
               }
            } else {
               var3 = field_635[var5 + 1];
               var4 = field_635[var5 + 2];
               field_636[var6].method_333(field_635[var5 + 6]);
            }

            field_636[var6].method_329(var0, var3, var4);
         }
      }
   }

   private static int method_266(int var0, int var1, int var2, int var3) {
      if ((var3 = field_635[field_637]) == 3 || var3 == 4 || var3 == 5 || var3 == 6 || var3 == 7 || var3 == 14 || var3 == 28) {
         class_2.method_78(var3);
      }

      field_635[field_637] = var2;
      field_635[field_637 + 1] = var0;
      field_635[field_637 + 2] = var1;
      field_635[field_637 + 3] = 0;
      field_635[field_637 + 4] = 0;
      field_635[field_637 + 5] = 1;
      field_635[field_637 + 6] = 0;
      var0 = field_637;
      if ((field_637 += 7) >= 1050) {
         field_637 = 0;
      }

      return var0;
   }

   public static final void method_267(int var0, int var1, int var2, int var3) {
      if (class_2.field_139 != 4) {
         var0 <<= 16;
         var1 <<= 16;
         int var4 = 6;

         while (--var4 >= 0) {
            int var5 = method_266(var0 + ((-5 + MathUtil.method_163(10)) * var2 << 8), var1 + ((-5 + MathUtil.method_163(10)) * var3 << 8), 1, 0);
            int var6 = MathUtil.method_163(100);
            int var7 = 15000 + var6 * 350;
            int var8 = var2;
            int var9 = -var3;
            if ((var4 & 1) == 0) {
               var8 = -var2;
               var9 = var3;
            }

            field_635[var5 + 3] = var9 * var7 >> 12;
            field_635[var5 + 4] = var8 * var7 >> 12;
            field_635[var5 + 5] = field_635[var5 + 5] + var6 * 3;
         }
      }
   }

   public static final void method_268(int var0, int var1, int var2, int var3) {
      var0 <<= 16;
      var1 <<= 16;
      var2 = 6;

      while (--var2 >= 0) {
         MathUtil.method_163(10);
         var3 = method_266(var0, var1 + ((-5 + MathUtil.method_163(10)) * -256 << 8), 1, 0);
         int var4 = MathUtil.method_163(100);
         int var5 = 2000 + var4 * 500;
         short var6 = 256;
         if ((var2 & 1) == 0) {
            var6 = -256;
         }

         field_635[var3 + 3] = var6 * var5 >> 12;
         field_635[var3 + 4] = 0 >> 12;
         field_635[var3 + 5] = field_635[var3 + 5] + var4 * 3;
      }
   }

   public static final void method_269(int var0, int var1, int var2, int var3) {
      var2 = 40;

      while (--var2 >= 0) {
         var3 = method_266(var0 + MathUtil.method_163(60) << 16, var1 + MathUtil.method_163(70) << 16, 2, 0);
         field_635[var3 + 5] = field_635[var3 + 5] - MathUtil.method_163(800);
         int var4 = MathUtil.method_163(1024);
         int var5 = MathUtil.method_163(1500);
         field_635[var3 + 3] = MathUtil.method_158(var4) * var5 >> 12;
         field_635[var3 + 4] = MathUtil.method_159(var4) * var5 >> 12;
      }
   }

   public static final void method_270(int var0, int var1, int var2, int var3) {
      var0 <<= 8;
      var3 = 30;

      for (int var8 = (var2 << 8) / 30; --var3 >= 0; var0 += var8) {
         int var4 = method_266(var0 << 8, var1 + MathUtil.method_163(1) << 16, 22, 0);
         field_635[var4 + 5] = field_635[var4 + 5] - MathUtil.method_163(800);
         int var5 = MathUtil.method_163(1024);
         int var6 = MathUtil.method_163(2500);
         field_635[var4 + 3] = MathUtil.method_158(var5) * var6 >> 12;
         field_635[var4 + 4] = MathUtil.method_159(var5) * var6 >> 12;
      }
   }

   public static final void method_271(class_15 var0, int var1, int var2) {
      int var3 = var0.field_647 >> 1;
      int var4 = var0.field_647 >> 1;
      int var5 = 10;

      while (--var5 >= 0) {
         int var6 = method_266(
            (var0.field_643 << 8) + (var1 - var4 + MathUtil.method_163(var4 << 1) << 16),
            (var0.field_644 << 8) + (var2 - var3 + MathUtil.method_163(var3 << 1) << 16),
            2,
            0
         );
         field_635[var6 + 5] = field_635[var6 + 5] - MathUtil.method_163(350);
         int var7 = MathUtil.method_163(1024);
         int var8 = MathUtil.method_163(1000);
         field_635[var6 + 3] = MathUtil.method_158(var7) * var8 >> 12;
         field_635[var6 + 4] = MathUtil.method_159(var7) * var8 >> 12;
      }
   }

   public static final void method_272(int var0, int var1, int var2, int var3, int var4) {
      var0 = method_266(var0 << 8, var1 << 8, var2 + 17, 0);
      field_635[var0 + 3] = field_635[var0 + 1];
      field_635[var0 + 4] = field_635[var0 + 2];
      field_635[var0 + 6] = var3 << 16 | var4;
   }

   public static final void method_273(int var0, int var1, int var2, int var3) {
      var0 += MathUtil.method_162() % var2;
      var1 += MathUtil.method_162() % var3;
      var0 <<= 16;
      var1 <<= 16;
      var2 = 15;

      while (--var2 >= 0) {
         var3 = method_266(var0 + (MathUtil.method_163(8) - 4 << 16), var1 + (MathUtil.method_163(8) - 4 << 16), 29 + MathUtil.method_163(3), 0);
         field_635[var3 + 3] = MathUtil.method_163(14000) - 7000;
         field_635[var3 + 4] = MathUtil.method_163(14000) - 7000;
         field_635[var3 + 5] = field_635[var3 + 5] + MathUtil.method_163(650);
      }
   }

   public static final void method_274(int var0, int var1) {
      var0 <<= 16;
      var1 <<= 16;
      int var2 = 7;

      while (--var2 >= 0) {
         int var3 = method_266(var0 + (MathUtil.method_163(8) - 4 << 16), var1 + (MathUtil.method_163(8) - 4 << 16), 12, 0);
         field_635[var3 + 3] = MathUtil.method_163(5000) - 2500;
         field_635[var3 + 4] = MathUtil.method_163(5000) - 2500;
         field_635[var3 + 5] = field_635[var3 + 5] + MathUtil.method_163(1250);
      }
   }

   public static final void method_275(int var0, int var1, int var2) {
      var2 = method_266(var0, var1, var2 + 3, 0);
      field_635[var2 + 3] = var0;
      field_635[var2 + 4] = var1;
   }

   public static final void method_276(int var0, int var1, int var2) {
      int var3 = method_266(var0, var1, 14, 0);
      field_635[var3 + 3] = var0;
      field_635[var3 + 4] = var1;
      field_635[var3 + 6] = var2;
   }

   public static final void method_277(int var0, int var1) {
      int var2 = method_266(var0, var1, 28, 0);
      field_635[var2 + 3] = var0;
      field_635[var2 + 4] = var1;
   }

   public static final void method_278(int var0, int var1) {
      method_266(var0 << 16, var1 << 16, 9, 0);
   }

   public static final void method_279(int var0, int var1) {
      method_266(var0 << 16, var1 << 16, 8, 0);
   }

   public static final void method_280(int var0, int var1, int var2) {
      var0 = method_266(var0 << 16, var1 << 16, 27, 0);
      field_635[var0 + 6] = var2;
   }

   public static final void method_281(int var0, int var1) {
      var0 <<= 16;
      var1 <<= 16;
      int var2 = 15;

      while (--var2 >= 0) {
         int var3 = method_266(var0 + (MathUtil.method_163(32) - 16 << 16), var1 + (MathUtil.method_163(32) - 16 << 16), 13, 0);
         field_635[var3 + 3] = MathUtil.method_163(2500) - 1250;
         field_635[var3 + 4] = MathUtil.method_163(2500) - 1250;
         field_635[var3 + 5] = field_635[var3 + 5] + MathUtil.method_163(500);
      }
   }

   public static final void method_282(int var0, int var1) {
      var0 <<= 16;
      var1 <<= 16;
      int var2 = 8;

      int var3;
      for (var3 = MathUtil.method_163(1024); --var2 >= 0; var3 += 128) {
         int var4 = method_266(var0, var1, 10, 0);
         field_635[var4 + 3] = MathUtil.method_158(var3) * 6000 >> 12;
         field_635[var4 + 4] = MathUtil.method_159(var3) * 6000 >> 12;
         field_635[var4 + 5] = field_635[var4 + 5] + 100 + MathUtil.method_163(150);
      }

      var2 = 4;

      for (int var8 = var3 + 64; --var2 >= 0; var8 += 256) {
         int var9 = method_266(var0, var1, 10, 0);
         field_635[var9 + 3] = MathUtil.method_158(var8) * 2000 >> 12;
         field_635[var9 + 4] = MathUtil.method_159(var8) * 2000 >> 12;
      }
   }

   public static final void method_283(int var0, int var1, int var2, int var3) {
      var0 <<= 16;
      var1 <<= 16;
      var2 = 3;

      while (--var2 >= 0) {
         var3 = method_266(var0 + (MathUtil.method_163(15) - 7 << 16), var1 + (MathUtil.method_163(15) - 7 << 16), 10, 0);
         field_635[var3 + 3] = 0;
         field_635[var3 + 4] = 0;
         field_635[var3 + 5] = field_635[var3 + 5] + 100 + MathUtil.method_163(150);
      }
   }

   public static final void method_284(int var0, int var1) {
      var0 <<= 16;
      var1 <<= 16;
      int var2 = 8;

      while (--var2 >= 0) {
         int var3 = method_266(var0 + (MathUtil.method_163(15) - 7 << 16), var1 + (MathUtil.method_163(15) - 7 << 16), 11, 0);
         field_635[var3 + 3] = MathUtil.method_163(10000) - 5000;
         field_635[var3 + 4] = -Math.abs(MathUtil.method_163(10000));
         field_635[var3 + 5] = field_635[var3 + 5] + MathUtil.method_163(350);
      }
   }

   public static final void method_285(int var0, int var1) {
      var0 <<= 16;
      var1 <<= 16;
      int var2 = 3;

      while (--var2 >= 0) {
         int var3 = method_266(var0 + (MathUtil.method_163(8) - 4 << 16), var1 + (MathUtil.method_163(8) - 4 << 16), 15, 0);
         field_635[var3 + 3] = MathUtil.method_163(5000) - 2500;
         field_635[var3 + 4] = MathUtil.method_163(5000) - 2500;
         field_635[var3 + 5] = field_635[var3 + 5] + MathUtil.method_163(400);
      }
   }

   public static final void method_286(int var0, int var1) {
      var0 <<= 16;
      var1 <<= 16;
      int var2 = 12;

      while (--var2 >= 0) {
         int var3 = method_266(var0 + (MathUtil.method_163(20) - 10 << 16), var1 + (MathUtil.method_163(20) - 10 << 16), 16, 0);
         field_635[var3 + 3] = MathUtil.method_163(5000) - 2500;
         field_635[var3 + 4] = MathUtil.method_163(5000) - 2500;
         field_635[var3 + 5] = field_635[var3 + 5] + MathUtil.method_163(400);
      }
   }

   public static final void method_287(int var0, int var1, int var2) {
      var0 <<= 16;
      var1 <<= 16;

      for (int var6 = 0; var6 < 1; var6++) {
         int var3 = method_266(var0, var1, 26, 0);
         field_635[var3 + 3] = MathUtil.method_163(3000) - 1500;
         field_635[var3 + 4] = MathUtil.method_163(3000) - 1500;
         field_635[var3 + 5] = field_635[var3 + 5] + MathUtil.method_163(300);
      }
   }

   public static final void method_288(int var0, int var1) {
      var0 <<= 16;
      var1 <<= 16;
      var0 = method_266(var0, var1, 23, 0);
      field_635[var0 + 3] = MathUtil.method_163(8000) - 4000;
      field_635[var0 + 4] = MathUtil.method_163(5000) - 2000;
      field_635[var0 + 5] = field_635[var0 + 5] + MathUtil.method_163(100);
   }

   public static final void method_289(int var0, int var1, int var2) {
      var0 <<= 16;
      var1 <<= 16;
      int var4 = 10;

      while (--var4 >= 0) {
         int var3 = method_266(var0 + (MathUtil.method_163(8) - 4 << 16), var1 + (MathUtil.method_163(8) - 4 << 16), 15, 0);
         field_635[var3 + 3] = MathUtil.method_163(5000) - 2500;
         field_635[var3 + 4] = MathUtil.method_163(5000) - 2500;
         field_635[var3 + 5] = field_635[var3 + 5] + MathUtil.method_163(400);
      }

      int var7 = method_266(var0, var1, 24, 0);
      field_635[var7 + 3] = MathUtil.method_163(8000) - 4000;
      field_635[var7 + 4] = -7500;
      field_635[var7 + 6] = var2;
   }

   public static final void method_290(int var0, int var1, int var2, int var3) {
      int var4 = 20;

      while (--var4 >= 0) {
         int var5 = method_266((var0 << 16) + (MathUtil.method_163(var2) << 16), (var1 << 16) + (MathUtil.method_163(var3) << 16), 2, 0);
         field_635[var5 + 5] = field_635[var5 + 5] - MathUtil.method_163(350);
         int var6 = MathUtil.method_163(1024);
         int var7 = MathUtil.method_163(1000);
         field_635[var5 + 3] = MathUtil.method_158(var6) * var7 >> 12;
         field_635[var5 + 4] = MathUtil.method_159(var6) * var7 >> 12;
      }
   }

   public static final void method_291(int var0, int var1, int var2, int var3) {
      var0 <<= 16;
      var1 <<= 16;

      for (int var5 = 0; var5 < var2; var5 += 8) {
         for (int var6 = 0; var6 < 2; var6++) {
            int var4 = method_266(var0 + (var5 << 16), var1 + (var6 == 0 ? var3 << 16 : 0), 25, 0);
            field_635[var4 + 5] = field_635[var4 + 5] + 250 + MathUtil.method_163(800);
            int var7 = MathUtil.method_163(1024);
            int var8 = MathUtil.method_163(2500);
            field_635[var4 + 3] = MathUtil.method_158(var7) * var8 >> 12;
            field_635[var4 + 4] = -Math.abs(MathUtil.method_159(var7) * var8 >> 12);
         }
      }

      for (int var12 = 0; var12 < var3; var12 += 8) {
         for (int var13 = 0; var13 < 2; var13++) {
            int var11 = method_266(var0 + (var13 == 0 ? var3 << 16 : 0), var1 + (var12 << 16), 25, 0);
            field_635[var11 + 5] = field_635[var11 + 5] + 250 + MathUtil.method_163(800);
            int var14 = MathUtil.method_163(1024);
            int var15 = MathUtil.method_163(2500);
            field_635[var11 + 3] = MathUtil.method_158(var14) * var15 >> 12;
            field_635[var11 + 4] = -Math.abs(MathUtil.method_159(var14) * var15 >> 12);
         }
      }
   }

   private static final int method_292(Gfx var0, int var1, int var2, int var3, int var4) {
      int var5 = 0;
      class_20 var6 = field_632;
      int var7 = 1;
      int var8 = var4;

      while (var8 / var7 > 9) {
         var7 *= 10;
      }

      int var10 = 1500 - var3;
      int var11 = 0;
      if (var10 > 375) {
         if (var10 > 1125) {
            var11 = 255 - (var10 - 1125 << 8) / 375;
         } else {
            var11 = 255;
         }
      } else {
         var11 = (var10 << 8) / 375;
      }

      var11 = 256 + (var11 << 9 >> 8);
      if (var0 != null) {
         int var12 = var10 * 185 + var3 * 250;
         int var13 = 0 + var3 * 162;
         int var9 = 0 + 0;
         var0.setColor(var12 / 1500 << 16 | var13 / 1500 << 8 | var9 / 1500);
         var10 = method_292(null, 0, 0, var3, var4);
         var1 -= var10 >> 1;
         var10 = var6.method_339() * var11 >> 8;
         var2 -= var10 >> 1;
      }

      boolean var18 = true;

      do {
         var4 = 0;
         int var27 = var8 / var7 % 10;
         if (var18) {
            var27 = 10;
         }

         class_1 var29 = var6.method_323();
         int var20 = var2 - var6.method_337();
         Object var23 = null;
         int[][] var24 = var29.field_29[var27].field_629;
         var27 = var29.field_29[var27].field_629.length;

         for (int var30 = 0; var30 < var27; var30++) {
            int[] var14;
            int var15 = (var14 = var24[var30])[2];
            int var16 = var14[3];
            int var17 = (var15 + var14[4]) * var11 >> 8;
            int var31 = (var16 + var14[5]) * var11 >> 8;
            var15 = var15 * var11 >> 8;
            var4 = Math.max(var4, var17);
            if (var0 != null) {
               var16 = var16 * var11 >> 8;
               var0.fillRect(var1 + var15, var20 + var16, var17 - var15, var31 - var16);
            }
         }

         if (!var18) {
            var7 /= 10;
         }

         if (var18) {
            var18 = false;
            var4 += var11 >> 8;
         }

         var1 += var4 + 2;
         var5 += var4 + 2;
      } while (var7 > 0);

      return var5;
   }
}
