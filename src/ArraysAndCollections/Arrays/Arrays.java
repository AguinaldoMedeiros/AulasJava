package ArraysAndCollections.Arrays;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double result = 0;

        System.out.print("Digit the number of notes: ");
        int qtd_notes = sc.nextInt();

        Double[] notes = new Double[qtd_notes];
        for (int i = 0; i < qtd_notes; i++){
            System.out.printf("Digit the %d note: (0 at 100) ", i+1);
            notes[i] = sc.nextDouble();
        }

        for(double note: notes){
            result += note;
        }

        result /= qtd_notes;

        System.out.println(result);
        System.out.println("end");

        sc.close();
    }
}
