package com.len.chessdemo.elements;

import com.len.chessdemo.utils.Position;

public class Tile {
    private Piece piece;
    private Position pos;

    public Tile(Position pos, Piece piece) {
        this.setPiece(piece);
        this.setPos(pos);
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }
}
