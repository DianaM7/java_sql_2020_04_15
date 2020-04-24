package days.third;

public class Homework8 {
    public static void main(String[] args) {
        int[][] matrix = {{2, 5, 7, 3}, {1, 4, 6, 7, 2}};

        int sum = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] > 5){
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Matricos elementu, kurie > 5, suma lygi: " + sum);
    }
}
