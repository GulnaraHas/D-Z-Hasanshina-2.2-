package org.gulnara.dz;
public class Main {
        public static void main(String[] args) {
                // Пример корректного массива
                String[][] correctArray = {
                        {"1", "2", "3", "4"},
                        {"5", "6", "7", "8"},
                        {"9", "10", "11", "12"},
                        {"13", "14", "15", "16"}
                };

                // Пример массива с некорректными данными
                String[][] incorrectDataArray = {
                        {"1", "2", "3", "4"},
                        {"5", "6", "7", "8"},
                        {"9", "10", "11", "12"},
                        {"13", "14", "15", "abc"}
                };

                // Пример массива неправильного размера
                String[][] incorrectSizeArray = {
                        {"1", "2", "3"},
                        {"4", "5", "6"},
                        {"7", "8", "9"}
                };

                try {
                        // Тестируем корректный массив
                        System.out.println("Сумма корректного массива: " + sumArray(correctArray));

                        // Тестируем массив с некорректными данными
                        try {
                                System.out.println("Сумма массива с ошибкой в данных: " + sumArray(incorrectDataArray));
                        } catch (MyArrayDataException e) {
                                System.out.println(e.getMessage());
                        }

                        // Тестируем массив неправильного размера
                        try {
                                System.out.println("Сумма массива неправильного размера: " + sumArray(incorrectSizeArray));
                        } catch (MyArraySizeException e) {
                                System.out.println(e.getMessage());
                        }

                } catch (Exception e) {
                        e.printStackTrace();
                }

                // Демонстрация ArrayIndexOutOfBoundsException
                try {
                        generateArrayIndexOutOfBounds();
                } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("\nПоймано ArrayIndexOutOfBoundsException: " + e.getMessage());
                }
        }

        public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
                // Проверка размера массива
                if (array.length != 4) {
                        throw new MyArraySizeException("Массив должен быть размером 4x4");
                }
                for (String[] row : array) {
                        if (row.length != 4) {
                                throw new MyArraySizeException("Массив должен быть размером 4x4");
                        }
                }

                int sum = 0;

                // Перебор элементов массива
                for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                                try {
                                        sum += Integer.parseInt(array[i][j]);
                                } catch (NumberFormatException e) {
                                        throw new MyArrayDataException(
                                                String.format("Некорректные данные в ячейке [%d][%d]: '%s'", i, j, array[i][j])
                                        );
                                }
                        }
                }

                return sum;
        }

        // Метод для генерации ArrayIndexOutOfBoundsException
        public static void generateArrayIndexOutOfBounds() {
                int[] smallArray = new int[3];

                // Попытка доступа к несуществующему индексу
                System.out.println("\nПопытка доступа к 10-му элементу массива длиной 3:");
                int value = smallArray[10]; // Здесь возникнет исключение
        }
}