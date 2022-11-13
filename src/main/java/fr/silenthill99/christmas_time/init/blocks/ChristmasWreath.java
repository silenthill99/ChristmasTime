package fr.silenthill99.christmas_time.init.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ChristmasWreath extends Block
{
    public ChristmasWreath() {
        super(AbstractBlock.Properties.of(Material.DIRT).noOcclusion());
    }
}
