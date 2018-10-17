package Bohr.Items;

import Bohr.Handlers.BohrBlockHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class BohrWorldGenerator implements IWorldGenerator {

  @Override
  public void generate(Random random, int chunkX, int chunkZ, World world,
                       IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
    // Dimension 0 is the overworld
    if (world.provider.getDimension() == 0){
      //is this saying 16x16 -> a random chunk?
      generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
    }
  }

  private void generateOverworld(Random random, int chunkX, int chunkZ,
                                 World world, IChunkGenerator chunkGenerator,
                                 IChunkProvider chunkProvider) {
    int chunkSize = 16;
    int yMax=256;
    int blockCount=4;
    int chance = 1;
    generateOre(BohrBlockHandler.bohrBlock.getDefaultState(), world, random,
            chunkX * chunkSize, chunkZ * chunkSize, chunkSize, yMax,
            blockCount + random.nextInt(blockCount), chance);
  }
  private void generateOre(IBlockState ore, World world, Random random, int x,
  int z, int minY, int maxY, int blockCount, int chances) {
    int deltaY = maxY - minY;

    for (int i = 0; i < chances; i++) {
      BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY),
       z + random.nextInt(16));
      if(i % 1 == 0) {
        System.out.println(pos.toString()+" ->"+i+"<- ");
      }

      WorldGenMinable generator = new WorldGenMinable(ore, blockCount);
      generator.generate(world, random, pos);
    }
  }


}
