package Bohr.Handlers;

import Bohr.Handlers.BohrItemHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BohrRecipeHandler {

   public static void init() {
     
     //json smelting recipes are not yet supported...
     GameRegistry.addSmelting(BohrItemHandler.bohrOre, new ItemStack(BohrItemHandler.bohrIte, 2), 3f);

   }
}
