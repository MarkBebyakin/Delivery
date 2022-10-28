public class Main {
    public static void main(String[] args) {
        Seller seller = new Seller();
        Deliverer deliverer = new Deliverer();
        Customer customer = new Customer();

        seller.showMenu();
        seller.menuChoice();
        System.out.println(" Ваш заказ будет доставлен в скором времени. ");

        deliverer.delivery();

        customer.getOrder();
    }
}