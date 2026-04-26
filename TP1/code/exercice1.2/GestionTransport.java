package exercice1.2;

public class GestionTransport {

    public static void main(String[] args) {

        // Polymorphisme : références de type Vehicule
        Vehicule maVoiture = new Voiture("Toyota", "Corolla", 2021, 4);
        Vehicule monCamion = new Camion("Volvo", "FMX", 2019, 12.5);
        Vehicule maMoto = new Moto("Yamaha", "MT-07", 2022, "Sport");

        // Appel polymorphique
        maVoiture.afficherDetails();
        monCamion.afficherDetails();
        maMoto.afficherDetails();
    }
}
