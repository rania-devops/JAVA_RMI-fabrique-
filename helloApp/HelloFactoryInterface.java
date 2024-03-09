import java.rmi.Remote;
import java.rmi.RemoteException;

// Interface de la fabrique d'objets qui déclare la méthode pour créer des objets distants.
public interface HelloFactoryInterface extends Remote {
    // Méthode pour créer et retourner une instance de l'objet distant.
    public HelloInterface createHelloObject() throws RemoteException;
}
