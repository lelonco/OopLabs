package com.company.lab7;

import java.io.File;

public interface ArrayIntProcess {
    double avg(int[] arr);

    double avg(File file);

    int[] aceptToArray(int[] arr, IntProc proc);

    File acceptToFile(File file, IntProc proc);
}
