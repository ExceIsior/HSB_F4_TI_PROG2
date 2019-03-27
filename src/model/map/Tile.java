package model.map;

public class Tile {
    
    private Field[][] tile = null;
    private boolean visible = false;
    
    public Tile() {
        tile = new Field[4][4];
        
        for (int i = 0; i < this.tile.length; i++) {
            for (int j = 0; j < this.tile[i].length; j++) {
                this.tile[i][j] = new Field('T');
            }
        }
    }
    @Override
    public String toString() {
        
        StringBuilder meinStringBuilder = new StringBuilder();
        for (int i = 0; i < this.tile.length; i++) {
            for (int j = 0; j < this.tile[i].length; j++) {
                meinStringBuilder.append(this.tile[i][j].getTextture());
            }
            meinStringBuilder.append("\n");
        }
        return meinStringBuilder.toString();
    }
}
