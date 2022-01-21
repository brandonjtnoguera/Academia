


import java.io.IOException;

import com.sun.webkit.dom.XPathResultImpl;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class FXDriver extends Application {
	   
	/**
	 * The main method for the GUI example program JavaFX version
	 * @param args not used
	 * @throws IOException
	 */
	public static void main(String[] args) {
		launch(args);   
	}
		   
	@Override
	public void start(Stage stage) throws IOException {
		//student Task #1:
		//  instantiate the FXMainPane, name it root
		//  set the scene to hold root
		
		FXMainPane root = new FXMainPane();
		stage.setScene(new Scene(root, 400, 400));
		//set stage title
		stage.setTitle("Hello World GUI");
		//display the stage
		stage.show();





	}
}
