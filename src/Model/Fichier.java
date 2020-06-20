/*
Class model d'un fichier

l'utilisation du framework NIO2 pour traitr/modifier un fichier
*/
package Model;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Fichier {
    private String nom;
    private Path chemin;
    
    /**
     * Constructeur
     * @param chemin String
     * @param nom  String
     */
    public Fichier(String chemin, String nom){
        this.nom = nom;
        this.chemin = Paths.get(chemin);
    }
    
    /**
     * Constructeur
     * @param f objet de type File
     */
    public Fichier(File f){
        this.nom = f.getName();
        this.chemin = Paths.get(f.getAbsolutePath());
    }

    /**
     * Getteur pour le nom du fichier
     * @return String
     */
    public String getNom() {
        return nom;
    }
    
    /**
     * Setteur pour le nom du fichier
     * @param nom  String
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getteur du chemin du fichier
     * @return objet de type Path
     */
    public Path getChemin() {
        return chemin;
    }

    /**
     * Setteur du chemin
     * @param chemin objet de type Path
     */
    public void setChemin(Path chemin) {
        this.chemin = chemin;
    }
}
