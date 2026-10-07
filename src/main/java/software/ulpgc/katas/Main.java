package software.ulpgc.katas;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    static void main() {
        String s = "¡Viva España!";
        byte[] utf = s.getBytes();
        byte[] iso = s.getBytes(StandardCharsets.ISO_8859_1);

        System.out.println("Decoding with UTF-8 and coding with UTF-8");
        System.out.println(new String(utf));
        System.out.println("Decoding with UTF-8 and coding with ISO-8859-1");
        System.out.println(new String(utf, StandardCharsets.ISO_8859_1));
        System.out.println("Decoding with ISO-8859-1 and coding with UTF-8");
        System.out.println(new String(iso));
        System.out.println("Decoding with ISO-8859-1 and coding with ISO-8859-1");
        System.out.println(new String(iso, StandardCharsets.ISO_8859_1));


    }
}
