package fr.silenthill99.christmas_time.utils;

import fr.silenthill99.christmas_time.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups
{
    public static final ItemGroup NOEL = new ItemGroup("christmas_time") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CHRISTMAS_WREATH.get());
        }
    };
}
