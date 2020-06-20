
package Controller.Crypto;

/**
 * Permet de crypter/d'écripter une ligne en utilisant l'algo de césar
 * Utiliser par la suite dans l'algo de vigenere
 * Encode que les caractères majuscules et minuscules ainsi que les différentes ponctuation et symbole;
 * N'encode pas les caractères spéciaux comme "DEL", "ESC", etc..
 * @author Sevrin
 */
public class Caesar {
    public  Caesar(){
        
    }
    
    /**
     * Permet d'encoder un String
     * @param message String
     * @param val int, clé
     * @return String encoder
     */
    public String encode(String message,int val){
        String result ="";
        for(char c : message.toCharArray()){
            if((int)c != 32){ //espace
                int ascii;
                if((int)c +val > 126){
                   ascii = (int)((c + val)-127)+33;
                   
                }else if((int)c +val<33){
                   ascii = 127-(33-(int)c -val); 
                   
                }else{
                   ascii = (int)c+val; 
                }
                result+=(char) ascii;
            }else{
                result+=c;
            }
            
        }

        return result;
    }
    
    
    /**
     * Permet de décoder
     * @param message String
     * @param val int, clé
     * @return String decoder
     */
    public String decode(String message,int val){
        return encode(message, -val);
    }
}
