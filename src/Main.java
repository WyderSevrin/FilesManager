
import Controller.Crypto.Caesar;
import Controller.Crypto.Vigenere;
import filemanager.MainWindows;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sevrin
 */
public class Main extends Application{
    public static int main(String[] args) {
        MainWindows main = new MainWindows();
        main.main(args);
        
        
//        Caesar ces = new Caesar();
//        String encoded = ces.encode("Voilazz~", 10);
//        
//        System.out.println("Encode :"+encoded);
//        String decoded = ces.decode(encoded, 10);
//        System.out.println("Encode :"+decoded);
//
//           Vigenere vig= new Vigenere();
//           ArrayList<Integer> key = new ArrayList<>();
//           key.add(3);key.add(0);key.add(3);
//           String encoded=vig.encode("Voilazz",key);
//           System.out.println("Encode :"+encoded);
//           String decoded=vig.decode(encoded,key);
//           System.out.println("Encode :"+decoded);


        return 0;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
