package service;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FindWordFromFile {
    public static int findWordToURL(String url, String searchWord) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("url")), StandardCharsets.UTF_8);
        int count = (int) Stream.of(text.split("[\\P{L}]+")).filter(s -> s.equals(searchWord)).count();
        return count;
    }
}
