import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listOfProducts = new ArrayList<>();
        int sum = 0;
        while (true) {
            System.out.println("Выберите операцию:");
            int operation = Integer.parseInt(scanner.nextLine());
            if (operation == 1) { //добавить
                System.out.println("Какую покупку вы хотите добавить?");
                listOfProducts.add(scanner.nextLine());
                sum += 1;
                System.out.println("Итого в списке покупок: " + sum);
            } else if (operation == 2) { //показать
                System.out.println("Список покупок:");
                if (listOfProducts.isEmpty()) {
                    System.out.println("Ваш список покупок пуст!");
                    continue;
                }
                for (int i = 0; i < listOfProducts.size(); i++) {
                    System.out.println((i + 1) + ". " + listOfProducts.get(i));
                }
            } else if (operation == 3) { //удалить
                System.out.println("Список покупок:");
                if (listOfProducts.isEmpty()) {
                    System.out.println("Ваш список покупок пуст!");
                    continue;
                }
                for (int i = 0; i < listOfProducts.size(); i++) {
                    System.out.println((i + 1) + ". " + listOfProducts.get(i));
                }
                System.out.println("Какую хотите удалить? Введите номер или название");
                String removedProduct = scanner.nextLine();
                try {
                    int index = Integer.parseInt(removedProduct) - 1;
                    removedProduct = listOfProducts.get(index);
                } catch (NumberFormatException exception) {
                    removedProduct = removedProduct;
                }
                listOfProducts.remove(removedProduct);
                System.out.println("Покупка " + removedProduct + " удалена, список покупок:");
                for (int i = 0; i < listOfProducts.size(); i++) {
                    System.out.println((i + 1) + ". " + listOfProducts.get(i));
                }
            } else if (operation == 4) { //найти
                System.out.println("Введите текст для поиска:");
                String text = (scanner.nextLine()).toLowerCase();
                for (int i = 0; i < listOfProducts.size(); i++) {
                    String product = (listOfProducts.get(i)).toLowerCase();
                    if (product.contains(text)) {
                        System.out.println((i + 1) + ". " + listOfProducts.get(i));
                    }
                }
            }
        }
    }
}