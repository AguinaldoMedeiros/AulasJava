package introduction;

public class Aula07WhileFor {

    public static void main(String[] args) {

        int age = 1;
        while (age <=10){
            System.out.println(age);
            age ++;
        }

        do {
            System.out.println(++age);
        } while (age >100);

        for(int i=0;i<10;i++){
            System.out.println(i);
        }

        // brak;
        // continue;
    }
}