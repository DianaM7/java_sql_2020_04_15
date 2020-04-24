package days.third;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Homework16 {
    static class NamesList{
        private String filename;

        public NamesList(String filename){
            this.filename = filename;
        }
        public void showNames(String filename){
            try(BufferedReader bf = new BufferedReader(new FileReader(filename))){
                System.out.println("Vardai sarase yra tokie:");
                List<String> names = new ArrayList<>();
                String line;
                while((line = bf.readLine()) != null){
                    String[] items = line.split(", ");
                    for(String item : items){
                        names.add(item);
                        System.out.println(item);
                    }
                }

            }catch(IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        NamesList namesList = new NamesList("names.txt");
        namesList.showNames("names.txt");
    }


}
