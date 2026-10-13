package monkeyspin;

import monkeyspin.platform.*;


public abstract class GameApp implements Runnable, Lifecycle {
   private long field_0;
   private int field_1;
   private int[] field_2;
   private int field_3;
   private boolean field_4;
   private boolean field_5;
   protected boolean field_6;
   private boolean field_7;
   private boolean field_8;
   private boolean field_9;
   private boolean field_10;
   static GameApp field_11;
   static boolean field_12;
   private static final boolean DEBUG = Boolean.getBoolean("monkeyspin.debug");

   protected GameApp() {
      field_11 = this;
      Host.register(this);
      GameCanvas.method_397(this);
   }

   public void run() {
      try {
         if (!this.field_5) {
            this.field_2 = new int[8];
            this.method_4();
            GameCanvas.method_400();
            this.method_3(2);
            this.field_5 = true;
         }

         if (this.field_9) {
            this.method_3(1);
            GameCanvas.method_403(1);
            this.field_8 = false;
            this.field_9 = false;
            GameCanvas.method_373();
         }

         if (!this.field_8 && !this.field_6) {
            long var4;
            int var1 = (int)((var4 = System.currentTimeMillis()) - this.field_0);
            this.field_0 = var4;
            this.field_3 = this.field_3 - Math.min(this.field_2[this.field_1], 500);
            this.field_3 = this.field_3 + Math.min(var1, 500);
            this.field_2[this.field_1] = var1;
            this.field_1 = this.field_1 + 1 & 7;
            var1 = this.field_3 >> 3;
            if (!field_12) {
               PromoScreen var10000 = GameCanvas.method_404();
               int var15;
               if ((var15 = this.field_1 - 1) < 0) {
                  var15 = 7;
               }

               int var16 = this.field_2[var15];
               PromoScreen var3 = var10000;
               if (var10000.field_622 && var3.field_621 != 0) {
                  var3.field_620 += var16;
                  if (var3.field_620 > var3.field_621) {
                     var3.field_619 = 1;
                     var3.field_622 = false;
                     field_11.method_3(5);
                  }
               }
            }

            field_12 = false;
            GameCanvas.method_372();
            this.method_1(var1);
            GameCanvas.method_403(2);
            GameCanvas.method_373();
         }

         Thread.sleep(1L);
      } catch (Exception var12) {
         if (DEBUG) {
            var12.printStackTrace();
         }
      } finally {
         if (!this.field_6 && !this.field_8) {
            Host.schedule(this);
         } else {
            synchronized (this) {
               this.field_10 = false;
            }
         }
      }

      if (this.field_6 && !this.field_7) {
         GameCanvas.method_392();
         GameCanvas.method_398();
         this.method_3(3);
         Host.exit();
      }
   }

   public void destroyApp(boolean var1) {
      GameCanvas.method_392();
      GameCanvas.method_398();
      this.field_7 = var1;
      this.field_6 = true;
      if (var1) {
         this.method_3(3);
      }
   }

   public void pauseApp() {
      if (!this.field_8) {
         GameCanvas.method_389();
         GameCanvas.method_392();
         this.method_3(0);
         GameCanvas.method_403(0);
         this.field_8 = true;
      }
   }

   public void startApp() {
      if (this.field_4 && this.field_8) {
         this.field_0 = System.currentTimeMillis();
         this.field_9 = true;
         synchronized (this) {
            if (this.field_8 && !this.field_10) {
               this.field_10 = true;
               Host.schedule(this);
            }
         }
      } else {
         if (!this.field_4) {
            GameCanvas.method_391(true);
            synchronized (this) {
               if (!this.field_10) {
                  this.field_10 = true;
                  Host.schedule(this);
               }
            }

            this.field_4 = true;
         }
      }
   }

   public abstract void method_0(Gfx var1);

   public abstract void method_1(int var1);

   public abstract void method_2(int var1, int var2);

   public abstract void method_3(int var1);

   protected final void method_4() {
      this.field_0 = System.currentTimeMillis();
      this.field_1 = 0;

      for (int var1 = 0; var1 < 8; var1++) {
         this.field_2[var1] = 40;
      }

      this.field_3 = 320;
   }

   public static boolean method_5(String var0) {
      boolean var1 = true;

      try {
         if (Host.openUrl(var0)) {
            field_11.destroyApp(false);
         }
      } catch (Exception var2) {
         var1 = false;
      }

      return var1;
   }
}
