package fabrique;
// Importation des classes RMI nécessaires
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AppServer {
    public static void main(String[] args) throws Exception {
        // Création du registre RMI sur le port 108
        Registry registry = LocateRegistry.createRegistry(108);

        // Création de l'implémentation de la fabrique d'objets
        FabriqueInterface factory = new FabImpl();

        // Enregistrement de la fabrique dans le registre RMI sous le nom "Factory"
        registry.rebind("Factory", factory);

        // Affichage d'un message indiquant que le serveur est prêt
        System.out.println("Serveur prêt.");
    }
}
