package com.len.chessdemo.elements;

import com.len.chessdemo.utils.Move;
import com.len.chessdemo.utils.Player;

import java.util.ArrayList;

public class Pawn extends Piece {
    public Pawn(Player player) {
        super(player);
    }

    @Override
    public boolean isLegalMove(Move move) {
        return true;
    }

//    @Override
//    public ArrayList<Move> getLegalMoves(Move move) {
//        return new Move();
//    }


}
