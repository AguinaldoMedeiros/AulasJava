package classes.moduleTest;

public class Person {
    private String name;
    private double weight;

    Person(){}

    Person(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return  name;
    }

    public double getWeight() {
        return weight;
    }

    void eat(Food food){
        this.weight += food.getWeight();
    }
}
