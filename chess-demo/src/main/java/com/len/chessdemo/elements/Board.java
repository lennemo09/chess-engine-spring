package com.len.chessdemo.elements;

import com.len.chessdemo.utils.Player;
import org.springframework.data.annotation.Id;

public class Board {
    @Id
    public String id;

    Tile[][] board = new Tile[8][8];

    public Board() {
        this.makeNewBoard();
    }

    public void makeNewBoard() {
        // Places the pawns
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Tile(i,1, new Pawn(Player.BLACK));
            board[6][i] = new Tile(i,6, new Pawn(Player.BLACK));
        }
    }

    public Tile[][] getBoard() {
        return board;
    }

    public Tile getTile(int x, int y) {
        return board[x][y];
    }
}
