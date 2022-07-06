package org.example;

import java.io.*;

public class FileIO {
    public static void main(String[] args) throws IOException {

//        BufferedWriter bW = new BufferedWriter(
//                new FileWriter("C:\\Users\\BUANOKWURU\\Desktop\\TestW\\Show.txt"));
//        bW.write("With GOD\n");
//        bW.write("All Things\n");
//        bW.write("are possible\n");
//        bW.close();

        BufferedWriter bW = new BufferedWriter(new FileWriter("C:\\Users\\BUANOKWURU\\Desktop\\TestW\\Show-copy.txt"));
        BufferedReader bR = new BufferedReader(
                new FileReader("C:\\Users\\BUANOKWURU\\Desktop\\TestW\\Show.txt"));
        String r;
        while((r = bR.readLine()) != null){
            bW.write(r + "\n");
        }
        bR.close();
        bW.close();
    }
}
