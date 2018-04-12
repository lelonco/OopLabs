package com.company.lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface ArrayIntProcess {
    double avg(int[] arr);

    double avg(File file) throws IOException, ClassNotFoundException;

    int[] aceptToArray(int[] arr, IntProc proc);

    File acceptToFile(File file, IntProc proc) throws IOException, ClassNotFoundException;
}
