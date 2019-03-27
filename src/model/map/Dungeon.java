package model.map;

public class Dungeon {
    
    Tile[][] board = null;
    
    public Dungeon()
    {
        this.board = new Tile[3][3];
        
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                this.board[i][j] = new Tile();
            }
        }
        ausgeben();
    }
    
    public void ausgeben() {
        StringBuilder meinStringBuilder = new StringBuilder();
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                meinStringBuilder.append(this.board[i][j].toString());;
            }
            meinStringBuilder.append("\n");
        }
        System.out.print(meinStringBuilder);
    }
}
