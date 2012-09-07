package net.minecraft.src;
import java.util.Random;

public class mod_ebg extends BaseMod
{

public static final Block Basalt = new Basalt(253,0).setHardness(3.0F).setLightValue(0.0F).setBlockName("Basalt");
public static final Block CrackedSand = (new CrackedSand(254, 0)).setHardness(1.0F).setLightValue(0.0F).setBlockName("Cracked Sand");
public static final Block AcaciaWood = new AcaciaWood(255, 0).setHardness(2.0F).setBlockName("Acacia Wood");
public static final Block AcaciaLeaf = new AcaciaLeaf(202, 0).setHardness(0.2F).setLightOpacity(1).setBlockName("Acacia Leaf");
public static final Block AcaciaSapling = new AcaciaSapling(201, 15).setHardness(0.0F).setBlockName("Acacia Sapling");
public static final Block AcaciaPlanks = (new AcaciaPlanks(200, 0)).setHardness(2.0F).setBlockName("Acacia Planks");

public static BiomeGenBase newdesert = (new NewDesert(39)).setColor(13786898).setDisableRain().setTemperatureRainfall(2.0F, 0.0F).setMinMaxHeight(0.1F, 0.3F).setBiomeName("Desert");
public static BiomeGenBase foresthills = (new ForestHills(41)).setColor(353825).setTemperatureRainfall(0.7F, 0.8F).setMinMaxHeight(0.6F, 1.9F).setBiomeName("Forest Mountains");
public static BiomeGenBase newforest = (new NewForest(42)).setColor(353825).setTemperatureRainfall(0.7F, 0.8F).setBiomeName("Forest");
public static BiomeGenBase coveredmountains = (new CoveredMountains(43)).setColor(747097).setTemperatureRainfall(0.0F, 0.8F).setMinMaxHeight(0.7F, 2.0F).setBiomeName("Covered Mountains");

public static int AcaciaAbove = ModLoader.addOverride("/terrain.png", "/textures/blocks/AcaciaAbove.png");
public static int AcaciaBelow = ModLoader.addOverride("/terrain.png", "/textures/blocks/AcaciaBelow.png");
public static int AcaciaSide = ModLoader.addOverride("/terrain.png", "/textures/blocks/acaciawood.png");

public mod_ebg()
{    

    ModLoader.registerBlock(Basalt);
    ModLoader.registerBlock(CrackedSand);
    ModLoader.registerBlock(AcaciaWood);
    ModLoader.registerBlock(AcaciaLeaf);
    ModLoader.registerBlock(AcaciaSapling);
    ModLoader.registerBlock(AcaciaPlanks);
    
    Basalt.blockIndexInTexture = ModLoader.addOverride("/terrain.png","/textures/blocks/basalt.png");
    CrackedSand.blockIndexInTexture = ModLoader.addOverride("/terrain.png","/textures/blocks/crackedsand.png");
    //AcaciaWood.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/blocks/acaciawood.png");
    AcaciaPlanks.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/blocks/acaciaplanks.png");
    AcaciaLeaf.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/blocks/acacialeaf.png");
    AcaciaSapling.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/blocks/acaciasapling.png");

    ModLoader.addName(Basalt, "Basalt");
    ModLoader.addName(CrackedSand, "Cracked Sand");
    ModLoader.addName(AcaciaWood, "WIP");
    ModLoader.addName(AcaciaLeaf, "WIP");
    ModLoader.addName(AcaciaSapling, "WIP");
    ModLoader.addName(AcaciaPlanks, "WIP");
    
}               

public String getVersion()
    {
        return "1.3.2";
    }
  
        public void load()
        {
        	ModLoader.addBiome(mod_ebg.newdesert);
        }

} 