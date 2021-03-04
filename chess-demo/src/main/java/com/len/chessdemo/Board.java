package com.len.chessdemo;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class Board {
    @Id
    public String id;

    Piece[][] board = new Piece[8][8];

    public Piece[][] getBoard() {
        return board;
    }
}
