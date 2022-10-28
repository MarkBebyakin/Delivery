public class Deliverer extends Seller {
    String order;
    double moneyOrder;
    String money;

    public void delivery() {
        String order = numberItem + street + house + flat;

        if (numberItem == 1) {
            double money = 0;
            double moneyOrder = money + 100000;
        } else if (numberItem == 2) {
            double money = 0;
            double moneyOrder = money + 1000;
        } else if (numberItem == 3) {
            double money = 0;
            double moneyOrder = money + 130000;
        }
    }
}
