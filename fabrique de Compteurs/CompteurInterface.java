package compteur;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Interface décrivant les opérations qu'un compteur doit supporter à distance
public interface CompteurInterface extends Remote {
    void increment() throws RemoteException;
    int getValue() throws RemoteException;
}
