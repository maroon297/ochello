package com.maruta.othello.stone;

/**
 * 石
 */
public interface Stone {
    // 石の色
    StoneColor stoneColor = StoneColor.BLACK;
    //動いたかどうか
    Boolean isMove = false;

    /**
     * 石を反転させる
     */
    void turnColor();
}
