import java.util.Arrays;
import java.util.Random;

public class java_HW_2 {
    public static void main(String[] args) {

//   Начало первого задания!!!

        int[] firstTaskNums = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0};

        for (int i = 0; i < firstTaskNums.length; i++) {
            if (firstTaskNums[i] == 0) {
                firstTaskNums[i]++;
            } else {
                firstTaskNums[i]--;
            }
        }

        System.out.println(Arrays.toString(firstTaskNums));

//   Конец первого задания!!!

//   Начало второго задания!!!

        int[] secondTaskNums = new int[8];
        int three = 0;
        for (int i = 0; i < secondTaskNums.length; i++) {
            three += 3;
            secondTaskNums[i] = three;
        }
        System.out.println(Arrays.toString(secondTaskNums));

//  Конец второго задания!!!

//  Начало третьего задания!!!

        int[] thirdTaskNums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < thirdTaskNums.length; i++) {
            if (thirdTaskNums[i] < 6) {
                thirdTaskNums[i] *= 2;
            }
        }

        System.out.println(Arrays.toString(thirdTaskNums));

//  Конец третьего задания!!!

//  Начало четверого задания!!!

        int[][] fourthTaskNums = new int[6][6];
        for (int i = 0; i < fourthTaskNums.length; i++) {
            for (int n = 0; n < fourthTaskNums[i].length; n++) {
                if (n == n) {
                    fourthTaskNums[n][n] = 1;

                }
            }


        }

        System.out.println(Arrays.toString(fourthTaskNums[0]));
        System.out.println(Arrays.toString(fourthTaskNums[1]));
        System.out.println(Arrays.toString(fourthTaskNums[2]));
        System.out.println(Arrays.toString(fourthTaskNums[3]));
        System.out.println(Arrays.toString(fourthTaskNums[4]));
        System.out.println(Arrays.toString(fourthTaskNums[5]));

//  Конец четвертого задания!!!

//  Начало пятого задания!!!

        Random randomNums = new Random();
        int[] fifthTaskNums = new int[10];
        for (int i = 0; i < fifthTaskNums.length; i++) {
            fifthTaskNums[i] = randomNums.nextInt(100);
        }
        int minNum = 100;
        int maxNum = 0;
        for (int i = 0; i < fifthTaskNums.length; i++) {
            if (fifthTaskNums[i] > maxNum) {
                maxNum = fifthTaskNums[i];
            }
            if (fifthTaskNums[i] < minNum) {
                minNum = fifthTaskNums[i];
            }
        }
        System.out.println(Arrays.toString(fifthTaskNums));
        System.out.println("Минимальная цифра" + " " + minNum);
        System.out.println("Максимальная цифра" + " " + maxNum);

//  Конец пятого задания!!!

        //  Начало шестого задания!!!

        int[] a = {4, 3, 2, 1, 2, 3, 1};

        System.out.println(task7(a));



    }

    public static boolean task7(int[] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a += arr[i];
        }
        if (a % 2 != 0) {
            return false;
        } else {
            a = a /= 2;
        }
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            b += arr[i];
            if (b > a) break;
            else if (a == b) return true;
        }
        return false;
    }

        //  Конец шестого задания!!!

}

