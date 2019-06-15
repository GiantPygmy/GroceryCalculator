/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery.calculator;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @author Jeremy
 */
public class WriteFile {

    private String path;
    private boolean append_to_file = false;

    //constructor
    public WriteFile(String file_path) {
        path = file_path;
    }

    //second append constructor
    public WriteFile(String file_path, boolean append_value) {

        path = file_path;
        append_to_file = append_value;

    }

    public void writeToFile(String textLine) throws IOException {
        FileWriter write = new FileWriter(path, append_to_file);
        PrintWriter print_line = new PrintWriter(write);

        print_line.printf("%s" + "%n", textLine);
        print_line.close();
    }

}
