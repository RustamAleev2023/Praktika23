package task1;

import java.util.Scanner;
import java.util.StringJoiner;

public class StartUI {
    public void init(Scanner scanner, NumbersList numbers) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.println("Выбрать: ");
            String select = scanner.nextLine();
            if ("add".equals(select)) {
                System.out.println("Добавление нового элемента");
                System.out.println("Введите элемент");
                int element = scanner.nextInt();
                numbers.add(element);
                System.out.println("Добавлен элемент: " + element);
            } else if ("remove".equals(select)) {
                System.out.println("Удаление элемента");
                System.out.println("Введите элемент");
                int element = scanner.nextInt();
                numbers.delete(element);
            } else if ("show".equals(select)) {
                System.out.println("Вывод списка");
                numbers.print();
            } else if ("check".equals(select)) {
                System.out.println("Проверка, есть ли элемент");
                System.out.println("Введите элемент");
                int element = scanner.nextInt();
                numbers.isContains(element);
            } else if ("update".equals(select)) {
                System.out.println("Заменить элемент в списке.");
                System.out.println("Введите старый элемент");
                int oldElement = scanner.nextInt();
                System.out.println("Введите новый элемент");
                int newElement = scanner.nextInt();
                numbers.update(oldElement, newElement);
            } else if ("exit".equals(select)) {
                run = false;
            }
        }
    }

    private void showMenu() {
//        String[] menu = {
//                "Добавить элемент в список.", "Удалить элемент из списка.",
//                "Показать содержимое списка.", "Проверить есть ли значение в списке.",
//                "Заменить значение в списке.", "Завершить программу."
//        };
        String[] menu = {
                "add", "remove",
                "show", "check",
                "update", "exit"
        };
        StringJoiner joiner = new StringJoiner(", ", "Меню: [", "]");
        for (int i = 0; i < menu.length; i++) {
            joiner.add(menu[i]);
        }
        System.out.println(joiner.toString());
    }
}
