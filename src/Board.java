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

    public void diagonal(String player,int place){
        boolean a=false;
        int p=place;
        if(){

        }return a;
    }
    public void upDown(String player,int place){
        boolean b=false;
        int p=place;
        if(){

        }return b;
    }
    public void leftgRight(String player,int place){
        boolean c=false;
        int p=place;
        if(){

        }return c;
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
        }if(diagonal("x",bottomrow)==true||upDown("x",bottomrow)==true||leftRight("x",bottomrow)==true){
            System.out.println("Yay player x has won!");
            endGame;
        }

    }
    public void dropX(){

    }

    public void endGame{

    }
}


//choose column
//drop:
//is column full?
//next on top
//connect 4?


