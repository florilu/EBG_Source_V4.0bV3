package net.minecraft.src;

import java.util.Random;

public class Lakeland extends BiomeGenBase
{
    protected Lakeland(int par1)
    {
        super(par1);
        this.theBiomeDecorator.treesPerChunk = 1;
        this.theBiomeDecorator.flowersPerChunk = 2;
        this.theBiomeDecorator.clayPerChunk = 1;
        this.theBiomeDecorator.waterlilyPerChunk = 3;
    }

    public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return worldGeneratorSwamp;
    }
    
}
