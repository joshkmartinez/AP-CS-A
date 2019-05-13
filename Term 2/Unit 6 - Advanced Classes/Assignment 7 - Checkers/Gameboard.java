public class Gameboard {
    public char[][] board;

    public Gameboard(boolean setup) {
        board = new char[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '-';
            }
        }
        if (setup) {
            // 1 red
            for (int i = 1; i < board.length; i += 2) {
                board[0][i] = 'r';
            }
            // 2 red
            for (int i = 0; i < board.length; i += 2) {
                board[1][i] = 'r';
            }
            // 3 red
            for (int i = 1; i < board.length; i += 2) {
                board[2][i] = 'r';
            }

            // 1 w
            for (int i = 0; i < board.length; i += 2) {
                board[board[0].length - 3][i] = 'w';
            }
            // 2 w
            for (int i = 1; i < board.length; i += 2) {
                board[board[0].length - 2][i] = 'w';
            }
            // 3 w
            for (int i = 0; i < board.length; i += 2) {
                board[board[0].length - 1][i] = 'w';
            }
        }
    }

    public boolean move(int x, int y, boolean left) {
        if (board[x][y] == '-') {
            return false;
        }
        if (!(x > -1 && x < 8 && y > -1 && y < 8)) {
            return false;
        }
        // check which piece side

        if (x > 0 && y > 0 && x < 7 && y < 7) {
            // move
            if (left) {
                if (board[x - 1][y - 1] == '-' && board[x][y] == 'w') {
                    board[x][y] = '-';
                    board[x - 1][y - 1] = 'w';
                    return true;
                }
                if (board[x + 1][x + 1] == '-' && board[x][y] == 'r') {
                    board[x][y] = '-';
                    board[x + 1][y + 1] = 'r';
                    return true;
                }
            } else {
                if (board[x - 1][y + 1] == '-' && board[x][y] == 'w') {
                    board[x][y] = '-';
                    board[x - 1][y + 1] = 'w';
                    return true;
                }
                if (board[x + 1][y - 1] == '-' && board[x][y] == 'r') {
                    board[x][y] = '-';
                    board[x + 1][y - 1] = 'r';
                    return true;
                }
            }
            // capture
            if (left) {
                // w l
                if (board[x][y] == 'w') {
                    if (board[x - 2][y + 2] == '-' && board[x - 1][y + 1] == 'r') {
                        jump(x, y);
                    }

                    return true;
                } else if (board[x + 1][x - 1] == 'w' && board[x][y] == 'r' && board[x + 2][y - 2] == '-') {
                    jump(x, y);
                    return true;
                }
            } else {
                if (board[x + 2][y + 2] == '-' && board[x][y] == 'w' && board[x + 1][y + 1] == 'r') {
                    jump(x, y);
                    return true;
                } else if (board[x - 1][y - 1] == 'w' && board[x][y] == 'r' && board[x - 1][y - 2] == '-') {
                    jump(x, y);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean jump(int x, int y) {
        if (board[x][y] == '-') {
            return false;
        }

        if (!(x > -1 && x < 8 && y > -1 && y < 8)) {
            return false;
        }

        boolean a = false;
        boolean br = false;
        if (board[x][y] == 'w') {
            // w
            // ri
            if (board[x - 1][y + 1] == 'r' && board[x - 2][y + 2] == '-') {
                if (x > 1 && y < 6) // top
                {
                    board[x][y] = '-';
                    board[x - 2][y + 2] = 'w';
                    board[x - 1][y + 1] = '-';

                    a = true;
                    br = true;
                    jump(x - 2, y + 2); // l 2

                }
            }
            // l
            if (!br && board[x + 2][y + 2] == '-' && board[x + 1][y + 1] == 'r') {
                if (x > 1 && y > 1)// bottom
                {

                    board[x + 1][y + 1] = '-';
                    board[x + 2][y + 2] = 'w';
                    board[x][y] = '-';
                    a = true;
                    jump(x + 2, y + 2);// r 2
                }
            }
        }
        // r reverse
        else {
            // l
            if (board[x + 1][y - 1] == 'w' && board[x + 2][y - 2] == '-') {
                if (x > 1 && y < 6) // top
                {
                    board[x][y] = '-';
                    board[x + 2][y - 2] = 'r';
                    board[x + 1][y - 1] = '-';

                    a = true;
                    br = true;
                    jump(x + 2, y - 2); // l 2

                }
            }
            // r
            if (!br && board[x - 2][y - 2] == '-' && board[x - 1][y - 1] == 'w') {
                if (x > 1 && y > 1)// bottom
                {

                    board[x - 1][y - 1] = '-';
                    board[x - 2][y - 2] = 'r';
                    board[x][y] = '-';
                    a = true;
                    jump(x - 2, y - 2);// r 2
                }
            }
        }

        return a;

    }

    public boolean kingMe(int x, int y) {
        if (board[x][y] == 'w' && x == 0) {
            board[x][y] = 'W';
            return true;
        }
        if (board[x][y] == 'r' && x == 7) {
            board[x][y] = 'R';
            return true;
        }
        return false;
    }

    public void p() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public String toString() {
        String a = "";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                a += board[i][j] + " ";
            }
            a += "\n";
        }
        return a;
    }

}