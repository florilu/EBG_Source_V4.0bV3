package net.minecraft.src;

import java.util.Random;

public class AcaciaSapling extends BlockFlower
{
    protected AcaciaSapling (int i, int j)
    {
        super(i,j,Material.rock);
        this.setCreativeTab(CreativeTabs.tabDeco);
    }

    public int idDropped(int i, Random random)
    {
        return mod_ebg.AcaciaSapling.blockID;               
    }

}