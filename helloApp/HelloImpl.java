import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Implémentation de l'interface distante.
public class HelloImpl extends UnicastRemoteObject implements HelloInterface {
    public HelloImpl() throws RemoteException {
        super();
    }

    // Implémentation de la méthode distante pour retourner un message de salutation.
    public String sayHello() throws RemoteException {
        return "Hello, World!";
    }
}
