package dlangina.epam;

import java.util.Scanner;

public class MainTask1 {
    //Задание: Приветствовать любого пользователя при вводе его имени через командную строку.
    public static void sayHello() {
        System.out.println("Введите имя и нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Привет " + name);
    }

    public static void main(String[] args) {
        sayHello();
    }
}
