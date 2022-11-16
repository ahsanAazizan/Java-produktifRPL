import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static double findMean(int[] arr){
        double mean = 0;
        for (int i = 0; i < arr.length; i++){
            mean += arr[i];
        }
        return mean / arr.length;
    }

    // Sorting the array with bubble sort algorithm
    // From the lowest to highest
    static void bubbleSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    // Swap arr[i] and arr[j + 1]
                    int temporaryJ = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temporaryJ;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Length : ");
        final int arrLength = sc.nextInt();
        int[] a = new int[arrLength];
        for (int i = 0; i < arrLength; i++){
            System.out.print("Index " + (i + 1) + " : ");
            a[i] = sc.nextInt();
        }

        System.out.println("You've created an integer array : \n" + Arrays.toString(a));
        bubbleSort(a);
        System.out.println("Sorted version of your integer array(Ascending) : \n" + Arrays.toString(a));
        System.out.println("Lowest : " + a[0]);
        System.out.println("Highest : " + a[a.length - 1]);
        System.out.println("Mean : " + findMean(a));

    }
}
