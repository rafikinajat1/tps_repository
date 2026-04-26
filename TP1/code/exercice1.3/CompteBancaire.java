package exercice1.3;

public class CompteBancaire {

    protected String numeroCompte;
    protected double solde;

    public CompteBancaire(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public void deposer(double montant) {
        solde += montant;
        System.out.println("Dépôt de " + montant + " effectué.");
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " effectué.");
        } else {
            System.out.println("Solde insuffisant.");
        }
    }

    public double getSolde() {
        return solde;
    }
}
