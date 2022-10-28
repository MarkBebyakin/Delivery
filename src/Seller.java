import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Seller extends JFrame {
    int numberItem;
    int itemID;
    String street;
    String house;
    String flat;

    public void showMenu() {
        JFrame frame = new JFrame("Menu frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {
                "№ Товара",
                "Название Товара",
                "Цена Товара"
        };

        String[][] menu = {
                {"1", "Зачёт у Виталия Андреевича", "100 000,00 руб."},
                {"2", "Отдых дома", "1 000,00 руб."},
                {"3", "Отдых в АТТ", "130 000,00 руб."},
        };

        JTable table = new JTable(menu, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);

        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(450, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void menuChoice() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Укажите номер выбранного товара. ");
        int numberItem = scan.nextInt();

        if (numberItem > 3) {
            System.out.println(" Вы указали неверный номер товара, попробуйте ещё раз. ");
            return;
        } else if (numberItem == 2) {
            System.out.println(" Вы выбрали товар под номером " + numberItem + ".");
            System.out.println(" К оплате 1 000,00 рублей");
        } else if (numberItem == 1) {
            System.out.println(" Вы выбрали товар под номером " + numberItem + ".");
            System.out.println(" К оплате 100 000,00 руб.");
        } else if (numberItem == 3) {
            System.out.println(" Вы выбрали товар под номером " + numberItem + ".");
            System.out.println(" К оплате 130 000,00 руб. ");
        }


        System.out.println(" Укажите адрес доставки: ");
        System.out.println(" Улица: ");
        String street = scan.next();
        System.out.println(" Дом: ");
        String house = scan.next();
        System.out.println(" Квартира: ");
        String flat = scan.next();

        System.out.println(" Товар будет доставлен по адресу " + " Улица " + street + ", Дом " + house + ", Квартира " + flat + ".");
    }
    }


