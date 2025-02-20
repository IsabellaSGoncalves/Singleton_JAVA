package singleton;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    public static void gravar(ArrayList<String> lista, String nomedoarquivo) throws IOException {
        FileWriter arq = new FileWriter(nomedoarquivo); //cria objetivo do tipo arquivo
        PrintWriter gravarArq = new PrintWriter(arq); //habilita arquivo para ser gravado
        //percorre a lista e grava no arquivo
        for (String nome : lista) {
            gravarArq.println(nome);
        }
        gravarArq.close();//fecha o arquivo
    }

    public static String importar(String nomedoarquivo) {
        ArrayList<String> lista = new ArrayList<>();
        try{
            FileReader arq = new FileReader(nomedoarquivo); // objeto do tipo arquivo para leitura
            BufferedReader lerArq = new BufferedReader(arq); //buffer para leitura
            String linha = lerArq.readLine(); // lê a primeira linha
        // a variável "linha" recebe o valor "null" quando o processo
        // de repetição atingir o final do arquivo texto
            while (linha != null) {
                if (!linha.trim().isEmpty()) { // Verifica se a linha não está vazia
                    lista.add(linha);
                }
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.", e.getMessage());
        }
        return lista.toString();
    }

}



