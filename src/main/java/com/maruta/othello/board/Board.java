package com.maruta.othello.board;

import com.maruta.othello.stone.Stone;
import com.maruta.othello.stone.StoneColor;

import java.util.*;

/**
 * 盤面
 */
 public interface Board {
    List<List<Stone>> board = new ArrayList<>();
    StoneColor playerColor = StoneColor.BLACK;

    /**
     * ゲームスタート
     * @param xSize 横のマス数
     * @param ySize 縦のマス数
     */
     void start(int xSize, int ySize);

    /**
     * 自分がパスかどうか
     * @return true: パス false: パスしない
     */
     Boolean isPass();

    /**
     * パスする
     */
     void pass();

    /**
     * 石を置く
     * @param x 横方向の座標
     * @param y 縦方向の座標
     * @param stoneColor 置く石の色
     */
     void putStone(int x, int y, StoneColor stoneColor);

    /**
     * 勝者判定
     * @return StoneColorが設定されている場合はその色が勝者
     */
     Optional<StoneColor> getWinner();

    /**
     * 盤面出力
     * @return 盤面の文字列
     */
     String outputBoardCondition();

}
