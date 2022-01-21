import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class death extends Application
{

    Button button;

    public static void main(String[] args)
    {
        // Launch the app
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("hi");
        button = new Button();
        button.setText("Hi");
    }
}



