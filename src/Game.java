import java.util.Scanner;
public class Game{
    static public void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a column to play. Column:1-8");
        Board b=new Board();
        int col=sc.nextInt();
        b.PrintBoard();
        while(b.game=false){
            b.dropX(col);
            b.PrintBoard();
            b.dropO(col);
            b.PrintBoard();
        }
    }
}