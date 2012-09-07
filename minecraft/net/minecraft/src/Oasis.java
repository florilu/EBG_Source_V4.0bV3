package net.minecraft.src;

import java.util.List;
import java.util.Random;

public class Oasis extends BiomeGenBase
{
    public Oasis(int par1)
    {
        super(par1);
        this.theBiomeDecorator.treesPerChunk = 3;
        this.theBiomeDecorator.grassPerChunk = 2;
        this.theBiomeDecorator.flowersPerChunk = 4;
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
            return new WorldGenTrees(false, 4 + par1Random.nextInt(7), 3, 3, true);
        }
    }
    
    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);
        WorldGenVines worldgenvines = new WorldGenVines();

        for (int i = 0; i < 50; i++)
        {
            int j = par3 + par2Random.nextInt(16) + 8;
            byte byte0 = 64;
            int k = par4 + par2Random.nextInt(16) + 8;
            worldgenvines.generate(par1World, par2Random, j, byte0, k);
        }
    }
}
