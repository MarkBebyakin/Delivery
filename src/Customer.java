import java.util.Scanner;

public class Customer extends Deliverer{
    public void getOrder() {
        System.out.println(" Поставьте оценку нашему сервису. (1-10) ");
        String customerOrder = order + moneyOrder;
        Scanner scanner = new Scanner(System.in);
        int feedback = scanner.nextInt();

        if (feedback > 10) {
            System.out.println(" Спасибо за щедрую оценку ;)");
        } else if (feedback >= 5) {
            System.out.println(" Мы рады что вам все понравилось :)");
        } else if (feedback < 5) {
            System.out.println(" Мы будем стараться ради вас!");
            System.out.println(" Ждем вас снова!");
        }
    }
}
