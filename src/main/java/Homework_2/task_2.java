package Homework_2;

import java.io.FileOutputStream;
import java.io.IOException;
public class task_2 {
    public static void main(String[] args) {
        writer();
    }
    public static StringBuilder generateString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append("TEST ");
        }
        return stringBuilder;
    }

    public static void writer(){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test.txt");

            fileOutputStream.write(generateString().toString().getBytes());

            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("Проблема вывода!");
            e.printStackTrace();
        }
    }
}
