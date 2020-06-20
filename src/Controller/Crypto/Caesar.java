/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Crypto;

/**
 *
 * @author Sevrin
 */
public class Caesar {
    public  Caesar(){
        
    }
    
    public String encode(String message,int val){
//        message = message.toLowerCase();
//        StringBuilder result = new StringBuilder();
//        for (char character : message.toCharArray()) {
//            if (character != ' ') {
//                int originalAlphabetPosition = character - 'a';
//                int newAlphabetPosition = (originalAlphabetPosition + val) % 26;
//                char newCharacter = (char) ('a' + newAlphabetPosition);
//                result.append(newCharacter);
//            } else {
//                result.append(character);
//            }
//        }
//        return result.toString();

        //de 33 a 126 inclue
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
    
    
    
    public String decode(String message,int val){
        return encode(message, -val);
    }
}
