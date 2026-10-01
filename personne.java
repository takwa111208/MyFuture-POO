public class personne {
    private int cin;
    private String nom;
    private String prenom;
    private String adresse;
    private int  age;
    // constructeur paramétré
    public personne (int cin,String nom, String prenom, String adresse, int age){
this.cin= cin;
this.nom= nom;
this.prenom= prenom;
this.adresse= adresse;
this.age= age;   
}
public int getcin(){
    return cin;
}
public void setcin (int cin){
    this.cin=cin;
}
public void afficher(){
    System.out.println(cin);
    System.out.println(nom);
    System.out.println(prenom);
    System.out.println(adresse);
    System.out.println(age);
}

}