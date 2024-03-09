package compteur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Implémentation de l'interface Compteur
public class CompteurImpl extends UnicastRemoteObject implements CompteurInterface {
    private int value;

    public CompteurImpl() throws RemoteException {
        super();
        this.value = 0;
    }

    @Override
    public void increment() throws RemoteException {
        this.value++;
    }

    @Override
    public int getValue() throws RemoteException {
        return this.value;
    }
}
