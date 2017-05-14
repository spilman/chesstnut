package model.impl;

import model.Piece;
import model.PieceTypeEnum;

public class PieceImpl implements Piece {
    private PieceTypeEnum type;
    private boolean whitePiece;

    public PieceImpl() {
        this.type = null;
        this.whitePiece = true;
    }

    public PieceTypeEnum getPieceType() {
        return this.type;
    }

    public void setPieceType(PieceTypeEnum pieceType) {
        this.type = pieceType;
    }

    public boolean isPieceWhite() {
        return this.whitePiece;
    }

    public void setPieceWhite(boolean whiteBool) {
        this.whitePiece = whiteBool;
    }
}
