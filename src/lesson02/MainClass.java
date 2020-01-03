package lesson02;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {


        //System.out.println("Hello world!");
        /*int a = 3;
        if (a == 1) {
            System.out.println("a = 1");
        } else if (a == 3) {
            System.out.println("a = 3");
        } else {
            System.out.println("Ни одно из условий не сработало"); */
       /* for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("end");*/
       /* int x;  // объявление управляющей переменной вынесено до начала цикла
        for (x = 10; x >= 0; x -= 5) { // Шаг -5
            System.out.print(x + " ");*/
        /*for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i-j: " + i + "-" + j);*/
        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + i + j);*/

        /*int[] arr = new int[5];
        for(int i = 0; i < 5; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);*/


      /*  int counter = 1;
        int[][] table = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();*/
        // 1.	Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
       /* int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i]; // это выражение заменило 1 на 0, а 0 на 1
        } */
        //2.	Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
       /* int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        } */
        // 3.	Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
                // ...
            }
        }
        System.out.println(Arrays.toString(arr));
        // 4.	Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        //    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    }

}





































