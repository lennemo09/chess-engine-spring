package com.len.chessdemo.elements;

import com.len.chessdemo.utils.Move;
import com.len.chessdemo.utils.Player;

import java.util.ArrayList;

public abstract class Piece {
    private Player player;

    public Piece(Player player) {
        this.setPlayer(player);
    }

    public abstract boolean isLegalMove(Move move);
    //public abstract ArrayList<Move> getLegalMoves(Move move);

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
