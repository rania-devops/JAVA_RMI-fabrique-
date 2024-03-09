package fabrique;

// Importation des exceptions RMI et de la classe UnicastRemoteObject
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Implémentation de l'interface distante AppInterface
public class AppImpl extends UnicastRemoteObject implements AppInterface {
    
    // Constructeur de la classe, déclare qu'elle peut lancer une RemoteException
    protected AppImpl() throws RemoteException {
        super();
    }

    // Implémentation de la méthode distante Reverse de l'interface
    @Override
    public String Reverse(String str) throws RemoteException {
        // Utilisation de StringBuilder pour inverser la chaîne de caractères
        return new StringBuilder(str).reverse().toString();
    }
}

