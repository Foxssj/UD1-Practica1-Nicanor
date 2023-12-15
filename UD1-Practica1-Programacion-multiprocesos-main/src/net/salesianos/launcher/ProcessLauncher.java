package net.salesianos.launcher;

import java.io.File;
import java.io.IOException;

public class ProcessLauncher {
    private final static String OUTPUT_ROUTE = "UD1-Practica1-Programacion-multiprocesos-main/src/net/salesianos/outputs/";

    public static Process initContadorVocalProcess(String vocal, String line) {
        ProcessBuilder processBuilder = new ProcessBuilder(
                "java", "C:\\Users\\nican\\Downloads\\UD1-Practica1-Programacion-multiprocesos-main\\UD1-Practica1-Programacion-multiprocesos-main\\src\\net\\salesianos\\processes\\VocalCounter.java", vocal, line
        );



        Process javaProcess = null;

        try {
            javaProcess = processBuilder.start();


        } catch (IOException e) {
            e.printStackTrace();
        }

        return javaProcess;
    }

    public static Process initOutputCounter(String vocal, String line, String fileName) {
        ProcessBuilder processBuilder = new ProcessBuilder(
                "java", "C:\\Users\\nican\\Downloads\\UD1-Practica1-Programacion-multiprocesos-main\\UD1-Practica1-Programacion-multiprocesos-main\\src\\net\\salesianos\\processes\\VocalCounter.java", vocal, line
        );



        Process javaProcess = null;

        try {
            File outputFile = new File(OUTPUT_ROUTE + fileName);
            processBuilder.redirectOutput(outputFile);
            javaProcess = processBuilder.start();


        } catch (IOException e) {
            e.printStackTrace();
        }

        return javaProcess;
    }
}
