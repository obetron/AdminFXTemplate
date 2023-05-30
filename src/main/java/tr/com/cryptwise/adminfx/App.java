package tr.com.cryptwise.adminfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author obetron
 * @date 27.05.2023 - 21:00
 */
public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/MainTemplate.fxml"));
        Scene rootScene = new Scene(root);
        stage.setResizable(false);
        stage.setTitle("AdminFX Template");
        stage.setScene(rootScene);
        stage.show();
    }
}