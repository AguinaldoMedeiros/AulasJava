package introduction;

public class Aula08Arrays {

    public static void main(String[] args) {

//        byte, short, int, long, float, e double 0
//        char ' '
//        boolean false
//        String null
//        int[] age = null;
        int[] num = {1, 2, 3, 4, 5};
        int[] num2 = new int[]{1, 2, 3, 4, 5};
        int[] age = new int[5];
        age[0] = 12;
        age[1] = 23;
        age[2] = 32;

        for (int i = 0; i <age.length; i++){
            System.out.println(age[i]);
        }
        for (int i: num){
            System.out.println(i);
        }
        for (int i: num2){
            System.out.println(i);
        }

        int[][] num3 = new int[2][2];
        int[][] num4 = {{1, 2, 3},{4, 5, 6}};

        for (int i = 0; i < num3.length; i++){
            for (int j = 0; j < num3[i].length; j++){
                System.out.println(num3[i][j]);
            }
        }
        
        for (int[] i: num4){
            for (int j: i){
                System.out.println(j);
            }
        }
    }
}
