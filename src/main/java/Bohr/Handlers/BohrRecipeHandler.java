public class BohrishRecipeHandler {

   public static void init() {
     
     //json smelting recipes are not yet supported...
     GameRegistry.addSmelting(BohrItemHandler.bohrOre, new ItemStack(BohrItemHandler.bohrIte, 2), 3f);

   }
}
