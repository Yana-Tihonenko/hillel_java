import java.io.IOException;

import static service.FindWordFromFile.findWordToURL;

public class Main {

    public static void main(String[] args) {
        String path = "./src/sourse/file.txt";
        int count=0;
        try {
             count = findWordToURL(path, "today");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }
}
