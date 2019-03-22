import java.util.Scanner;
public class Game{
    static public void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a column to play. Column:1-8");
        Board b=new Board();
        int col=sc.nextInt();
        while(b.game==true){
            if(b.game==true){
                b.dropX(col);
                b.PrintBoard();
                System.out.println("Player 1's Turn");
            }
            if (b.game==true){
                b.dropO(col);
                b.PrintBoard();
                System.out.println("Player 2's Turn");
            }
        }

    }

}