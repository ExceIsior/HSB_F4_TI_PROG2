package control.Enums;

import control.Constants.TerrainConst;
import model.map.Terrain;

public enum Terrains {
    GRASS(new Terrain(TerrainConst.GRASS_HEIGHT, TerrainConst.GRASS_PATH)),
    MOUNTAIN(new Terrain(TerrainConst.MOUNTAIN_HEIGHT, TerrainConst.MOUNTAIN_PATH)),
    FOREST(new Terrain(TerrainConst.FOREST_HEIGHT, TerrainConst.FOREST_PATH)),
    RIVER(new Terrain(TerrainConst.RIVER_HEIGHT, TerrainConst.RIVER_PATH));

    private Terrain terrain;

    private Terrains(Terrain terrain) {
        this.terrain = terrain;
    }

    public Terrain getTerrain() {
        return this.terrain;
    }
}
