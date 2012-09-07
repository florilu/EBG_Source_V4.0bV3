package net.minecraft.src;

import java.util.List;
import java.util.Random;

public class Glacier extends BiomeGenBase
{
    public Glacier(int par1)
    {
      super(par1);
      spawnableCreatureList.clear();
      spawnableMonsterList.clear();
      topBlock = (byte)Block.blockSnow.blockID;
      fillerBlock = (byte)Block.ice.blockID;
      this.theBiomeDecorator.treesPerChunk = -999;
      this.theBiomeDecorator.deadBushPerChunk = -999;
      this.theBiomeDecorator.reedsPerChunk = -999;
      this.theBiomeDecorator.cactiPerChunk = -999;
    }
}