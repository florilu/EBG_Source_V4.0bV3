package net.minecraft.src;

import java.util.List;
import java.util.Random;

public class Volcano extends BiomeGenBase
{
    public Volcano(int par1)
    {
        super(par1);
        spawnableCreatureList.clear();
        topBlock = (byte)mod_ebg.Basalt.blockID;
        fillerBlock = (byte)Block.lavaMoving.blockID;
        this.theBiomeDecorator.treesPerChunk = -999;
    }
    
}
