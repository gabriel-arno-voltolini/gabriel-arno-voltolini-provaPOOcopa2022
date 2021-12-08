//Gabriel Arno
//Luan Garcia
package Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ApplicationLogger {
    private String fileName;
    private String filePath;
    private File file;

    public ApplicationLogger(String fileName, String filePath) {
        this.setFileName(fileName);
        this.setFilePath(filePath);
        this.createFile(file);
    }

    public void writeToFile(String content) {
        try {
            FileWriter writer = new FileWriter(this.getFilePath() + this.getFileName());
            writer.write(content);
            writer.close();
            System.out.println("Arquivo alterado com sucesso.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    };

    private void createFile(File file) {
        try {
            file = new File(this.getFilePath() + this.getFileName());
            if (file.createNewFile()) {
                System.out.println("Arquivo criado: " + file.getName());
            } else {
                System.out.println("Arquivo já existe");
            }
        } catch (IOException e) {
            System.out.println("Algo de errado ocorreu na criação do aquivo");
            e.printStackTrace();
        }
    }

    public File getFile() {
        return file;
    }

    private void setFile(File file) {
        this.file = file;
    }

    public String getFilePath() {
        return filePath;
    }

    private void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    private void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
