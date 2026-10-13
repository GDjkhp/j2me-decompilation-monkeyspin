package monkeyspin;

import monkeyspin.platform.*;

import java.io.DataInputStream;
import java.io.IOException;

public final class BitmapFont {
   Img field_700;
   Fnt field_701;
   int field_702;
   int field_703;
   boolean field_704;
   private int field_705;
   private int field_706;
   int field_707;
   byte[] field_708;
   short[] field_709;
   byte[] field_710;
   byte[] field_711;
   byte[] field_712;
   private int[] field_713;

   public BitmapFont(Img var1, DataInputStream var2, Fnt var3, int var4, int var5) throws IOException {
      if (var1 != null) {
         this.field_700 = var1;
         int var6 = var2.readShort();
         this.field_705 = var2.readByte();
         this.field_706 = var2.readByte();
         this.field_707 = var2.readByte();
         int var7 = 1;

         while (var7 < (var6 << 2) / 3) {
            var7 <<= 1;
         }

         Object var8 = null;
         this.field_713 = new int[var7];
         this.field_708 = new byte[var6];
         this.field_709 = new short[var6];
         this.field_710 = new byte[var6];
         this.field_711 = new byte[var6];
         this.field_712 = new byte[var6];

         while (var6 > 0) {
            int var9 = var2.read();

            for (char var11 = var2.readChar(); var9-- > 0; var11++) {
               this.field_708[--var6] = (byte)var2.readByte();
               this.field_709[var6] = (short)var2.readShort();
               this.field_710[var6] = (byte)var2.readByte();
               this.field_711[var6] = (byte)var2.readByte();
               this.field_712[var6] = (byte)var2.readByte();
               this.method_315(var11, (short)var6);
            }
         }
      } else {
         this.field_701 = var3;
         this.field_702 = var4;
         this.field_703 = var5;
         this.field_704 = var5 != -1;
      }
   }

   final int method_310(char var1) {
      int var2 = this.method_316(var1);
      if (var2 == -1) {
         var2 = this.method_316(' ');
      }

      return var2;
   }

   public final int method_311(String var1) {
      if (this.field_700 == null) {
         return this.field_701.stringWidth(var1) + (this.field_704 ? 2 : 0);
      } else {
         int var2 = 0;

         for (int var3 = 0; var3 < var1.length(); var3++) {
            int var4 = var1.charAt(var3);
            var4 = this.method_310((char)var4);
            var2 += this.field_710[var4] + this.field_705;
         }

         if (this.field_705 < 0) {
            var2 -= this.field_705;
         }

         return var2;
      }
   }

   public final int method_312(char var1) {
      if (this.field_700 != null) {
         int var2 = this.method_310(var1);
         return this.field_710[var2] + this.field_705;
      } else {
         return this.field_701.charWidth((char)var1);
      }
   }

   public final int method_313() {
      return this.field_700 != null ? this.field_706 + this.field_707 : this.field_701.getHeight() + (this.field_704 ? 2 : 0);
   }

   public final void method_314(Gfx var1, String var2, int var3, int var4, int var5) {
      if (this.field_700 != null) {
         if ((var5 & 1) != 0) {
            var3 -= this.method_311(var2) >> 1;
         } else if ((var5 & 8) != 0) {
            var3 -= this.method_311(var2);
         }

         if ((var5 & 16) != 0) {
            var4 += this.field_706;
         } else if ((var5 & 32) != 0) {
            var4 -= this.field_707;
         }

         if ((var5 & 2) == 0) {
            int var19 = var1.getClipX();
            var5 = var1.getClipY();
            int var7 = var1.getClipWidth();
            int var8 = var1.getClipHeight();

            for (int var9 = 0; var9 < var2.length(); var9++) {
               char var10 = var2.charAt(var9);
               int var11 = this.method_310(var10);
               int var12 = this.field_710[var11];
               if (var10 != ' ') {
                  int var20 = this.field_712[var11];
                  int var13 = this.field_711[var11];
                  int var14 = var19 + var7;
                  int var15 = var5 + var8;
                  int var16 = Math.max(var19, var3);
                  int var17 = Math.max(var5, var4 - var20);
                  var14 = Math.max(var16, Math.min(var14, var3 + var12));
                  var13 = Math.max(var17, Math.min(var15, var4 - var20 + var13));
                  var1.setClip(var16, var17, var14 - var16, var13 - var17);
                  var1.drawImage(this.field_700, var3 - (this.field_708[var11] & 255), var4 - this.field_709[var11] - var20, 20);
               }

               var3 += var12 + this.field_705;
            }

            var1.setClip(var19, var5, var7, var8);
         }
      } else {
         var1.setFont(this.field_701);
         int var6 = var1.getColor();
         if (this.field_704) {
            if ((var5 & 4) != 0) {
               var3++;
            } else if ((var5 & 8) != 0) {
               var3--;
            }

            if ((var5 & 16) != 0) {
               var4++;
            } else if ((var5 & 32) != 0) {
               var4--;
            }

            var1.setColor(this.field_703);
            var1.drawString(var2, var3, var4 - 1, var5);
            var1.drawString(var2, var3 - 1, var4, var5);
            var1.drawString(var2, var3 + 1, var4, var5);
            var1.drawString(var2, var3, var4 + 1, var5);
         }

         var1.setColor(this.field_702);
         var1.drawString(var2, var3, var4, var5);
         var1.setColor(var6);
      }
   }

   private void method_315(char var1, short var2) {
      int var3 = method_317(var1);

      for (int var4 = 0; var4 < this.field_713.length; var4++) {
         if (this.field_713[var3 & this.field_713.length - 1] == 0) {
            this.field_713[var3 & this.field_713.length - 1] = var1 << 16 | var2 & '\uffff';
            return;
         }

         var3++;
      }
   }

   private int method_316(char var1) {
      int var2 = method_317(var1);

      int var4;
      for (int var3 = 0; var3 < this.field_713.length && (var4 = this.field_713[var2 & this.field_713.length - 1]) != 0; var3++) {
         if (var4 >>> 16 == var1) {
            return var4 & 65535;
         }

         var2++;
      }

      return -1;
   }

   private static int method_317(char var0) {
      return (var0 + 4660) * (var0 + 17185);
   }
}
