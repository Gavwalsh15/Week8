package ie.atu.week8;

import java.io.*;
import java.util.Scanner;

public class CreateFile
{
    public static void main(String[] args) {

        File File1 = new File("File1.txt");
        System.out.println("My file is located at" + File1.getAbsolutePath());
        Scanner inputFile = null;
        try {
            FileWriter myWriter = new FileWriter(File1, true);
            PrintWriter myPrinter = new PrintWriter(myWriter);
            myPrinter.println("Hi Paul How Are You");
            myPrinter.close();


            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter the filename: ");
            String filename = keyboard.nextLine();
            inputFile = new Scanner(new File(filename));

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try {
            while (inputFile.hasNext()) {
                String str = inputFile.nextLine();
                System.out.println(str);
            }
        }
        catch(NullPointerException e)
        {
            e.printStackTrace();
        }

    }
}