package ua.mkaloshyn.lection1;

import ua.mkaloshyn.lection1.factorial.InvalidNumberException;
import ua.mkaloshyn.lection1.sorting.BubbleSort;
import ua.mkaloshyn.lection1.sorting.InsertionSort;

public class Main {

    public static void main(String[] args) throws InvalidNumberException {

        BubbleSort bubblesort = new BubbleSort();
        bubblesort.sort(new int[]{2, 4, 0, -1, 1, 4, 9});

        System.out.println();

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(new int[]{3, -2, 0});

        System.out.println();

        /*LoopFactorial loopFactorial = new LoopFactorial();
        System.out.println("by loop method: n! = " + loopFactorial.calcFactorial(10));*/

        /*System.out.println();

        Recursion recursion = new Recursion();
        System.out.println("by recursion method: n! = " + recursion.calcFactorial(4));*/

       /* System.out.println();

        System.out.println("n! = " + FactorialByLongMath.factorialByLongMath(16));

        System.out.println();

        int n = 5;
        CalcFibonacciLoop calcFibonacciLoop = new CalcFibonacciLoop();
        System.out.println(n + " element of the Fibonacci raw is: " + calcFibonacciLoop.calcFibonacciNumber(n));

        System.out.println();

        int m = 7;
        CalcFibonacciRecursion calcFibonacciRecursion = new CalcFibonacciRecursion();
        System.out.println(m + " element of the Fibonacci raw is: " + calcFibonacciRecursion.calcFibonacciNumber(m));

        Car car1 = new Car(1995, 145, 2, "Mazerati");
        Car car2 = new Car(1995, 145, 2, "Bugatti");
        Car car3 = new Car(2002, 202, 4, "Ford");

        System.out.println();

        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());*/

    }
}
