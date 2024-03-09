package fabrique;
// Importation des classes RMI nécessaires
import java.rmi.Remote;
import java.rmi.RemoteException;

// Déclaration de l'interface distante AppInterface étendant l'interface Remote
public interface AppInterface extends Remote {

    // Signature de la méthode distante Reverse que le client peut appeler à distance
    // Elle prend une chaîne de caractères en entrée et renvoie une chaîne inversée
    public String Reverse(String str) throws RemoteException;
}
