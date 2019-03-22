import java.util.Scanner;

public class Board {
    int width=8;
    int height=8;
    int[]full={0,0,0,0,0,0,0,0};
    String[][] grid = new String[width][height];
    boolean game=true;

    public Board() {
        for(int w=0;w<width;w++){
            for(int h=0;h<height;h++){
                grid[h][w]=" .";
            }
        }
    }

    void PrintBoard(){
        for(int w=0;width>w;w++){
            for(int h=0;height>h;h++){
                System.out.print(grid[w][h]);
            }
            System.out.println();
        }
        System.out.println();
    }

    boolean leftRight(String player){
        boolean a=false;
        int counter=0;
        for(int h=0;h<8;h++){
            for(int w=0;w<8;w++){
                if(grid[w][h].equals(player)){
                    counter++;
                }if(counter>=4){
                    System.out.println("Player "+player+" wins!");
                    a=true;
                    break;
                }
            }
        }
        return a;
    }
    boolean upDown(String player) {
        boolean a=false;
        int counter=0;
        for (int w=0;w<=width;w++) {
            for (int h=0;h<=height;h++) {
                if (grid[w][h].equals(player)) {
                    counter++;
                }
                if (counter>=4) {
                    System.out.println("Player "+player+" wins!");
                    a=true;
                    break;
                }
            }
        }
        return a;
    }


    void dropO(int col) {
        int bottomrow = 0;
        int counter = 1;
        if (col > width) {
            System.out.println("That is not a valid column");
        }
        if (full[col+1] != 0) {
            System.out.println("That column is full, please choose another one");
            //int col=sc.nextInt();
        } else {
            for (int i = 0; i < height; i++) {
                if (grid[bottomrow][col] == " .") {
                    grid[bottomrow][col] = " o";
                    break;
                } else if (grid[bottomrow][col] == " o" || grid[bottomrow][col] == " x") {
                    bottomrow++;
                    if (i == 8) {
                        full[col + 1] = col;
                    }
                }
            }
            if (upDown("o") == true || leftRight("o") == true) {
                System.out.println("Yay player o has won!");
                boolean game = false;
            }
        }
    }
    void dropX(int col) {
        int bottomrow = 0;
        int counter = 1;
        if (col > width) {
            System.out.println("That is not a valid column");
            //int col=sc.nextInt();
        } else {
            if (full[col + 1] != 0) {
                System.out.println("That column is full, please choose another one");
                //int col=sc.nextInt();
            }
            for (int i = 0; i < height; i++) {
                if (grid[bottomrow][col] == " .") {
                    grid[bottomrow][col] = " x";
                    break;
                } else if (grid[bottomrow][col] == " o" || grid[bottomrow][col] == " x") {
                    bottomrow++;
                    if (i == 8) {
                        full[col + 1] = col;
                    }
                }
            }
            if (upDown("x") == true || leftRight("x") == true) {
                System.out.println("Yay player x has won!");
                game = false;
            }

        }
    }
}
//choose column
//drop:
//is column full?
//next on top
//connect 4?
//next turn

//to do:
//try input value again
//reset
//check to win functions
//finish sequece
//cats game