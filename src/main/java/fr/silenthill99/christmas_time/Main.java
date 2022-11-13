package fr.silenthill99.christmas_time;

import fr.silenthill99.christmas_time.init.ModBlocks;
import fr.silenthill99.christmas_time.init.ModItems;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main
{
    public static final String MODID = "christmas_time";

    public Main()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);
        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
    }

    private void setup(FMLCommonSetupEvent event)
    {
    }

    private void clientSetup(FMLClientSetupEvent event)
    {
        RenderTypeLookup.setRenderLayer(ModBlocks.CHRISTMAS_WREATH.get(), RenderType.cutout());
    }
}