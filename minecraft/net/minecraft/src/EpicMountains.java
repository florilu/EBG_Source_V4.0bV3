package net.minecraft.src;

import java.util.List;
import java.util.Random;

public class EpicMountains extends BiomeGenBase
{
    protected EpicMountains(int par1)
    {
        super(par1);
        this.theBiomeDecorator.treesPerChunk = 10;
        this.theBiomeDecorator.flowersPerChunk = 2;
        spawnableCreatureList.add(new SpawnListEntry(net.minecraft.src.EntityCow.class, 10, 4, 4));
    }
    
    public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {

        if (par1Random.nextInt(2) == 0)
        {
            return new WorldGenShrub(3, 0);
        }
        
        else
        {
            return new WorldGenTrees(false, 4 + par1Random.nextInt(7), 3, 3, true);
        }
    
    }
}
