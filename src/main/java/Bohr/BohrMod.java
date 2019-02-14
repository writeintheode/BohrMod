package Bohr;

import Bohr.Config.Config;
import Bohr.Handlers.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Config.NAME, version = Config.VERSION, modid = Config.MODID)
public class BohrMod {
    @EventHandler
    public void preinit(FMLPreInitializationEvent event){
        System.out.println("<<<<<< Inside preinit method >>>>>>");
        BohrBlockHandler.preInit();
        BohrWorldHandler.preInit();
        BohrItemHandler.preInit();
        BohrToolHandler.preInit();

    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        System.out.println("<<<<<< Inside init method >>>>>>");
        BohrBlockHandler.init();
        BohrWorldHandler.init();
        BohrItemHandler.init();
        BohrToolHandler.init();
        BohrRecipeHandler.init();
    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        System.out.println("<<<<<< Inside postinit method >>>>>>");
        BohrBlockHandler.postInit();
        BohrWorldHandler.postInit();
        BohrItemHandler.postInit();
        BohrToolHandler.postInit();
    }
}
