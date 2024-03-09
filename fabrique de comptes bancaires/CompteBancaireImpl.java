package banque;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Implémentation de l'interface CompteBancaire
public class CompteBancaireImpl extends UnicastRemoteObject implements CompteBancaireInterface {
    private double solde;

    public CompteBancaireImpl() throws RemoteException {
        super();
        this.solde = 0.0;
    }

    @Override
    public void deposer(double montant) throws RemoteException {
        this.solde += montant;
    }

    @Override
    public void retirer(double montant) throws RemoteException {
        if (montant <= this.solde) {
            this.solde -= montant;
        } else {
            System.out.println("Solde insuffisant");
        }
    }

    @Override
    public double getSolde() throws RemoteException {
        return this.solde;
    }
}
