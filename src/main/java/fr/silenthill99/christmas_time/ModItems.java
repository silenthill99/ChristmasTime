package fr.silenthill99.christmas_time;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    public static final RegistryObject<Item> BARLEY_SWORD = ITEMS.register("barley_sword", () -> new SwordItem(ModItemTiers.BARLEY, 3, -3f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_COMBAT)));
}
