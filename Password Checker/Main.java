import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    PasswordChecker checker = new PasswordChecker();

    System.out.print("Введите мин. длину пароля: ");
    int minLength;
    try {
      minLength = Integer.parseInt(sc.nextLine());
      checker.setMinLength(minLength);
    } catch (NumberFormatException e) {
      System.out.println("Вы ввели не числовое значение аргумента minLength.");
      return;
    } catch (IllegalArgumentException e) {
      System.out.println("Вы ввели неверное значение аргумента minLength.");
      return;
    }

    System.out.print("Введите макс. допустимое количество повторений символа подряд: ");
    int maxRepeats;
    try {
      maxRepeats = Integer.parseInt(sc.nextLine());
      checker.setMaxRepeats(maxRepeats);
    } catch (NumberFormatException e) {
      System.out.println("Вы ввели не числовое значение аргумента maxRepeats.");
      return;
    } catch (IllegalArgumentException e) {
      System.out.println("Вы ввели неверное значение аргумента minLength.");
      return;
    }
    while (true) {
      System.out.print("Введите пароль или end: ");
      String password = sc.nextLine();
      if ("end".equals(password)) {
        break;
      }
      System.out.println(checker.verify(password) ? "Подходит!" : "Не подходит!");
    }
    System.out.println("Программа завершена.");
  }
}
