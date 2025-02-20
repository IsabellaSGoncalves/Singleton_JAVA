package singleton;

public class TesteFileConnection {

public static void main(String[] args) {

    FileConnection arquivo = FileConnection.getInstance("C:\\Users\\Pichau\\Downloads\\teste.txt");
    System.out.println(arquivo.getArquivo());
}

}
