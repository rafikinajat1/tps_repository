package exercice1.3;

public class CompteEpargne extends CompteBancaire {

    public CompteEpargne(String numeroCompte, double solde) {
        super(numeroCompte, solde);
    }

    public void calculerInterets(double taux) {
        double interets = solde * taux;
        solde += interets;
        System.out.println("Intérêts ajoutés : " + interets);
    }
}
