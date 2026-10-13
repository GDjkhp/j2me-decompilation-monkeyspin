package monkeyspin;

import monkeyspin.platform.*;


public final class class_16 {
   class_10 field_661;
   byte[] field_662;
   private short[] field_663;
   short[] field_664;
   byte[] field_665;
   int field_666 = -1;
   int field_667 = -1;
   class_3 field_668;
   short[] field_669;
   short[] field_670;
   class_3[] field_671;
   short[][] field_672;
   short[][] field_673;
   short[][] field_674;
   int field_675;
   int field_676;
   int field_677;
   int field_678;
   boolean field_679;
   boolean field_680;
   short[] field_681;
   int field_682;
   boolean field_683;
   int field_684;
   int field_685;
   int field_686;
   int field_687;
   int field_688;
   boolean field_689;
   short[] field_690;
   byte[] field_691;
   boolean[] field_692;

   public class_16(int var1, class_10 var2) {
      this.method_300(var1, var2);
   }

   private void method_300(int var1, class_10 var2) {
      this.field_661 = var2;
      byte[] var6 = GameCanvas.method_366(var1);
      this.field_662 = var6;
      int var9 = var6[0] & 255;
      int var3 = 2;
      this.field_663 = new short[var9];

      for (int var4 = 0; var4 < var9; var4++) {
         this.field_663[var4] = (short)((var6[var3++] & 255) << 8 | var6[var3++] & 255);
      }

      int var17 = var6[var3++] & 255;
      this.field_692 = new boolean[var17];
      this.field_675 = var6[var3++] & 255;
      this.field_676 = this.field_675;
      this.field_677 = var6[var3++] & 255;
      this.field_678 = this.field_676 + this.field_677;
      int var10 = var6[var3++] & 255;
      var17 = this.field_675 + this.field_677 + var10;
      this.field_665 = new byte[var17];

      for (int var5 = 0; var5 < var17; var5++) {
         this.field_665[var5] = var6[var3++];
      }

      this.field_664 = new short[var17];

      for (int var19 = 0; var19 < var17; var19++) {
         this.field_664[var19] = (short)((var6[var3++] & 255) << 8 | var6[var3++] & 255);
      }

      this.field_667 = var6[var3] & 255;
      this.field_671 = new class_3[this.field_675];
      this.field_672 = new short[this.field_675][];
      this.field_673 = new short[this.field_677][];
      this.field_674 = new short[var10][];
      this.field_691 = new byte[this.field_675];
      int var20 = this.field_675;

      for (int var7 = 0; var7 < this.field_677; var20++) {
         this.method_303(var20);
         var7++;
      }

      for (int var8 = 0; var8 < var10; var20++) {
         this.method_306(var20);
         var8++;
      }

      this.field_681 = new short[this.field_675 + var10 + this.field_677];
      this.field_682 = 0;
      this.field_680 = false;
   }

   final boolean method_301(int var1) {
      return var1 < this.field_675;
   }

   static int method_302(byte[] var0, int var1, int var2, Img[][] var3, class_20[] var4) {
      var3[0] = null;
      var4[0] = null;
      int[] var5 = new int[var2];
      byte[] var6 = new byte[var2];
      boolean var7 = false;
      boolean var8 = false;

      for (int var9 = 0; var9 < var2; var9++) {
         var5[var9] = method_305(var0, var1);
         var1 += 4;
         var8 = var8 || var5[var9] != -1;
         var6[var9] = var0[var1++];
         var7 = var7 || var6[var9] == 2 || var6[var9] == 3;
      }

      if (var8) {
         if (var7) {
            var4[0] = new class_20(Assets.method_346(var5), true);
         } else {
            var3[0] = new Img[var2];

            for (int var12 = 0; var12 < var2; var12++) {
               Img var10 = null;
               if (var6[var12] == 0) {
                  var10 = GameCanvas.method_375(var5[var12]);
               } else if (var6[var12] == 1) {
                  var10 = Assets.method_347(var5[var12]);
               }

               var3[0][var12] = var10;
            }
         }
      }

      return var1;
   }

   final void method_303(int var1) {
      byte[] var2 = this.field_662;
      int var3 = this.field_664[this.field_675 + (var1 - this.field_676)];
      int var4;
      short[] var5 = new short[var4 = var2[var3++] & 255];

      for (int var6 = 0; var6 < var4; var6++) {
         var5[var6] = method_304(var2[var3++]);
      }

      this.field_673[var1 - this.field_676] = var5;
   }

   static short method_304(byte var0) {
      short var1;
      return (var1 = (short)(var0 & 255)) == 255 ? -1 : var1;
   }

   public static int method_305(byte[] var0, int var1) {
      return var0[var1++] << 24 | (var0[var1++] & 0xFF) << 16 | (var0[var1++] & 0xFF) << 8 | var0[var1] & 0xFF;
   }

   final void method_306(int var1) {
      byte[] var2 = this.field_662;
      int var3 = this.field_664[this.field_675 + this.field_677 + (var1 - this.field_678)];
      short[] var4;
      (var4 = new short[2])[0] = method_304(var2[var3++]);
      var4[1] = method_304(var2[var3]);
      this.field_674[var1 - this.field_678] = var4;
   }

   final void method_307(int var1) {
      short var2 = -1;
      if (this.field_682 > 0) {
         var2 = this.field_681[this.field_682 - 1];
      }

      if (var1 != -1) {
         if (var1 == -2) {
            if (this.field_669 != null && this.field_669.length > 0) {
               this.method_307(this.field_669[0]);
               return;
            }
         } else {
            if (var1 == -3) {
               this.field_679 = false;
               this.field_667 = var2;
               this.field_682--;
               return;
            }

            if (var1 >= 0) {
               short var3;
               if ((var3 = this.field_663[var1]) != -1) {
                  this.field_679 = true;
                  this.field_667 = var3;
                  if (this.method_301(this.field_666)) {
                     this.field_691[this.field_666] = (byte)this.field_668.field_334;
                  }

                  if (var2 == var3) {
                     this.field_679 = false;
                     this.field_682--;
                  } else if (this.field_680) {
                     this.field_681[this.field_682++] = (short)this.field_666;
                  }
               }

               this.field_661.method_228(var1);
            }
         }
      }
   }

   final void method_308(int var1) {
      if (this.field_671[var1] != null) {
         this.field_671[var1].method_114();
         this.field_671[var1] = null;
      }
   }

   public final int method_309() {
      int var1 = -1;
      if (this.field_683) {
         var1 = 100 - this.field_688;
         if (this.field_689) {
            var1 += this.field_685 * this.field_688 / this.field_684;
         } else {
            var1 = this.field_685 * var1 / this.field_684;
            if (this.field_685 == this.field_684 && Assets.method_349() == 0) {
               var1 = 100;
            }
         }
      }

      return var1;
   }
}
