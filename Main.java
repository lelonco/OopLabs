package com.company.lab7;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int []arr={1,2};
     File arrFile= new File(System.getProperty("user.dir")+"/arrFile.txt");
        System.out.println(System.getProperty("user.dir"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arrFile));
        oos.writeObject(arr);
        oos.close();
    }
}
