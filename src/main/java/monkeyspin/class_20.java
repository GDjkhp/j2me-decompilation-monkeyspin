package monkeyspin;

import monkeyspin.platform.*;


public final class class_20 {
   private class_1[] field_719;
   private class_1 field_720;
   private int field_721;
   private int field_722;
   private boolean field_723;
   private int field_724;
   private int field_725;

   private class_20(class_1[] var1) {
      this.method_319(var1, -2);
   }

   public class_20(class_1 var1) {
      this(new class_1[]{var1});
   }

   public class_20(class_1[] var1, boolean var2) {
      this.method_319(var1, var2 ? -1 : 1);
   }

   public class_20(class_1 var1, boolean var2) {
      this(new class_1[]{var1}, false);
   }

   public class_20() {
   }

   public final class_20 method_318() {
      return this.field_724 == -2 ? new class_20(this.field_719) : new class_20(this.field_719, this.field_724 == -1);
   }

   private void method_319(class_1[] var1, int var2) {
      if (this.field_719 != null) {
         this.method_340();
      }

      this.field_719 = var1;
      int var3 = var1.length;

      while (--var3 >= 0) {
         Assets.method_352(var1[var3], 1);
      }

      this.method_330(0, var2, true);
   }

   public final int method_320() {
      return this.field_720.field_29.length;
   }

   public final int method_321() {
      return this.field_720.field_33;
   }

   private int method_322() {
      int var1 = this.field_721;
      return this.field_720.field_31[var1] + this.field_722;
   }

   public final class_1 method_323() {
      return this.field_720;
   }

   public final class_19[] method_324() {
      int var1 = this.field_721;
      return this.field_720.field_29[var1].field_628;
   }

   public final class_19 method_325(int var1) {
      int var3 = this.field_721;
      class_13 var4;
      int var2 = (var4 = this.field_720.field_29[var3]).field_628.length;

      while (--var2 >= 0) {
         if (var4.field_628[var2].field_718 == var1) {
            return var4.field_628[var2];
         }
      }

      return null;
   }

   public final void method_326(int var1) {
      this.method_333(0);
      boolean var2 = this.field_723;
      this.field_723 = false;
      this.method_327(var1);
      this.field_723 = var2;
   }

   public final void method_327(int var1) {
      int var2 = this.field_721;
      var2 = this.field_720.field_30[var2];
      this.field_722 += var1;

      while (this.field_722 >= var2) {
         this.field_722 -= var2;
         if (this.field_723) {
            this.field_722 = 0;
         }

         var1 = this.field_720.field_29.length;
         this.field_721++;
         if (this.field_721 >= var1) {
            if (this.field_725 > 0) {
               this.field_725--;
            }

            this.field_721 = 0;
            if (this.field_725 == 0) {
               this.field_721 = var1 - 1;
               this.field_722 = var2 - 1;
               return;
            }
         }

         var2 = this.field_721;
         var2 = this.field_720.field_30[var2];
      }
   }

   private boolean method_328() {
      class_1 var2;
      if ((var2 = this.field_720).field_36 != null) {
         int var1 = 6;

         while (--var1 >= 0) {
            if (var2.field_36[var1].field_392.length > 0) {
               return true;
            }
         }
      }

      return false;
   }

   public final void method_329(Gfx var1, int var2, int var3) {
      int var4 = this.method_322();
      if (this.method_328()) {
         var2 += this.method_328() ? this.field_720.method_8(1, this.method_322(), this.method_341()) : 0;
         var3 += this.method_328() ? this.field_720.method_8(2, this.method_322(), this.method_341()) : 0;
      }

      // (hand-reconstructed from the original bytecode: the decompiler mixed up the inlined local slots)
      int frame = var4;
      class_1 seq = this.field_720;
      int idx = -1;
      for (int i = seq.field_30.length - 1; i >= 0; i--) {
         if (frame >= seq.field_31[i]) {
            idx = i;
            break;
         }
      }

      int localFrame = frame;
      if (!seq.field_35) {
         localFrame = frame - seq.field_31[idx];
      }

      seq.field_29[idx].method_261(var1, var2 - seq.field_25, var3 - seq.field_26, localFrame);
   }

   public final void method_330(int var1, int var2, boolean var3) {
      this.field_720 = this.field_719[var1];
      this.field_724 = var2;
      this.field_723 = var3;
      this.method_333(0);
   }

   public final int method_331() {
      int var1 = 0;

      while (this.field_720 != this.field_719[var1]) {
         var1++;
      }

      return var1;
   }

   public final int method_332() {
      return this.field_719.length;
   }

   public final void method_333(int var1) {
      this.field_721 = var1;
      this.field_725 = this.field_724;
      if (this.field_724 == -2) {
         this.field_725 = 1;
         if (this.field_720.field_34) {
            this.field_725 = -1;
         }
      }

      this.field_722 = 0;
   }

   public final int method_334() {
      return this.field_721;
   }

   public final boolean method_335() {
      return this.field_725 == 0;
   }

   public final int method_336() {
      return this.field_720.field_37;
   }

   public final int method_337() {
      return this.field_720.field_38;
   }

   public final int method_338() {
      return this.field_720.field_39;
   }

   public final int method_339() {
      return this.field_720.field_40;
   }

   public final void method_340() {
      if (this.field_719 != null) {
         int var1 = this.field_719.length;

         while (--var1 >= 0) {
            Assets.method_352(this.field_719[var1], -1);
         }

         Assets.method_356();
         this.field_719 = null;
      }
   }

   private boolean method_341() {
      return this.field_725 != 0 && (this.field_725 != 1 || this.field_721 != this.method_320() - 1);
   }
}
