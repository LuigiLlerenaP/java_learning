package ec.System;

import java.io.IOException;

public class ExampleRuntimeProgramSO {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proc;
        try {
            //Use lower case because  Is mores simple  to compare the strings
            if(System.getProperty("os.name").toLowerCase().contains("windows")){
                proc = rt.exec("notepad");
            }else {
                proc = rt.exec("gedit");
            }
            proc.waitFor();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Close the editor ");
    }
}
