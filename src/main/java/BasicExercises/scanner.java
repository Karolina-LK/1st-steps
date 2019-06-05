package BasicExercises;

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the 1st world");
        String num1 = scanner.next();

        System.out.println(" Enter the 2nd world");
        String num2 = scanner.next();

        System.out.println(" Enter the 1st no");
        int num3 = scanner.nextInt();

        System.out.println(" Enter the 2nd no");
        int num4 = scanner.nextInt();


        System.out.println(num1 + "\n" + num2 );
        System.out.println(num3 + "\n" + num4);
    }
}
