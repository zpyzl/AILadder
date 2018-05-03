package dp.leetcode.bfs.SurroundedRegions130;

import common.Array2dUtils;

/**
 * Created by zhaopengyang on 2018/5/3.
 */
public class Test {
    /**
     * [
     * ["X","X","X","X"],
     * ["X","O","O","X"],
     * ["X","X","O","X"],
     * ["X","O","X","X"]]
     */
    public static void  main(String[] args){
        char[][] board = {
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}};
        String s = "[" +
                "[" +
                "\"O\",\"O\",\"O\",\"O\",\"X\",\"X\"" +
                "]" +
                "," +
                "[\"O\",\"O\",\"O\",\"O\",\"O\",\"O\"],[\"O\",\"X\",\"O\",\"X\",\"O\",\"O\"],[\"O\",\"X\",\"O\",\"O\",\"X\",\"O\"],[\"O\",\"X\",\"O\",\"X\",\"O\",\"O\"],[\"O\",\"X\",\"O\",\"O\",\"O\",\"O\"]]";
        s = "[[\"O\",\"O\",\"O\",\"O\",\"X\",\"X\"],[\"O\",\"O\",\"O\",\"O\",\"O\",\"O\"],[\"O\",\"X\",\"O\",\"X\",\"O\",\"O\"],[\"O\",\"X\",\"O\",\"O\",\"X\",\"O\"],[\"O\",\"X\",\"O\",\"X\",\"O\",\"O\"],[\"O\",\"X\",\"O\",\"O\",\"O\",\"O\"]]";
        board = Array2dUtils.convertChars(s);

        Solution solution = new Solution();
        solution.solve(board);
    }
}
