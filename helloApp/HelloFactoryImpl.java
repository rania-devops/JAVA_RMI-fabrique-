import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Implémentation de la fabrique d'objets qui crée des instances de l'objet distant.
public class HelloFactoryImpl extends UnicastRemoteObject implements HelloFactoryInterface {
    public HelloFactoryImpl() throws RemoteException {
        super();
    }

    // Implémentation de la méthode de la fabrique pour créer et retourner un objet distant.
    public HelloInterface createHelloObject() throws RemoteException {
        return new HelloImpl();
    }
}
