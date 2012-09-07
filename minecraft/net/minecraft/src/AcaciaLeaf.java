package net.minecraft.src;

import java.util.Random;

public class AcaciaLeaf extends Block
{
    protected AcaciaLeaf (int i, int j)
    {
        super(i,j,Material.leaves);
        this.setCreativeTab(CreativeTabs.tabDeco);
    }

    public int idDropped(int i, Random random)
    {
        return mod_ebg.AcaciaLeaf.blockID;               
    }

}