import java.util.Scanner;

// Classe etudiant
class etudiant {

    private String CodeE;
    private String Nom;
    private String Prenom;
    private int Age;
    private String Ville;

    // Constructeur par défaut
    public etudiant() {
    }

    // Constructeur avec paramètres
    public etudiant(String CodeE, String Nom, String Prenom, int Age, String Ville) {
        this.CodeE = CodeE;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Age = Age;
        this.Ville = Ville;
    }

    // Getters et setters
    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    // Saisie d'un étudiant
    public void saisirE() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer le CodeE :");
        CodeE = sc.next();

        System.out.println("Entrer le Nom :");
        Nom = sc.next();

        System.out.println("Entrer le Prenom :");
        Prenom = sc.next();

        System.out.println("Entrer l'Age :");
        Age = sc.nextInt();

        System.out.println("Entrer la Ville :");
        Ville = sc.next();
    }

    // Affichage d'un étudiant
    public void afficherE() {
        System.out.println("CodeE : " + CodeE);
        System.out.println("Nom : " + Nom);
        System.out.println("Prenom : " + Prenom);
        System.out.println("Age : " + Age);
        System.out.println("Ville : " + Ville);
    }
}

// Classe principale
public class testetudiant {

    // Recherche de l'étudiant le plus âgé
    public static void plusGrand(etudiant[] tab) {

        int max = tab[0].getAge();
        int indice = 0;

        for (int i = 1; i < tab.length; i++) {

            if (tab[i].getAge() > max) {
                max = tab[i].getAge();
                indice = i;
            }
        }

        System.out.println("L'etudiant le plus age est :");
        tab[indice].afficherE();
    }

    // Programme principal
    public static void main(String[] args) {

        // Création du tableau de 3 étudiants
        etudiant[] tab = new etudiant[3];

        // Saisie des étudiants
        System.out.println("Entrer les 3 etudiants :");

        for (int i = 0; i < 3; i++) {
            tab[i] = new etudiant();
            tab[i].saisirE();
        }

        // Affichage du tableau
        System.out.println("\nAffichage du tableau :");

        for (int i = 0; i < 3; i++) {
            tab[i].afficherE();
        }

        // Affichage de la longueur du tableau
        System.out.println("\nLongueur du tableau :");
        System.out.println(tab.length);

        // Modification du deuxième étudiant
        tab[1].setNom("BenAli");
        tab[1].setPrenom("Sami");

        // Affichage après modification
        System.out.println("\nAffichage du tableau apres modification :");

        for (int i = 0; i < 3; i++) {
            tab[i].afficherE();
        }

        // Création d'un étudiant avec le constructeur paramétré
        System.out.println("\nAffichage de l'etudiant parametre :");

        etudiant e = new etudiant("E10", "Trabelsi", "Ahmed", 22, "Tunis");
        e.afficherE();

        // Recherche de l'étudiant le plus âgé
        System.out.println("\nRecherche de l'etudiant le plus age :");
        plusGrand(tab);
    }
}