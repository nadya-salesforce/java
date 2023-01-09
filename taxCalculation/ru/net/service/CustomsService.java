package ru.net.service;

public class CustomsService {
  public static final double TAX_FIX = 0.01;

  public static long calculateCustoms(int priceValue, int nettoValue) {
    long dutyValue = Math.round(priceValue * TAX_FIX + nettoValue * 100);
    return dutyValue;
  }

}
