import com.sun.org.apache.xpath.internal.operations.String;
import java.util.Scanner;

public class Board {
    int width=8;
    int height=8;
    int bottomrow=-1;
    char[][] grid=new char[width][height];
    public Board(){
      for(int i=0;i<height;i++){
          for(int a=0;a<width;a++){
              grid[i][a]=' ';
          }
      }
    }

    public void diagonal(String player){
        boolean a=false;
        int counter=0;
        for(int n=0;n<=8;n++){
            if(Board[n][n]=player){
                counter++;
            }if(counter>=4){
                System.out.println("Player "+player+" wins!");
                break;
            }
        }for(int n=0;n<=8;n++){
            if(Board[n][8-n]=player){
                counter++;
            }if(counter>=4){
                System.out.println("Player "+player+" wins!");
                a=true;
                break;
            }
        }
    }
    public void leftRight(String player){
        boolean a=false;
        int counter=0;
        for(int h=0;h<=height;h++){
            for(int w=0;w<=width;w++){
                if(Board[w][h]=player){
                    counter++;
                }if(counter>=4){
                    System.out.println("Player "+player+" wins!");
                    a=true;
                    break;
                }
            }
        }
    }
    public void upDown(String player) {
        boolean a=false;
        int counter=0;
        for (int w=0;w<=width;w++) {
            for (int h=0;h<=height;h++) {
                if (Board[w][h]=player) {
                    counter++;
                }
                if (counter>=4) {
                    System.out.println("Player "+player+" wins!");
                    a=true;
                    break;
                }
            }
        }
    }

    Scanner sc = new Scanner(System.in);
    public void dropO(){
        int counter=1;
        System.out.println("Player 1's Turn");
        int col=sc.nextInt();
        if(col>width){
            System.out.println("That is not a valid column");
        }if(Board[bottomrow][col]==" "){
            Board[bottomrow][col]=="o";
        }if(Board[bottomrow][col]=="o"||Board[bottomrow][col]=="x"){
            Board[bottomrow+1][col]=="o";
        }
        counter++;
        if(counter==height){
            System.out.println("That column is full");
            break;
        }if(diagonal("o")==true||upDown("o")==true||leftRight("o")==true){
            System.out.println("Yay player o has won!");
            endGame();
        }

    }
    public void dropX(){
        int counter=1;
        System.out.println("Player 2's Turn");
        int col=sc.nextInt();
        if(col>width){
            System.out.println("That is not a valid column");
        }if(Board[bottomrow][col]==" "){
            Board[bottomrow][col]=="x";
        }if(Board[bottomrow][col]=="o"||Board[bottomrow][col]=="x"){
            Board[bottomrow+1][col]=="x";
        }
        counter++;
        if(counter==height){
            System.out.println("That column is full");
            break;
        }if(diagonal("x",bottomrow)==true||upDown("x",bottomrow)==true||leftRight("x",bottomrow)==true){
            System.out.println("Yay player x has won!");
            endGame();
        }
    }

    public void endGame(){
        //reset the board
    }
}


//choose column
//drop:
//is column full?
//next on top
//connect 4?


