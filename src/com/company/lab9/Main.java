package com.company.lab9;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //System.out.println(Main.class.getResource("text.txt").toExternalForm());
     /*   File file=new File(classDirectory,"text.txt");*/
        File file =new File(System.getProperty("user.dir"),"text.txt");
        FileOperation fileOperation=new FileOperation();
        fileOperation.copyFile(file);
    }

}
