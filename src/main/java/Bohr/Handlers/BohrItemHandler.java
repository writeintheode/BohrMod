package Bohr.Handlers;

import Bohr.Items.BohrIte;
import Bohr.Items.BohrOre;
import static Bohr.Helper.BohrHelper.modelMaker;
import net.minecraft.creativetab.CreativeTabs;

public class BohrItemHandler {

  public static BohrOre bohrOre;
  private static String lang_bohr_ore = "loc_bohr_ore";
  private static String reg_bohr_ore = "bohr_ore";

  public static void preInit() {

    bohrOre = new BohrOre(lang_bohr_ore, reg_bohr_ore, 64, CreativeTabs.MATERIALS);
    modelMaker(bohrOre);
  }

  public static void init() {
  }

  public static void postInit() {
  }
}
