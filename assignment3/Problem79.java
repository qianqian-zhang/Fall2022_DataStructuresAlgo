package assignment3;

public class Problem79 {
    //79. Word Search
    String word;
    boolean isFound;
    char[][] board;
    public boolean exist(char[][] board, String word) {
        this.word = word;
        this.board = board;
        isFound = false;
        int n = board.length;
        int m = board[0].length;

        for(int i = 0; i< n; i++) {
            for(int j = 0; j < m; j++) {
                if(board[i][j] == word.charAt(0)){
                    exist(i, j, 0, new boolean[n][m]);
                }
            }
        }
        return isFound;
    }

    private void exist(int row, int col, int index, boolean[][] visited) {
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || visited[row][col] == true || board[row][col] != word.charAt(index)) return;

        if(index == word.length() - 1) {
            isFound = true;
            return;
        }

        visited[row][col] = true;
        index++;

        exist(row + 1, col, index, visited);
        exist(row, col + 1, index, visited);
        exist(row - 1, col, index, visited);
        exist(row, col - 1, index, visited);

        visited[row][col] = false;
        index--;
    }
}
