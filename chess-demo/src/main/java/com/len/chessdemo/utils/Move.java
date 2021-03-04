package com.len.chessdemo.utils;

import com.len.chessdemo.elements.Tile;

public class Move {

    private String boardId;
    private Position src;
    private Position dst;

    public Move(String boardId, Position sourcePos, Position destinationPos) {
        this.setBoardId(boardId);
        this.setSrc(sourcePos);
        this.setDst(destinationPos);
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public Position getSrc() {
        return src;
    }

    public void setSrc(Position src) {
        this.src = src;
    }

    public Position getDst() {
        return dst;
    }

    public void setDst(Position dst) {
        this.dst = dst;
    }
}
