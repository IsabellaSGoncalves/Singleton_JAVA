package singleton;
import java.io.*;
import java.util.ArrayList;

public class FileConnection {
    private static FileConnection instance;
    private String arquivo;

    private FileConnection(String arquivoConfig){
        this.arquivo = Arquivo.importar(arquivoConfig);
    }
    public static FileConnection getInstance(String arquivoConfig){
        if(instance == null){
           instance = new FileConnection(arquivoConfig);
        }
        return instance;
    }

    public String getArquivo(){
        return arquivo;
    }
}
