public class PasswordChecker {
  private int minLength = -1;
  private int maxRepeats = 0;

  public void setMinLength(int minLength) {
    if (minLength < 0) {
      throw new IllegalArgumentException("Минимально допустимая длина пароля должна быть целым числом.");
    }
    this.minLength = minLength;
  }

  public void setMaxRepeats(int maxRepeats) {
    if (maxRepeats <= 0) {
      throw new IllegalArgumentException(
          "Максимально допустимое количество повторений символа подряд быть целым числом.");
    }
    this.maxRepeats = maxRepeats;
  }

  public boolean verify(String password) {
    if (minLength == -1 || maxRepeats == 0) {
      throw new IllegalStateException("Не настроен чекер.");
    }
    if (password.length() < minLength) {
      return false;
    }
    int counterRepeats = 0;
    char previousSymbol = ' ';
    for (char symbol : password.toCharArray()) {
      if (symbol == previousSymbol) {
        counterRepeats++;
      } else {
        counterRepeats = 0;
      }
      if (counterRepeats == maxRepeats) {
        return false;
      }
      previousSymbol = symbol;
    }

    return true;
  }
}
