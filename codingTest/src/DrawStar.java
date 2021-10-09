//문제 직사각형 별찍기
//※ Use Standrad input and output to solve this challenge
//Print a n by m grid of asterisks.
import java.util.Scanner;

public class DrawStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
