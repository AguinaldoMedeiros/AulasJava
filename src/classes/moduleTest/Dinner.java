package classes.moduleTest;

public class Dinner {

    public static void main(String[] args) {

        Food banana = new Food("Banana",  0.500);

        Person p1 = new Person("Medeiros", 105);

        System.out.println(p1.getWeight());

        p1.eat(banana);

        System.out.println(p1.getWeight());


    }
}
