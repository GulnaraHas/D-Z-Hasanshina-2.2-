package org.gulnara.dz;
public class Main {
    public static void main(String[] args) {
        // Примеры массивов
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
                {"13", "14", "15", "abc"}
        };

        try {
            System.out.println("Сумма correctArray: " + sumArrayElements(correctArray));
            System.out.println("Сумма wrongSizeArray: " + sumArrayElements(wrongSizeArray)); // MyArraySizeException
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println("Сумма wrongDataArray: " + sumArrayElements(wrongDataArray)); // MyArrayDataException
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // Проверка размера массива
        if (array.length != 4) {
            throw new MyArraySizeException("Ошибка размера: массив должен быть 4x4, но количество строк: " + array.length);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null || array[i].length != 4) {
                throw new MyArraySizeException(
                        "Ошибка размера: строка " + i + " имеет длину " +
                                (array[i] == null ? "null" : array[i].length) + " вместо 4"
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
                            "Ошибка данных в ячейке [" + i + "][" + j + "]: '" +
                                    array[i][j] + "' не является целым числом"
                    );
                }
            }
        }

        return sum;
    }
}