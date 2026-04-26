package exercice1.1;

public abstract class Animal {
    private String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    // Méthode abstraite
    public abstract void faireDuBruit();
}
