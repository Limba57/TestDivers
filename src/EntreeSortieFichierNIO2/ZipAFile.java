package EntreeSortieFichierNIO2;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ZipAFile {

    Path source;
    Path destination;
    Path fileName;

    public ZipAFile(String stringSource, String stringDestination) {
        this.source = Paths.get(stringSource);
        this.destination = Paths.get(stringDestination);
    }

    public ZipAFile(String stringSource) {
        this.source = Paths.get(stringSource);
        destination = source.getParent();
        String fileNameAndExtention = source.getFileName().toString();
        String[] splitFileNameAndExention = fileNameAndExtention.split("\\.",2);
        fileName = Paths.get(splitFileNameAndExention[splitFileNameAndExention.length - 2]);
    }
}
