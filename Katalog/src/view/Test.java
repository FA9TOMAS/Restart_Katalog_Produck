// todo поменять на наименование ru,...
package view;

public class Test {
    public static void main(String[] args) {
        // это корневой элемент каталога
        Product product = new Product("Корневой каталог", true);
        // todo Добавить несколько категорий
        // Добваить категорию азотные удобрения
        Product product1 = new Product("Азотные удобрения", true);
        // добавить категорию Фосфорные удобрения
        Product product2 = new Product("Фосфорные удобрения", true);

        product.addProduct(product1);
        product.addProduct(product2);


        // добавить категорию Фосфорные удобрения
        product1.addProduct(new Product("Амидные", false));
        product1.addProduct(new Product("Аммонийные", false));
        product1.addProduct(new Product("Нитратные", false));


        // todo добавить несколько продуктов

        // todo вывести содержимое всего каталога
        System.out.println();
    }
}

