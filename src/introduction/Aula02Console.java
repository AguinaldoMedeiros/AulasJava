package introduction;

import java.util.Scanner;

public class Aula02Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n\n");

        System.out.println("Bom");
        System.out.println("Bom!");

        System.out.printf("Values: %d %d%n", 1, 2);
        System.out.printf("Salary: %.2f %n", 2200.3042);

        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        System.out.println(text);

        sc.close();
    }
}
