package by.it.osipik.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int k=sc.nextInt();
        int a = i  + k;
        System.out.print("DEC:" );
        System.out.println(i + "+" + k +"="+ a);
        System.out.println("BIN:" + Integer.toBinaryString(i) + "+" + Integer.toBinaryString(k) +"="+ Integer.toBinaryString(a));
        System.out.println("HEX:" + Integer.toHexString(i) + "+" + Integer.toHexString(k) +"="+ Integer.toHexString(a));
        System.out.println("OCT:" + Integer.toOctalString(i) + "+" + Integer.toOctalString(k) +"="+ Integer.toOctalString(a));






    }


}