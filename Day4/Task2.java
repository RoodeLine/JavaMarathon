package Day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] numbers = new int[100];
        Random random = new Random();
        for (int i=0; i<100; i++) numbers[i] = random.nextInt(10000);
        System.out.println(Arrays.toString(numbers));

        int max = numbers[1], min = numbers[1]; // вариант max = 0, min = 10000
        int count = 0, sum = 0;
        for(int i: numbers) {
            if (max < i) max = i;
            if (min > i) min = i;
            if (i%10 == 0) {
                count++;
                sum += i; // sum = sum + i
            }

        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
