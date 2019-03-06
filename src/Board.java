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
    Scanner sc = new Scanner(System.in);
    public void dropO(){
        int counter=1;
        System.out.println("Player 1's Turn");
        int col=sc.nextInt();
        if(col>width){
            System.out.println("That is not a valid column");
        }if(Board[bottomrow][col]==" "){
            Board[bottomrow][col]=="x";
        }if(Board[bottomrow][col]=="o"||Board[bottomrow][col]=="o"){
            Board[bottomrow+1][col]=="x";
        }

    }
    public void dropX(){

    }
}


//choose column
//drop:
//is column full?
//next on top
//connect 4?


