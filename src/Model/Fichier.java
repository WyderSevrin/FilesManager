/*
Class model d'un fichier

l'utilisation du framework NIO2 pour modifier le fichier
*/
package Model;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Fichier {
    private String nom;
    private Path chemin;

    public Fichier(String chemin, String nom){
        this.nom = nom;
        this.chemin = Paths.get(chemin);
    }
    
    public Fichier(File f){
        this.nom = f.getName();
        this.chemin = Paths.get(f.getAbsolutePath());
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Path getChemin() {
        return chemin;
    }

    public void setChemin(Path chemin) {
        this.chemin = chemin;
    }
}
