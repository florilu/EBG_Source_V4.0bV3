package net.minecraft.src;

import java.util.List;
import java.util.Random;

public class Firelands extends BiomeGenBase
{
    public Firelands(int par1)
    {
        super(par1);
        spawnableCreatureList.clear();
        topBlock = (byte)mod_ebg.Basalt.blockID;
        fillerBlock = (byte)mod_ebg.Basalt.blockID;
        this.theBiomeDecorator.treesPerChunk = -999;
    }
    
}
