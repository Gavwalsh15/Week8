package ie.atu.week8;

import java.io.*;

public class CreateFile
{
    public static void main(String[] args)
    {
            File myFile = new File("MyFile.txt");
            System.out.println("My file is located at" + myFile.getAbsolutePath());

            try
            {
                FileWriter outputFile = new FileWriter(myFile, true);
                outputFile.write("Gavin Test 2");
                outputFile.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }




    }
}
