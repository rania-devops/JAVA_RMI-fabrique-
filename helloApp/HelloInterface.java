import java.rmi.Remote;
import java.rmi.RemoteException;

// Cette interface déclare les méthodes distantes que le client peut appeler sur les objets distants.
public interface HelloInterface extends Remote {
    // Méthode distante qui retourne un message de salutation.
    public String sayHello() throws RemoteException;
}
