
/**
 * matrics
 */
import java.util.*;

public class matrics {


    public static boolean Search(int matrix[][],int key){
        int n = matrix.length;
        int m= matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
               if (matrix[i][j]==key ) {
                System.out.println("cell found at "+i+" "+ j);
                return true;
               }
            }
            
        }
        System.out.println("not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m= matrix[0].length;
        System.out.println("enter elements : ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        Search(matrix, m);
        sc.close();
    }

}