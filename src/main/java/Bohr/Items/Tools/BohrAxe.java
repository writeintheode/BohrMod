package Bohr.Items.Tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class BohrAxe extends ItemAxe{
  public BohrAxe(String langName, String regName, int stackSize,
                 ToolMaterial mat, CreativeTabs tab) {
  super(mat, mat.getDamageVsEntity(), mat.getEfficiencyOnProperMaterial());
    setUnlocalizedName(langName);
    setRegistryName(regName);
    setMaxStackSize(stackSize);
    setCreativeTab(tab);
  }
}
