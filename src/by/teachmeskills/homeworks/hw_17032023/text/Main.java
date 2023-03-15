package by.teachmeskills.homeworks.hw_17032023.text;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data\\hw_1703\\OriginalText.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data\\hw_1703\\FormaterText.txt"))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                if (TextFormater.checkPalindromeString(str) | (TextFormater.returnNumberWords(str) >= 3 & TextFormater.returnNumberWords(str) <= 5)) {
                    bufferedWriter.write(str + "\n");
                    bufferedWriter.flush();
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
