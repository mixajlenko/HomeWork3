import org.shop.demo.client.Customer;
import org.shop.demo.client.Order;
import org.shop.demo.shop.Product;
import org.shop.demo.shop.Seller;


public class ShopApp {

    public static void main(String[] args) {

        Product [] [] Banana = new Product[1] [1];

        Seller bananas = new Seller("BananaShop", Banana);
        Customer customer1 = new Customer("Oleg", "Kirova 125", "38099222222","oleg@meta.ru");
        Customer customer2 = new Customer("Vasya", "Lazaryana 2a", "38066444444", "vasya2323@gmail.com");
        Order order1 = new Order(1, "21.12.14",12, 1,"accepted", true, "customer1");
    }
}
