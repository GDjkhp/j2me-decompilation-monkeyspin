package monkeyspin;

import monkeyspin.platform.*;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public final class class_10 {
   public static boolean field_574 = false;
   private MonkeySpin field_575;
   private class_2 field_576;
   private class_20 field_577;
   private class_20 field_578;
   private int field_579 = 5000;
   private class_3 field_580;
   private boolean field_581;
   private int field_582 = -1;
   private boolean field_583;
   private boolean field_584;
   private int field_585;
   private int field_586 = -1;
   private static final int[] field_587 = new int[]{50, 50, 54, 50, 54, 50, 55, 50, 54, 50};
   private int[] field_588;
   private int field_589;
   private class_3 field_590;
   private int field_591;
   private static int field_592 = 0;
   private boolean field_593;
   private boolean field_594 = false;
   private PromoScreen field_595;
   private boolean field_596;
   private boolean field_597;
   private BitmapFont field_598;
   private boolean field_599;
   private boolean field_600;
   private class_4 field_601;
   private String field_602;

   public class_10(MonkeySpin var1, BitmapFont var2, BitmapFont var3, BitmapFont var4) {
      this.field_575 = var1;
      this.field_576 = new class_2();
      class_2.method_84(var3, var4);
      class_3.method_85(var2, var3, var4);
      this.field_593 = GameCanvas.method_402(5) != null;
      this.field_595 = GameCanvas.method_404();
      this.field_594 = (this.field_595.field_626 ? 4 : 2) == 4;
      String var7;
      if ((var7 = GameCanvas.method_402(11)) != null) {
         Integer.parseInt(var7);
      }

      try {
         this.field_598 = new BitmapFont(null, null, Fnt.getFont(32, 0, 8), 0, -1);
      } catch (IOException var5) {
      }

      class_2.method_58();
      this.field_582 = -1;
      if (GameCanvas.method_402(7) != null) {
         this.field_586 = GameCanvas.method_368();
      } else if (GameCanvas.method_369().length == 1) {
         this.field_586 = 0;
      }

      byte[] var6;
      if ((var6 = GameCanvas.method_365("settings")) != null) {
         this.field_586 = var6[0];
         this.field_575.method_7(this.field_586);
         GameCanvas.method_394(var6[1]);
         this.field_584 = var6[3] == 1;
      }
   }

   public final void method_220() {
      this.field_581 = true;
      this.field_582 = -1;
   }

   public final int method_221(int var1, int var2) {
      if (var1 != 10 && var1 != 4) {
         this.method_241(var1);
      }

      if (var1 != 30 || class_2.field_69 != 0) {
         GameApp.field_12 = true;
      }

      if (this.field_597) {
         this.field_597 = false;
         return 0;
      } else {
         if (this.field_581) {
            this.field_581 = false;
            if (var1 == 30) {
               return 22;
            }
         }

         switch (var1) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            default:
               break;
            case 22:
               if (this.field_577.method_335()) {
                  return -2;
               }

               this.field_577.method_327(var2);
               break;
            case 23:
               this.field_579 -= var2;
               this.field_578.method_327(var2);
               if (this.field_579 < 0 || this.field_578.method_335()) {
                  return -2;
               }
               break;
            case 24:
            case 25:
            case 26:
            case 31:
            case 34:
               GameApp.field_12 = true;
               int var10 = 0;
               class_6.field_377 += var2;
               int var11;
               if (class_6.field_378.length == 0) {
                  var11 = 2;
               } else {
                  class_3 var4 = null;
                  if (class_6.field_375 >= 0) {
                     var4 = class_6.field_372[class_6.field_375];
                  } else if (class_6.field_375 == -1) {
                     var4 = class_6.field_379;
                  } else if (class_6.field_375 == -2) {
                     var4 = class_6.field_380;
                  }

                  if (class_6.field_371 != null && class_6.field_371 == var4) {
                     int[] var5;
                     if ((var5 = class_6.field_371.method_98(var2)) != null) {
                        if (class_6.field_374 < 0) {
                           if (class_6.field_374 == -2) {
                              class_6.field_375 = class_6.field_376;
                           } else {
                              var10 = 2;
                           }
                        } else if (var5[1] == class_6.field_383) {
                           if ((class_6.field_373 = class_6.field_378[class_6.field_374]).equals("nolink")) {
                              class_6.field_376 = class_6.field_374;
                              class_6.field_375 = -2;
                           } else {
                              boolean var10000 = GameApp.method_5(class_6.field_373);
                              boolean var6 = false;
                              if (var10000) {
                                 var10 = 1;
                              } else {
                                 class_6.field_375 = -1;
                              }
                           }
                        } else {
                           var10 = 2;
                        }
                     }
                  } else {
                     class_6.field_374 = class_6.field_375;
                     class_6.field_371 = var4;
                     var4.method_97();
                  }

                  if (var10 != 0) {
                     class_6.field_374 = 0;
                     class_6.field_375 = 0;
                     GameCanvas.method_376();
                     class_6.field_371 = null;
                     class_6.field_372 = null;
                     class_6.field_379 = null;
                     class_6.field_380 = null;
                     class_6.field_381 = null;
                     class_6.field_382 = null;
                  }

                  var11 = var10;
               }

               int var7 = var11;
               if (var11 != 0) {
                  this.field_583 = var7 == 1;
                  this.field_584 = true;
                  this.method_242();
                  return -3;
               }
               break;
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
               int var9;
               if ((var9 = this.field_595.method_257(var2)) != 0) {
                  this.field_594 = var9 == 4;
                  if (var1 == 29) {
                     return -3;
                  }

                  return -2;
               }
               break;
            case 30:
               int var8;
               if ((var8 = this.field_576.method_14(var2)) == 1) {
                  return 22;
               }

               if (var8 == 3) {
                  if (class_2.field_49) {
                     class_2.field_69 = 0;
                     class_2.field_139 = 0;
                     return 25;
                  }

                  class_2.field_56 = false;
                  return 26;
               }

               if (var8 == 2) {
                  if ((class_2.field_114 = class_2.method_43()) >= 10) {
                     class_2.field_111++;
                     class_2.field_114 = class_2.method_43();
                     if (class_2.field_111 >= 5) {
                        class_2.field_111 = 4;
                     }
                  }

                  return 24;
               }
               break;
            case 35:
            case 36:
            case 37:
            case 40:
               this.field_601.method_124(var2);
               if (this.field_601.method_126()) {
                  class_2.method_57();
                  return 40;
               }
               break;
            case 38:
               int var3;
               if ((var3 = class_2.method_46(var2)) == 1) {
                  return 33;
               }

               if (var3 == 3) {
                  return 35;
               }

               if (var3 == 2) {
                  return 34;
               }
               break;
            case 39:
               this.field_601.method_124(var2);
               if (this.field_601.method_126()) {
                  class_2.field_105 = true;
                  class_2.method_57();
                  return 41;
               }
               break;
            case 41:
               this.field_601.method_124(var2);
               if (this.field_601.method_126()) {
                  class_2.method_57();
                  return 39;
               }
               break;
            case 42:
               if (class_2.method_66(var2) == 3) {
                  return 42;
               }
               break;
            case 43:
               if (class_2.method_77(var2) == 4) {
                  return 36;
               }
               break;
            case 44:
               this.field_601.method_124(var2);
               if (this.field_601.method_126()) {
                  return 35;
               }
         }

         if (this.field_591 > 0) {
            this.field_591 -= var2;
            if (this.field_591 <= 0 && this.field_590 != null) {
               this.field_590.method_114();
               this.field_590 = null;
            }
         }

         if (this.field_600 && this.field_599 && class_2.field_41 && class_2.field_42) {
            for (class_2.field_71 += var2; class_2.field_71 > 33; class_2.field_71 -= 33) {
               class_2.method_29(false, 0, 0);
            }

            field_592 += var2;
            class_2.field_73 += var2;
         }

         return -1;
      }
   }

   public final void method_222(int var1, Gfx var2) {
      class_2.field_41 = false;
      switch (var1) {
         case 10:
         case 11:
         case 35:
         case 36:
         case 37:
            return;
         case 22:
            var2.setColor(16777215);
            var2.fillRect(0, 0, GameCanvas.method_383(), GameCanvas.method_363());
            this.field_577.method_329(var2, GameCanvas.method_383() >> 1, GameCanvas.method_363() >> 1);
            return;
         case 23:
            var2.setColor(16777215);
            var2.fillRect(0, 0, GameCanvas.method_383(), GameCanvas.method_363());
            this.field_578.method_329(var2, GameCanvas.method_383() >> 1, GameCanvas.method_363() >> 1);
            return;
         case 24:
         case 31:
         case 34:
            return;
         case 25:
            return;
         case 26:
            method_227(var2, var1, 0);
            if (class_6.field_374 < 0) {
               if (class_6.field_374 == -1) {
                  class_6.field_379.method_99(var2, 0, 0);
               }

               if (class_6.field_374 == -2) {
                  class_6.field_380.method_99(var2, 0, 0);
               }

               return;
            }

            if (class_6.field_371 != null) {
               var1 = 0;
               if (class_6.field_385 > 1) {
                  var1 = class_6.field_382.getWidth() + 5;
               }

               class_6.field_371.method_99(var2, var1, 0);
               if (class_6.field_374 > -1 && class_6.field_385 > 1) {
                  var1 = class_6.field_377 / 120 % 5;
                  var2.drawImage(class_6.field_381, 5 - var1, GameCanvas.method_363() / 2, 6);
                  var2.drawImage(class_6.field_382, GameCanvas.method_383() - 5 + var1, GameCanvas.method_363() / 2, 10);
               }
            }

            return;
         case 27:
         case 28:
         case 29:
         case 32:
         case 33:
            method_227(var2, var1, 0);
            PromoScreen var3;
            if ((var3 = this.field_595).field_626 && var3.field_616 != null) {
               var3.field_616.method_99(var2, 0, 0);
            }

            return;
         case 30:
            class_2.method_15(var2, var1);
            return;
         case 38:
            class_2.method_47(var2);
            return;
         case 39:
            this.field_601.method_123(var2);
            return;
         case 40:
         case 41:
            class_2.method_15(var2, var1);
            this.field_601.method_123(var2);
            return;
         case 42:
            method_227(var2, var1, 0);
            class_2.method_67(var2);
            return;
         case 43:
            class_9.method_204(var2);
            class_9.method_218(var2);
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         default:
            return;
         case 44:
            class_9.method_204(var2);
            this.field_601.method_123(var2);
      }
   }

   public final void method_223(int var1, int var2, class_3 var3) {
      switch (var2) {
         case 0:
            field_574 = true;
            break;
         case 2:
            if (var1 == 0) {
               class_2.field_42 = true;
            }

            if (var1 == 10) {
               class_2.field_42 = false;
            }
            break;
         case 30:
            if (class_2.field_49 && var1 == 55) {
               class_2.method_40();
            }
            break;
         case 38:
            class_2.method_41();
            break;
         case 42:
            class_2.field_74 = true;
            break;
         case 43:
            class_2.field_74 = true;
      }

      if (var1 == 4 || var1 == 10) {
         this.method_242();
      }

      this.field_585 = var1;
      if (var2 == 10 || var2 == 4) {
         this.method_241(var2);
      }

      this.field_580 = var3;
   }

   public final void method_224(int var1, int var2, int var3) {
      int var4 = GameCanvas.method_377(var2);
      boolean var5 = var3 == 0 && var4 == 53 || var3 == 3 && GameCanvas.method_382(var2) == 0;
      switch (var1) {
         case 0:
            if (var3 == 0 && GameCanvas.method_402(16) != null) {
               if (this.field_588 == null) {
                  this.field_588 = new int[field_587.length];
               }

               this.field_588[this.field_589 % field_587.length] = var4;
               var1 = 0;

               boolean var12 = false;

               for (; var1 < field_587.length && !var12; var1++) {
                  if (this.field_588[(this.field_589 + var1 + 1) % field_587.length] != field_587[var1]) {
                     var12 = true;
                  }
               }

               if (!var12) {
                  class_2.method_17();
                  var2 = GameCanvas.method_383() - (GameCanvas.method_383() >> 2);
                  var3 = GameCanvas.method_363() - (GameCanvas.method_363() >> 2) - GameCanvas.method_378();
                  var4 = GameCanvas.method_383() - var2 >> 1;
                  int var5b = GameCanvas.method_363() - var3 >> 1;
                  this.field_591 = 2000;
                  this.field_590 = new class_3();
                  this.field_590.method_86(1, 1, 3);
                  this.field_590.method_89(0, 1, GameCanvas.method_381(20), null, -1);
                  this.field_590.field_306[0] = 1;
                  this.field_590.method_87(4);
                  this.field_590.method_96(var4, var5b, var2, var3);
               }

               this.field_589++;
               return;
            }
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         default:
            break;
         case 7:
            return;
         case 8:
            if (var3 == 0 && (var4 == 50 || var4 == 56)) {
               var1 = this.field_580.field_334;
               GameCanvas.method_401(GameCanvas.method_369()[var1][1]);
               return;
            }
            break;
         case 22:
            if (var5) {
               this.field_577.method_333(this.field_577.method_320() - 1);
            }
         case 23:
            if (var1 == 23 && var5) {
               this.field_579 = 0;
               return;
            }
            break;
         case 24:
         case 25:
         case 26:
         case 31:
         case 34:
            if (class_6.field_371 != null) {
               if (class_6.field_372 != null) {
                  var3 = 0;
                  if (var3 == 0) {
                     var3 = GameCanvas.method_377(var2);
                  }

                  if (class_6.field_374 >= 0) {
                     if (var3 == 52) {
                        if (--class_6.field_375 < 0) {
                           class_6.field_375 = class_6.field_372.length - 1;
                        }
                     } else if (var3 == 54 && ++class_6.field_375 > class_6.field_372.length - 1) {
                        class_6.field_375 = 0;
                     }
                  }
               }

               class_6.field_371.method_101(var2, var3);
            }

            return;
         case 27:
         case 28:
         case 29:
         case 32:
         case 33:
            PromoScreen var7 = this.field_595;
            if (this.field_595.field_626 && !var7.field_627) {
               if (var7.field_616 != null) {
                  var7.field_616.method_101(var2, var3);
               }

               return;
            }

            return;
         case 30:
         case 35:
         case 36:
         case 37:
         case 38:
         case 42:
            class_2.method_16(var2, var3);
            return;
         case 39:
         case 40:
         case 41:
         case 44:
            class_4 var6 = this.field_601;
            boolean var16 = false;
            if (var3 == 0 && GameCanvas.method_377(var2) == 53 || var3 == 3 && var2 == 1) {
               var16 = true;
            }

            if (var3 == 3 && var2 == 14) {
               var6.field_365 = true;
            }

            switch (var6.field_361) {
               case 1:
                  if (var16) {
                     var6.field_364 = true;
                  }

                  var6.field_363[var6.field_360].method_101(var2, var3);
                  return;
               case 3:
                  if (var16) {
                     var6.field_364 = true;
                     return;
                  }

                  return;
               default:
                  return;
            }
         case 43:
            class_2.method_16(var2, var3);
            class_9.field_535[class_2.field_252].method_101(var2, var3);
            return;
      }
   }

   public final boolean method_225(int var1) {
      switch (var1) {
         case 45:
            if (this.field_586 == -1) {
               return true;
            }

            return false;
         case 46:
            return this.field_596;
         case 47:
            return true;
         case 48:
            return false;
         case 49:
            return this.field_595.method_256(3);
         case 50:
            return this.field_595.method_256(5);
         case 51:
            return false;
         case 52:
            return false;
         case 53:
            class_2.field_111 = class_2.method_44();
            class_2.field_114 = class_2.method_43();
            if (class_2.field_105) {
               return false;
            }

            class_2.field_105 = true;
            class_2.method_57();
            return true;
         case 54:
            return class_2.method_82();
         case 55:
            return class_2.field_49;
         case 56:
            class_2.field_69 = 0;
            class_2.field_139 = 0;
            if (!class_2.field_49) {
               return true;
            }

            return false;
         case 57:
            if (!class_2.field_49 && class_11.field_615[(class_2.field_76 << 1) + 1] != null && class_11.field_615[(class_2.field_76 << 1) + 1].length > 0) {
               return true;
            }

            return false;
         case 58:
            if (class_2.field_148 > class_11.field_609[1] && !class_2.field_45) {
               class_2.field_45 = true;
               class_2.field_252 = 1;
               class_2.method_57();
               return true;
            }

            return false;
         case 59:
         case 60:
         case 61:
            return true;
         case 62:
            if (this.field_576.field_133) {
               this.field_576.field_133 = false;
               return true;
            }

            return false;
         default:
            return false;
      }
   }

   public final void method_226(int var1, Gfx var2, class_3 var3) {
      method_227(var2, var1, var3.field_317);
      var3.method_100(var2);
      if (var1 == 0 && this.field_590 != null) {
         this.field_590.method_100(var2);
      }
   }

   private static void method_227(Gfx var0, int var1, int var2) {
      class_2.field_41 = true;
      class_9.method_212(var0, var1, var2);
   }

   public final void method_228(int var1) {
      switch (var1) {
         case 2:
            this.field_584 = true;
            break;
         case 3:
            class_2.field_49 = false;
            class_2.method_41();
            return;
         case 4:
            class_2.field_49 = true;
            return;
         case 5:
            GameApp.field_11.field_6 = true;
            return;
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
            Object var6 = null;
            class_9.field_397 = class_2.field_111 = this.field_580.field_334;
            return;
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
            Object var5 = null;
            class_2.field_76 = class_2.field_114 = class_2.method_61(class_2.field_111, this.field_580.field_334);
            class_2.method_20();
            return;
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 32:
         case 34:
         case 35:
         case 36:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         default:
            break;
         case 27:
            class_2.method_18();
            return;
         case 28:
         case 29:
         case 43:
         case 44:
            var1 = var1 == 44 ? 1 : 2;
            GameCanvas.method_394(this.field_580.field_344[var1]);
            GameCanvas.method_384(131073, 1);
            return;
         case 30:
         case 31:
         case 45:
         case 46:
         case 48:
            class_2.method_59();
            this.field_575.method_7(this.field_586);
            return;
         case 33:
            class_2.method_20();
            return;
         case 37:
            class_2.method_19();
            return;
         case 47:
            Object var3 = null;
            this.field_586 = this.field_580.field_334;
            if (this.field_586 != GameCanvas.method_368()) {
               this.field_575.method_7(this.field_586);
               this.method_242();
               return;
            }
            break;
         case 49:
            method_240(true);
            return;
         case 50:
            method_240(false);
            return;
         case 51:
            Object var2 = null;
            this.field_586 = this.field_580.field_334;
            this.field_575.method_7(this.field_586);
            this.method_242();
            return;
      }
   }

   public final String method_229(int var1, int var2, int var3) {
      if (var1 == 3) {
         if (var3 == 0 && this.field_594) {
            var2 = 18;
         }

         if (var2 == 22) {
         }
      } else if (var1 == 0) {
         if (var3 == 0) {
            return this.field_595.method_259();
         }

         if (var3 == 13) {
            return null;
         }

         if (var3 == 6) {
            return null;
         }

         if (var3 == 7) {
            return null;
         }
      } else {
         if (var2 == -2 && (var1 == 4 && var3 == 3 || var1 == 10 && var3 == 3)) {
            return null;
         }

         if (var1 == 11 && var3 == 0 && class_2.field_49) {
            return GameCanvas.method_381(40);
         }
      }

      return GameCanvas.method_381(var2);
   }

   public final void method_230(int var1, class_3 var2, int var3) {
      if (var3 != 0) {
         if (var3 == 1) {
            switch (var1) {
               case 7:
                  var2.method_94(null, this.field_598, this.field_598);
               default:
                  return;
               case 8:
                  var2.method_94(null, this.field_598, this.field_598);
                  return;
            }
         }

         if (var3 == 2) {
            int var4 = GameCanvas.method_379();
            switch (var1) {
               case 4:
                  var2.field_344[1] = var4;
                  break;
               case 10:
                  Object var5 = null;
                  var2.field_344[2] = var4;
                  return;
               case 19:
                  return;
               case 20:
                  return;
            }
         }
      }
   }

   public final boolean method_231(int var1) {
      if (var1 == 8 || var1 == 9) {
         if (var1 == 8 && this.field_586 != -1) {
            return false;
         }

         if (GameCanvas.method_369().length == 1) {
            return false;
         }
      }

      return true;
   }

   public static boolean method_232(int var0, int var1) {
      return var1 == 1 ? var0 == 0 || var0 == 2 : false;
   }

   public final int method_233(int var1) {
      switch (var1) {
         case 0:
         case 1:
         case 6:
         case 8:
            if (this.field_600) {
               return 0;
            }

            return 1;
         case 2:
            return 1;
         case 3:
            return 6;
         case 4:
            return 2;
         case 5:
         case 7:
         default:
            return 0;
      }
   }

   public final void method_234(int var1, int var2) {
      switch (var1) {
         case 0:
         case 1:
         case 6:
         case 8:
            if (this.field_602 == null) {
               this.field_602 = GameCanvas.method_381(225);
            }

            this.field_599 = true;
            if (!this.field_600) {
               class_9.method_173();
               this.field_600 = true;
               if (class_2.field_42) {
                  class_2.method_28();
                  return;
               }
            } else if (class_2.field_42) {
               class_2.method_28();
            }
         case 2:
         case 5:
         case 7:
         default:
            break;
         case 3:
            if (var2 == 0) {
               this.field_596 = this.field_595.method_256(2);
               return;
            }

            if (var2 == 1) {
               if (this.field_596) {
                  this.field_595.method_258();
                  return;
               }
            } else if (var2 != 2 && var2 != 3 && var2 != 4 && var2 == 5) {
               return;
            }
            break;
         case 4:
            if (var2 == 0) {
               if (this.field_578 == null) {
                  this.field_578 = new class_20(Assets.method_345(589843), false);
               }

               return;
            }

            if (var2 == 1) {
               this.field_577 = new class_20(Assets.method_345(524320), false);
               return;
            }
      }
   }

   public final void method_235(int var1) {
      switch (var1) {
         case 0:
         case 6:
         case 8:
            this.field_602 = null;
            this.field_599 = false;
            this.field_600 = false;
         case 1:
         case 2:
         case 3:
         case 5:
         case 7:
         default:
            return;
         case 4:
            this.field_578.method_340();
            this.field_578 = null;
            this.field_577.method_340();
            this.field_577 = null;
      }
   }

   public static int method_236(int var0) {
      switch (var0) {
         case 24:
         case 25:
         case 26:
         case 29:
         case 37:
            return 100;
         case 27:
         case 28:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         default:
            return 0;
         case 30:
            if (class_2.method_82()) {
               return 0;
            }

            return class_2.method_10();
         case 38:
            return Math.max(100, class_2.method_10());
         case 39:
         case 40:
         case 41:
         case 44:
            return Math.max(100, class_2.method_10());
         case 42:
            return 100;
         case 43:
            return 0;
      }
   }

   public final void method_237(boolean var1) {
      if (var1) {
         GameCanvas.method_398();
         this.field_582 = -1;
      } else {
         GameApp.field_11.method_4();
      }
   }

   public final void method_238(int var1, int var2) {
      switch (var1) {
         case 24:
         case 29:
            if (var2 == 1) {
               this.field_595.method_256(4);
               this.field_595.method_258();
               return;
            }
            break;
         case 25:
         case 26:
            if (var2 == 1) {
               byte[] var6 = GameCanvas.method_366(327683);
               ByteArrayInputStream var7 = new ByteArrayInputStream(var6);
               DataInputStream var9 = new DataInputStream(var7);

               try {
                  int var10 = var9.readByte();
                  class_6.field_384 = new int[4][var10];

                  for (int var3 = 0; var3 < var10; var3++) {
                     for (int var4 = 0; var4 < 4; var4++) {
                        class_6.field_384[var4][var3] = var9.readInt();
                     }
                  }

                  var9.close();
                  var7.close();
               } catch (IOException var5) {
               }

               GameCanvas.method_380(34, 282, null, 0);
               String[] var8 = class_6.method_151();
               class_6.method_152(class_6.field_384[1], class_6.field_384[3], class_6.field_384[0], class_6.field_384[2], var8, 34, 5);
               return;
            }
         case 27:
         case 28:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 43:
         default:
            break;
         case 30:
         case 37:
            class_2.method_11(var2);
            return;
         case 38:
            class_2.method_60(var2);
            return;
         case 39:
            if (var2 == 0) {
               class_2.field_114 = 0;
               class_2.field_76 = 0;
               class_2.method_20();
               if (this.field_601 != null) {
                  this.field_601.method_115();
               }

               this.field_601 = new class_4(class_11.field_613);
            }

            this.field_601.method_122(var2);
            return;
         case 40:
            if (var2 == 0) {
               class_2.method_20();
               if (this.field_601 != null) {
                  this.field_601.method_115();
               }

               this.field_601 = new class_4(class_11.field_615[class_2.field_76 << 1]);
            }

            this.field_601.method_122(var2);
            class_2.method_11(var2);
            return;
         case 41:
            if (var2 == 0) {
               if (this.field_601 != null) {
                  this.field_601.method_115();
               }

               this.field_601 = new class_4(class_11.field_615[(class_2.field_76 << 1) + 1]);
            }

            this.field_601.method_122(var2);
            break;
         case 42:
            class_2.method_68(var2);
            return;
         case 44:
            if (var2 == 0) {
               if (this.field_601 != null) {
                  this.field_601.method_115();
               }

               this.field_601 = new class_4(class_11.field_614);
            }

            this.field_601.method_122(var2);
            return;
      }
   }

   public static void method_239(int var0, int var1) {
      switch (var0) {
         case 0:
            if (var1 == 2) {
               class_2.field_42 = true;
            }
            break;
         case 10:
            if (var1 == 2) {
               class_2.field_42 = false;
               return;
            }
      }
   }

   private static void method_240(boolean var0) {
      int var1 = GameCanvas.method_379();
      if (var0) {
         if (var1 == 0) {
            var1 = 3;
         }
      } else {
         var1 = 0;
      }

      GameCanvas.method_394(var1);
   }

   private void method_241(int var1) {
      int var2 = -1;
      boolean var3 = true;
      if (!this.field_583 || var1 != 26 && this.field_585 != 26) {
         switch (var1) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 38:
            case 42:
            case 43:
               var2 = 131072;
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 18:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            default:
               break;
            case 30:
               if (class_2.field_69 == 1 || class_2.field_69 == 4 || class_2.field_69 == 3) {
                  var2 = 131075;
                  var3 = false;
               } else if (class_2.field_69 == 2) {
                  var2 = 131074;
                  var3 = false;
               } else if (class_9.field_397 > 2) {
                  var2 = 131077;
               } else {
                  var2 = 131078;
               }
               break;
            case 39:
            case 40:
            case 41:
            case 44:
               var2 = 131076;
         }
      }

      if (var2 == -1) {
         GameCanvas.method_398();
      } else if (var2 != this.field_582) {
         GameCanvas.method_384(var2, var3 ? -1 : 1);
      }

      this.field_582 = var2;
   }

   private void method_242() {
      byte[] var1;
      (var1 = new byte[4])[0] = (byte)this.field_586;
      var1[1] = (byte)GameCanvas.method_379();
      var1[3] = (byte)(this.field_584 ? 1 : 0);
      GameCanvas.method_393("settings", var1, 1);
   }

   public final void method_243() {
      this.field_597 = true;
   }

   private boolean method_244(int var1, int var2) {
      switch (var1) {
         case 0:
            if (var2 == 10) {
               return false;
            }

            if (var2 == 1) {
               if (this.field_593 && !this.field_584) {
                  return true;
               }

               return false;
            }

            if (var2 == 9) {
               if (this.field_593 && this.field_584) {
                  return true;
               }

               return false;
            }

            if (var2 == 6) {
               return false;
            }

            if (var2 == 0) {
               if (this.field_595.method_259() != null) {
                  return true;
               }

               return false;
            }

            if (var2 == 13) {
               return false;
            }

            if (var2 == 7) {
               return false;
            }

            if (var2 == 4) {
               return true;
            }

            if (var2 == 3) {
               return true;
            }

            if (var2 == 5) {
               return true;
            }
            break;
         case 2:
            if (var2 == 2 || var2 == 3) {
               return true;
            }
            break;
         case 4:
            if (var2 == 0) {
               return false;
            }

            if (var2 == 1) {
               return true;
            }

            if (var2 == 2) {
               return false;
            }

            if (var2 == 4) {
               if (GameCanvas.method_369().length > 1) {
                  return true;
               }

               return false;
            }

            if (var2 == 3) {
               return false;
            }
            break;
         case 10:
            if (var2 == 1) {
               return false;
            }

            if (var2 == 2) {
               return true;
            }

            if (var2 == 4) {
               return false;
            }

            if (var2 == 3) {
               return false;
            }

            if (var2 == 5) {
               return true;
            }
            break;
         case 19:
            if (var2 == 5) {
               return true;
            }

            if (var2 == 2 || var2 == 3 || var2 == 4) {
               return true;
            }
            break;
         case 20:
            if (var2 == 6 || var2 == 7 || var2 == 8 || var2 == 9) {
               return true;
            }
      }

      return true;
   }

   public final void method_245(int var1, class_3 var2, int var3, int var4, int var5) {
      if (var1 != 8 && var1 != 9) {
         var2.method_86(var3, var4, var5);
      } else {
         String[][] var6 = GameCanvas.method_369();
         var2.method_86(var3, var6.length, var5);
         var1 = var1 == 8 ? 51 : 47;

         for (int var8 = 0; var8 < var6.length; var8++) {
            String var9 = var6[var8][0];
            var2.method_89(var8, 0, var9, null, var1);
         }
      }
   }

   public final void method_246(class_3 var1, String var2, class_20 var3, int var4) {
      String var6 = var3 == null ? var2 : null;
      var1.method_88(var6, null, var4);
      var1.field_307 = var1.field_307 || var3 != null;
      var1.field_315 = var3;
   }

   public static void method_247(class_3 var0, String var1, Img var2, int var3) {
      var0.method_88(var2 == null ? var1 : null, var2, var3);
   }

   public final void method_248(class_3 var1, int var2, int var3) {
      var1.field_306[var3] = var2;
   }

   public final void method_249(int var1, class_3 var2, int var3, int var4, String var5, class_20 var6, Img[] var7, int var8) {
      if (this.method_244(var1, var3)) {
         if (var1 == 17 && (var3 == 0 || var3 == 1 || var3 == 2 || var3 == 3 || var3 == 4)) {
            int[] var10 = new int[]{10, 90};
            int[] var12 = new int[]{0, 0};
            String[] var18 = new String[]{var3 + 1 + ".", "" + class_2.field_55[var3]};
            var2.method_89(var3, 6, null, null, -1);
            if (var2.field_349 == null) {
               var2.field_349 = new int[var2.field_303][];
               var2.field_350 = new int[var2.field_303][];
               var2.field_351 = new String[var2.field_303][];
               var2.field_353 = new Img[var2.field_303][];
            }

            if (var2.field_354 == null) {
               var2.field_354 = new class_20[var2.field_303][];
            }

            var2.field_349[var3] = var10;
            var2.field_350[var3] = var12;
            var2.field_351[var3] = var18;
            var2.field_353[var3] = null;
            var2.field_354[var3] = null;
            return;
         }

         if (var6 != null) {
            var2.method_90(var3, var4, var5, var6, var8);
         } else {
            var2.method_89(var3, var4, var5, var7, var8);
         }

         if (var1 == 0 && var3 == 1) {
            int[] var14 = new int[]{300, 300, 300, 300, 1000, 300};
            if (var2.field_357 == null) {
               var2.field_357 = new int[var2.field_303][];
            }

            var2.field_357[var3] = var14;
         }
      }
   }

   public final void method_250(
      int var1, class_3 var2, int var3, String var4, class_20 var5, Img[] var6, String[] var7, class_20 var8, Img[] var9, int var10
   ) {
      if (this.method_244(var1, var3)) {
         if (var5 != null || var8 != null) {
            var2.method_91(var3, var4, null, var7, null, var10);
            var2.field_345[var3] = Math.max(var2.field_345[var3], var8 != null ? var8.method_332() : 0);
            var2.field_331[var3] = var5;
            var2.field_348[var3] = var8;
            return;
         }

         var2.method_91(var3, var4, var6, var7, var9, var10);
      }
   }

   public final void method_251(int var1, class_3 var2, int var3, String var4, class_20 var5, Img[] var6, int var7, int var8, int var9) {
      if (this.method_244(var1, var3)) {
         if (var5 != null) {
            var2.method_92(var3, var4, null, var7, var8, var9);
            var2.field_331[var3] = var5;
            return;
         }

         var2.method_92(var3, var4, var6, var7, var8, var9);
      }
   }

   public static void method_252(class_3 var0, int var1) {
      var0.method_87(var1);
   }

   public final void method_253(int var1, class_3 var2) {
      int var7 = GameCanvas.method_383();
      int var3 = GameCanvas.method_363();
      int var4 = 0;
      int var5 = 0;
      if (class_2.method_9(var1)) {
         var2.method_87(2);
         var1 = GameCanvas.method_383() * 80 / 100;
         int var6 = (GameCanvas.method_363() - GameCanvas.method_378()) * 75 / 100;
         var4 = var7 - var1 >> 1;
         var5 = var3 - var6 >> 1;
         var2.method_96(var4, var5, var1, var6);
      } else {
         var2.method_96(0, 0, var7, var3);
      }
   }

   public static boolean method_254(int var0) {
      switch (var0) {
         case 7:
         case 8:
         case 17:
         case 22:
         case 23:
         case 42:
            return false;
         default:
            return true;
      }
   }

   public static void method_255(Gfx var0, int var1) {
      class_9.method_197(var0, var1, !field_574);
   }
}
