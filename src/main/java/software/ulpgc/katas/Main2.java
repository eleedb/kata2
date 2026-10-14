package software.ulpgc.katas;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Main2 {
    static void main(String[] args) throws IOException {
        URL url = new URL("https://raw.githubusercontent.com/sachin365123/CSV-files-for-Data-Science-and-Machine-Learning/refs/heads/main/Employee%20Dataset%20-%20TSV.txt");
        File file = new File("employees2.tsv");
        try(InputStream is = url.openStream(); OutputStream os = new FileOutputStream(file)) {
            os.write(is.readAllBytes());
        }
    }
}
