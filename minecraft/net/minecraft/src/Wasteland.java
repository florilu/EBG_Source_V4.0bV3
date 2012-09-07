package net.minecraft.src;

import java.util.List;
import java.util.Random;

public class Wasteland extends BiomeGenBase
{
    public Wasteland(int par1)
    {
        super(par1);
        spawnableCreatureList.clear();
        topBlock = (byte)mod_ebg.CrackedSand.blockID;
        fillerBlock = (byte)mod_ebg.CrackedSand.blockID;
        this.theBiomeDecorator.treesPerChunk = -999;
        this.theBiomeDecorator.deadBushPerChunk = 2;
        this.theBiomeDecorator.reedsPerChunk = 50;
        this.theBiomeDecorator.cactiPerChunk = -999;
    }

}
