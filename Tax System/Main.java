import java.util.Scanner;
import ru.netology.taxcode.Menu;
import ru.netology.taxcode.TaxSystem;

class Main {
  public static void main(String[] args) {

    int earnings = 0; // доходы
    int spendings = 0; // расходы

    // вывод меню
    Menu.printMenu();
    
       Scanner scanner = new Scanner(System.in);

    while (true) {

      String inputOper = scanner.nextLine();
      if ("end".equals(inputOper)) {
        break;
      }

      int operation = Integer.parseInt(inputOper);
      switch (operation) {
        case 1:
          System.out.println("Введите сумму дохода:");
          String moneyStr = scanner.nextLine(); // Не используйте тут nextInt (!)
          int money = Integer.parseInt(moneyStr);
          earnings += money;
          // System.out.println(earnings);
          break;
        case 2:
          // действия при выборе второй операции
          System.out.println("Введите сумму расхода:");
          moneyStr = scanner.nextLine(); // Не используйте тут nextInt (!)
          money = Integer.parseInt(moneyStr);
          spendings += money;
          // System.out.println(spendings);
          break;
        case 3:
          // действия при выборе третьей операции
TaxSystem.resultTaxSystem(earnings, spendings);
          break;
        default:
          System.out.println("Такой операции нет");
      }

      Menu.printMenu();

    }
    System.out.println("Программа завершена!");
  }
}