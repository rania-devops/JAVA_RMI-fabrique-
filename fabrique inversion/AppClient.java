// Importer la classe de gestion du registre RMI et l'interface
package fabrique;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AppClient {
    public static void main(String[] args) throws Exception {
        // Obtenir une référence vers le registre RMI sur localhost et le port 108
        Registry registry = LocateRegistry.getRegistry("localhost", 108);

        // Rechercher la fabrique d'objets dans le registre sous le nom "Factory"
        FabriqueInterface factory = (FabriqueInterface) registry.lookup("Factory");

        // Créer une instance de l'interface distante AppInterface à partir de la fabrique
        AppInterface app = factory.createAppInstance();

        // Appeler la méthode distante Reverse et afficher le résultat
        System.out.println(app.Reverse("bonjour"));
    }
}
