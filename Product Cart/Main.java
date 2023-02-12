import java.util.Arrays;
import java.util.Scanner;

class Main {

  static String[] products = { "Хлеб", "Яблоки", "Молоко" };
   static int[] prices = { 100, 200, 300 };
   static int[] counts = new int[products.length];
 static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
       
    while (true) {
      showGoods();
      
      System.out.println("Выберите товар и количество или введите `end`");
      String answer = sc.nextLine();
      if ("end".equals(answer)) {
        break;
      }
      String[] answers = answer.split(" ");
      int productIndex = Integer.parseInt(answers[0]) - 1;
      int count = Integer.parseInt(answers[1]);
      //проверка на ввод отрицательного количества продукта больше, чем уже есть в корзине (было 3, ввели -5)
      if (-count > counts[productIndex]) {
        counts[productIndex] = 0;
      } else {
        counts[productIndex] += count;
      }

      
    }
    printTotal();
  }

private static void  printTotal() {
    int sumProd = 0;
    System.out.println("Ваша корзина:");
    for (int i = 0; i < products.length; i++) {
      if (counts[i] != 0) {
        System.out.printf(" %s %d шт. %d руб./шт. %d руб. в сумме%n",
            products[i], counts[i], prices[i], counts[i] * prices[i]);
        sumProd += counts[i] * prices[i];
      }
    }
    System.out.printf("Итого %d руб.%n", sumProd);
  }
  
  private static void showGoods() {
    System.out.println("Список возможных товаров для покупки:");

      for (int i = 0; i < products.length; i++) {
        System.out.printf("%d. %s %d руб./шт.%n", i + 1, products[i], prices[i]);
      }
  }
}
