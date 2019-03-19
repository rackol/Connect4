import java.util.Scanner;

public class Board {
    int width=8;
    int height=8;
    int bottomrow=-1;
    String[][] grid = new String[width][height];
    boolean game=true;

    public Board() {
        for(int w=0;w<width;w++){
            for(int h=0;h<height;h++){
                grid[h][w]=" .";
            }
        }
    }


    void play(int col){
        while(game==true){
            PrintBoard();
            dropX(col);
            PrintBoard();
            dropO(col);
            PrintBoard();
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

    boolean diagonal(String player){
        boolean a=false;
        int counter=0;
        for(int n=0;n<=8;n++){
            if(grid[n][n]==player){
                counter++;
            }if(counter>=4){
                System.out.println("Player "+player+" wins!");
                break;
            }
        }for(int n=0;n<=8;n++){
            if(grid[n][8-n]==player){
                counter++;
            }if(counter>=4){
                System.out.println("Player "+player+" wins!");
                a=true;
                break;
            }
        }
       return a;
    }
    boolean leftRight(String player){
        boolean a=false;
        int counter=0;
        for(int h=0;h<=height;h++){
            for(int w=0;w<=width;w++){
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


    void dropO(int col){
        int counter=1;
        System.out.println("Player 1's Turn");
        if(col>width){
            System.out.println("That is not a valid column");
        }if(grid[bottomrow][col]==" ."){
            grid[bottomrow][col]=" o";
        }if(grid[bottomrow][col]==" o"||grid[bottomrow][col]==" x"){
            grid[bottomrow+1][col]=" o";
        }
        counter++;
        if(counter==height){
            System.out.println("That column is full");
        }if(diagonal("o")==true||upDown("o")==true||leftRight("o")==true){
            System.out.println("Yay player o has won!");
            boolean game=false;
        }

    }
    void dropX(int col){
        int counter=1;
        System.out.println("Player 2's Turn");
        if(col>width){
            System.out.println("That is not a valid column");
        }if(grid[bottomrow][col]==" ."){
            grid[bottomrow][col]=" x";
        }if(grid[bottomrow][col]==" o"||grid[bottomrow][col]==" x"){
            grid[bottomrow+1][col]=" x";
        }
        counter++;
        if(counter==height){
            System.out.println("That column is full");
        }if(diagonal("x")==true||upDown("x")==true||leftRight("x")==true){
            System.out.println("Yay player x has won!");
            game=false;
        }
    }

    void endGame(){
        //reset the grid
        //grid=clear
        //players=not won
        //no outcome
        //no messages
        //refresh?
    }
}

//choose column
//drop:
//is column full?
//next on top
//connect 4?
//next turn