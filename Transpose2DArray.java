public class Transpose2DArray {
    public static int[][] transpose(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] transposedArray = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedArray[j][i] = array[i][j];
            }
        }

        return transposedArray;
    }
    
    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Array:");
        print2DArray(array);
        int[][] transposedArray = transpose(array);

        System.out.println("Transposed Array:");
        print2DArray(transposedArray);
    }
}
    

