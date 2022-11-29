package com.eakonovalov.leetcode._79_WordSearch;

import java.util.ArrayList;
import java.util.List;

public class MySolution implements Solution {

    public boolean exist(char[][] board, String word) {
        List<Point> path = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    path.add(new Point(i, j));
                    if (findNext(board, word, 1, i, j, path)) {
                        return true;
                    } else {
                        path.clear();
                    }
                }
            }
        }
        return false;
    }

    private boolean findNext(char[][] board, String word, int index, int i, int j, List<Point> path) {
        if (index >= word.length()) {
            return true;
        }
        Point p;
        if (i - 1 >= 0 && !path.contains(p = new Point(i - 1, j)) && board[i - 1][j] == word.charAt(index)) {
            path.add(p);
            if (findNext(board, word, index + 1, i - 1, j, path)) {
                return true;
            } else {
                path.remove(path.size() - 1);
            }
        }
        if (j - 1 >= 0 && !path.contains(p = new Point(i, j - 1)) && board[i][j - 1] == word.charAt(index)) {
            path.add(p);
            if (findNext(board, word, index + 1, i, j - 1, path)) {
                return true;
            } else {
                path.remove(path.size() - 1);
            }
        }
        if (i + 1 < board.length && !path.contains(p = new Point(i + 1, j)) && board[i + 1][j] == word.charAt(index)) {
            path.add(p);
            if (findNext(board, word, index + 1, i + 1, j, path)) {
                return true;
            } else {
                path.remove(path.size() - 1);
            }
        }
        if (j + 1 < board[0].length && !path.contains(p = new Point(i, j + 1)) && board[i][j + 1] == word.charAt(index)) {
            path.add(p);
            if (findNext(board, word, index + 1, i, j + 1, path)) {
                return true;
            } else {
                path.remove(path.size() - 1);
            }
        }

        return false;
    }

    private static final class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return x >> 8 + y;
        }
    }
}
