package arrayofarrays;

public class Triangular {
    public void triangularMatrix(int size) {
        int[][] matrix = new int[size][];
        for(int i = 0; i < matrix.length; i++){
            matrix[i] = new int[ i + 1 ];
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Triangular triangular = new Triangular();
        triangular.triangularMatrix(4);
    }
}
