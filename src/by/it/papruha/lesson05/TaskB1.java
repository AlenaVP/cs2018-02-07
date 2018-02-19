package by.it.papruha.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/

public class TaskB1 {
    public static void main(String[] args) {
        String[] ls = {"asdf","ghjk","1","2","5"};
        System.out.println(ls.length);
        for (int j = 0; j < ls.length; j++) {
            System.out.println(ls[j]);
        }
    }
}