package days.third;
// Not finished
public class Homework6 {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 3, 4};
        String[] stringArray = {"a", "b", "c", "d"};
        String[] combArray = combineMas(numberArray, stringArray);

        for(int i = 0; i < combArray.length; i++){
            System.out.print(combArray[i] + "");
        }
    }

    private static String[] combineMas (int[] numberArray, String[] stringArray){
        String[] newArray = new String[numberArray.length + stringArray.length];

        int j = 0;
        for(int i = 0; i < numberArray.length; i++){
            newArray[j++] = String.valueOf(numberArray[i]);
            newArray[j++] = stringArray[i];
        }
        return newArray;
    }



}
