package by.it.papruha.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class TaskC2 {
    //Напишите тут ваш код
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();//{10,5,2,3,8};
        //int[] bulb = {10, 5, 2, 3, 8, };
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            int num=sc.nextInt();
            nums.set(i, num);
        }
        for (int j = 0; j < 20; j++) {
            System.out.print(nums.get(j) + " ");
        }
    }


    public static void sort(int[] array) {
        //Напишите тут ваш код
        int size = array.length;
        int t;
        for (int i = 1; i < size; i++) {
            for (int j = size - 1; j >= i; j--) {
                if (array[j - 1] > array[j]) {
                    t = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = t;
                }
            }
        }

    }
}