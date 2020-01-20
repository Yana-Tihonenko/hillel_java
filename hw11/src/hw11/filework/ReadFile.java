package hw11.filework;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

    public static String readFile(String path) throws IOException {
        String result = null;
        FileInputStream readFile = new FileInputStream(path);
        byte[] buffer = new byte[readFile.available()];
        readFile.read(buffer);
        result = new String(buffer);
        readFile.close();
        return result;
    }
}
