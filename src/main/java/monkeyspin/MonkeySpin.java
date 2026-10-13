package monkeyspin;

import monkeyspin.platform.*;

import java.io.IOException;
import java.util.Vector;

/** Desktop entry point of the Monkey Spin port (Digital Chocolate, 2009). */
public class MonkeySpin extends GameApp {

   public static void main(String[] args) {
      new MonkeySpin().startApp();
   }

   private class_16 field_13;
   private class_16 field_14;
   private class_16 field_15;
   private boolean field_16;
   private boolean field_17;
   private int field_18;
   private int field_19;
   private int field_20;
   private boolean field_21;
   private BitmapFont field_22;
   private BitmapFont field_23;
   private BitmapFont field_24;

   public MonkeySpin() {
   }

   public final void method_1(int var1) {
      if (!this.field_16) {
         if (!this.field_17) {
            this.field_18 = 6;
            this.field_19 = 0;
            this.field_17 = true;
         } else if (this.field_19 >= this.field_18) {
            this.field_16 = true;
            this.field_17 = false;
            this.field_15 = this.field_13;
            this.method_4();
         } else {
            switch (this.field_19) {
               case 0:
                  Assets.method_342();
                  break;
               case 1:

                  try {
                     Object var31 = null;
                     Object var46 = null;
                     Object var81 = null;
                     Fnt var89 = Fnt.getFont(32, 0, 8);
                     Fnt var91 = Fnt.getFont(32, 1, 8);
                     Fnt var94 = Fnt.getFont(32, 1, 0);
                     var31 = GameCanvas.method_375(65545);
                     var46 = GameCanvas.method_375(65543);
                     var81 = GameCanvas.method_375(65541);
                     this.field_22 = new BitmapFont((Img)var31, GameCanvas.method_364(65546), var89, 0, -1);
                     this.field_23 = new BitmapFont((Img)var46, GameCanvas.method_364(65544), var91, 16777215, 0);
                     this.field_24 = new BitmapFont((Img)var81, GameCanvas.method_364(65542), var94, 16776960, 0);
                     class_3.method_85(this.field_24, this.field_22, this.field_23);
                     GameCanvas.method_387(this.field_23);
                  } catch (IOException var21) {
                  }
                  break;
               case 2:
                  class_1[] var30 = Assets.method_346(new int[]{524310, 524312, 524311});
                  class_1[] var119 = Assets.method_346(new int[]{524313, 524315, 524314});
                  class_20 var10000 = new class_20(var30, true);
                  class_20 var43 = new class_20(var119, true);
                  class_20 var79 = var10000;
                  class_3.field_253 = var10000;
                  class_3.field_254 = var43;
                  class_3.field_257 = 0;

                  for (int var85 = 0; var85 < var79.method_332(); var85++) {
                     var79.method_330(var85, -1, true);
                     class_3.field_257 = Math.max(class_3.field_257, var79.method_339() + 2);
                  }

                  class_3.field_258 = 0;

                  for (int var86 = 0; var86 < var43.method_332(); var86++) {
                     var43.method_330(var86, -1, true);
                     class_3.field_258 = Math.max(class_3.field_258, var43.method_339() + 2);
                  }

                  class_1[] var121 = Assets.method_346(new int[]{524316, 524317});
                  class_1[] var44 = Assets.method_346(new int[]{524318, 524319});
                  var10000 = new class_20(var121, true);
                  var43 = new class_20(var44, true);
                  var79 = var10000;
                  class_3.field_269 = 0;
                  class_3.field_270 = 0;

                  for (int var87 = 0; var87 < var79.method_332(); var87++) {
                     var79.method_330(var87, -1, true);
                     class_3.field_269 = Math.max(class_3.field_269, var79.method_338() + 2);
                  }

                  for (int var88 = 0; var88 < var43.method_332(); var88++) {
                     var43.method_330(var88, -1, true);
                     class_3.field_270 = Math.max(class_3.field_270, var43.method_338() + 2);
                  }

                  class_3.field_267 = var79;
                  class_3.field_268 = var43;
                  break;
               case 3:
                  this.field_13 = new class_16(196609, new class_10(this, this.field_24, this.field_22, this.field_23));
                  break;
               case 4:
                  this.method_6();
                  break;
               case 5:
                  for (int var93 = 0; var93 < Assets.method_349(); var93++) {
                     Assets.method_350();
                  }
            }

            this.field_19++;
         }
      } else {
         if (this.field_15 != this.field_14) {
            this.field_14 = this.field_15;
         }

         if (this.field_14 != null) {
            class_16 var23 = this.field_14;
            if (this.field_14.field_667 != -1) {
               class_16 var29 = var23;
               GameApp.field_12 = true;

               label371:
               while (var29.field_667 != -1) {
                  if (!var29.field_683) {
                     int var117 = var29.field_666 != -1 ? var29.field_665[var29.field_666] : -1;
                     int var13 = var29.field_665[var29.field_667];
                     if (var29.field_666 != -1) {
                        if (var117 == -1) {
                           if (var29.method_301(var29.field_666)) {
                              var29.method_308(var29.field_666);
                           }
                        } else if (var117 != var13 && !class_10.method_232(var117, var13)) {
                           int var39 = var29.field_692.length;

                           while (--var39 >= 0) {
                              if (var29.field_692[var39] && var39 != var13) {
                                 var29.field_661.method_235(var39);
                                 int var76 = var29.field_665.length;

                                 while (--var76 >= 0) {
                                    if (var29.field_665[var76] == var39 && var29.method_301(var76)) {
                                       var29.method_308(var76);
                                    }
                                 }

                                 var29.field_692[var39] = false;
                              }
                           }
                        }

                        class_10.method_239(var29.field_666, var29.field_667);
                        var29.field_668 = null;
                        var29.field_669 = null;
                        var29.field_670 = null;
                        GameCanvas.method_376();
                     }

                     var29.field_686 = 0;
                     if (var13 != -1 && var13 != var117) {
                        if (!class_10.method_232(var13, var117)) {
                           var29.field_686 = var29.field_661.method_233(var13);
                        }

                        int var41 = 0;

                        for (int var77 = 0; var77 < var29.field_665.length; var77++) {
                           if (var29.field_665[var77] == var13 && var29.method_301(var77) && var29.field_671[var77] == null) {
                              var41++;
                           }
                        }

                        var29.field_690 = new short[var41];
                        int var78 = 0;

                        for (int var42 = 0; var42 < var29.field_665.length; var42++) {
                           if (var29.field_665[var42] == var13 && var29.method_301(var42) && var29.field_671[var42] == null) {
                              var29.field_690[var78++] = (short)var42;
                           }
                        }
                     } else {
                        int var40 = var29.field_667;
                        if (var29.method_301(var40) && var29.field_671[var40] == null) {
                           var29.field_690 = new short[]{(short)var40};
                        } else {
                           var29.field_690 = new short[0];
                        }
                     }

                     var29.field_687 = class_10.method_236(var29.field_667);
                     var29.field_684 = var29.field_686 + var29.field_687 + var29.field_690.length;
                     var29.field_688 = 75;
                     if (var29.field_684 > 0) {
                        var29.field_661.method_237(true);
                        var29.field_685 = 0;
                        var29.field_683 = true;
                        var29.field_689 = false;
                        GameCanvas.method_376();
                        break;
                     }
                  } else {
                     if (var29.field_685 < var29.field_684) {
                        long var116 = System.currentTimeMillis();

                        while (true) {
                           if (var29.field_689) {
                              Assets.method_350();
                           } else {
                              int var48 = var29.field_685;
                              if (var29.field_685 < var29.field_686) {
                                 int var37 = var29.field_665[var29.field_667];
                                 var29.field_661.method_234(var37, var48);
                              } else if ((var48 = var48 - var29.field_686) < var29.field_687) {
                                 var29.field_661.method_238(var29.field_667, var48);
                              } else {
                                 var48 -= var29.field_687;
                                 short var35 = var29.field_690[var48];
                                 short var24 = var35;
                                 class_16 var84 = var29;
                                 if (var29.field_661.method_231(var35)) {
                                    byte[] var36 = var29.field_662;
                                    var48 = var29.field_664[var35];
                                    int var90 = var36[var48++];
                                    Vector var92 = new Vector();
                                    Img[][] var8 = new Img[1][];
                                    class_20[] var9 = new class_20[1];
                                    int var10 = var36[var48++];
                                    int var11 = var36[var48++];
                                    class_3 var14 = new class_3();
                                    var29.field_661.method_230(var35, var14, 0);
                                    var29.field_661.method_245(var35, var14, var10, var90, var11);
                                    var10 = var36[var48++];
                                    class_10.method_252(var14, var10);
                                    var11 = class_16.method_305(var36, var48);
                                    var48 += 4;
                                    String var15 = var29.field_661.method_229(var35, var11, -1);
                                    var48 = class_16.method_302(var36, var48, 1, var8, var9);
                                    Img var96 = var8[0] == null ? null : var8[0][0];
                                    class_20 var16 = var9[0];
                                    int var104 = var36[var48++];
                                    if (var15 != null && var15.length() != 0 || var16 != null || var96 != null) {
                                       if (var16 != null) {
                                          var29.field_661.method_246(var14, var15, var16, var104);
                                       } else {
                                          class_10.method_247(var14, var15, var96, var104);
                                       }
                                    }

                                    var10 = var36[var48++];
                                    if ((var104 = var36[var48++] & 255) != 255) {
                                       var92.addElement(new Integer(var10));
                                       var92.addElement(new Integer(var104));
                                    }

                                    var29.field_661.method_248(var14, var10, 0);
                                    var10 = var36[var48++];
                                    if ((var104 = var36[var48++] & 255) != 255) {
                                       var92.addElement(new Integer(var10));
                                       var92.addElement(new Integer(var104));
                                    }

                                    var29.field_661.method_248(var14, var10, 1);

                                    for (int var17 = 0; var17 < var90; var17++) {
                                       int var18;
                                       switch (var18 = var36[var48++]) {
                                          case 0:
                                             var104 = class_16.method_305(var36, var48);
                                             int var74 = var48 + 4;
                                             var15 = var84.field_661.method_229(var24, var104, var17);
                                             var48 = class_16.method_302(var36, var74, 3, var8, var9);
                                             Img[] var102 = var8[0];
                                             var16 = var9[0];
                                             short var114 = class_16.method_304(var36[var48++]);
                                             var84.field_661.method_249(var24, var14, var17, var18, var15, var16, var102, var114);
                                             break;
                                          case 1:
                                             var104 = class_16.method_305(var36, var48);
                                             var48 += 4;
                                             var15 = var84.field_661.method_229(var24, var104, var17);
                                             var48 = class_16.method_302(var36, var48, 4, var8, var9);
                                             Img[] var101 = var8[0];
                                             var16 = var9[0];
                                             String[] var135 = new String[var18 = var36[var48++]];

                                             for (int var20 = 0; var20 < var18; var20++) {
                                                var104 = class_16.method_305(var36, var48);
                                                var48 += 4;
                                                var135[var20] = var84.field_661.method_229(var24, var104, var17);
                                             }

                                             var48 = class_16.method_302(var36, var48, var18, var8, var9);
                                             Img[] var136 = var8[0];
                                             class_20 var133 = var9[0];
                                             short var112 = class_16.method_304(var36[var48++]);
                                             var84.field_661.method_250(var24, var14, var17, var15, var16, var101, var135, var133, var136, var112);
                                             break;
                                          case 2:
                                             var104 = class_16.method_305(var36, var48);
                                             int var66 = var48 + 4;
                                             var15 = var84.field_661.method_229(var24, var104, var17);
                                             var48 = class_16.method_302(var36, var66, 4, var8, var9);
                                             Img[] var100 = var8[0];
                                             var16 = var9[0];
                                             var18 = var36[var48++] & 255;
                                             int var19 = var36[var48++] & 255;
                                             short var109 = class_16.method_304(var36[var48++]);
                                             var84.field_661.method_251(var24, var14, var17, var15, var16, var100, var18, var19, var109);
                                             break;
                                          case 3:
                                             var48 += 9;
                                             var48 = class_16.method_302(var36, var48, 3, var8, var9);
                                             var48 += 2;
                                             break;
                                          case 4:
                                             var104 = class_16.method_305(var36, var48);
                                             var48 += 4;
                                             var15 = var84.field_661.method_229(var24, var104, var17);
                                             var48 = class_16.method_302(var36, var48, 1, var8, var9);
                                             Img[] var99 = var8[0];
                                             var16 = var9[0];
                                             var84.field_661.method_249(var24, var14, var17, 1, var15, var16, var99, -1);
                                       }
                                    }

                                    var84.field_661.method_230(var24, var14, 1);
                                    var84.field_661.method_253(var24, var14);
                                    var14.method_102(0);
                                    var84.field_671[var24] = var14;
                                    if (var92.size() > 0) {
                                       short[] var130 = new short[var92.size()];

                                       for (int var134 = 0; var134 < var92.size(); var134++) {
                                          var130[var134] = (short)((Integer)var92.elementAt(var134)).intValue();
                                       }

                                       var84.field_672[var24] = var130;
                                    }
                                 }
                              }
                           }

                           var29.field_685++;
                           int var38 = (int)(System.currentTimeMillis() - var116);
                           if (var29.field_685 >= var29.field_684 || var38 >= 50) {
                              break label371;
                           }
                        }
                     }

                     if (!var29.field_689) {
                        var29.field_684 = Assets.method_349();
                        if (var29.field_684 > 0) {
                           var29.field_685 = 0;
                           var29.field_689 = true;
                           break;
                        }
                     }

                     int var115;
                     if ((var115 = var29.field_665[var29.field_667]) != -1) {
                        var29.field_692[var115] = true;
                     }

                     var29.field_661.method_237(false);
                     var29.field_683 = false;
                  }

                  int var118 = var29.field_666;
                  var29.field_666 = var29.field_667;
                  var29.field_667 = -1;
                  int var120 = var29.field_682;

                  while (--var120 >= 0) {
                     if (var29.field_681[var120] == var29.field_666) {
                        var29.field_682 = var120;
                        break;
                     }
                  }

                  var1 = var29.field_666;
                  if (var1 < var29.field_675) {
                     var29.field_668 = var29.field_671[var1];
                     if (var29.field_679) {
                        var29.field_668.method_102(0);
                     } else {
                        var29.field_668.method_102(var29.field_691[var29.field_666] & 255);
                     }

                     var29.field_661.method_230(var1, var29.field_668, 2);
                     var29.field_668.method_97();
                     var29.field_661.method_230(var1, var29.field_668, 3);
                     var29.field_680 = class_10.method_254(var1);
                  } else if (var1 < var29.field_675 + var29.field_677) {
                     if (var29.field_673[var1 - var29.field_676] == null) {
                        var29.method_303(var1);
                     }

                     var29.field_669 = var29.field_673[var1 - var29.field_676];
                     var29.field_680 = class_10.method_254(var1);
                  } else {
                     if (var29.field_674[var1 - var29.field_678] == null) {
                        var29.method_306(var1);
                     }

                     var29.field_670 = var29.field_674[var1 - var29.field_678];
                     var29.field_680 = false;
                  }

                  var29.field_661.method_223(var118, var29.field_666, var29.field_668);
                  if (var29.field_670 != null) {
                     var1 = var29.field_666;
                     if (var29.field_661.method_225(var1)) {
                        var29.method_307(var29.field_670[0]);
                     } else {
                        var29.method_307(var29.field_670[1]);
                     }
                  }
               }
            } else {
               int var3 = var23.field_661.method_221(var23.field_666, var1);
               var23.method_307(var3);
               if (var23.field_668 != null) {
                  int[] var28 = var23.field_668.method_98(var1);
                  Object var33 = null;
                  var23.field_691[var23.field_666] = (byte)var23.field_668.field_334;
                  if (var28 != null) {
                     if (var28[0] == 1) {
                        var23.method_307(var28[1]);
                     } else if (var28[0] == 0) {
                        boolean var34 = false;
                        short[] var4;
                        if ((var4 = var23.field_672[var23.field_666]) != null) {
                           int var5 = 0;

                           while (var5 < var4.length) {
                              short var6 = var4[var5++];
                              short var7 = var4[var5++];
                              if (var6 == var28[1]) {
                                 var23.method_307(var7);
                                 var34 = true;
                              }
                           }
                        }

                        if (!var34) {
                           int var12 = var28[1];
                           if (var12 != -1 && GameCanvas.method_382(var12) == 2) {
                              var23.method_307(-3);
                           }
                        }
                     }
                  }
               }
            }

            if (this.field_20 != -1) {
               this.field_20 = this.field_14.method_309();
            }
         }
      }
   }

   private void method_6() {
      if (!this.field_21) {
         byte[] var1;
         int var2 = (var1 = GameCanvas.method_366(3538971))[0];

         for (int var11 = 1; var2 > 0; var2--) {
            int var4 = var1[var11++];
            int var5 = class_16.method_305(var1, var11);
            int var10 = var11 + 4;
            int var6 = class_16.method_305(var1, var10);
            var11 = var10 + 4;
            int var7 = var1[var11++];
            Img var8 = null;
            if (var6 != -1 && (var8 = Assets.method_347(var6)) == null) {
               var8 = GameCanvas.method_375(var6);
            }

            GameCanvas.method_380(var4, var5, var8, var7);
         }

         this.field_21 = true;
      }
   }

   public final void method_0(Gfx var1) {
      if (this.field_17) {
         class_9.method_197(var1, this.field_19 * 50 / this.field_18, true);
      } else {
         if (this.field_14 != null) {
            if (this.field_20 != -1) {
               int var3;
               class_9.method_197(var1, var3 = 50 + this.field_20 / 2, true);
               return;
            }

            class_16 var2;
            if ((var2 = this.field_14).field_683) {
               class_10.method_255(var1, var2.method_309());
               return;
            }

            var2.field_661.method_222(var2.field_666, var1);
            if (var2.field_668 != null) {
               var2.field_661.method_226(var2.field_666, var1, var2.field_668);
            }
         }
      }
   }

   public final void method_2(int var1, int var2) {
      if (!this.field_17) {
         class_16 var3;
         if (this.field_14 != null && !(var3 = this.field_14).field_683) {
            if (var3.field_668 != null) {
               var3.field_668.method_101(var1, var2);
            }

            if (var3.field_661 != null) {
               var3.field_661.method_224(var3.field_666, var1, var2);
            }
         }
      }
   }

   public final void method_3(int var1) {
      if (!this.field_17) {
         if (this.field_14 != null) {
            if (var1 == 1) {
               this.field_14.field_661.method_220();
               return;
            }

            if (var1 == 5) {
               this.field_14.field_661.method_243();
            }
         }
      }
   }

   public final void method_7(int var1) {
      if (this.field_16) {
         class_16 var2 = null;
         var2 = this.field_13;
         int var3 = this.field_13.field_675;

         while (--var3 >= 0) {
            var2.method_308(var3);
         }

         if (var2.field_667 == -1) {
            var2.field_667 = var2.field_666;
         }

         var2.field_666 = -1;
         var2.field_668 = null;
         var2.field_683 = false;
      }

      GameCanvas.method_390(var1);
      this.field_21 = false;
      this.method_6();
   }
}
