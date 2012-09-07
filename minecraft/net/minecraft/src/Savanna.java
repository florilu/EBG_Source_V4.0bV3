package net.minecraft.src;

import java.util.List;
import java.util.Random;

public class Savanna extends BiomeGenBase
{
    public Savanna(int par1)
    {
        super(par1);
        spawnableCreatureList.clear();
        this.theBiomeDecorator.treesPerChunk = 1;
        this.theBiomeDecorator.grassPerChunk = 4;
    }

    /**
     * Gets a WorldGen appropriate for this biome.
     */
    public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        if (par1Random.nextInt(5) == 0)
        {
            return worldGeneratorForest;
        }
        
        else
        {
            return worldGeneratorTrees;
        }
    }
}
