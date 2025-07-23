package Day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int [][] matrice = new int[12][8];
        Random random = new Random();

        for (int i=0; i< matrice.length; i++) {
            for (int j=0; j<matrice[i].length; j++) {
                matrice[i][j] = random.nextInt(50);
            }
        }

        int sum1 = 0, sum2 = 0, result = 0;
        for (int i: matrice[0]) {
            sum1 = sum1 + i;
        }
        System.out.println(sum1);

        for (int i = 1; i<12; i++) {
            sum2 = 0;
            for (int j : matrice[i]) {
                sum2 = sum2 + j;
                }
            System.out.println(sum2);
            if (sum2 >= sum1) {
                result = i;
                sum1 = sum2;
            }
        }
        System.out.println("Индекс строки, сумма чисел в которой максимальна: "+ result);

    }
}

