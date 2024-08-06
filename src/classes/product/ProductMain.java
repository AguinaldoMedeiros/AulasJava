package classes.product;

public class ProductMain {

    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product("Notebook", 2850);

        p1.name = "Test";
        p1.price = 2500;

        System.out.println(p1.discountPrice());

        System.out.println(p2.discountPrice());

        System.out.println(p2.price + " " + p2.discountPrice(0.3));

        System.out.println(Product.getDiscount());
    }
}
