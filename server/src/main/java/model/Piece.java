package model;

public interface Piece {
    PieceTypeEnum getPieceType();
    void setPieceType(PieceTypeEnum pieceType);

    boolean isPieceWhite();
    void setPieceWhite(boolean whiteBool);
}
