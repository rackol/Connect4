import java.util.Scanner;
public class Game{
    static public void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1, choose a column to play. Column:1-8");
        Board b=new Board();
        int move=sc.nextInt();
        b.play(move);
    }
}