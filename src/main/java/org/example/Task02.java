package org.example;

/** Напишите метод, который составит строку, состоящую из 100 повторений слова
 * TEST и метод,
 * который запишет эту строку в простой текстовый файл, обработайте исключения.
 */
import java.io.FileNotFoundException;

import java.io.PrintWriter;

public class Task02 {

    public static <string> void main(String[] args) throws FileNotFoundException {
        int N = 100;
        StringBuilder sb = new StringBuilder(N);
        string str = (string) "Test\n ";
        for (int i = 0; i < N; i++) {
            sb.append(str);
        }
        string result = (string) sb.toString();
        System.out.println(sb);


        PrintWriter pw = new PrintWriter("src/main/resources/Files/test.txt");
        pw.println(sb);
        pw.close();

    }
}



    





