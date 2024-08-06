package classes.moduleTest;

public class Food {
    private String name;
    private double weight;

    Food(){}

    Food(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
