package untitled;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;

public class Main {

    public static void main(String[] args) throws IOException {

        String greetings;
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\temp\\test.txt", true);

         greetings = "Привет! Добро пожаловать на JavaRush - лучший сайт для тех, кто хочет стать программистом!\r\n";

        fileOutputStream.write(greetings.getBytes());

        try {
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }

