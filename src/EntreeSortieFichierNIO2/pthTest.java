package EntreeSortieFichierNIO2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class pthTest {

    public static void main(String[] args)throws IOException {

        Path testTxtPath = Paths.get("/Users/sebastienjean/Documents/test.txt");
        Path rela = testTxtPath.relativize(testTxtPath);
        System.out.println(testTxtPath);
        System.out.println(rela);

        System.out.println(Files.isReadable(testTxtPath));

        String separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);

        List<String> lignes =  Files.readAllLines(
                testTxtPath, StandardCharsets.UTF_8);
        for (String ligne : lignes)
            System.out.println(ligne);



    }
}
