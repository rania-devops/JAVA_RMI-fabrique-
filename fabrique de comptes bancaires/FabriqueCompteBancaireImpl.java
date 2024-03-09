package banque;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Implémentation de l'interface FabriqueCompteBancaire
public class FabriqueCompteBancaireImpl extends UnicastRemoteObject implements FabriqueCompteBancaireInterface {
    public FabriqueCompteBancaireImpl() throws RemoteException {
        super();
    }

    @Override
    public CompteBancaireInterface createCompteBancaire() throws RemoteException {
        return new CompteBancaireImpl();
    }
}
