package software.ulpgc.katas;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    static void main() throws IOException {
        File file = new File("document.legacy.txt");
        try (InputStream is = new FileInputStream(file)) {
            byte[] b = is.readAllBytes();
            System.out.println(new String(b, StandardCharsets.ISO_8859_1));
        }


    }
}
