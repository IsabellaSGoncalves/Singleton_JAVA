/**
 *
 */
package singleton;


/**
 *
 */
public class ConfigManager {

    // atributo privado
    private static ConfigManager instance;
    private String properties="\n app.name=Sistema Empresarial" + "\n app.version=1.0" +  "\n app.language=pt-BR" + "\n currency=BRL" + "\n timeout=300 segundos";

    // método construtor privado
    private ConfigManager() {

    }

    // método static get

    public static ConfigManager getInstance() {
        if(instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public String getProperties() {
        return properties;
    }
}
