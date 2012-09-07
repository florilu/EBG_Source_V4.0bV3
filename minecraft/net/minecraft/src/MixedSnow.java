package net.minecraft.src;

import java.util.List;
import java.util.Random;

public class MixedSnow extends BiomeGenBase
{
    public MixedSnow(int par1)
    {
        super(par1);
        spawnableCreatureList.add(new SpawnListEntry(net.minecraft.src.EntityCow.class, 5, 4, 4));
        this.theBiomeDecorator.treesPerChunk = 10;
        this.theBiomeDecorator.grassPerChunk = 2;
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

        if (par1Random.nextInt(1000) == 0)
        {
            return worldGeneratorBigTree;
        }
        
        if (par1Random.nextInt(3) == 0)
        {
            return new WorldGenTaiga1();
        }
        
        else
        {
            return worldGeneratorTrees;
        }
    }
}
