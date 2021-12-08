import java.nio.file.Paths;

import Domain.Entities.ComissaoTecnica;
import Domain.Entities.Jogador;
import Logger.ApplicationLogger;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
    	
        System.out.println("Iniciado");
        Jogador j1 = new Jogador("luan", "lua", LocalDate.now(), 15, "meio", 156, 56 );
        Jogador j2 = new Jogador("lun", "l", LocalDate.now(), 18, "centro", 126, 67 );
       
        var logger = new ApplicationLogger("log.txt", Paths.get("").toString());
        logger.writeToFile("Teste");
        
        
    }
}
