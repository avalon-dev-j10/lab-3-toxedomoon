package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20]; 
        //Создать массив из 20 целых чисел и адресовать его с сохранить ссылку
        //в переменную array Создать массив из 20 целых чисел и адресовать его 
        //сохранить ссылку в переменную array.
        
        FibonacciInitializer fibo = new FibonacciInitializer();
        
        fibo.initialize(array);
        
        System.out.println("\n" + "Последовательность чисел Фибоначчи::"
                + "\n");

        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println("");
        
        int sum=0;
        
        System.out.println("\n" + "Сумма чисел Фибоначчи::"
                + "\n");
        
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.print(sum + " ");
        }
        
        
        RandomInitializer rand = new RandomInitializer();
        
        rand.initialize(array);
        
        System.out.println("");
        
        System.out.println("\n" + "Сортирую массив с использованием метода пузырьковой сортировки:"
                + "\n");
        
        BubbleSort bubbleSort = new BubbleSort();
        
        bubbleSort.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println("");
        
        System.out.print("\n" + "Формирую массив последовательностью случайных чисел в диапазоне от -50 до 50:"
                + "\n");
        
        array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100) - 50);
            System.out.print(array[i] + " ");
        }
        
        System.out.println("");
        
        SelectionSort sSort = new SelectionSort();
        
        sSort.sort(array);
        
        System.out.println("\n" + "Сортирую массив с использованием метода сортировки выбором:"
                + "\n");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println("");
        
        System.out.print("\n" + "Формирую массив последовательностью случайных чисел в диапазоне от -50 до 50:" + "\n");
            
        array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100) - 50);
            System.out.print(array[i] + " ");
        }  
        
        System.out.println("");
        
        
        ShellSort shellSort = new ShellSort();
        shellSort.sort(array);
        
            System.out.println("Сортировка расческой:");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            }
            
    }
}

        
	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */

