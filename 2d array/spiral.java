public class spiral {
    public static void printspiral(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;
        
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;
            
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
    //On^2 time
    // public static int diagonal_sum(int matrix[][]){
    //     int sum =0;
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[0].length; j++) {
    //             if (i==j) {
    //                 sum += matrix[i][j];
    //             }else if (i+j == matrix.length-1) {
    //                 sum += matrix[i][j];
    //             }
    //         }
    //     }
    //     return sum;
    // }
    public static int diagonal_sum(int matrix[][]){
        //pd
        int sum =0;
        for (int i = 0; i < matrix.length; i++) {
             //pd
             sum+= matrix[i][i];
             //sd
             if (i !=matrix.length-i -1) {
                sum += matrix[i][matrix.length-i-1];
             }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println(diagonal_sum(matrix));
        // printspiral(matrix);
    }
}
