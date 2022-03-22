import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("rows");
        int rows = sc.nextInt();
        System.out.println("columns");
        int col = sc.nextInt();
        System.out.println("enter values or matrix 1");
        int [][] matrix1 = new int[rows][col];
        int [][] matrix2 = new int[rows][col];
        int [][] result = new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter values or matrix 2");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        //printing matrix
        System.out.println("matrix1");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n"+"matrix2");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
               result[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("result");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }



    }
}
