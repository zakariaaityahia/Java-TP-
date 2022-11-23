package ma.education.heitage;

public class Test {
    public static void main(String[] args) {
        Personne p1 = new Etudiant(); // true cuz we declared the object with Personne
        Personne p2 = new Professuer(); // true cuz we declared the object wuth Personne
        Personne p3 = new Personne(); // cuz we created new object declared with same class
        //Etudiant e1 = new Professuer(); //
        //Professuer p4 = new Etudiant(); //
        Etudiant e2 = (Etudiant) p1;
        Professuer p5 = (Professuer) p2;


        //System.out.println(p1.note);
        System.out.println(e2.note);
        //System.out.println(p2.salaire);
        System.out.println(p5.salaire);
    }
}
