/*
Дано: двумерная матрица 8 на 8 из случайных чисел от 0 до 255 (спектр цветов GrayScale). 
Алгоритм "поворачивает" матрицу на 90, 180 или 270 градусов градусов по часовой стрелке.
*/

import java.util.Scanner;
import java.util.Random;

class Main {
  public static final int SIZE = 8;

  public static void main(String[] args) {

    int[][] colors = createMatrix(SIZE, SIZE);

    System.out.println("Исходная матрица:");
    printMatrix(colors);
    System.out.println();

    // запрос у пользователя угла разворота
    int rotation = askRotation();

    // разворот матрицы
    int[][] rotatedColors = rotateMatrix(colors, rotation);

    System.out.println("\nПеревернутая на " + rotation + " градусов матрица:");
    printMatrix(rotatedColors);
  }

  // Метод заполняет матрицу случайными значениями в диапазоне от 0 до 255
  private static int[][] createMatrix(int rows, int cols) {
    Random random = new Random();
    int[][] matrix = new int[rows][cols];
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        matrix[i][j] = random.nextInt(256);
      }
    }
    return matrix;
  }

  public static void printMatrix(int[][] colors) {
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        // %4d - под каждый номер резервируем 4 знака, незанятые будут заполнены
        // пробелами.
        System.out.format("%4d", colors[i][j]);
      }
      // Переход на следующую строку
      System.out.println();
    }
  }

  public static int askRotation() {
    System.out.println("\nВведите угол поворота, кратный 90:");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    int rotation = 0;
    rotation = Integer.parseInt(input);
    // Проверка угла поворота на кратность 90 градусам.
    while (true) {
      if (rotation % 90 != 0) {
        System.out.println("На такой угол матрицу повернуть нельзя.");
        rotation = askRotation();
      } else {
        break;
      }
    }
    return rotation;
  }

  public static int[][] rotateMatrix(int[][] colors, int rotation) {
    int[][] rotatedColors = new int[colors.length][colors.length];
    int normRotation = rotation % 360;
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        switch (normRotation) {
          case 90:
            rotatedColors[j][colors.length - i - 1] = colors[i][j];
            break;
          case 180:
            rotatedColors[i][j] = colors[colors.length - i - 1][colors.length - j - 1];
            break;
          case 270:
            rotatedColors[i][j] = colors[j][colors.length - i - 1];
            break;
          case 0:
            rotatedColors[i][j] = colors[i][j];
            break;
          default:
            System.out.println("На такой угол матрицу повернуть нельзя.");

        }
      }
    }
    return rotatedColors;
  }
}
