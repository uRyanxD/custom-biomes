package com.redescout.custombiomes;

import net.minecraft.server.v1_8_R3.BiomeBase;
import org.bukkit.plugin.java.JavaPlugin;

public final class BiomesPlugin extends JavaPlugin {

    @Override
    public void onLoad() {
        this.replaceWorldBiomes();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void replaceWorldBiomes() {
        BiomeBase[] biomes = BiomeBase.getBiomes();

        biomes[BiomeBase.DEEP_OCEAN.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.OCEAN.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.SWAMPLAND.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.DESERT.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.DESERT_HILLS.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.JUNGLE.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.JUNGLE_EDGE.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.JUNGLE_HILLS.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.EXTREME_HILLS.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.EXTREME_HILLS_PLUS.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.MESA.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.MESA_PLATEAU.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.MESA_PLATEAU_F.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.MUSHROOM_ISLAND.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.MUSHROOM_SHORE.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.FROZEN_OCEAN.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.SAVANNA.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.SAVANNA_PLATEAU.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.RIVER.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.FROZEN_RIVER.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.FOREST.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.FOREST_HILLS.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.BIRCH_FOREST.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.BIRCH_FOREST_HILLS.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.ROOFED_FOREST.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.TAIGA.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.TAIGA_HILLS.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.COLD_TAIGA.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.COLD_TAIGA_HILLS.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.MEGA_TAIGA.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.MEGA_TAIGA_HILLS.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.BEACH.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.STONE_BEACH.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.COLD_BEACH.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.ICE_PLAINS.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.ICE_MOUNTAINS.id] = BiomeBase.PLAINS;
        biomes[BiomeBase.SMALL_MOUNTAINS.id] = BiomeBase.PLAINS;
    }
}