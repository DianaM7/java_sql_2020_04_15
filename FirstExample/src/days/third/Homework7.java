package days.third;

public class Homework7 {
    public static void main(String[] args) {
        int[][] matrix = {{5, 13, -1}, {-10, 5, 6}};

        int sum = 0;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] > 0) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Matricos teigiamu skaiciu suma " + sum);
    }
}
