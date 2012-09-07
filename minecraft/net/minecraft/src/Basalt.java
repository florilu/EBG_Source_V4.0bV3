package net.minecraft.src;

import java.util.Random;

public class Basalt extends Block
{
    protected Basalt (int i, int j)
    {
        super(i,j,Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    public int idDropped(int i, Random random)
    {
        return mod_ebg.Basalt.blockID;               
    }

}