package com.len.chessdemo.utils;

import com.len.chessdemo.elements.Tile;

public class Move {

    private String boardId;
    private Tile src;
    private Tile dst;

    public Move(String boardId, Tile sourceTile, Tile destinationTile) {
        this.boardId = boardId;
        this.src = sourceTile;
        this.dst = destinationTile;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public Tile getSrc() {
        return src;
    }

    public void setSrc(Tile src) {
        this.src = src;
    }

    public Tile getDst() {
        return dst;
    }

    public void setDst(Tile dst) {
        this.dst = dst;
    }
}
