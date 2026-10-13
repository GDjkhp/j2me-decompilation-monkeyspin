package monkeyspin;

import monkeyspin.platform.*;


public final class class_4 {
   private int[][] field_359;
   int field_360;
   int field_361;
   private class_20[][] field_362;
   class_3[] field_363;
   boolean field_364 = false;
   boolean field_365 = false;
   private int field_366;

   public final void method_115() {
      if (this.field_362 != null) {
         for (int var1 = 0; var1 < this.field_362.length; var1++) {
            for (int var2 = 0; var2 < this.field_362[var1].length; var2++) {
               this.field_362[var1][var2].method_340();
            }
         }
      }
   }

   public class_4(int[][] var1) {
      this.field_359 = var1;
   }

   private int method_116(int var1) {
      return this.field_359[var1].length - 1;
   }

   private int method_117(int var1, int var2) {
      int var3;
      int var4;
      if ((var3 = this.method_118(var1, var2)) == 524470 || var3 == 524453 || var3 == 524466) {
         var4 = 36;
      } else if (var3 != 524457
         && var3 != 524460
         && var3 != 524456
         && var3 != 524465
         && var3 != 524454
         && var3 != 524459
         && var3 != 524455
         && var3 != 524468
         && var3 != 524461
         && var3 != 524451
         && var3 != 524452
         && var3 != 524458
         && var3 != 524463
         && var3 != 524464
         && var3 != 524467) {
         var4 = 3;
      } else {
         var4 = 40;
      }

      return var4;
   }

   private int method_118(int var1, int var2) {
      return var2 == 0 ? this.field_359[var1][0] : this.field_359[var1][var2 + 1];
   }

   private int method_119(int var1, int var2) {
      int var3 = GameCanvas.method_383();
      GameCanvas.method_363();
      int var4 = this.method_117(var1, var2);
      var1 = 0;
      if ((var4 & 1) != 0) {
         var1 = var3 / 2;
      }

      if ((var4 & 8) != 0) {
         var1 = var3 - 1;
      }

      return var1;
   }

   private int method_120(int var1, int var2) {
      GameCanvas.method_383();
      int var3 = GameCanvas.method_363();
      int var4 = this.method_117(var1, var2);
      var1 = 0;
      if ((var4 & 2) != 0) {
         var1 = var3 / 2;
      }

      if ((var4 & 32) != 0) {
         var1 = var3 - 1;
      }

      return var1;
   }

   private void method_121(Gfx var1, int var2) {
      GameCanvas.method_383();
      GameCanvas.method_363();
      int var3 = this.method_116(var2);

      for (int var4 = 0; var4 < var3; var4++) {
         this.field_362[var2][var4].method_329(var1, this.method_119(var2, var4), this.method_120(var2, var4));
      }
   }

   public final void method_122(int var1) {
      if (this.field_359 == null) {
         this.field_361 = 4;
      } else {
         switch (var1) {
            case 0:
               this.field_362 = new class_20[this.field_359.length][];
               this.field_363 = new class_3[this.field_359.length];
               this.field_366 = 0;

               for (int var8 = 0; var8 < this.field_359.length; var8++) {
                  int var2 = this.method_116(var8);
                  this.field_362[var8] = new class_20[var2];

                  for (int var3 = 0; var3 < var2; var3++) {
                     if (var3 == 0 && var8 > 0 && this.method_118(var8, var3) == this.method_118(var8 - 1, var3)) {
                        this.field_362[var8][var3] = this.field_362[var8 - 1][var3];
                     } else {
                        this.field_362[var8][var3] = new class_20(Assets.method_345(this.method_118(var8, var3)), false);
                     }
                  }

                  this.field_366 = this.field_366 + this.field_362[var8][0].method_321();
                  int var11;
                  if ((var11 = this.field_359[var8][1]) != -1) {
                     for (int var4 = 0; var4 < var2; var4++) {
                        class_20 var5;
                        int var6 = (var5 = this.field_362[var8][var4]).method_320();
                        class_19[] var7 = null;
                        var5.method_333(--var6);
                        var7 = var5.method_324();
                        var5.method_333(0);
                        if (var7 != null && var7.length > 0) {
                           class_3[] var10000 = this.field_363;
                           class_19 var10002 = var7[0];
                           int var14 = this.method_120(var8, var4);
                           var4 = this.method_119(var8, var4);
                           class_19 var9 = var10002;
                           var4 += var9.field_714;
                           int var15 = var14 + var9.field_715;
                           var6 = var9.field_716;
                           var2 = var9.field_717;
                           class_3 var7b = new class_3();
                           var7b.method_86(1, 1, 3);
                           var7b.method_89(0, 1, GameCanvas.method_381(var11), null, -1);
                           var7b.method_87(2);
                           var7b.method_96(var4, var15, var6, var2);
                           var10000[var8] = var7b;
                           break;
                        }
                     }
                  }
               }
         }
      }
   }

   public final void method_123(Gfx var1) {
      switch (this.field_361) {
         case 0:
            return;
         case 1:
            this.method_121(var1, this.field_360);
            this.field_363[this.field_360].method_100(var1);
            return;
         case 2:
            this.method_121(var1, this.field_360);
            return;
         case 3:
            this.method_121(var1, this.field_360);
      }
   }

   final void method_124(int var1) {
      if (this.field_365) {
         this.method_125(4);
      }

      switch (this.field_361) {
         case 0:
            this.field_360 = 0;
            this.method_125(2);
            return;
         case 1:
            this.field_363[this.field_360].method_98(var1);
         case 3:
            if (this.field_364 || this.field_361 == 3) {
               if (this.field_360 < this.field_362.length - 1) {
                  this.field_360++;
                  this.method_125(2);
                  return;
               } else {
                  this.method_125(4);
               }
            }
         default:
            return;
         case 2:
            boolean var10000;
            label58: {
               class_4 var2 = this;
               if (this.field_359[this.field_360][0] != -1
                  && (
                     this.field_362[this.field_360].length != 1
                        || this.field_362[this.field_360][0].method_320() != this.field_362[this.field_360][0].method_334()
                  )) {
                  int var3 = this.method_116(this.field_360);
                  int var4 = 0;

                  while (true) {
                     if (var4 >= var3) {
                        var10000 = false;
                        break label58;
                     }

                     if (var2.field_362[var2.field_360][var4].method_335()) {
                        break;
                     }

                     var4++;
                  }
               }

               var10000 = true;
            }

            if (var10000) {
               if (this.field_363[this.field_360] != null) {
                  this.method_125(1);
               } else {
                  this.method_125(3);
               }
            } else {
               int var9 = this.field_360;
               int var8 = var1;
               class_4 var7 = this;
               int var5 = this.method_116(var9);

               for (int var6 = 0; var6 < var5; var6++) {
                  var7.field_362[var9][var6].method_327(var8);
               }
            }
      }
   }

   private void method_125(int var1) {
      switch (var1) {
         case 1:
            GameCanvas.method_376();
            GameCanvas.method_388(1, 1);
            if (this.field_360 < this.field_362.length - 1) {
               GameCanvas.method_388(14, 3);
            }
         case 3:
            break;
         default:
            GameCanvas.method_376();
            GameCanvas.method_388(14, 3);
      }

      this.field_364 = false;
      this.field_365 = false;
      this.field_361 = var1;
   }

   public final boolean method_126() {
      return this.field_361 == 4;
   }
}
