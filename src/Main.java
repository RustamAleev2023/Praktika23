import task1.NumbersList;
import task1.StartUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task1();
    }

    //Task1
    //Пользователь вводит с клавиатуры набор чисел. Полученные числа необходимо сохранить в список. После
    //чего нужно показать меню, в котором предложить пользователю набор пунктов:
    //1. Добавить элемент в список.
    //2. Удалить элемент из списка.
    //3. Показать содержимое списка.
    //4. Проверить есть ли значение в списке.
    //5. Заменить значение в списке.
    //В зависимости от выбора пользователя выполняется
    //действие, после чего меню отображается снова.
    public static void task1(){
        Scanner scanner = new Scanner(System.in);
        NumbersList numbers = new NumbersList();
        new StartUI().init(scanner, numbers);
    }
}