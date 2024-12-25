//todo здесь сама модель взаимодействия с пользователем.То-есть, компьютер выполняет все действия которые запросил пользователь.
package model.exception.Catalog;
import view.Product;

// Всё должно возвращаться
public class FullCatalog {
    public Product getTestProduct() {
        Product product = new Product("Корневой каталог", true);
        Product product1 = new Product("Азотные удобрения", true);
        Product product2 = new Product("Фосфорные удобрения", true);

        product.addProduct(product1);
        product.addProduct(product2);
        //поменять отображение продуктов
        product1.addProduct(new Product("- Амидные;", false));
        product1.addProduct(new Product("- Аммонийные;", false));// пусть будет выглядеть так: ..Азотные удобрения/Аммонийные
        product1.addProduct(new Product("- Нитратные;", false));

        product2.addProduct(new Product("- Фосфорная мука",false));
        product2.addProduct(new Product("- Простой суперфосфат",false));
        return product;
    }
}
//todo добавить проверку что есть такой катало, и что такого продукта в этом каталоге нету.




