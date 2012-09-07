package net.minecraft.src;
import java.util.Random;
import java.io.PrintStream;
 
public class Pyramid extends WorldGenerator
{
   public Pyramid()
   {
     
   }
   
   public boolean generate(World world, Random rand, int x, int y, int z)
   {
      if(world.getBlockId(x, y, z)!= Block.sand.blockID || world.getBlockId(x, y + 1, z)!= 0)
      {
         return false;
      }
                int block = Block.sandStone.blockID;
                int glow = Block.glowStone.blockID;
                int shelf = Block.bookShelf.blockID;
                //Boden Anfang
                world.setBlockWithNotify(x, y, z, block);
                world.setBlockWithNotify(x, y, z + 1, block);
                world.setBlockWithNotify(x, y, z + 2, block);
                world.setBlockWithNotify(x, y, z + 3, block);
                world.setBlockWithNotify(x, y, z + 4, block);
                world.setBlockWithNotify(x, y, z + 5, block); //Mitte
                world.setBlockWithNotify(x, y, z + 6, block);
                world.setBlockWithNotify(x + 1, y, z + 4, block);
                world.setBlockWithNotify(x + 1, y, z + 5, block);
                world.setBlockWithNotify(x + 1, y, z + 6, block);
                world.setBlockWithNotify(x - 1, y, z + 4, block);
                world.setBlockWithNotify(x - 1, y, z + 5, block);
                world.setBlockWithNotify(x - 1, y, z + 6, block);
                world.setBlockWithNotify(x, y + 1, z + 5, Block.enchantmentTable.blockID);
                //Boden Ende
                //Regalring Ring 1 von 2 Anfang
                world.setBlockWithNotify(x + 1, y + 1, z + 3, shelf);
                world.setBlockWithNotify(x + 2, y + 1, z + 3, shelf);
                world.setBlockWithNotify(x + 2, y + 1, z + 4, shelf);
                world.setBlockWithNotify(x + 2, y + 1, z + 5, shelf);
                world.setBlockWithNotify(x + 2, y + 1, z + 6, shelf);
                world.setBlockWithNotify(x + 2, y + 1, z + 7, shelf);
                world.setBlockWithNotify(x + 1, y + 1, z + 7, shelf);
                world.setBlockWithNotify(x, y + 1, z + 7, shelf);
                world.setBlockWithNotify(x - 1, y + 1, z + 7, shelf);
                world.setBlockWithNotify(x - 2, y + 1, z + 7, shelf);
                world.setBlockWithNotify(x - 2, y + 1, z + 6, shelf);
                world.setBlockWithNotify(x - 2, y + 1, z + 5, shelf);
                world.setBlockWithNotify(x - 2, y + 1, z + 4, shelf);
                world.setBlockWithNotify(x - 2, y + 1, z + 3, shelf);
                world.setBlockWithNotify(x - 1, y + 1, z + 3, shelf);
                //Regalring Ring 1 von 2 Ende
                //Regalring Ring 2 von 2 Anfang
                world.setBlockWithNotify(x + 1, y + 2, z + 3, shelf);
                world.setBlockWithNotify(x + 2, y + 2, z + 3, shelf);
                world.setBlockWithNotify(x + 2, y + 2, z + 4, shelf);
                world.setBlockWithNotify(x + 2, y + 2, z + 5, shelf);
                world.setBlockWithNotify(x + 2, y + 2, z + 6, shelf);
                world.setBlockWithNotify(x + 2, y + 2, z + 7, shelf);
                world.setBlockWithNotify(x + 1, y + 2, z + 7, shelf);
                world.setBlockWithNotify(x, y + 2, z + 7, shelf);
                world.setBlockWithNotify(x - 1, y + 2, z + 7, shelf);
                world.setBlockWithNotify(x - 2, y + 2, z + 7, shelf);
                world.setBlockWithNotify(x - 2, y + 2, z + 6, shelf);
                world.setBlockWithNotify(x - 2, y + 2, z + 5, shelf);
                world.setBlockWithNotify(x - 2, y + 2, z + 4, shelf);
                world.setBlockWithNotify(x - 2, y + 2, z + 3, shelf);
                world.setBlockWithNotify(x - 1, y + 2, z + 3, shelf);
                //Regalring Ring 2 von 2 Ende
                //glowstonering anfang
                world.setBlockWithNotify(x + 1, y + 3, z + 3, glow);
                world.setBlockWithNotify(x + 2, y + 3, z + 3, glow);
                world.setBlockWithNotify(x + 2, y + 3, z + 4, glow);
                world.setBlockWithNotify(x + 2, y + 3, z + 5, glow);
                world.setBlockWithNotify(x + 2, y + 3, z + 6, glow);
                world.setBlockWithNotify(x + 2, y + 3, z + 7, glow);
                world.setBlockWithNotify(x + 1, y + 3, z + 7, glow);
                world.setBlockWithNotify(x, y + 3, z + 7, glow);
                world.setBlockWithNotify(x - 1, y + 3, z + 7, glow);
                world.setBlockWithNotify(x - 2, y + 3, z + 7, glow);
                world.setBlockWithNotify(x - 2, y + 3, z + 6, glow);                
                world.setBlockWithNotify(x - 2, y + 3, z + 5, glow);
                world.setBlockWithNotify(x - 2, y + 3, z + 4, glow);
                world.setBlockWithNotify(x - 2, y + 3, z + 3, glow);
                world.setBlockWithNotify(x - 1, y + 3, z + 3, glow);
                //Glowstonering Ende
                //Aussenseite Anfang 1. Ring
                world.setBlockWithNotify(x + 1, y + 1, z, block);
                world.setBlockWithNotify(x + 2, y + 1, z, block);
                world.setBlockWithNotify(x + 3, y + 1, z, block);
                world.setBlockWithNotify(x + 4, y + 1, z, block);
                world.setBlockWithNotify(x + 5, y + 1, z, block);
                world.setBlockWithNotify(x + 5, y + 1, z + 1, block);
                world.setBlockWithNotify(x + 5, y + 1, z + 2, block);
                world.setBlockWithNotify(x + 5, y + 1, z + 3, block);
                world.setBlockWithNotify(x + 5, y + 1, z + 4, block);
                world.setBlockWithNotify(x + 5, y + 1, z + 5, block);
                world.setBlockWithNotify(x + 5, y + 1, z + 6, block);
                world.setBlockWithNotify(x + 5, y + 1, z + 7, block);
                world.setBlockWithNotify(x + 5, y + 1, z + 8, block);
                world.setBlockWithNotify(x + 5, y + 1, z + 9, block);
                world.setBlockWithNotify(x + 5, y + 1, z + 10, block);
                world.setBlockWithNotify(x + 4, y + 1, z + 10, block);
                world.setBlockWithNotify(x + 3, y + 1, z + 10, block);
                world.setBlockWithNotify(x + 2, y + 1, z + 10, block);
                world.setBlockWithNotify(x + 1, y + 1, z + 10, block);
                world.setBlockWithNotify(x, y + 1, z + 10, block);
                world.setBlockWithNotify(x - 1, y + 1, z + 10, block);
                world.setBlockWithNotify(x - 2, y + 1, z + 10, block);
                world.setBlockWithNotify(x - 3, y + 1, z + 10, block);
                world.setBlockWithNotify(x - 4, y + 1, z + 10, block);
                world.setBlockWithNotify(x - 5, y + 1, z + 10, block);
                world.setBlockWithNotify(x - 5, y + 1, z + 9, block);
                world.setBlockWithNotify(x - 5, y + 1, z + 8, block);
                world.setBlockWithNotify(x - 5, y + 1, z + 7, block);
                world.setBlockWithNotify(x - 5, y + 1, z + 6, block);
                world.setBlockWithNotify(x - 5, y + 1, z + 5, block);
                world.setBlockWithNotify(x - 5, y + 1, z + 4, block);
                world.setBlockWithNotify(x - 5, y + 1, z + 3, block);
                world.setBlockWithNotify(x - 5, y + 1, z + 2, block);
                world.setBlockWithNotify(x - 5, y + 1, z + 1, block);
                world.setBlockWithNotify(x - 5, y + 1, z, block);
                world.setBlockWithNotify(x - 4, y + 1, z, block);
                world.setBlockWithNotify(x - 3, y + 1, z, block);
                world.setBlockWithNotify(x - 2, y + 1, z, block);
                world.setBlockWithNotify(x - 1, y + 1, z, block);
                //Aussenseite Ende 1. Ring
                //Aussenseite Anfang 2. Ring
                world.setBlockWithNotify(x + 1, y + 2, z + 1, block);
                world.setBlockWithNotify(x + 2, y + 2, z + 1, block);
                world.setBlockWithNotify(x + 3, y + 2, z + 1, block);
                world.setBlockWithNotify(x + 4, y + 2, z + 1, block);
                world.setBlockWithNotify(x + 4, y + 2, z + 2, block);
                world.setBlockWithNotify(x + 4, y + 2, z + 3, block);
                world.setBlockWithNotify(x + 4, y + 2, z + 4, block);
                world.setBlockWithNotify(x + 4, y + 2, z + 5, block);
                world.setBlockWithNotify(x + 4, y + 2, z + 6, block);
                world.setBlockWithNotify(x + 4, y + 2, z + 6, block);
                world.setBlockWithNotify(x + 4, y + 2, z + 7, block);
                world.setBlockWithNotify(x + 4, y + 2, z + 8, block);
                world.setBlockWithNotify(x + 4, y + 2, z + 9, block);
                world.setBlockWithNotify(x + 3, y + 2, z + 9, block);
                world.setBlockWithNotify(x + 2, y + 2, z + 9, block);
                world.setBlockWithNotify(x + 1, y + 2, z + 9, block);
                world.setBlockWithNotify(x, y + 2, z + 9, block);
                world.setBlockWithNotify(x - 1, y + 2, z + 9, block);
                world.setBlockWithNotify(x - 2, y + 2, z + 9, block);
                world.setBlockWithNotify(x - 3, y + 2, z + 9, block);
                world.setBlockWithNotify(x - 4, y + 2, z + 9, block);
                world.setBlockWithNotify(x - 4, y + 2, z + 8, block);
                world.setBlockWithNotify(x - 4, y + 2, z + 7, block);
                world.setBlockWithNotify(x - 4, y + 2, z + 6, block);
                world.setBlockWithNotify(x - 4, y + 2, z + 5, block);
                world.setBlockWithNotify(x - 4, y + 2, z + 4, block);
                world.setBlockWithNotify(x - 4, y + 2, z + 3, block);
                world.setBlockWithNotify(x - 4, y + 2, z + 2, block);
                world.setBlockWithNotify(x - 4, y + 2, z + 1, block);
                world.setBlockWithNotify(x - 3, y + 2, z + 1, block);
                world.setBlockWithNotify(x - 2, y + 2, z + 1, block);
                world.setBlockWithNotify(x - 1, y + 2, z + 1, block);
                //Aussenseite Ende 2. Ring
                //Aussenseite Anfang 3. Ring
                world.setBlockWithNotify(x + 1, y + 3, z + 2, block);
                world.setBlockWithNotify(x + 2, y + 3, z + 2, block);
                world.setBlockWithNotify(x + 3, y + 3, z + 2, block);
                world.setBlockWithNotify(x + 3, y + 3, z + 3, block);
                world.setBlockWithNotify(x + 3, y + 3, z + 4, block);
                world.setBlockWithNotify(x + 3, y + 3, z + 5, block);
                world.setBlockWithNotify(x + 3, y + 3, z + 6, block);
                world.setBlockWithNotify(x + 3, y + 3, z + 7, block);
                world.setBlockWithNotify(x + 3, y + 3, z + 8, block);
                world.setBlockWithNotify(x + 2, y + 3, z + 8, block);
                world.setBlockWithNotify(x + 1, y + 3, z + 8, block);
                world.setBlockWithNotify(x, y + 3, z + 8, block);
                world.setBlockWithNotify(x - 1, y + 3, z + 8, block);
                world.setBlockWithNotify(x - 2, y + 3, z + 8, block);
                world.setBlockWithNotify(x - 3, y + 3, z + 8, block);
                world.setBlockWithNotify(x - 3, y + 3, z + 7, block);
                world.setBlockWithNotify(x - 3, y + 3, z + 6, block);
                world.setBlockWithNotify(x - 3, y + 3, z + 5, block);
                world.setBlockWithNotify(x - 3, y + 3, z + 4, block);
                world.setBlockWithNotify(x - 3, y + 3, z + 3, block);
                world.setBlockWithNotify(x - 3, y + 3, z + 2, block);
                world.setBlockWithNotify(x - 2, y + 3, z + 2, block);
                world.setBlockWithNotify(x - 1, y + 3, z + 2, block);
                world.setBlockWithNotify(x, y + 3, z + 2, block);
                //Aussenseite Ende 3. Ring
                //Aussenseite Anfang 4. Ring
                world.setBlockWithNotify(x, y + 4, z + 3, block);
                world.setBlockWithNotify(x + 1, y + 4, z + 3, block);
                world.setBlockWithNotify(x + 2, y + 4, z + 3, block);
                world.setBlockWithNotify(x + 2, y + 4, z + 4, block);
                world.setBlockWithNotify(x + 2, y + 4, z + 5, block);
                world.setBlockWithNotify(x + 2, y + 4, z + 6, block);
                world.setBlockWithNotify(x + 2, y + 4, z + 7, block);
                world.setBlockWithNotify(x + 1, y + 4, z + 7, block);
                world.setBlockWithNotify(x, y + 4, z + 7, block);
                world.setBlockWithNotify(x - 1, y + 4, z + 7, block);
                world.setBlockWithNotify(x - 2, y + 4, z + 7, block);
                world.setBlockWithNotify(x - 2, y + 4, z + 6, block);
                world.setBlockWithNotify(x - 2, y + 4, z + 5, block);
                world.setBlockWithNotify(x - 2, y + 4, z + 4, block);
                world.setBlockWithNotify(x - 2, y + 4, z + 3, block);
                world.setBlockWithNotify(x - 1, y + 4, z + 3, block);
                //Aussenseite Ende 4. Ring
                //Aussenseite Anfang 5. Ring
                world.setBlockWithNotify(x, y + 5, z + 4, block);
                world.setBlockWithNotify(x + 1, y + 5, z + 4, block);
                world.setBlockWithNotify(x + 1, y + 5, z + 5, block);
                world.setBlockWithNotify(x + 1, y + 5, z + 6, block);
                world.setBlockWithNotify(x, y + 5, z + 6, block);
                world.setBlockWithNotify(x - 1, y + 5, z + 6, block);
                world.setBlockWithNotify(x - 1, y + 5, z + 5, block);
                world.setBlockWithNotify(x - 1, y + 5, z + 4, block);
                //Aussenseite Ende 5. Ring
                //Aussenseite Anfang Stein an der Spitze
                world.setBlockWithNotify(x, y + 6, z + 5, block);
                //Aussenseite Ende Stein an der Spitze
                //Zusatz Anfang
                world.setBlockWithNotify(x + 1, y + 2, z, block);
                world.setBlockWithNotify(x + 1, y + 3, z, block);
                world.setBlockWithNotify(x - 1, y + 2, z, block);
                world.setBlockWithNotify(x - 1, y + 3, z, block);
                world.setBlockWithNotify(x, y + 3, z, block);
                world.setBlockWithNotify(x + 1, y + 1, z + 1, block);
                world.setBlockWithNotify(x - 1, y + 1, z + 1, block);
                world.setBlockWithNotify(x + 1, y + 1, z + 2, block);
                world.setBlockWithNotify(x + 1, y + 2, z + 2, block);
                world.setBlockWithNotify(x - 1, y + 1, z + 2, block);
                world.setBlockWithNotify(x - 1, y + 2, z + 2, block);
                world.setBlockWithNotify(x, y + 3, z + 3, glow);
                world.setBlockWithNotify(x - 1, y + 3, z + 1, block);
                world.setBlockWithNotify(x + 1, y + 3, z + 1, block);
                world.setBlockWithNotify(x, y + 3, z + 1, block);
                world.setBlockWithNotify(x, y + 4, z + 1, block);
                world.setBlockWithNotify(x, y + 4, z + 2, block);
                
                return true;
   }
}