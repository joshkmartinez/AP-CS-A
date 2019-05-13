public class Student_Runner_Gameboard {

    public static void main(String[] args) {
        Gameboard blank = new Gameboard(false);
        System.out.println("Printing blank gameboard:\n" + blank + "\n");

        Gameboard filled = new Gameboard(true);
        System.out.println("Printing game-ready gameboard:\n" + filled + "\n");

        System.out.println("Testing move method for both colors:");
        System.out.println("Testing move left:");
        filled.move(5,2,true);
        filled.move(2,5,true);
        System.out.println(filled.toString());
        System.out.println("Testing move right:");
        filled.move(6,1,false);
        filled.move(1,6,false);
        System.out.println(filled.toString());
        System.out.println("Testing can't move:");
        System.out.println("" + filled.move(5,0,false));
        System.out.println("" + filled.move(2,7,false));

        System.out.println("Testing jump:");
        Gameboard a = new Gameboard(false);
        a.board[7][0] = 'w'; a.board[6][1] = 'r'; a.board[0][7] = 'r'; a.board[1][6] = 'w';
        a.jump(7,0); a.jump(0,7);
        System.out.println(a.toString());

        System.out.println("Testing multiple jumps:");
        Gameboard b = new Gameboard(false);
        b.board[7][0] = 'w'; b.board[6][1] = 'r'; b.board[0][7] = 'r'; b.board[1][6] = 'w';
        b.board[4][1] = 'r'; b.board[3][6] = 'w'; b.board[2][1] = 'r';
        b.jump(7,0); b.jump(0,7);
        System.out.println(b.toString());

        System.out.println("Testing kingMe:");
        Gameboard c = new Gameboard(false);
        c.board[7][2] = 'r'; c.board[0][5] = 'w';
        c.kingMe(7,2); c.kingMe(0,5);
        System.out.println(c.toString());
    }
}
