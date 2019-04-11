import java.util.Scanner;
public class Game{
    static public void main(String[]args){
        Board b=new Board();
        Scanner sc = new Scanner(System.in);
        System.out.println("To play choose a column to play. Column:0-7");
        System.out.println("Player x's Turn");
        b.PrintBoard();
        while(b.game==true){
           if(b.game==true){
                int colX=sc.nextInt();
                b.dropX(colX);
                b.PrintBoard();
               if (b.catsGame()==true && b.game==true){
                   System.out.println("Cats Game!");
               }if (b.game==true&&b.catsGame()!=true){
                   System.out.println("Player o's Turn");
               }if (b.game==false&&b.catsGame()==false){
                   System.out.println("Yay player x has won!");
               }


            }
            if (b.game==true){
                int colO=sc.nextInt();
                b.dropO(colO);
                b.PrintBoard();
                if (b.catsGame()==true && b.game==true){
                    System.out.println("Cats Game!");
                }if (b.game==true&&b.catsGame()!=true){
                    System.out.println("Player x's Turn");
                }if (b.game==false&&b.catsGame()==false){
                    System.out.println("Yay player o has won!");
                }

            }
        }
    }
}