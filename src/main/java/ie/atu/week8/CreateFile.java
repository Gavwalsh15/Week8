package ie.atu.week8;

import java.io.*;

public class CreateFile
{
    public static void main(String[] args) {
        File myFile = new File("MyFile.txt");
        System.out.println("My file is located at" + myFile.getAbsolutePath());

        try {
            FileWriter myWriter = new FileWriter(myFile, true);
            PrintWriter myPrinter = new PrintWriter(myWriter);
            myPrinter.println("Gavin1");
            myPrinter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}