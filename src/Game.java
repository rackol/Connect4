import java.util.Scanner;
public class Game{
    public void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a column to play. Column:1-8");
        Board b=new Board();
        int move=sc.nextInt();
        b.dropO(move);
        b.dropX(move);
    }
}