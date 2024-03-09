package fabrique;
// Importation des classes RMI nécessaires
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FabImpl extends UnicastRemoteObject implements FabriqueInterface {
    
    // Constructeur de la classe, déclare qu'elle peut lancer une RemoteException
    protected FabImpl() throws RemoteException {
        super();
    }

    // Implémentation de la méthode distante createAppInstance de l'interface FabriqueInterface
    @Override
    public AppInterface createAppInstance() throws RemoteException {
        // Créez et retournez une instance de l'interface distante AppInterface
        return new AppImpl();
    }
}

