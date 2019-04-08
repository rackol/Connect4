import java.util.Scanner;
public class Game{
    static public void main(String[]args){
        Board b=new Board();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a column to play. Column:1-8");
        while(b.game==true){
           if(b.game==true){
                int colX=sc.nextInt();
                b.dropX(colX);
                b.PrintBoard();
                System.out.println("Player 2's Turn");
            }
            if (b.game==true){
                int colO=sc.nextInt();
                b.dropO(colO);
                b.PrintBoard();
                System.out.println("Player 1's Turn");
            }
        }
    }
}