package view;
import model.exception.Catalog.FullCatalog;

import java.util.Scanner;
import java.util.Stack;

public class ConsoleView {
    private  static Stack<Product> productStack = new Stack<>();
    public static void main(String[] args) {
        while (true){
            FullCatalog catalog = new FullCatalog();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Меню:");
            System.out.println("1. Открыть каталог");
            System.out.println("2. Добавить продукт в каталог");
            System.out.println("3. Удалить продукт из каталога");
            System.out.println("4. Выход");
            System.out.println("5. Перейти в каталог");
            System.out.println("6. Вернуться на уровень выше");


            System.out.print("Выберите пункт меню (1-6): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера
            Product carenProduct = catalog.getTestProduct();


            switch (choice) {
                case 1:
                    carenProduct = catalog.getTestProduct();
                    System.out.println(carenProduct);
                    break;
                case 2:

                case 3:

                case 4:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                case 5:
                    System.out.println("Введите удобрения:");
                    String path = scanner.nextLine();
                    Product product = carenProduct.getProductByPath(path);
                if (product != null) {
                        productStack.push(carenProduct);
                        carenProduct = product;
                        System.out.println(carenProduct);
                    }
                    else {
                        System.out.println("Продукт не найден");
                    }
                    break;
                case 6:
                    //Выполнение через стеки
                    if (!productStack.isEmpty()) {
                        carenProduct = productStack.pop(); // Извлекаем из стека
                        System.out.println("Вернулись к: " + carenProduct.getName());
                        System.out.println(carenProduct);
                    } else {
                        System.out.println("Уже находитесь в корневом каталоге.");
                    }
                    break;
                default:
                    System.out.println("Некорректный ввод. Пожалуйста, выберите пункт от 1 до 4.");
            }
        }
    }
}