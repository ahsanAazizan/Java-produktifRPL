import java.util.Arrays;
import java.util.Scanner;

public class SearchAndSort {
    private static double findMean(int[] arr){
        double mean = 0;
        for (int i = 0; i < arr.length; i++){
            mean += arr[i];
        }
        return mean / arr.length;
    }

    private static int findLowest(int[] arr){
        int[] newArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(newArr);
        return newArr[0];
    }

    private static int findHighest(int[] arr){
        int[] newArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(newArr);
        return newArr[newArr.length - 1];
    }

    private static void rank(int[] nilai, String[] nama){
        int n = nilai.length - 1;
        for (int i = 0; i < n; i++){
            for (int j =0; j < n - i - 1; j++){
                if (nilai[j] > nilai[j + 1]){
                    int temp = nilai[j];
                    String temp2 = nama[j];

                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;

                    nama[j] = nama[j + 1];
                    nama[j + 1] = temp2;
                }
            }
        }
    }

    static int binarySearch(int v[], int To_Find)
    {
        int lo = 0, hi = v.length - 1;
        // This below check covers all cases , so need to check
        // for mid=lo-(hi-lo)/2
        while (hi - lo > 1) {
            int mid = (hi + lo) / 2;
            if (v[mid] < To_Find) {
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
        }
        if (v[lo] == To_Find) {
            return lo;
        }
        else if (v[hi] == To_Find) {
            return hi;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ANALISIS DATA NILAI SISWA");
        System.out.print("Jumlah Siswa : ");
        final int jumlahSiswa = sc.nextInt();
        sc.nextLine();
        int[] nilai = new int[jumlahSiswa];
        String[] nama = new String[jumlahSiswa];
        for (int i = 0; i < jumlahSiswa; i++){
            System.out.print("Nama siswa ke-" + (i + 1) + " : ");
            nama[i] = sc.nextLine();
            System.out.print("Nilai Siswa ke-" + (i + 1) + " : ");
            nilai[i] = sc.nextInt();
            sc.nextLine();
        }

        // Output
        System.out.println(Arrays.toString(nama));
        System.out.println(Arrays.toString(nilai));
        System.out.println("Nilai terendah : " + findLowest(nilai) + "(" + nama[binarySearch(nilai, findLowest(nilai))] + ")");
        System.out.println("Nilai tertinggi : " + findHighest(nilai) + "(" + nama[binarySearch(nilai, findHighest(nilai))] + ")");
        System.out.println("Mean (Rata - rata) : " + findMean(nilai));
        System.out.println("Median (Nilai tengah) : " + nilai[nilai.length / 2] + "(" + nama[nama.length / 2] + ")");
        rank(nilai, nama);
        System.out.println("Rank siswa berdasarkan nilai : ");
        for (int i = 0; i < nama.length; i++){
            System.out.println((i + 1) + ". " + nama[i]);
        }
    }
}
