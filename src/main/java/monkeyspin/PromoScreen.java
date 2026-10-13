package monkeyspin;

import monkeyspin.platform.*;

public final class PromoScreen implements Runnable {
   class_3 field_616;
   private class_3[] field_617;
   private String field_618;
   int field_619 = 0;
   int field_620;
   int field_621;
   boolean field_622;
   private int field_623;
   private int field_624;
   private boolean field_625;
   boolean field_626;
   boolean field_627;

   public PromoScreen() {
      this.field_618 = GameCanvas.method_402(10);
      this.field_626 = this.field_618 != null;
      this.field_625 = !"nolink".equals(this.field_618);
      String var1;
      if ((var1 = GameCanvas.method_402(11)) != null) {
         this.field_621 = Integer.parseInt(var1) * 1000;
      }

      if ((var1 = GameCanvas.method_402(12)) != null) {
         this.field_624 = Integer.parseInt(var1);
         if (this.field_624 != 0) {
            byte[] var3;
            if ((var3 = GameCanvas.method_365("pc")) != null) {
               this.field_623 = var3[0];
            } else {
               var3 = new byte[1];
            }

            this.field_623++;
            var3[0] = (byte)this.field_623;
            GameCanvas.method_393("pc", var3, 1);
            if (this.field_623 > this.field_624) {
               this.field_619 = 1;
            }
         }
      }
   }

   public final boolean method_256(int var1) {
      if (!this.field_626) {
         return false;
      } else if (var1 == 2) {
         GameCanvas.method_374();
         if (this.field_623 > this.field_624) {
            this.field_619 = 1;
         } else {
            this.field_619 = 0;
         }

         return true;
      } else if (var1 == 4) {
         this.field_622 = false;
         this.field_619 = 2;
         return true;
      } else {
         return false;
      }
   }

   public final int method_257(int var1) {
      if (!this.field_626) {
         return 2;
      } else if (this.field_627) {
         return 0;
      } else {
         int var2 = 0;
         if (this.field_617 == null) {
            this.method_258();
         }

         if (this.field_616 != null && this.field_616 == this.field_617[this.field_619]) {
            int[] var4;
            if ((var4 = this.field_616.method_98(var1)) != null) {
               if (var4[1] == 1) {
                  this.field_622 = true;
                  var2 = 4;
               } else if (var4[1] == 24) {
                  GameApp.method_5(this.field_618);
                  this.field_627 = true;
               } else if (var4[1] == 5) {
                  this.field_622 = true;
                  var2 = 4;
               } else if (var4[1] == 6) {
                  this.field_627 = true;
               }
            }
         } else {
            this.field_616 = this.field_617[this.field_619];
            this.field_616.method_97();
         }

         if (var2 != 0) {
            this.field_619 = 0;
            GameCanvas.method_376();
            this.field_616 = null;
            this.field_617 = null;
         }

         if (this.field_627) {
            try {
               GameApp.field_11.destroyApp(false);
            } catch (Exception var3) {
            }
         }

         return var2;
      }
   }

   public final void run() {
   }

   public final void method_258() {
      String var1 = GameCanvas.method_381(286);
      String var2;
      if (this.field_624 > 0) {
         var1 = var1 + "\\n" + GameCanvas.method_371(GameCanvas.method_381(287), new String[]{"" + (this.field_624 - this.field_623 + 1)});
         if (this.field_623 > this.field_624) {
            var2 = GameCanvas.method_381(288);
         } else {
            var2 = GameCanvas.method_381(289);
         }
      } else {
         var2 = GameCanvas.method_381(289);
      }

      String var3;
      if (this.field_625) {
         GameCanvas.method_380(24, 290, null, 0);
         var2 = var2 + "\\n" + GameCanvas.method_381(291);
         var3 = GameCanvas.method_381(292);
      } else {
         var3 = GameCanvas.method_381(293);
         var2 = var2 + "\\n" + var3;
      }

      this.field_617 = new class_3[3];
      String var4 = GameCanvas.method_381(294);
      this.field_617[0] = new class_3();
      this.field_617[0].method_86(1, 2, 0);
      this.field_617[0].method_88(var4, null, 1);
      this.field_617[0].method_89(1, 1, var1, null, 0);
      this.field_617[0].field_306[0] = 1;
      this.field_617[0].method_95(GameCanvas.method_383(), GameCanvas.method_363());
      this.field_617[1] = new class_3();
      this.field_617[1].method_86(1, 2, 0);
      this.field_617[1].method_88(var4, null, 1);
      this.field_617[1].method_89(1, 1, var2, null, 0);
      if (this.field_625) {
         this.field_617[1].field_306[0] = 24;
      }

      this.field_617[1].field_306[1] = 6;
      this.field_617[1].method_95(GameCanvas.method_383(), GameCanvas.method_363());
      this.field_617[2] = new class_3();
      this.field_617[2].method_86(1, 2, 0);
      this.field_617[2].method_88(var4, null, 1);
      this.field_617[2].method_89(1, 1, var3, null, 0);
      if (this.field_625) {
         this.field_617[2].field_306[0] = 24;
      }

      if (this.field_623 > this.field_624) {
         this.field_617[2].field_306[1] = 6;
      } else {
         this.field_617[2].field_306[1] = 5;
      }

      this.field_617[2].method_95(GameCanvas.method_383(), GameCanvas.method_363());
   }

   public final String method_259() {
      return !this.field_626 ? null : GameCanvas.method_381(46);
   }
}
