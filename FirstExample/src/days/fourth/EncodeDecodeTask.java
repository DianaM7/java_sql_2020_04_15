package days.fourth;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class EncodeDecodeTask {

    private static Map<Integer, String> encode = new HashMap<>();

    public static void main(String[] args) {
        readCode();//fill map parameters

        List<Integer> letters = readLetter();
        //combine string into one from separate items
        StringBuilder stringBuilder = new StringBuilder();
        for(Integer l : letters){
            String value = encode.get(l);
            if(value != null){
                stringBuilder.append(value.equals("tarpas") ? " " : value);
            }
        }
        //convert StringBuilder to string and print
        System.out.println(stringBuilder.toString());


    }

    private static List<Integer> readLetter(){
        List<Integer> numbers = new ArrayList<>();

        try(BufferedReader bf = new BufferedReader(new FileReader("laiskas.txt"))){
            String line;
            while((line = bf.readLine()) != null){
                //split by space
                String[] items = line.split(" ");
                //: imam elementa po elementa ir 1-a elementa is item priskiriam reiksme
                //add elements to list
                for(String item : items){
                    //konvertuoja Stringa i Integer
                    numbers.add(Integer.valueOf(item));
                }
            }
        }catch(IOException e){
            System.out.println(e.getMessage());

        }
        return numbers;
    }

    private static void readCode(){
        //nuskaitom teksta - read file from rood directory
        //try() using for close stream in any case
        try(BufferedReader bf = new BufferedReader(new FileReader("koduote.txt"))){

            String line;
            //read line by line
            while((line = bf.readLine()) != null){
                //split line by space
                String[] items = line.split(" ");
                //integer value of convert String to Integer
                encode.put(Integer.valueOf(items[0]), items[1]);
            }
        }catch(IOException e){
            System.out.println("Klaida nuskaitant faila " + e.getMessage());
        }

    }

    private static void codeLetter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite teksta, kuri norite uzkoduoti:");


    }

}
