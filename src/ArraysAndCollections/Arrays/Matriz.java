package ArraysAndCollections.Arrays;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double media_notes = 0;

        System.out.print("Digit the number of studants: ");
        int num_studants = sc.nextInt();

        System.out.print("Digit the number of notes: ");
        int num_notes = sc.nextInt();

        Double[][] notes_studants = new Double[num_studants][num_notes];

//        for (Double[] studant: notes_studants){
//            for (Double note: studant){
//                System.out.printf("Digit the note % of studante %d", note, studant);
//                notes_studants[studant][note] = sc.nextDouble();
//            }
//        }

        for (int i = 0; i < num_studants; i++){
            System.out.printf("###STUDANT %d##\n", i+1);
            for (int j = 0; j < num_notes; j++){
                System.out.printf("Digit the note %d of studante %d: ", j+1, i+1);
                notes_studants[i][j] = sc.nextDouble();

            }
        }

        for (Double[] studant: notes_studants){
            for (Double note: studant){
                media_notes += note;
            }
        }

        media_notes /= num_notes * num_studants;

        System.out.printf("%.2f",media_notes);

    }
}
