public class BohrishRecipeHandler {

   public static void init() {
       GameRegistry.addSmelting(BohrItemHandler.bohrOre, new ItemStack(BohrItemHandler.bohrite), 1);

       GameRegistry.addRecipe(new ItemStack(BohrItemHandler.bohrPickaxe,1),
               "XXX",
               " Y ",
               " Y ",
               'X', BohrItemHandler.bohrite,
               'Y', Items.STICK);

       GameRegistry.addRecipe(new ItemStack(BohrItemHandler.bohrShovel,1),
               " X ",
               " Y ",
               " Y ",
               'X', BohrItemHandler.bohrite,
               'Y', Items.STICK);

       GameRegistry.addRecipe(new ItemStack(BohrItemHandler.bohrHoe,1),
               "XX ",
               " Y ",
               " Y ",
               'X', BohrItemHandler.bohrite,
               'Y', Items.STICK);

       GameRegistry.addRecipe(new ItemStack(BohrItemHandler.bohrAxe,1),
               "XX ",
               "XY ",
               " Y ",
               'X', BohrItemHandler.bohrite,
               'Y', Items.STICK);

       GameRegistry.addRecipe(new ItemStack(BohrItemHandler.bohrSword,1),
               " X ",
               " X ",
               " Y ",
               'X', BohrItemHandler.bohrite,
               'Y', Items.STICK);
   }
}
