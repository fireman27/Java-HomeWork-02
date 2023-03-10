package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class Task03 {
    static Logger logger = Logger.getLogger("Task3");

    public static <DirectoryIsNotFoundException> void main(String[] args) {
        ex5("D:\\Рабочий стол\\Обучение\\Java\\HomeWork02");
        pathDir();

        private static void ex5(String pathDir) {
            String[] filesNamesFromDir = new String[0];
            try {
                filesNamesFromDir = convertPathToNamesArr(pathDir);
            } catch (DirectoryIsNotFoundException e) {
                logger.severe(e.getMessage());
                System.exit(1);
            }
            File output = new File("src/main/resources/Files/test2.txt");
            if (!output.exists()) {
                try {
                    output.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        try (PrintWriter pw = new PrintWriter(new FileWriter(output, true))) {
            pw.print(sb);
        } catch (IOException e) {
            logger.warning(e.getMessage());
            throw new RuntimeException("Файл не найден по пути: " + output.getPath());
        }
    }

    private static String[] convertPathToNamesArr (String path){
        File dir = new File(path);
        if (!dir.isDirectory()) {
            throw new DirectoryIsNotFoundException("По указанному пути не было найдено директории: " + path);
        }
        return dir.list();

    }
}

    private static void pathDir() {

    }




