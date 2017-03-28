package example;

import example2.Main;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ex {
    public static void main(String[] args) throws IOException {
        String path = "C:/model.uml";
        URI modelURI = URI.createFileURI(URI.decode(path));
        File targetFolder = new File("C:/result");

        Main generator = new Main(modelURI, targetFolder, new ArrayList<Object>());
        generator.doGenerate(new BasicMonitor());
    }
}
