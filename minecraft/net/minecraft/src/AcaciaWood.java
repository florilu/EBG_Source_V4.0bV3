package net.minecraft.src;

import java.util.Random;

public class AcaciaWood extends Block
{
    protected AcaciaWood (int i, int j)
    {
        super(i,j,Material.wood);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public int idDropped(int i, Random random)
    {
        return mod_ebg.AcaciaWood.blockID;               
    }
    
    public int getBlockTextureFromSide(int a)
    {
    	if(a == 0)
    	{
    		return mod_ebg.AcaciaBelow;
    	}
    	else if(a == 1)
    	{
    		return mod_ebg.AcaciaAbove;
    	}
    	else
    	{
    		return mod_ebg.AcaciaSide;
    	}
    }

}