package Bohr.Handlers;

import Bohr.Items.BohrWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BohrWorldHandler {
  // was 3, setting to 100 to see what happens
  public static void preInit() {
    GameRegistry.registerWorldGenerator(new BohrWorldGenerator(), 100);
  }

  public static void init() {
  }

  public static void postInit() {
  }
}

