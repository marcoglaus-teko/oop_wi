package ch.teko.oop.tag13.input.DemoExceptions;

import java.io.FileWriter;

/**
 * IO ist "checked" und muss behandelt werden.
 */
public class ExceptionsDemo {
    public static void main(String[] args) {
        String data = "This is the data in the output file";

        try {
            // Creates a FileWriter
            FileWriter output = new FileWriter("./src/ch/teko/oop/tag13/input/DemoExceptions/output.txt");
            //FileWriter output = new FileWriter(".\\src\\ch\\teko\\oop\\tag13\\input\\DemoExceptions\\output.txt");

            // Writes the string to the file
            output.write(data);

            // Closes the writer
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

