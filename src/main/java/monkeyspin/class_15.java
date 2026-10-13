package monkeyspin;

import monkeyspin.platform.*;

public final class class_15 {
   public static int field_638;
   public int field_639;
   public byte field_640;
   public int field_641;
   public byte field_642;
   public int field_643;
   public int field_644;
   public int field_645;
   public int field_646;
   public int field_647;
   public int field_648;
   public int field_649;
   public int field_650;
   public byte field_651;
   public byte field_652;
   public int field_653;
   public int field_654;
   public int field_655;
   public static int field_656;
   public static int field_657;
   public static int field_658;
   public static int field_659;
   public int field_660;

   public class_15() {
      this.method_293();
   }

   public final void method_293() {
      this.field_660 = 0;
      this.method_294(1, false);
      this.field_643 = 0;
      this.field_644 = 0;
   }

   public final void method_294(int var1, boolean var2) {
      if (var2) {
         this.field_660 |= var1;
      } else {
         this.field_660 &= ~var1;
      }
   }

   public final boolean method_295(int var1) {
      return (this.field_660 & var1) != 0;
   }

   public final void method_296() {
      if (this.field_640 == 1 || this.field_640 == 3 || this.field_640 == 4) {
         field_656 = (this.field_643 >> 8) - this.field_647;
         field_657 = (this.field_644 >> 8) - this.field_647;
         field_658 = this.field_647 << 1;
         field_659 = this.field_647 << 1;
      } else if (this.field_640 == 2) {
         int var1 = this.field_643 >> 8;
         int var2 = this.field_644 >> 8;
         int var3 = this.field_648 >> 8;
         int var4 = this.field_649 >> 8;
         field_656 = Math.min(var1, var3);
         field_657 = Math.min(var2, var4);
         field_658 = Math.max(var1, var3) - field_656;
         field_659 = Math.max(var2, var4) - field_657;
      } else {
         field_656 = this.field_643 >> 8;
         field_657 = this.field_644 >> 8;
         field_658 = this.field_648;
         field_659 = this.field_649;
      }
   }

   public final int method_297() {
      if (this.method_295(64)) {
         class_20 var1 = class_9.field_428;
         if (class_2.field_143.method_295(512)) {
            var1 = class_9.field_429;
         }

         int var2 = this.method_295(256) ? 1 : 0;
         return this.field_643 + (MathUtil.method_169(var1, var2, 1) << 8);
      } else {
         return this.field_643;
      }
   }

   public final int method_298() {
      if (this.method_295(64)) {
         class_20 var1 = class_9.field_428;
         if (class_2.field_143.method_295(512)) {
            var1 = class_9.field_429;
         }

         int var2 = this.method_295(256) ? 1 : 0;
         return this.field_644 + (MathUtil.method_169(var1, var2, 2) << 8);
      } else {
         return this.field_644;
      }
   }

   public final void method_299() {
      this.method_294(8, !this.method_295(8));
   }
}
