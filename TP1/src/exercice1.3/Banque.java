package exercice1.3;

public class Banque {

    public static void main(String[] args) {

        CompteBancaire compte1 = new CompteBancaire("CB1001", 1000);
        CompteEpargne compte2 = new CompteEpargne("CE2001", 2000);

        compte1.deposer(500);
        compte1.retirer(300);

        compte2.deposer(400);
        compte2.calculerInterets(0.05);

        System.out.println("Solde Compte Bancaire : " + compte1.getSolde());
        System.out.println("Solde Compte Epargne : " + compte2.getSolde());
    }
}
