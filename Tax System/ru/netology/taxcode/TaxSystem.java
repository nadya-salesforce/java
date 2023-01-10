package ru.netology.taxcode;

public class TaxSystem {
  public static final int taxErnVal = 6;
  public static final int taxErnSpendVal = 15;
  
  public static int taxEarnings(int earnings) {
    int tax = earnings * taxErnVal / 100;
        return tax;
  }
     
  public static int taxEarningsMinusSpendings(int earnings, int spendings) {
    int tax = (earnings - spendings) * taxErnSpendVal / 100;
    if (tax >= 0) {
      return tax;
    } else {
      // если расходы оказались больше, то налог посчитается отрицательным и не может быть отрицательным
      return 0;
    }
  }

  public static void resultTaxSystem (int earnings, int spendings) {
    System.out.println(earnings + " "+  spendings);
    int taxEMinusSVal = TaxSystem.taxEarningsMinusSpendings(earnings, spendings);
          int taxEVal = TaxSystem.taxEarnings(earnings);
          int economy = Math.abs(taxEVal - taxEMinusSVal);
    String taxSys;
    int tax, taxOther;
    
    if (taxEMinusSVal < taxEVal) {
            taxSys = "Советуем вам УСН доходы минус расходы.";
      tax = taxEMinusSVal;
      taxOther = taxEVal;
    }
    else if (taxEMinusSVal == taxEVal) {
      taxSys = "Можете выбрать любую систему налогообложения.";
      tax = taxEMinusSVal;
      taxOther = taxEVal;
    } else {
      taxSys = "Советуем вам УСН доходы.";
      tax = taxEVal;
      taxOther = taxEMinusSVal;
      }
      
      System.out.println(taxSys);
      System.out.println("Ваш налог составит: " + tax + " рублей.");
      System.out.println("Налог на другой системе: " + taxOther + " рублей.");

System.out.println("Экономия: " + economy + " рублей.");
          } 
}