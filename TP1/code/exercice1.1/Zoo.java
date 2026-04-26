package exercice1.1;

public class Zoo {
    public static void main(String[] args) {

        Animal tigre = new Mammifere("Tigre");
        Animal perroquet = new Oiseau("Perroquet");

        tigre.faireDuBruit();        // Tigre grogne.
        perroquet.faireDuBruit();    // Perroquet chante.

        // Utilisation de voler() après conversion
        Oiseau oiseau = (Oiseau) perroquet;
        oiseau.voler();
    }
}
