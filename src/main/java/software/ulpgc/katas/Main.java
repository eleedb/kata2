package software.ulpgc.katas;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    static void main() throws IOException {
        File file = new File("document.legacy.txt");
        try (Reader reader = new FileReader(file, StandardCharsets.ISO_8859_1)) {
            System.out.println(reader.readAllAsString());
        }


    }
}
