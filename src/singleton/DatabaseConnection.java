/**
 *
 */
package singleton;

/**
 *
 */
public class DatabaseConnection {
    //instância única do Singleton
    private static DatabaseConnection instance;

    //construtor privado
    private DatabaseConnection() {
        System.out.println("Conexão com o banco de dados estabelecida");
    }

    //método público para obter a instância única, get
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        System.out.println("Método getInstance executado");
        return instance;
    }

    //método que simula uma operação no banco de dados
    public void executeQuery(String query) {
        System.out.println("Executando Query: " + query);
    }

}
