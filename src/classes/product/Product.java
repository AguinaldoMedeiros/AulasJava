package classes.product;

public class Product {

    String name;
    double price;
    private static double discount =  0.15;

    Product(){
        this("test", 0);
        // o this método, retorna o método que validar as entradas referidas, nesse caso a entrada compatível é
        // a do construct Product, então ele será acionado pelo método this()
    }

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public static double getDiscount() {
        return discount;
    }

    double discountPrice(){
        return price - (price * discount);
    }

    double discountPrice(double personalDiscount){
        return price - (price * personalDiscount);
    }
}
