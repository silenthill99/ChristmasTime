package fr.silenthill99.christmas_time.init;

import fr.silenthill99.christmas_time.Main;
import fr.silenthill99.christmas_time.init.blocks.GingerbreadSugar;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);

    public static final RegistryObject<Block> GINGERBREAD_SUGAR = createBlock("gingerbread_sugar", GingerbreadSugar::new);

    private static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        return block;
    }
}
