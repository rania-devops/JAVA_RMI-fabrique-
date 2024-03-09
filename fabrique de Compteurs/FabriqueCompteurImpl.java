package compteur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Implémentation de l'interface FabriqueCompteur
public class FabriqueCompteurImpl extends UnicastRemoteObject implements FabriqueCompteurInterface {
    public FabriqueCompteurImpl() throws RemoteException {
        super();
    }

    @Override
    public CompteurInterface createCompteur() throws RemoteException {
        return new CompteurImpl();
    }
}
