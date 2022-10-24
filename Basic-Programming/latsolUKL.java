import java.util.ArrayList;
import java.util.Scanner;

public class latihan {
    static void generateTriangle(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= (i * 2) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void multiMatrix2(int arr1[][], int arr2[][]) {
        int temp[][] = {{0, 0}, {0, 0}}, i, j;
        for (i = 0; i < 2; i++){
            for (j = 0; j < 2; j++){
                for (int k = 0; k < 3; k++){
                    temp[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        for (i = 0; i < temp.length; i++){
            for (j = 0; j < temp[i].length; j++){
                System.out.print(temp[i][j] + "\t");
            }
            System.out.println();
        }
    }



    static void multiMatrix1(int arr1[][], int arr2[][]){
        for (int i = 0; i < 2; i++){
            int temp = 0;
            for (int j = 0; j < 2; j++){
                temp += (arr1[i][j] * arr2[j][0]);
            }
            System.out.println(temp);
        }
    }

    static void sumMatrix2x2(int mat1[][], int mat2[][]){
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.print((mat1[i][j] - mat2[i][j]) + "\t");
            }
            System.out.println();
        }
    }

    static void generateMatrix3(int a, int b){
        int i, j;
        for (i = 0; i < 3; i++){
            for (j = 0; j < i; j++){
                System.out.print(a + "\t");
                a += b;
            }
            System.out.println();
        }

        for (i = 3; i > 0; i--){
            for (j = 0; j < i; j++){
                System.out.print(a + "\t");
                a += b;
            }
            System.out.println();
        }
    }

    static void generateMatrix5(int a, int b){
        for (int i = 5; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print(a + "\t");
                a += b;
            }
            System.out.println();
        }
    }

    static void generateMatrix3x4(int a, int b){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(a + "\t");
                a += b;
            }
            System.out.println();
        }
    }

    static ArrayList<Integer> generateArithmetic(int a, int b, int sukuTerakhir) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < sukuTerakhir; i++) {
            arr.add(a);
            a += b;
        }
        return arr;
    }
}
