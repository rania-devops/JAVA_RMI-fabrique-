package banque;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Interface décrivant les opérations pour créer des instances de CompteBancaire
public interface FabriqueCompteBancaireInterface extends Remote {
    CompteBancaireInterface createCompteBancaire() throws RemoteException;
}
