package com.bobocode.se;

import com.bobocode.util.ExerciseNotCompletedException;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * {@link FileReaders} provides an API that allow to read whole file into a {@link String} by file name.
 */
public class FileReaders {
    
    /**
     * Returns a {@link String} that contains whole text from the file specified by name.
     *
     * @param fileName a name of a text file
     * @return string that holds whole file content
     */
    public static String readWholeFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                return in.nextLine();
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
        return "";
    }
}
