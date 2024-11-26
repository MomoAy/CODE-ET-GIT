public class GestionnaireNotes {

    // Affiche note et moyennes
    /
     * affiche le nom de l'étudiant et toutes ses notes
     * 
     * @param nomEtudiant le nom de l'eutiant
     * @param notes tableau contenant les notes de l'étudiant
     */
    public void afficherNotes(String nomEtudiant, int[] notes) 
    {
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    /
     * 
     * calcule la somme des notes d'un étudiant
     * @param notes tableau contenant les notes de l'étudiant
     * @return la somme des notes d'un élève
     */
    public int  calculersomme(int[] notes) {
        int somme = 0;// variable qui va contenir la somme des notes
        for (int note : notes) {//calculer la somme des notes de l'étudiant
            somme += note;
        }
        return somme;
    }

    /**
     * affiche la moyenne d'un etidiant
     * 
     * @param notes tableau contenant les notes de l'étudiant
     * @param nomEtudiant le nom de l'eutiant
     */
       public void afficherMoyenne(String nomEtudiant,int[] notes){
        double moyenne = calculersomme(notes)/ notes.length;
        System.out.println("Moyenne de " + nomEtudiant + ":" + moyenne);
       }
        
    }
}