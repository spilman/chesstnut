package model;

/**
 * 8x8 chess board interface.
 */
public interface Board {
    void getBoardState();
    boolean isGameOn();
    boolean resetBoard();
}
