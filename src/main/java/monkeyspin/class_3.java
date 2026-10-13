package monkeyspin;

import monkeyspin.platform.*;

import java.util.Vector;

public final class class_3 {
   static class_20 field_253;
   static class_20 field_254;
   private static class_20 field_255;
   private static class_20 field_256;
   static int field_257;
   static int field_258;
   private int field_259;
   int field_260;
   private int field_261;
   private int field_262;
   private int field_263;
   private int field_264;
   private int field_265;
   private int field_266;
   public static class_20 field_267;
   public static class_20 field_268;
   static int field_269;
   static int field_270;
   private int field_271;
   private int field_272;
   private int field_273;
   private static BitmapFont field_274;
   private static BitmapFont field_275;
   private static BitmapFont field_276;
   private BitmapFont field_277;
   private int field_278;
   private BitmapFont field_279;
   private int field_280;
   private BitmapFont field_281;
   private int field_282;
   private static BitmapFont field_283;
   private boolean field_284;
   private boolean field_285;
   private boolean field_286;
   private boolean field_287;
   private int field_288;
   private int field_289;
   private int field_290;
   private int field_291;
   private boolean field_292;
   private int field_293;
   private int field_294;
   private int field_295;
   private int field_296;
   private int field_297;
   private int field_298;
   private int field_299;
   private int field_300;
   int field_301;
   private int field_302;
   int field_303;
   private boolean field_304;
   private final int[] field_305 = new int[2];
   final int[] field_306 = new int[2];
   boolean field_307;
   private int field_308;
   private int field_309;
   private int field_310;
   private int field_311;
   private String field_312;
   private String[] field_313;
   private Img field_314;
   class_20 field_315;
   private int field_316;
   public int field_317;
   private int field_318;
   private int field_319;
   private int field_320;
   private int field_321;
   private int field_322;
   private int field_323;
   private int field_324;
   private int[] field_325;
   private int[] field_326;
   private int[] field_327;
   private int[] field_328;
   private int[] field_329;
   private Img[][] field_330;
   class_20[] field_331;
   private String[] field_332;
   private String[][] field_333;
   int field_334;
   private int[] field_335;
   private int[] field_336;
   private int field_337;
   private int field_338;
   private int field_339;
   private int field_340;
   private int field_341;
   private int[] field_342;
   private int[] field_343;
   int[] field_344;
   int[] field_345;
   private String[][] field_346;
   private Img[][] field_347;
   class_20[] field_348;
   int[][] field_349;
   int[][] field_350;
   String[][] field_351;
   private String[][][] field_352;
   Img[][] field_353;
   class_20[][] field_354;
   private int[][] field_355;
   private int[][] field_356;
   int[][] field_357;
   private int field_358;

   public class_3() {
   }

   public static void method_85(BitmapFont var0, BitmapFont var1, BitmapFont var2) {
      field_274 = var0;
      field_275 = var1;
      field_276 = var2;
   }

   public final void method_86(int var1, int var2, int var3) {
      this.field_298 = var1;
      this.field_334 = -1;
      this.field_260 = 0;
      this.field_259 = 0;
      this.field_324 = var3;
      this.field_261 = 0;
      this.field_308 = var3;
      this.field_325 = new int[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         this.field_325[var4] = -1;
      }

      this.field_332 = new String[var2];
      this.field_333 = new String[var2][];
      this.field_336 = new int[var2];
      this.field_335 = new int[var2];
      this.field_330 = new Img[var2][];
      this.field_331 = new class_20[var2];
      field_255 = field_253.method_318();
      field_256 = field_254.method_318();
      this.field_303 = var2;
      this.field_310 = 1;
      this.field_307 = false;
      this.field_340 = 1;
      this.field_306[0] = -1;
      this.field_306[1] = -1;
      this.method_94(field_274, field_275, field_276);
      this.method_87(2);
      this.field_295 = GameCanvas.method_383();
      this.field_296 = GameCanvas.method_363();
      this.field_297 = GameCanvas.method_378();
   }

   public final void method_87(int var1) {
      switch (var1) {
         case 1:
            this.field_284 = true;
            this.field_288 = 16777215;
            this.field_289 = 16777215;
            this.field_286 = false;
            this.field_287 = false;
            this.field_285 = false;
            this.field_292 = true;
            break;
         case 2:
            this.field_284 = false;
            this.field_286 = true;
            this.field_285 = false;
            this.field_292 = true;
            break;
         case 3:
            this.field_284 = true;
            this.field_288 = 13434828;
            this.field_289 = 10092441;
            this.field_286 = false;
            this.field_287 = true;
            this.field_290 = 13421823;
            this.field_291 = 10066431;
            this.field_285 = false;
            this.field_292 = true;
            break;
         case 4:
            this.field_284 = true;
            this.field_288 = 13434828;
            this.field_289 = 10092441;
            this.field_286 = true;
            this.field_287 = true;
            this.field_290 = 13421823;
            this.field_291 = 10066431;
            this.field_285 = true;
            this.field_292 = false;
            break;
         case 5:
            this.field_284 = true;
            this.field_288 = 13434828;
            this.field_289 = 10092441;
            this.field_286 = false;
            this.field_287 = true;
            this.field_285 = true;
            this.field_292 = false;
         case 6:
         case 7:
      }

      if (this.field_285) {
         this.field_293 = 1;
         this.field_294 = 1;
      } else {
         this.field_293 = 9;
         this.field_294 = 11;
      }
   }

   public final void method_88(String var1, Img var2, int var3) {
      this.field_307 = var1 != null || var2 != null;
      this.field_312 = var1;
      this.field_314 = var2;
      this.field_308 = var3;
   }

   public final void method_89(int var1, int var2, String var3, Img[] var4, int var5) {
      if (this.field_325[var1] != -1) {
         this.method_93(var1);
      }

      this.field_325[var1] = var2;
      this.field_336[var1] = var5;
      this.field_330[var1] = var4;
      this.field_332[var1] = var3;
   }

   public final void method_90(int var1, int var2, String var3, class_20 var4, int var5) {
      this.method_89(var1, var2, var3, null, var5);
      this.field_331[var1] = var4;
   }

   public final void method_91(int var1, String var2, Img[] var3, String[] var4, Img[] var5, int var6) {
      this.method_89(var1, 5, var2, var3, var6);
      if (this.field_344 == null) {
         this.field_344 = new int[this.field_303];
         this.field_345 = new int[this.field_303];
      }

      this.field_344[var1] = 0;
      this.field_345[var1] = var4 != null ? var4.length : 0;
      if (this.field_346 == null) {
         this.field_346 = new String[this.field_303][];
      }

      this.field_346[var1] = var4;
      this.field_345[var1] = Math.max(this.field_345[var1], var5 != null ? var5.length : 0);
      if (this.field_347 == null) {
         this.field_347 = new Img[this.field_303][];
      }

      this.field_347[var1] = var5;
      if (this.field_348 == null) {
         this.field_348 = new class_20[this.field_303];
      }
   }

   public final void method_92(int var1, String var2, Img[] var3, int var4, int var5, int var6) {
      this.method_89(var1, 4, var2, var3, var6);
      if (this.field_344 == null) {
         this.field_344 = new int[this.field_303];
         this.field_345 = new int[this.field_303];
      }

      this.field_344[var1] = var4;
      this.field_345[var1] = var5 + 1;
   }

   private void method_93(int var1) {
      int var10000 = this.field_325[var1];
      boolean var2 = false;
      if (var10000 != -1 && this.field_334 == var1) {
         this.field_334 = this.method_110(var1);
         if (this.field_334 < var1) {
            this.field_334 = this.method_111(var1);
         }
      }

      if (this.field_330 != null) {
         this.field_330[var1] = null;
      }

      if (this.field_347 != null) {
         this.field_347[var1] = null;
      }

      if (this.field_353 != null) {
         this.field_353[var1] = null;
      }

      if (this.field_331 != null && this.field_331[var1] != null) {
         this.field_331[var1].method_340();
         this.field_331[var1] = null;
      }

      if (this.field_348 != null && this.field_348[var1] != null) {
         this.field_348[var1].method_340();
         this.field_348[var1] = null;
      }

      if (this.field_354 != null && this.field_354[var1] != null) {
         for (int var3 = 0; var3 < this.field_354[var1].length; var3++) {
            if (this.field_354[var1][var3] != null) {
               this.field_354[var1][var3].method_340();
            }
         }

         this.field_354[var1] = null;
      }

      this.field_332[var1] = null;
      this.field_333[var1] = null;
      this.field_325[var1] = -1;
      if (this.field_346 != null) {
         this.field_346[var1] = null;
      }

      if (this.field_349 != null) {
         this.field_349[var1] = null;
         this.field_350[var1] = null;
         this.field_351[var1] = null;
      }

      if (this.field_355 != null) {
         this.field_355[var1] = null;
         this.field_356[var1] = null;
         this.field_352[var1] = null;
      }
   }

   public final void method_94(BitmapFont var1, BitmapFont var2, BitmapFont var3) {
      if (var1 != null) {
         this.field_277 = var1;
         this.field_278 = var1.method_313();
      }

      if (var2 != null) {
         this.field_279 = var2;
         this.field_280 = var2.method_313();
      }

      if (var3 != null) {
         this.field_281 = var3;
         this.field_282 = var3.method_313();
      }
   }

   public final void method_95(int var1, int var2) {
      boolean var25 = false;
      var2 = var2;
      var1 = var1;
      if (this.field_285) {
         var1 -= 8;
         var2 -= 8;
      }

      this.field_301 = var1;
      this.field_302 = var2;
      this.field_320 = this.field_293;
      this.field_322 = var1 - (this.field_293 << 1);
      if (this.field_298 == 100) {
         this.field_322 = this.field_322 - (field_269 + field_270);
         this.field_320 = this.field_320 + field_269;
      }

      class_3 var28 = this;
      if (this.field_307) {
         var2 = 0;
         int var3 = 0;
         if (this.field_314 != null) {
            var2 = this.field_314.getWidth() + 8;
            var3 = this.field_314.getHeight();
         }

         if (this.field_315 != null) {
            var2 = this.field_315.method_338() + 8;
            var3 = this.field_315.method_339();
         }

         this.field_319 = var2;
         this.field_317 = Math.max(this.field_278, var3) + 4;
         int var4 = var2;
         int var5 = this.field_286 ? this.field_295 : this.field_301;
         if (this.field_312 != null) {
            this.field_313 = new String[]{this.field_312};
         }

         int var6 = 0;
         boolean var7 = false;
         if (this.field_313 != null) {
            for (int var32 = 0; var32 < var28.field_313.length; var32++) {
               var6 = Math.max(var6, var28.field_277.method_311(var28.field_313[var32]));
            }

            var7 = true;
            var28.field_312 = null;
         }

         if (var7) {
            var6 = Math.min(var6, var5 - var2 - 8);
            var28.field_318 = var6 + 8;
            var4 = var2 + var28.field_318;
         } else {
            var28.field_318 = 0;
         }

         var28.field_316 = 0;
         if ((var28.field_308 & 1) != 0) {
            var28.field_316 = var5 - var4 >> 1;
         }
      } else {
         this.field_317 = 0;
      }

      class_3 var29 = this;
      if (this.field_307) {
         var2 = this.field_317;
         if (this.field_286) {
            var2 += this.field_294;
         }
      } else {
         var2 = this.field_294;
      }

      this.field_321 = var2;
      int var34 = 0 + this.field_296 - this.field_297;
      int var36 = this.field_302;
      int var39 = Math.min(this.field_302 - this.field_321 - this.field_294, var34 - this.field_321);
      var34 = Math.min(var36 - this.field_294 - field_258, var34) - this.field_321 - field_257;
      int var41 = 0;
      int var43 = 0;
      boolean var37 = false;
      boolean var8 = false;
      if (this.field_298 != 0 && this.field_298 != 100) {
         if (this.field_298 == 1) {
            for (int var47 = 0; var47 < var29.field_303; var47++) {
               var8 = var8 || var29.field_325[var47] == 6;
            }
         }
      } else {
         for (int var9 = 0; var9 < var29.field_303; var9++) {
            boolean var10 = false;
            Img[] var11;
            if ((var11 = var29.field_330[var9]) != null) {
               for (int var52 = 0; var52 < var11.length; var52++) {
                  if (var11[var52] != null) {
                     var41 = Math.max(var41, var11[var52].getWidth() + 8);
                     var43 = Math.max(var43, var11[var52].getHeight() + 4);
                  }
               }
            }

            class_20 var61;
            if ((var61 = var29.field_331[var9]) != null) {
               for (int var53 = 0; var53 < var61.method_332(); var53++) {
                  var61.method_330(var53, -2, true);
                  var41 = Math.max(var41, var61.method_338() + 8);
                  var43 = Math.max(var43, var61.method_339() + 4);
               }
            }

            var37 = var37 || var29.field_325[var9] == 4 || var29.field_325[var9] == 5;
            if (var29.field_325[var9] == 5) {
               if ((var11 = var29.field_347[var9]) != null) {
                  for (int var54 = 0; var54 < var11.length; var54++) {
                     if (var11[var54] != null) {
                        var43 = Math.max(var43, var11[var54].getHeight() + 4);
                     }
                  }
               }

               class_20 var63;
               if ((var63 = var29.field_348[var9]) != null) {
                  for (int var55 = 0; var55 < var63.method_332(); var55++) {
                     var63.method_330(var55, -2, true);
                     var43 = Math.max(var43, var63.method_339() + 4);
                  }
               }
            }
         }
      }

      var29.field_326 = new int[var29.field_303 << 2];
      var29.field_329 = new int[var29.field_303];
      var29.field_328 = new int[var29.field_303];
      if (var29.field_298 == 1) {
         var29.field_327 = new int[var29.field_303];
      }

      if (var37) {
         var29.field_343 = new int[var29.field_303];
         var29.field_342 = new int[var29.field_303];
      }

      if (var8) {
         var29.field_355 = new int[var29.field_303][];
         var29.field_356 = new int[var29.field_303][];
         var29.field_352 = new String[var29.field_303][][];
      }

      if (var29.field_298 == 0 || var29.field_298 == 100) {
         var29.field_338 = Math.max(var43, var29.field_282 + 4);
      }

      var41 = var41;
      class_3 var38 = var29;

      for (int var48 = 0; var48 < var38.field_303; var48++) {
         if (var38.field_325[var48] == 6) {
            int var65 = var48;
            class_3 var57 = var38;
            int var71 = var38.field_322 - 8;
            int var75 = 0;
            int[] var81;
            int var85 = (var81 = var38.field_349[var48]).length;
            int var88 = 0;
            if (var38.field_351[var48] != null) {
               var88 = var38.field_351[var48].length;
            } else if (var38.field_353[var48] != null) {
               var88 = var38.field_353[var48].length;
            } else if (var38.field_354[var48] != null) {
               var88 = var38.field_354[var48].length;
            }

            int var91 = var88 / var85;
            int[] var46 = new int[var85];
            int[] var18 = new int[var91];
            String[][] var19 = new String[var88][];
            var38.field_355[var48] = var46;
            var38.field_356[var48] = var18;
            var38.field_352[var48] = var19;
            int var20 = var71;

            for (int var21 = 0; var21 < var85; var21++) {
               if (var81[var21] == -1) {
                  int var22 = 0;

                  for (int var23 = var21; var23 < var88; var23 += var85) {
                     if (var57.field_351[var65] != null && var57.field_351[var65][var23] != null) {
                        String var24 = var57.field_351[var65][var23];
                        var22 = Math.max(var22, var57.field_279.method_311(var24));
                        var19[var23] = new String[]{var24};
                     }

                     if (var57.field_353[var65] != null && var57.field_353[var65][var23] != null) {
                        Img var101 = var57.field_353[var65][var23];
                        var22 = Math.max(var22, var101.getWidth());
                     }

                     if (var57.field_354[var65] != null && var57.field_354[var65][var23] != null) {
                        class_20 var102 = var57.field_354[var65][var23];
                        var22 = Math.max(var22, var102.method_338());
                     }
                  }

                  var22 += 6;
                  var46[var21] = var22;
                  var20 -= var22;
               }
            }

            for (int var93 = 0; var93 < var85; var93++) {
               if (var81[var93] != -1) {
                  var46[var93] = var20 * var81[var93] / 100;
               }
            }

            var20 = var71;

            for (int var94 = 0; var94 < var85; var94++) {
               var20 -= var46[var94];
            }

            var46[var85 - 1] = var46[var85 - 1] + var20;
            int var95 = 0;

            for (int var97 = 0; var95 < var91; var95++) {
               int var98 = 0;

               for (int var103 = 0; var103 < var85; var97++) {
                  if (var81[var103] != -1) {
                     var88 = var46[var103] - 6;
                     if (var57.field_351[var65] != null && var57.field_351[var65][var97] != null) {
                        var57.field_352[var65][var97] = method_104(var57.field_351[var65][var97], var57.field_279, var88);
                     }
                  }

                  if (var57.field_354[var65] != null && var57.field_354[var65][var97] != null) {
                     var98 = Math.max(var98, var57.field_354[var65][var97].method_339());
                  } else if (var57.field_353[var65] != null && var57.field_353[var65][var97] != null) {
                     var98 = Math.max(var98, var57.field_353[var65][var97].getHeight());
                  } else if (var57.field_351[var65] != null && var57.field_351[var65][var97] != null) {
                     var98 = Math.max(var98, var57.field_352[var65][var97].length * var57.field_280);
                  }

                  var103++;
               }

               var98 += 2;
               var98 = ((var98 - 1) / (var57.field_280 + 2) + 1) * (var57.field_280 + 2);
               var18[var95] = var98;
               var75 += var98;
            }

            var57.field_351[var65] = null;
            var57.field_326[(var65 << 2) + 2] = var71 + 8;
            var57.field_326[(var65 << 2) + 3] = var75;
         } else {
            int var56 = 0;
            int var64 = 0;
            if (var38.field_298 != 0 && var38.field_298 != 100) {
               if (var38.field_330[var48] != null) {
                  var56 = var38.field_330[var48][0].getWidth() + 8;
                  var64 = var38.field_330[var48][0].getHeight();
               }

               if (var38.field_331[var48] != null) {
                  var56 = var38.field_331[var48].method_338() + 8;
                  var64 = var38.field_331[var48].method_339();
               }
            } else {
               var56 = var41;
               var64 = var43;
            }

            var38.field_329[var48] = var56;
            int var8i = 0;
            if (var38.field_325[var48] == 5) {
               int var12 = 0;
               Img[] var13;
               if ((var13 = var38.field_347[var48]) != null) {
                  for (int var14 = 0; var14 < var13.length; var14++) {
                     if (var13[var14] != null) {
                        var12 = Math.max(var12, var13[var14].getWidth() + 8);
                     }
                  }
               }

               class_20 var72;
               if ((var72 = var38.field_348[var48]) != null) {
                  for (int var76 = 0; var76 < var72.method_332(); var76++) {
                     var72.method_330(var76, -2, true);
                     var12 = Math.max(var12, var72.method_338() + 8);
                  }
               }

               var38.field_343[var48] = var12;
               int var73 = 0;
               if (var38.field_346[var48] != null) {
                  for (int var77 = 0; var77 < var38.field_346[var48].length; var77++) {
                     String var15;
                     if ((var15 = var38.field_346[var48][var77]) != null) {
                        var73 = Math.max(var73, var38.field_281.method_311(var15));
                     }
                  }

                  var73 += 8;
               }

               var38.field_342[var48] = var73;
               var8i = 0 + var12 + var73;
            }

            if (var38.field_325[var48] == 4) {
               int var69 = 9 + (var38.field_345[var48] - 2) * 10 + 8;
               var38.field_343[var48] = var69;
               var38.field_342[var48] = 0;
               var8i += var69;
            }

            int var70 = 0;
            int var74 = 0;
            if (var38.field_298 == 1) {
               if (var38.field_330[var48] != null) {
                  var70 = var38.field_330[var48][0].getWidth() + 8;
                  int var104 = var38.field_330[var48][0].getHeight();
                  boolean var78 = false;
                  var74 = (var104 - 1) / (var38.field_280 + 2) + 1;
               }

               if (var38.field_331[var48] != null) {
                  var70 = var38.field_331[var48].method_338() + 8;
                  int var105 = var38.field_331[var48].method_339();
                  boolean var79 = false;
                  var74 = (var105 - 1) / (var38.field_280 + 2) + 1;
               }

               var38.field_327[var48] = var74;
            }

            if (var38.field_298 == 0 || var38.field_298 == 100) {
               var8i += var56;
            }

            String[] var80 = var38.field_333[var48];
            String var82;
            if ((var82 = var38.field_332[var48]) != null) {
               if (var38.field_298 != 0 && var38.field_298 != 100) {
                  int var16 = var38.field_322 - 8 - var8i;
                  field_283 = var38.field_298 == 0 ? var38.field_281 : var38.field_279;
                  var80 = method_113(var82, var16, var70, var74);
               } else {
                  var80 = new String[]{var82};
               }
            }

            if (var80 != null) {
               int var86 = 0;

               for (int var83 = 0; var83 < var80.length; var83++) {
                  String var17 = var80[var83];
                  int var90;
                  if (var38.field_298 != 0 && var38.field_298 != 100) {
                     var90 = var38.field_279.method_311(var17);
                  } else {
                     var90 = var38.field_281.method_311(var17);
                  }

                  if (var83 < var74) {
                     var90 += var70;
                  }

                  var86 = Math.max(var86, var90);
               }

               var86 = Math.min(var86, var38.field_322 - var8i - 8);
               var38.field_328[var48] = var86 + 8;
               var8i += var38.field_328[var48];
               int var84;
               if (var38.field_298 != 0 && var38.field_298 != 100) {
                  var84 = var38.field_280 * var80.length + 2 * var80.length;
               } else {
                  var84 = var38.field_282 + 4;
               }

               var64 = Math.max(var64, var84);
               var38.field_332[var48] = null;
               var38.field_333[var48] = var80;
            } else if (var38.field_330[var48] == null && var38.field_331[var48] == null) {
               var64 = 0;
            }

            if (var38.field_298 == 1 && var80 == null) {
               var8i += var56;
            }

            if (var38.field_325[var48] == 5 || var38.field_325[var48] == 4) {
               var8i = var38.field_322;
            }

            if ((var38.field_298 == 0 || var38.field_298 == 100) && var64 > 0) {
               var64 = var38.field_338;
            }

            var38.field_326[(var48 << 2) + 2] = var8i;
            var38.field_326[(var48 << 2) + 3] = var64;
         }
      }

      for (int var49 = 0; var49 < var29.field_303; var49++) {
         boolean var58 = false;
         if ((var29.field_324 & 1) != 0) {
            var29.field_326[var49 << 2] = var29.field_322 - var29.field_326[(var49 << 2) + 2] >> 1;
         }
      }

      if (var29.field_298 == 100) {
         var29.field_323 = var39;
         var29.field_262 = var29.field_338;

         for (int var50 = 0; var50 < var29.field_303; var50++) {
            var29.field_326[(var50 << 2) + 1] = 0;
            var29.field_326[(var50 << 2) + 3] = var29.field_338;
         }
      } else {
         boolean var51 = false;

         do {
            if (var51) {
               var29.field_321 = var2 + field_257;
               var29.field_323 = var34;
               var29.field_263 = var29.field_301 >> 1;
               var29.field_264 = var29.field_321 - field_257 + (field_257 >> 1);
               var29.field_265 = var29.field_321 + var29.field_323 + (field_258 >> 1);
            } else {
               var29.field_323 = var39;
            }

            if (var29.field_298 == 1) {
               var29.field_321 += 2;
               var29.field_323 -= 4;
               boolean var59 = false;
               int var66 = var29.field_303;

               while (--var66 >= 0) {
                  var59 = var59 || var29.field_333[var66] != null;
               }

               if (var59) {
                  var66 = var29.field_280 + 2;
                  var29.field_321 = var29.field_321 + (var29.field_323 % var66 >> 1);
                  var29.field_323 = var29.field_323 / var66 * var66;
               }
            }

            int var60 = 0;

            for (int var68 = 0; var68 < var29.field_303; var68++) {
               var29.field_326[(var68 << 2) + 1] = var60;
               var60 += var29.field_326[(var68 << 2) + 3];
               if (var29.field_298 == 1 && var60 != 0) {
                  var60 = ((var60 - 1) / (var29.field_280 + 2) + 1) * (var29.field_280 + 2);
               }
            }

            if (var29.field_303 > 0) {
               var29.field_262 = var29.field_326[(var29.field_303 - 1 << 2) + 1] + var29.field_326[(var29.field_303 - 1 << 2) + 3];
            }

            if (var51) {
               var51 = false;
            } else if (var29.field_262 > var29.field_323) {
               var51 = true;
            } else if (var29.field_292) {
               if (var29.field_298 == 0 && var34 / var29.field_338 >= 3) {
                  var51 = true;
               } else if (var29.field_298 == 1 && var34 / (var29.field_280 + 2) >= 3) {
                  var51 = true;
               }
            }
         } while (var51);
      }

      if (this.field_298 == 0) {
         this.field_337 = this.field_323 / this.field_338;
         if (this.field_323 < this.field_262) {
            this.field_321 = this.field_321 + (this.field_323 - this.field_337 * this.field_338 >> 1);
         }
      }

      if (this.field_334 == -1) {
         this.field_334 = 0;
      }

      this.field_334 = this.method_110(this.field_334);
      if (this.field_334 != -1) {
         this.field_334 = this.method_111(this.field_334);
      }

      this.field_260 = 0;
      if (this.field_334 != -1) {
         this.method_102(this.field_334);
      }
   }

   public final void method_96(int var1, int var2, int var3, int var4) {
      this.field_299 = 0;
      this.field_300 = 0;
      this.method_95(var3, var4);
      this.field_299 = var1;
      this.field_300 = var2;
   }

   public final void method_97() {
      this.method_109();
      this.field_259 = 0;
      this.field_311 = 0;
      this.field_358 = 0;
      field_255.method_330(0, -1, true);
      field_256.method_330(0, -1, true);
   }

   public final int[] method_98(int var1) {
      this.field_358 += var1;
      this.field_358 &= 268435455;
      if (this.field_259 != 0 && this.field_262 > this.field_323) {
         this.field_261 += var1;
         int var2 = this.field_261 * (this.field_280 + 2) / 300;
         this.field_261 = this.field_261 - var2 * 300 / (this.field_280 + 2);
         if (this.field_259 == 2) {
            this.field_260 -= var2;
         } else if (this.field_259 == 1) {
            this.field_260 += var2;
         }

         if (this.field_266 == 2) {
            this.field_259 = 0;
         } else {
            this.field_266 = 1;
         }

         this.field_260 = Math.max(this.field_260, 0);
         this.field_260 = Math.min(this.field_260, this.field_262 - this.field_323);
      }

      if (this.field_307) {
         if (this.field_315 != null) {
            this.field_315.method_327(var1);
         }

         String[] var5 = null;
         if (this.field_313 != null) {
            var5 = this.field_313;
         }

         if (var5 != null) {
            this.field_273 = this.field_311;
            this.field_271 = this.field_309;
            this.field_272 = this.field_310;
            int var6 = this.field_277.method_311(var5[0]);
            this.method_105(var1, var6, this.field_318 - 8);
            this.field_309 = this.field_271;
            this.field_310 = this.field_272;
            this.field_311 = this.field_273;
         }
      }

      for (int var8 = 0; var8 < this.field_303; var8++) {
         int var11 = var1;
         int var4 = var8;
         class_3 var3 = this;
         if (this.field_331[var8] != null && this.field_331[var8] != null) {
            this.field_331[var8].method_327(var1);
         }

         if (this.field_348 != null && this.field_348[var8] != null) {
            this.field_348[var8].method_327(var1);
         }

         if (this.field_354 != null && this.field_354[var8] != null) {
            for (int var12 = 0; var12 < var3.field_354[var4].length; var12++) {
               class_20 var7;
               if ((var7 = var3.field_354[var4][var12]) != null) {
                  var7.method_327(var11);
               }
            }
         }

         if (var4 == var3.field_334 && var3.field_333[var4] != null) {
            var3.field_273 = var3.field_341;
            String[] var13;
            if ((var13 = var3.field_333[var4]) != null) {
               var3.field_271 = var3.field_339;
               var3.field_272 = var3.field_340;
               int var14 = var3.field_281.method_311(var13[0]);
               var3.method_105(var11, var14, var3.field_328[var4] - 8);
               var3.field_339 = var3.field_271;
               var3.field_340 = var3.field_272;
            }

            var3.field_341 = var3.field_273;
         }
      }

      field_255.method_327(var1);
      field_256.method_327(var1);
      if (this.field_298 == 1) {
         int var9;
         if ((var9 = this.field_259 == 2 ? 2 : 0) != field_255.method_331()) {
            field_255.method_330(var9, -1, true);
         }

         if ((var9 = this.field_259 == 1 ? 2 : 0) != field_256.method_331()) {
            field_256.method_330(var9, -1, true);
         }
      } else {
         if (field_255.method_335()) {
            field_255.method_330(0, -1, true);
         }

         if (field_256.method_335()) {
            field_256.method_330(0, -1, true);
         }
      }

      if (this.field_298 == 100 && field_267 != null) {
         field_267.method_327(var1);
         field_268.method_327(var1);
         if (field_267.method_335()) {
            field_267.method_330(0, -1, true);
         }

         if (field_268.method_335()) {
            field_268.method_330(0, -1, true);
         }
      }

      if (this.field_304) {
         this.field_304 = false;
         return this.field_305;
      } else {
         return null;
      }
   }

   public final void method_99(Gfx var1, int var2, int var3) {
      if (this.field_285) {
         var2 += 4;
         var3 += 4;
      }

      int var4 = var1.getClipX();
      int var5 = var1.getClipY();
      int var6 = var1.getClipWidth();
      int var7 = var1.getClipHeight();
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var13 = var3;
      int var14 = this.field_301;
      int var15 = this.field_302;
      if (this.field_307) {
         if (this.field_286) {
            var8 = 0;
            var9 = 0;
            var10 = this.field_295;
         } else {
            var8 = var2;
            var9 = var3;
            var10 = this.field_301;
         }

         var11 = this.field_317;
      }

      if (this.field_307 && this.field_287) {
         var1.setClip(var8, var9, var10, var11);
         method_103(var1, var8, var9, var10, var11, this.field_290, this.field_291, 2);
         var13 = var3 + var11;
         var15 -= var11;
      }

      if (this.field_284) {
         var1.setClip(var2, var13, var14, var15);
         method_103(var1, var2, var13, var14, var15, this.field_288, this.field_289, 1);
      }

      if (this.field_285) {
         if (!this.field_286 && this.field_287) {
            var13 -= var11;
            var15 += var11;
         }

         int var12 = var2 - 4;
         var13 -= 4;
         var14 += 8;
         var15 += 8;
         int var41 = var1.getClipX();
         int var37 = var1.getClipY();
         int var50 = var1.getClipWidth();
         int var57 = var1.getClipHeight();
         var1.setClip(var12, var13, var14, var15);
         var1.setColor(255);
         var1.drawRect(var12, var13, var14 - 1, var15 - 1);
         var1.drawRect(var12 + 1, var13 + 1, var14 - 3, var15 - 3);
         var1.drawRect(var12 + 3, var13 + 3, var14 - 7, var15 - 7);
         var1.setColor(this.field_288);
         var1.drawRect(var12 + 2, var13 + 2, var14 - 5, var15 - 5);
         var1.setClip(var41, var37, var50, var57);
      }

      int var38 = var3;
      if (this.field_307) {
         var8 += this.field_316;
         var1.setClip(var8, var9, var10, this.field_317);
         int var67 = this.field_318;
         var13 = this.field_319;
         this.method_107(var1, -2, var8, var9, var13, var11);
         this.method_108(var1, -2, var8 + var13, var9, var67, var11);
         var38 = var3 + this.field_317;
      }

      var1.setClip(var2, var38, this.field_301, this.field_302 - this.field_317);
      if ((this.field_324 & 2) != 0 && this.field_262 < this.field_323) {
         var3 += this.field_323 - this.field_262 >> 1;
      }

      if (this.field_298 == 0) {
         for (int var43 = 0; var43 < this.field_303; var43++) {
            var14 = var2 + this.field_320 + this.field_326[var43 << 2];
            var15 = this.field_326[(var43 << 2) + 1] - this.field_260;
            var8 = this.field_326[(var43 << 2) + 2];
            var9 = this.field_326[(var43 << 2) + 3];
            if (var15 >= 0 && var15 + var9 <= this.field_323) {
               var15 += var3 + this.field_321;
               var1.setClip(var2 + this.field_320, var3 + this.field_321, this.field_322, this.field_323);
               this.method_106(var1, var43, var14, var15, var8, var9, var2);
            }
         }
      } else if (this.field_298 == 1) {
         for (int var44 = 0; var44 < this.field_303; var44++) {
            var14 = this.field_320 + this.field_326[var44 << 2];
            var15 = this.field_321 + this.field_326[(var44 << 2) + 1] - this.field_260;
            var8 = this.field_326[(var44 << 2) + 2];
            var9 = this.field_326[(var44 << 2) + 3];
            if (var15 + var9 >= this.field_321 && var15 < this.field_321 + this.field_323) {
               var1.setClip(var2 + this.field_320, var3 + this.field_321, this.field_322, this.field_323);
               this.method_106(var1, var44, var2 + var14, var3 + var15, var8, var9, var2);
            }
         }
      } else if (this.field_298 == 100) {
         int var66 = this.field_334;
         if (this.field_334 != -1) {
            int var68 = var2 + this.field_320 + this.field_326[var66 << 2];
            var13 = this.field_326[(var66 << 2) + 1];
            var38 = this.field_326[(var66 << 2) + 2];
            var14 = this.field_326[(var66 << 2) + 3];
            var13 += var3 + this.field_321;
            var1.setClip(var2 + this.field_320, var3 + this.field_321, this.field_322, this.field_323);
            this.method_106(var1, var66, var68, var13, var38, var14, var2);
            var1.setClip(var2 + this.field_320 - field_269, var3 + this.field_321, this.field_322 + field_269 + field_270, this.field_323);
            var15 = this.field_320 - field_269 + (field_269 >> 1);
            var8 = this.field_320 + this.field_322 + field_270 - field_269 + (field_269 >> 1);
            var9 = var13 + (var14 >> 1);
            var10 = var15 - (field_267.method_338() >> 1);
            var11 = var9 - (field_267.method_339() >> 1);
            field_267.method_329(var1, var10 + field_267.method_336(), var11 + field_267.method_337());
            var10 = var8 - (field_268.method_338() >> 1);
            var11 = var9 - (field_268.method_339() >> 1);
            field_268.method_329(var1, var10 + field_268.method_336(), var11 + field_268.method_337());
         }
      }

      boolean var47 = this.field_260 > 0;
      boolean var54 = this.field_260 + this.field_323 < this.field_262;
      var47 = var47 || field_255.method_331() == 1;
      var54 = var54 || field_256.method_331() == 1;
      if (var47) {
         var15 = var2 + this.field_263;
         var8 = var3 + this.field_264;
         var15 -= field_255.method_338() >> 1;
         var8 -= field_255.method_339() >> 1;
         var1.setClip(var4, var5, var6, var7);
         field_255.method_329(var1, var15 + field_255.method_336(), var8 + field_255.method_337());
      }

      if (var54) {
         var15 = var2 + this.field_263;
         var8 = var3 + this.field_265;
         var15 -= field_256.method_338() >> 1;
         var8 -= field_256.method_339() >> 1;
         var1.setClip(var4, var5, var6, var7);
         field_256.method_329(var1, var15 + field_256.method_336(), var8 + field_256.method_337());
      }

      var1.setClip(var4, var5, var6, var7);
   }

   public final void method_100(Gfx var1) {
      this.method_99(var1, this.field_299, this.field_300);
   }

   public final void method_101(int var1, int var2) {
      int var3 = -1;
      if (!this.field_304) {
         switch (var2) {
            case 0:
               var2 = GameCanvas.method_377(var1);
               if (this.field_298 == 0
                  && this.field_334 != -1
                  && (this.field_325[this.field_334] == 4 || this.field_325[this.field_334] == 5)
                  && this.field_335[this.field_334] != 1) {
                  int var4 = this.field_344[this.field_334];
                  if (var2 == 52) {
                     this.field_344[this.field_334]--;
                  } else if (var2 == 54) {
                     this.field_344[this.field_334]++;
                  }

                  if (this.field_325[this.field_334] == 4) {
                     this.field_344[this.field_334] = Math.max(Math.min(this.field_344[this.field_334], this.field_345[this.field_334] - 1), 0);
                  } else {
                     this.field_344[this.field_334] = (this.field_344[this.field_334] + this.field_345[this.field_334]) % this.field_345[this.field_334];
                  }

                  if (this.field_344[this.field_334] != var4) {
                     var3 = 1;
                  }
               }

               if (var2 == 53) {
                  if (this.field_298 == 0) {
                     if (this.field_334 != -1 && this.field_335[this.field_334] != 1) {
                        if (this.field_325[this.field_334] == 0) {
                           var3 = 1;
                        } else if (this.field_325[this.field_334] == 5 || this.field_325[this.field_334] == 4) {
                           this.field_344[this.field_334] = (this.field_344[this.field_334] + 1) % this.field_345[this.field_334];
                           var3 = 1;
                        }
                     }
                  } else {
                     var3 = 0;
                     var1 = this.field_306[0];
                  }
               } else if (var2 == 50) {
                  if (this.field_298 == 0) {
                     int var6;
                     if ((var6 = this.method_111(this.field_334)) != -1) {
                        this.method_102(var6);
                        if (this.field_260 > 0) {
                           field_255.method_330(1, 1, true);
                        }

                        this.method_109();
                     }
                  } else if (this.field_298 == 1) {
                     this.field_259 = 2;
                     this.field_266 = 0;
                  }
               } else if (var2 == 56) {
                  if (this.field_298 == 0) {
                     int var7;
                     if ((var7 = this.method_110(this.field_334)) != -1) {
                        this.method_102(var7);
                        if (this.field_260 + this.field_323 < this.field_262) {
                           field_256.method_330(1, 1, true);
                        }

                        this.method_109();
                     }
                  } else if (this.field_298 == 1) {
                     this.field_259 = 1;
                     this.field_266 = 0;
                  }
               }

               if (this.field_298 == 100) {
                  if (var2 == 52) {
                     int var8;
                     if ((var8 = this.method_111(this.field_334)) != -1) {
                        this.method_102(var8);
                        this.method_109();
                     }

                     field_267.method_330(1, 1, true);
                  } else if (var2 == 54) {
                     int var9;
                     if ((var9 = this.method_110(this.field_334)) != -1) {
                        this.method_102(var9);
                        this.method_109();
                     }

                     field_268.method_330(1, 1, true);
                  }
               }
               break;
            case 1:
               if (this.field_266 == 1) {
                  this.field_259 = 0;
               } else {
                  this.field_266 = 2;
               }
            case 2:
            default:
               break;
            case 3:
               if (this.field_298 == 0) {
                  if (var1 == this.field_306[1]) {
                     var3 = 0;
                  }

                  if (this.field_334 != -1 && this.field_335[this.field_334] != 1 && var1 == this.field_306[0]) {
                     if (this.field_325[this.field_334] == 4 || this.field_325[this.field_334] == 5) {
                        this.field_344[this.field_334] = (this.field_344[this.field_334] + 1) % this.field_345[this.field_334];
                     }

                     var3 = 1;
                  }
               } else {
                  var3 = 0;
               }
         }
      }

      if (var3 != -1) {
         this.field_304 = true;
         this.field_305[0] = var3;
         if (var3 == 1) {
            this.field_305[1] = this.field_336[this.field_334];
            return;
         }

         this.field_305[1] = var1;
      }
   }

   public final void method_102(int var1) {
      this.field_334 = this.method_110(var1 - 1);
      if (this.field_334 != -1) {
         this.field_341 = 0;
         this.field_339 = 0;
         this.field_340 = 0;
         if (this.field_262 > this.field_323) {
            int var2 = this.field_260 / this.field_338;
            int var3 = this.field_262 / this.field_338;
            var1 = this.field_326[(var1 << 2) + 1] / this.field_338;
            var2 = Math.min(Math.max(Math.min(Math.max(var2, var1 - (this.field_337 >> 1)), var1 - (this.field_337 - 1 >> 1)), 0), var3 - this.field_337);
            this.field_260 = var2 * this.field_338;
         } else {
            this.field_260 = 0;
         }

         this.field_340 = 0;
         this.field_339 = 0;
      }
   }

   private static void method_103(Gfx var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var5 != var6) {
         int var8 = var5 >> 16 & 0xFF;
         int var9 = var5 >> 8 & 0xFF;
         var5 &= 255;
         int var10 = (var6 >> 16 & 0xFF) - var8;
         int var11 = (var6 >> 8 & 0xFF) - var9;
         var6 = (var6 & 0xFF) - var5;
         int var12 = 0;

         while (var12 < var4) {
            if (var12 + var7 > var4) {
               var7 = var4 - var12;
            }

            var0.setColor(var8 + var12 * var10 / (var4 - 1), var9 + var12 * var11 / (var4 - 1), var5 + var12 * var6 / (var4 - 1));
            var0.fillRect(var1, var2 + var12, var3, var7);
            var12 += var7;
         }
      } else {
         var0.setColor(var5);
         var0.fillRect(var1, var2, var3, var4);
      }
   }

   public static String[] method_104(String var0, BitmapFont var1, int var2) {
      field_283 = var1;
      return method_113(var0, var2, 0, 0);
   }

   private void method_105(int var1, int var2, int var3) {
      if ((var2 = var2 - var3) <= 0) {
         this.field_271 = 0;
      } else {
         var2 += 25;

         for (this.field_273 -= var1; this.field_273 < 0; this.field_273 += 40) {
            if (this.field_272 == 1) {
               this.field_271++;
            } else {
               this.field_271--;
            }

            if (this.field_271 > var2) {
               this.field_271 = var2;
               this.field_272 = 0;
            } else if (this.field_271 < -25) {
               this.field_271 = -25;
               this.field_272 = 1;
            }
         }
      }
   }

   private void method_106(Gfx var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = this.field_328[var2];
      int var9 = this.field_329[var2];
      if (this.field_298 == 1 && var8 > 0) {
         var9 = 0;
      } else if (this.field_298 == 0 && var2 == this.field_334) {
         if (class_9.field_396 != null) {
            int var10 = 0;
            var10 = var4 + (class_9.field_396.method_339() >> 1);
            int var46;
            int var11 = (var46 = var7 + this.field_320) + this.field_322 - 1;
            class_9.field_396.method_330(0, 0, false);
            class_9.field_396.method_329(var1, var46 + class_9.field_396.method_338(), var10);
            var7 = var46 + class_9.field_396.method_338();
            class_9.field_396.method_330(2, 0, false);
            class_9.field_396.method_329(var1, var11 - class_9.field_396.method_338(), var10);
            var11 -= class_9.field_396.method_338();
            class_9.field_396.method_330(1, 0, false);

            for (int var12 = class_9.field_396.method_338(); var7 < var11; var7 += var12) {
               class_9.field_396.method_329(var1, var7, var10);
            }
         } else {
            if (class_10.field_574) {
               var1.setColor(16685109);
               var1.fillRect(var7 + this.field_320, var4, this.field_322 - 1, var6);
            }

            var1.setColor(7354905);
            var1.drawRect(var7 + this.field_320, var4, this.field_322 - 1, var6);
         }
      }

      boolean var10000;
      label184: {
         int[] var61;
         if (this.field_357 != null && (var61 = this.field_357[var2]) != null) {
            int var65 = 0;

            for (int var13 = 0; var13 < var61.length; var13++) {
               var65 += var61[var13];
            }

            int var70 = this.field_358 % var65;
            var65 = 0;

            for (int var14 = 0; var14 < var61.length; var14++) {
               var65 += var61[var14];
               if (var70 < var65) {
                  var10000 = (var14 & 1) == 1;
                  break label184;
               }
            }
         }

         var10000 = false;
      }

      if (!var10000) {
         if (this.field_325[var2] == 6) {
            int var69 = var3;
            int var64 = var2;
            Gfx var59 = var1;
            class_3 var50 = this;
            int[] var27 = this.field_355[var2];
            int[] var28 = this.field_356[var2];
            int[] var31 = this.field_350[var2];
            var3 = var27.length;
            int var37 = var28.length;
            var5 = var4;
            var6 = 0;

            for (int var53 = 0; var6 < var37; var6++) {
               var9 = var28[var6] - 2;
               int var76 = var69 + 4;

               for (int var77 = 0; var77 < var3; var53++) {
                  int var74 = var27[var77] - 6;
                  int var16 = var31[var77];
                  int var17 = var76 + 3;
                  int var18 = var5;
                  if (var50.field_354[var64] != null && var50.field_354[var64][var53] != null) {
                     class_20 var79 = var50.field_354[var64][var53];
                     if ((var16 & 1) != 0) {
                        var17 += var74 - var79.method_338() >> 1;
                     } else if ((var16 & 4) != 0) {
                        var17 += var74 - var79.method_338();
                     }

                     if ((var16 & 2) != 0) {
                        var18 = var5 + (var9 - var79.method_339() >> 1);
                     } else if ((var16 & 8) != 0) {
                        var18 = var5 + (var9 - var79.method_339());
                     }

                     var79.method_329(var59, var17 + var79.method_336(), var18 + var79.method_337());
                  } else if (var50.field_353[var64] != null && var50.field_353[var64][var53] != null) {
                     Img var78 = var50.field_353[var64][var53];
                     if ((var16 & 1) != 0) {
                        var17 += var74 - var78.getWidth() >> 1;
                     } else if ((var16 & 4) != 0) {
                        var17 += var74 - var78.getWidth();
                     }

                     if ((var16 & 2) != 0) {
                        var18 = var5 + (var9 - var78.getHeight() >> 1);
                     } else if ((var16 & 8) != 0) {
                        var18 = var5 + (var9 - var78.getHeight());
                     }

                     var59.drawImage(var78, var17, var18, 20);
                  } else if (var50.field_352[var64] != null && var50.field_352[var64][var53] != null) {
                     String[] var19;
                     int var20 = (var19 = var50.field_352[var64][var53]).length * var50.field_280;
                     if ((var16 & 2) != 0) {
                        var18 = var5 + (var9 - var20 >> 1);
                     } else if ((var16 & 8) != 0) {
                        var18 = var5 + (var9 - var20);
                     }

                     for (String var22 : var19) {
                        int var23 = var17;
                        if ((var16 & 5) != 0) {
                           int var24 = var50.field_279.method_311(var22);
                           if ((var16 & 1) != 0) {
                              var23 = var17 + (var74 - var24 >> 1);
                           } else if ((var16 & 4) != 0) {
                              var23 = var17 + (var74 - var24);
                           }
                        }

                        var50.field_279.method_314(var59, var22, var23, var18, 20);
                        var18 += var50.field_280;
                     }
                  }

                  var76 += var27[var77];
                  var77++;
               }

               var5 += var28[var6];
            }
         } else {
            this.method_107(var1, var2, var3, var4, this.field_329[var2], var6);
            this.method_108(var1, var2, var3 + var9, var4, var8, var6);
            if (this.field_325[var2] == 5) {
               int var30 = this.field_342[var2];
               int var33 = this.field_343[var2];
               var4 = var3 + var5 - var30 - var33;
               var5 = this.field_344[var2];
               Img var42;
               if (this.field_347[var2] != null && (var42 = this.field_347[var2][var5]) != null) {
                  var1.drawImage(var42, var4 + (var33 >> 1), var4 + (var6 >> 1), 3);
               }

               if (this.field_348[var2] != null) {
                  class_20 var43 = this.field_348[var2];
                  if (var5 != var43.method_331()) {
                     var43.method_330(var5, -2, true);
                  }

                  var43.method_329(
                     var1, var4 + var43.method_336() + (var33 - var43.method_338() >> 1), var4 + var43.method_337() + (var6 - var43.method_339() >> 1)
                  );
               }

               String var44;
               if (this.field_346[var2] != null && (var44 = this.field_346[var2][var5]) != null) {
                  var8 = var4 + var33 + 4;
                  var9 = var4 + (var6 - this.field_282 >> 1);
                  this.field_281.method_314(var1, var44, var8, var9, 20);
               }
            } else {
               if (this.field_325[var2] == 4) {
                  int var25 = var6;
                  int var71 = var4;
                  Gfx var58 = var1;
                  class_3 var48 = this;
                  int var29 = this.field_342[var2];
                  int var32 = this.field_343[var2];
                  var4 = var3 + var5 - var29 - var32;
                  var5 = this.field_345[var2] - 1;
                  var6 = this.field_344[var2];

                  for (int var51 = 1; var51 <= var5; var51++) {
                     var9 = var4 + (var51 - 1) * 10 + 4;
                     int var75 = var71 + (var25 + var48.field_282 >> 1);
                     int var15 = var48.field_282 * var51 / var5;
                     if (var6 >= var51) {
                        var58.setColor(16711680);
                     } else {
                        var58.setColor(0);
                     }

                     var58.fillRect(var9, var75 - var15, 9, var15);
                  }
               }
            }
         }
      }
   }

   private void method_107(Gfx var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7;
      int var8;
      if (!(var7 = var2 == -2) && this.field_298 != 1) {
         if (this.field_335[var2] == 0) {
            var8 = this.field_334 == var2 ? 1 : 0;
         } else {
            var8 = 2;
         }

         if ((this.field_325[var2] == 5 || this.field_325[var2] == 4) && this.field_344[var2] == 0) {
            var8 = 3;
         }
      } else {
         var8 = 0;
      }

      Img var9 = null;
      if (var7) {
         var9 = this.field_314;
      } else if (this.field_330[var2] != null) {
         var9 = this.field_330[var2][var8];
      }

      if (var9 != null) {
         int var10 = var3 + (var5 - var9.getWidth() >> 1);
         int var11 = var4;
         if (var7 || this.field_298 == 0 || this.field_298 == 100) {
            var11 = var4 + (var6 - var9.getHeight() >> 1);
         } else if (this.field_333[var2] != null && this.field_333[var2].length > this.field_327[var2]) {
            int var12 = this.field_327[var2] * (this.field_280 + 2) - 2;
            if (var9.getHeight() > var12) {
               var12 += 2;
            }

            var11 = var4 + (var12 - var9.getHeight() >> 1);
         }

         var1.drawImage(var9, var10, var11, 20);
      }

      class_20 var13;
      if (var7) {
         var13 = this.field_315;
      } else {
         var13 = this.field_331[var2];
      }

      if (var13 != null) {
         if (var8 != var13.method_331()) {
            var13.method_330(var8, -2, true);
         }

         int var14 = var3 + (var5 - var13.method_338() >> 1);
         int var15 = var4;
         if (var7 || this.field_298 == 0) {
            var15 = var4 + (var6 - var13.method_339() >> 1);
         } else if (this.field_333[var2] != null && this.field_333[var2].length > this.field_327[var2]) {
            int var16 = this.field_327[var2] * (this.field_280 + 2) - 2;
            if (var13.method_339() > var16) {
               var16 += 2;
            }

            var15 = var4 + (var16 - var13.method_339() >> 1);
         }

         var13.method_329(var1, var14 + var13.method_336(), var15 + var13.method_337());
      }
   }

   private void method_108(Gfx var1, int var2, int var3, int var4, int var5, int var6) {
      String[] var7;
      if (var2 == -2) {
         var7 = this.field_313;
      } else {
         var7 = this.field_333[var2];
      }

      if (var7 != null) {
         var3 += 4;
         int var8 = this.field_280;
         BitmapFont var9 = this.field_279;
         if (var2 == -2) {
            var8 = this.field_278;
            var9 = this.field_277;
         } else if (this.field_298 == 0 || this.field_298 == 100) {
            var8 = this.field_282;
            var9 = this.field_281;
         }

         if (var2 != -2 && this.field_298 == 1) {
            int var28 = var8 + 2;
            var8 = var4;
            int var31 = var1.getClipY();
            int var34 = var1.getClipHeight();
            int var35 = 0;
            if (var4 < var31) {
               var35 = (var31 - var4) / var28;
            }

            int var37;
            var31 = (var37 = var31 + var34 - (var4 + var35 * var28)) == 0 ? 0 : (var37 - 1) / var28 + 1;
            int var36 = Math.min(var35 + var31, this.field_333[var2].length);
            int var38 = 0;
            int var39 = 0;
            if (this.field_298 == 1) {
               var38 = this.field_329[var2];
               var39 = this.field_327[var2];
            }

            for (int var40 = var35; var40 < var36; var40++) {
               String var33 = this.field_333[var2][var40];
               var4 = var3;
               var6 = var8 + var28 * var40;
               if (var40 < var39) {
                  var4 = var3 + var38;
               } else if ((this.field_324 & 1) != 0) {
                  int var25 = var9.method_311(var33);
                  var4 = var3 + ((var5 - var25 >> 1) - 4);
               }

               var9.method_314(var1, var33, var4, var6, 20);
            }
         } else {
            var8 = var4 + (var6 - var8 >> 1);
            int var10;
            boolean var11 = (var10 = var9.method_311(var7[0])) <= var5 - 8;
            int var12 = var1.getClipX();
            int var13 = var1.getClipY();
            int var14 = var1.getClipWidth();
            int var15 = var1.getClipHeight();
            if (!var11) {
               int clipRight = var12 + var14;
               int var16 = var13 + var15;
               int var17 = Math.max(var12, var3);
               int var18 = Math.max(var13, var4);
               clipRight = Math.max(var17, Math.min(clipRight, var3 + (var5 - 8)));
               var4 = Math.max(var18, Math.min(var16, var4 + var6));
               var1.setClip(var17, var18, clipRight - var17, var4 - var18);
               if (var2 == -2) {
                  if (this.field_309 >= 0) {
                     var6 = var10 - (this.field_318 - 8);
                     var3 -= Math.min(var6, this.field_309);
                  }
               } else if (var2 == this.field_334 && this.field_339 >= 0) {
                  var6 = var10 - (this.field_328[var2] - 8);
                  var3 -= Math.min(var6, this.field_339);
               }
            }

            var9.method_314(var1, var7[0], var3, var8, 20);
            var1.setClip(var12, var13, var14, var15);
         }
      }
   }

   private void method_109() {
      GameCanvas.method_376();
      int var1 = 0;
      if (this.field_335 != null && this.field_334 < this.field_335.length && this.field_334 != -1) {
         var1 = this.field_335[this.field_334];
      }

      if (this.field_306[0] != -1 && var1 != 1) {
         GameCanvas.method_388(this.field_306[0], 0);
      }

      if (this.field_306[1] != -1) {
         GameCanvas.method_388(this.field_306[1], 0);
      }

      if (this.field_298 == 1) {
         this.field_260 = 0;
      }

      this.field_341 = 0;
      if (this.field_298 == 100) {
         field_267.method_330(0, -1, true);
         field_268.method_330(0, -1, true);
      }
   }

   private int method_110(int var1) {
      if (this.field_303 == 0) {
         return -1;
      } else {
         int var2 = this.field_303;

         do {
            var1 = (var1 + 1) % this.field_303;
            if (var2-- <= 0) {
               return -1;
            }
         } while (!this.method_112(var1));

         return var1;
      }
   }

   private int method_111(int var1) {
      if (this.field_303 == 0) {
         return -1;
      } else {
         if (var1 == -1) {
            var1 = 0;
         }

         int var2 = this.field_303;

         do {
            var1 = (var1 + this.field_303 - 1) % this.field_303;
            if (var2-- <= 0) {
               return -1;
            }
         } while (!this.method_112(var1));

         return var1;
      }
   }

   private boolean method_112(int var1) {
      return this.field_325[var1] == 0 || this.field_325[var1] == 4 || this.field_325[var1] == 5;
   }

   private static String[] method_113(String var0, int var1, int var2, int var3) {
      char[] var4 = new char[]{'.', '/'};
      BitmapFont var17 = field_283;
      var1 -= field_283.field_700 == null && var17.field_704 ? 2 : 0;
      int var5 = 0;
      int var7 = 0;
      int var8 = var0.length();
      Vector var9 = new Vector();
      int var10 = 0;
      if (var0.length() == 0) {
         var9.addElement(var0);
      }

      while (var7 < var8) {
         if ((var7 = var0.indexOf("\\n", var5)) == -1) {
            var7 = var8;
         }

         boolean var11 = false;

         while (!var11) {
            int var6 = var5;
            int var12 = 0;
            int var13 = -1;
            int var14 = var1;
            if (var10 < var3) {
               var14 = var1 - var2;
            }

            while (var12 <= var14 && var6 < var7) {
               char var15 = var0.charAt(var6);
               var12 += field_283.method_312(var15);
               var6++;
               if (var15 == ' ') {
                  var13 = var6;
               }
            }

            if (var6 == var7 && var12 <= var14) {
               var11 = true;
            } else if (var13 != -1) {
               var6 = var13 - 1;
            } else {
               var6--;
               boolean var23 = false;

               for (int var20 = var6; var20 > var5 && !var23; var20--) {
                  char var22 = var0.charAt(var20);
                  int var16 = var4.length;

                  while (--var16 >= 0 && !var23) {
                     if (var22 == var4[var16]) {
                        var6 = var20 + 1;
                        var23 = true;
                     }
                  }
               }
            }

            var9.addElement(var0.substring(var5, var6));
            var10++;
            if (var11 && var6 < var8) {
               var6 += 2;
            } else if (var13 != -1) {
               var6++;
            }

            var5 = var6;
         }
      }

      String[] var19 = new String[var9.size()];

      for (int var21 = 0; var21 < var19.length; var21++) {
         var19[var21] = (String)var9.elementAt(var21);
      }

      field_283 = null;
      return var19;
   }

   public final void method_114() {
      if (this.field_325 != null) {
         for (int var1 = 0; var1 < this.field_303; var1++) {
            this.method_93(var1);
         }
      }

      if (this.field_315 != null) {
         this.field_315.method_340();
      }
   }
}
