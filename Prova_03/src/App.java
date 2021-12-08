import java.nio.file.Paths;

import Logger.ApplicationLogger;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        var logger = new ApplicationLogger("teste.txt", Paths.get("").toString());
        logger.writeToFile("Teste");
    }
}
