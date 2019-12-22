package BasicExercises;

import java.util.Scanner;

public class Ex11 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter the radius pls: ");

        double radius = in.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
