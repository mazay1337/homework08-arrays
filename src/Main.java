import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*    1) Объявите три массива:  Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new
          Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
          Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
          с помощью ключевого слова или сразу заполненный элементами.
        */
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        double[] array2 = {1.57, 7.654, 9.986};
        String[] array3 = {"Harry Potter", "Hermione Granger", "Ronald Weasley"};

        // 2) Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        // В конце строки запятую ставить не надо.
        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length -1) {
                System.out.println(array1[i]);
                break;
            }
            System.out.print(array1[i] + ", ");
        }
        for (int i = 0; i < array2.length; i++) {
            if (i == array2.length -1) {
                System.out.println(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }
        for (int i = 0; i < array3.length; i++) {
            if (i == array3.length -1) {
                System.out.println(array3[i]);
                break;
            }
            System.out.print(array3[i] + ", ");
        }

        // 3) Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        // В конце строки запятую ставить не надо.
        for (int i = array1.length - 1; i >= 0;  i--) {
            if (i == 0) {
                System.out.println(array1[i]);
                break;
            }
            System.out.print(array1[i] + ", ");
        }
        for (int i = array2.length - 1; i >= 0;  i--) {
            if (i == 0) {
                System.out.println(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }
        for (int i = array3.length - 1; i >= 0;  i--) {
            if (i == 0) {
                System.out.println(array3[i]);
                break;
            }
            System.out.print(array3[i] + ", ");
        }

        // 4) Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i]++;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}