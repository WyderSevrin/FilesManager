
import filemanager.MainWindows;
import javafx.application.Application;
import javafx.stage.Stage;



/**
 * Permet de lancer l'application
 * @author Sevrin
 */
public class Main extends Application{
    public static int main(String[] args) {
        MainWindows main = new MainWindows();
        main.main(args);
        return 0;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
