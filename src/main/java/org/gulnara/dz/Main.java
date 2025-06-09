package org.gulnara.dz;
public class Main {
    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // Проверка размера массива
        if (array.length != 4) {
            throw new MyArraySizeException("Массив должен быть 4x4. Получено строк: " + array.length);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null || array[i].length != 4) {
                throw new MyArraySizeException(
                        String.format("Строка %d должна содержать 4 элемента. Получено: %s",
                                i, array[i] == null ? "null" : array[i].length)
                );
            }
        }

        // Суммирование элементов
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            String.format("Неверные данные в ячейке [%d][%d]: '%s'",
                                    i, j, array[i][j])
                    );
                }
            }
        }
        return sum;
    }

    // Метод для демонстрации ArrayIndexOutOfBoundsException
    public static void demonstrateArrayIndexException() {
        int[][] matrix = {{1, 2}, {3, 4}};
        try {
            System.out.println("Попытка доступа к matrix[2][0]...");
            int value = matrix[2][0]; // Здесь возникнет исключение
            System.out.println("Значение: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано ArrayIndexOutOfBoundsException: " + e.getMessage());
            System.out.println("Максимально допустимый индекс строки: " + (matrix.length - 1));
        }
    }

    public static void main(String[] args) {
        // Тестовые данные
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] wrongSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        String[][] wrongDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "X"}
        };

        // Обработка массивов
        processAndPrint(correctArray, "Корректный массив");
        processAndPrint(wrongSizeArray, "Массив неправильного размера");
        processAndPrint(wrongDataArray, "Массив с некорректными данными");

        // Демонстрация ArrayIndexOutOfBoundsException
        System.out.println("\nДемонстрация ArrayIndexOutOfBoundsException:");
        demonstrateArrayIndexException();
    }

    private static void processAndPrint(String[][] array, String description) {
        System.out.println("\nОбработка: " + description);
        try {
            int sum = processArray(array);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных в массиве: " + e.getMessage());
        }
    }
}