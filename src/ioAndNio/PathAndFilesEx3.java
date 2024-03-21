package ioAndNio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test17.txt");
        Files.createFile(filePath);
        String dialog = "Hello, Igor!\nHow are you?\nI am fine!";
        Files.write(filePath, dialog.getBytes());

    }
}
