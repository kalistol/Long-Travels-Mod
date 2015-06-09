package kalistol.EasyTools.worldGen;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderEnd;
import net.minecraft.world.gen.ChunkProviderHell;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

import kalistol.EasyTools.EasyTools;

public class rubyOreGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if (!(chunkGenerator instanceof ChunkProviderEnd)
				&& !(chunkGenerator instanceof ChunkProviderHell)) {

			// Ruby
			for (int i = 0; i < 1; i++) {
				int randPosX = (chunkX * 16) + random.nextInt(16);
				int randPosY = random.nextInt(16);
				int randPosZ = (chunkZ * 16) + random.nextInt(16);

				new WorldGenMinable(EasyTools.rubyOre, 1, 1, Blocks.stone)
						.generate(world, random, randPosX, randPosY, randPosZ);
			}

		}
	}
}