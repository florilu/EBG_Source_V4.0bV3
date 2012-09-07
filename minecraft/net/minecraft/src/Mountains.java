package net.minecraft.src;

import java.util.Random;

public class Mountains extends BiomeGenBase
{
	public Mountains(int par1)
	{
		super(par1);
		this.spawnableCreatureList.clear();
        this.topBlock = (byte)Block.stone.blockID;
        this.fillerBlock = (byte)Block.stone.blockID;
        this.theBiomeDecorator.treesPerChunk = 3;
	}
}



