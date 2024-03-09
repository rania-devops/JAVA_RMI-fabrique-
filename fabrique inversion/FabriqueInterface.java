package fabrique;

// Importation des classes RMI nécessaires
import java.rmi.Remote;
import java.rmi.RemoteException;

// Déclaration de l'interface distante FabriqueInterface étendant l'interface Remote
public interface FabriqueInterface extends Remote {

    // Signature de la méthode distante createAppInstance
    // Cette méthode permet la création d'une instance de l'interface distante AppInterface
    public AppInterface createAppInstance() throws RemoteException;
}
