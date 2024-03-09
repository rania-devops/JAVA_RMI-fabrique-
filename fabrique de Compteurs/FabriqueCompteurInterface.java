package compteur;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Interface décrivant les opérations pour créer des instances de Compteur
public interface FabriqueCompteurInterface extends Remote {
    CompteurInterface createCompteur() throws RemoteException;
}
