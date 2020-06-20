/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
