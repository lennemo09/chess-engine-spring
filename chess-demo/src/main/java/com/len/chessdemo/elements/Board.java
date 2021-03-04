package com.len.chessdemo.elements;

import com.len.chessdemo.utils.Move;
import com.len.chessdemo.utils.Player;
import com.len.chessdemo.utils.Position;
import org.springframework.data.annotation.Id;

public class Board {
    @Id
    public String id;

    Tile[][] board = new Tile[8][8];

    public Board() {
        this.makeNewBoard();
    }

    public void makeNewBoard() {
        // Places the pawns on the 2nd and 7th ranks.
        for (int i = 0; i < 8; i++) {
            board[0][i] = new Tile(new Position(i,1), new Pawn(Player.BLACK));
            board[1][i] = new Tile(new Position(i,1), new Pawn(Player.BLACK));
            board[6][i] = new Tile(new Position(i,6), new Pawn(Player.WHITE));
            board[7][i] = new Tile(new Position(i,6), new Pawn(Player.WHITE));
        }

        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Tile(new Position(j,i), null);
            }
        }
    }

    public Tile[][] getBoard() {
        return board;
    }

    public Tile getTile(Position pos) {
        return board[pos.y][pos.x];
    }

    public Piece makeMove(Move move) {
        Tile sourceTile = this.getTile(move.getSrc());
        Tile destinationTile = this.getTile(move.getDst());
        Piece piece = sourceTile.getPiece();

        sourceTile.setPiece(null);
        destinationTile.setPiece(piece);
//        if (piece != null) {
//            boolean canMove = piece.checkTileMovable(destinationTile);
//            if (canMove) {
//                this.getTile(move.getSrc()).setPiece(null);
//                this.getTile(move.getDst()).setPiece(piece);
//            }
//        }
        return piece;
    }
}
