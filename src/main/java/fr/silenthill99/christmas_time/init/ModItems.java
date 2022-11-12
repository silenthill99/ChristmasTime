package fr.silenthill99.christmas_time.init;

import fr.silenthill99.christmas_time.Main;
import fr.silenthill99.christmas_time.utils.ModItemTiers;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    public static final RegistryObject<Item> BARLEY = ITEMS.register("barley", () -> new Item(new Item.Properties().food(new Food.Builder().alwaysEat().build()).tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> BARLEY_SWORD = ITEMS.register("barley_sword", () -> new SwordItem(ModItemTiers.BARLEY, 3, -3f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> BARLEY_PICKAXE = ITEMS.register("barley_pickaxe", () -> new PickaxeItem(ModItemTiers.BARLEY, 3, -3f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> GINGERBREAD_SUGAR = ITEMS.register("gingerbread_sugar", () -> new BlockItem(ModBlocks.GINGERBREAD_SUGAR.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
}