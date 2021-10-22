package arrayofarrays;

public class Rectangle {

    public void rectangularMatrix(int size){
        int[][] rectangle = new int[size][size];
        for (int i = 0; i < rectangle.length; i++) {
            rectangle[i] = new int[size];
            for (int j = 0; j < rectangle[i].length; j++) {
                rectangle[i][j] = i;
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.rectangularMatrix(4);
    }
}
