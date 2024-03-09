package banque;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Interface décrivant les opérations qu'un compte bancaire doit supporter à distance
public interface CompteBancaireInterface extends Remote {
    void deposer(double montant) throws RemoteException;
    void retirer(double montant) throws RemoteException;
    double getSolde() throws RemoteException;
}
