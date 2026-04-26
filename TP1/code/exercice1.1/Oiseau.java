package exercice1.1;

public class Oiseau extends Animal {

    public Oiseau(String nom) {
        super(nom);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " chante.");
    }

    // Méthode demandée dans l'énoncé
    public void voler() {
        System.out.println("L'oiseau vole.");
    }
}
