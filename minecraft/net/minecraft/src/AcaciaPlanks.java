package net.minecraft.src;

import java.util.Random;

public class AcaciaPlanks extends Block
{
    protected AcaciaPlanks (int i, int j)
    {
        super(i,j,Material.wood);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    public int idDropped(int i, Random random)
    {
        return mod_ebg.AcaciaPlanks.blockID;               
    }

}