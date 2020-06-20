/*
 * Permet de crypter un fichier par la méthode de vigenere
 */
package Controller.Crypto;

import java.util.ArrayList;

/**
 *
 * @author Sevrin
 */
public class Vigenere {
    
    public Vigenere(){
        
    }
    
    /**
     * Permet d'encoder un String grâce à une clé
     * @param content le String a modifier
     * @param key les clé utiliser pour modifier le String
     * @return String, le String en entrée modifier
     */
    public String encode(String content, ArrayList<Integer> key){
        String res ="";
        Caesar ces = new Caesar();
        int i =0;
        for(char c : content.toCharArray()){
            res+=ces.encode(c+"", key.get(i));
            if((i+1)>=key.size()){
                i=0;
            }else{
                i++;
            }
        }
        return res;
    }
    
    /**
     * Permet de décoder un String grâce à uen clé
     * @param content le String a modifier
     * @param key les clé utiliser pour modifier le String
     * @return String, le String en entrée modifier
     */
    public String decode(String content, ArrayList<Integer> key){
       String res ="";
        Caesar ces = new Caesar();
        int i =0;
        for(char c : content.toCharArray()){
            res+=ces.decode(c+"", key.get(i));
            if((i+1)>=key.size()){
                i=0;
            }else{
                i++;
            }
        }
        return res;
    }
}
