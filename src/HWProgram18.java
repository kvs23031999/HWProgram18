import java.sql.Array;
import java.util.Arrays;

public class HWProgram18 {

    public static void main(String[] args) {

       int[][] matrix = new int[8][8];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               if ( i % 2 == 0 ){
                   matrix[i][j] = j+1;
               }else {
                   matrix[i][j] = matrix[i].length-j;

               }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
    }

}












