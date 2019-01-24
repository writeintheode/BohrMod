package Bohr.Handlers;

import Bohr.Items.BohrIte;
import Bohr.Items.BohrOre;
import static Bohr.Helper.BohrHelper.modelMaker;
import net.minecraft.creativetab.CreativeTabs;

public class BohrItemHandler {

  public static BohrOre bohrOre;
  private static String lang_bohr_ore = "loc_bohr_ore";
  private static String reg_bohr_ore = "bohr_ore";

  public static BohrIte bohrIte;
  private static String lang_bohr_ite = "loc_bohr_ite";
  private static String reg_bohr_ite = "bohr_ite";
  public static void preInit() {

    bohrOre = new BohrOre(lang_bohr_ore, reg_bohr_ore, 64, CreativeTabs.MATERIALS);
    modelMaker(bohrOre);

    bohrIte =  new BohrIte(lang_bohr_ite,reg_bohr_ite, 64, CreativeTabs.MATERIALS);
    modelMaker(bohrIte);

//    bohrAxe = new BohrAxe(lang_bohr_axe,reg_bohr_axe,1, BohrMaterialHandler.BOHR,CreativeTabs.TOOLS);
//    modelMaker(bohrAxe);
//
//    bohrHoe = new BohrHoe(lang_bohr_hoe, reg_bohr_hoe,1, BohrMaterialHandler.BOHR,CreativeTabs.TOOLS);
//    modelMaker(bohrHoe);
//
//    bohrPick = new BohrPick(lang_bohr_pick, reg_bohr_pick,1, BohrMaterialHandler.BOHR,CreativeTabs.TOOLS);
//    modelMaker(bohrPick);
//
//    bohrShovel = new BohrShovel(lang_bohr_shovel, reg_bohr_shovel,1, BohrMaterialHandler.BOHR,CreativeTabs.TOOLS);
//    modelMaker(bohrShovel);
  }

  public static void init() {
  }

  public static void postInit() {
  }
}
