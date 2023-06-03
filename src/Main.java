import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        ArrayList<String> list = new ArrayList<>();


        try {BufferedReader reader = new BufferedReader(new FileReader("List.txt"));
            String readLine;
            while ((readLine = reader.readLine()) != null){
                list.add(readLine);
            }
        }catch (IOException e) {e.printStackTrace();}

        for (int i = 0; i < 1; i++) {
            System.out.print("enter your entry: ");
            Scanner sc =new Scanner(System.in);
            String userInput = sc.nextLine();
            if (userInput.equals(""))break;
            list.add(userInput);
             i--;
        }

        try {BufferedWriter writer = new BufferedWriter(new FileWriter("List.txt"));
            for (String s : list) {
                writer.write(s);
                writer.newLine();
            }
            writer.close();
        }catch (IOException e) {e.printStackTrace();}

        int counter = 1;
        System.out.println();
        for (String s : list) {
            System.out.println(counter + ". " + s);
            counter++;
        }


    }
}