package introduction;

public class Aula05TernaryOperator {

    public static void main(String[] args) {

        int age = 1;
        //(condition) ? true : false
        boolean park_entrance = age >= 10 ? true : false;

        System.out.println(park_entrance);
        System.out.println(age <= 10 ? true : false);
    }
}
