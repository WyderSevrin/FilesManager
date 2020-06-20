package Controller;

import Controller.Crypto.Vigenere;
import Model.Fichier;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Cette classe permet de traiter tout les fonctionnaliter de l'application
 * Elle gère le cryptage/décryptage ainsi que la concatènation
 * @author Sevrin
 */
public class Manager {
    private ArrayList<Fichier> filesToDisplay;
    private ArrayList<Fichier> filesToTreat;
    private String fileOutpute;

    public Manager(){
        this.filesToDisplay = new ArrayList<>();
        this.fileOutpute = "ResultOutpute";
    }

    public Manager(ArrayList<Fichier> files){
        this.filesToDisplay = files;
        this.fileOutpute = "ResultOutpute";
    }

    public Manager(ArrayList<Fichier> files, String output){
        this.filesToDisplay = files;
        this.fileOutpute = output;
    }
    
    /**
     * Permet de changer l'ordre des fichiers d'une arrayList.
     * Fait avancer une objet en avant dans la liste
     * @param f objet de type Fichier
     */
    public void order_push_forward(Fichier f){
        int indexF1 = this.indexOfFiles(f);
        if(indexF1>0){
            Collections.swap(this.filesToDisplay, indexF1, indexF1-1);
        }
    }

    /**
     * Permet de changer l'ordre des fichiers d'une arrayList.
     * Fait reculer une objet en arrière dans la liste
     * @param f objet de type Fichier
     */
    public void order_push_backwards(Fichier f){
        int indexF1 = this.indexOfFiles(f);
        if(indexF1<this.filesToDisplay.size()-1){
            Collections.swap(this.filesToDisplay, indexF1, indexF1+1);
        }
    }

    /**
     * Permet de récupérer l'index d'un fichier situer dans l'arrayListe  
     * @param File objet de type Fichier
     * @return int
     */
    public int indexOfFiles(Fichier File){
        int counter =0;
        Boolean found = false;
        for(Fichier f : this.filesToDisplay){
            if(File.equals(f)){
                found = true;
                break;
            }else{
                counter++;
            }
        }
        return counter;
    }
    
    /**
     * Permet de récupérer l'index d'un fichier situer dans l'arrayListe  
     * @param name String
     * @return int
     */
    public int findIndex(String name){
        int index = 0;
        for(Fichier f : this.filesToDisplay){
            if(f.getNom() == name){
                index = indexOfFiles(f);
                break;
            }
        }
        return index;
    }

    /**
     * Permet de lancer la concatenation des fichiers de l'arrayListe
     * @throws IOException 
     */
    public void StartConcatene() throws IOException {
        Charset charset = Charset.forName("US-ASCII");
        String contenu = null;
        FileWriter writer;


        //Creation du fichier
        if(this.filesToTreat.size()>1){
            Path outpute =  Paths.get(this.fileOutpute);
            if(Files.exists(outpute)){
                outpute.toFile().delete();
            }
            try {
                Files.createFile(outpute);//creer le fichier s'il existe pas
            } catch (IOException e) {
                e.printStackTrace();
            }


            //Concatenation
            writer = new FileWriter(outpute.toFile(),true);
            for(Fichier f : this.filesToTreat){
                try(BufferedReader reader = Files.newBufferedReader(f.getChemin(), StandardCharsets.UTF_8)) {
                    while ((contenu = reader.readLine()) != null) {
                        //System.out.println(contenu);
                        writer.write(contenu+"\n");
                    }
                }

            }
            writer.close();
        }else{
            System.out.println("WARNING !! PAS De Fichier a concatener");
        }
        this.filesToTreat.clear();
    }
    
    /**
     * Permet de lancer l'algo de cryptage sur un fichier
     * @param f objet de type Fichier
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void Crypter(Fichier f) throws FileNotFoundException, IOException{
        Vigenere vig = new Vigenere();
        ArrayList<Integer> key = new ArrayList<>();
        key.add(3);key.add(6);key.add(1);key.add(4);
        ArrayList<String> lines = new ArrayList<>();
        
        
        File file = f.getChemin().toFile();
       
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            line = vig.encode(line, key);
            lines.add(line);
            
            System.out.println(line);
        }
        br.close();
        
        //on vide le fichier
        try {
            PrintWriter printwriter =
            new PrintWriter(new FileOutputStream(file));
            printwriter.print("");
            printwriter.close();
        }catch (Exception ex) {
            System.out.println("Error clear file"+f);
        }

        
        //Ecrire les lignes dans le fichier
        try {
            FileWriter writer = new FileWriter(f.getChemin().toFile(),true);
            int count =0;
            for(String str : lines){
                writer.write(str+"\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    /**
     * Permet de lancer l'algo de décryptage d'un fichier
     * @param f objet de type Fichier
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void Decrypter(Fichier f) throws FileNotFoundException, IOException{
        Vigenere vig = new Vigenere();
        ArrayList<Integer> key = new ArrayList<>();
        key.add(3);key.add(6);key.add(1);key.add(4);
        ArrayList<String> lines = new ArrayList<>();
        
        
        File file = f.getChemin().toFile();
       
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            line = vig.decode(line, key);
            lines.add(line);
            
            System.out.println(line);
        }
        br.close();
        
        //on vide le fichier
        try {
            PrintWriter printwriter =
            new PrintWriter(new FileOutputStream(file));
            printwriter.print("");
            printwriter.close();
        }catch (Exception ex) {
            System.out.println("Error clear file"+f);
        }

        
        //Ecrire les lignes dans le fichier
        try {
            FileWriter writer = new FileWriter(f.getChemin().toFile(),true);
            int count =0;
            for(String str : lines){
                writer.write(str+"\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    /**
     * permet d'ajouter un fichier
     * @param f objet de type Fichier
     */
    public void addFile(File f){
        
        this.filesToDisplay.add(new Fichier(f));
    }
    
    /**
     * Netoye la liste des fichiers
     */
    public void clear(){
        this.filesToDisplay.clear();
        
    }

    //************* Getteur and Setteur **************//
    public ArrayList<Fichier> getFilesToConcat() {
        return filesToDisplay;
    }

    public void setFilesToConcat(ArrayList<Fichier> filesToConcat) {
        this.filesToDisplay = filesToConcat;
    }
    
    public void setOutpute(String out){
        this.fileOutpute =out;
    }
    
    /**
     * Permet d'afficher la liste des fichiers dans la console
     */
    public void showFileList(){
        for(Fichier f : this.filesToDisplay){
            System.out.println(f.getNom());
        }
    }

    public void addFileToTreat(ArrayList<Fichier> listFilesToTreat) {
        this.filesToTreat = listFilesToTreat;
    }

    public void remove(Fichier file) {
        this.filesToDisplay.remove(file);
    }
}
