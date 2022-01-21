


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	private Button b1, b2, b3, b4, b5, b6;
	private Label label;
	private TextField textField;
	private HBox hBox1, hBox2;
	
	//student Task #4:
	//  declare an instance of DataManager
	private DataManager dataManager;

	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons
		b1 = new Button("Hello");
		b2 = new Button("Howdy");
		b3 = new Button("Chinese");
		b4 = new Button("Clear");
		b5 = new Button("Exit");
		b6 = new Button("French");
		//  instantiate the label
		label = new Label("Feedback:");
		//  instantiate the textfield
		textField = new TextField();
		//  instantiate the HBoxes
		hBox1 = new HBox();
		hBox2 = new HBox();

		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		hBox1.getChildren().addAll(label, textField);
		//  add the buttons to the other HBox
		hBox2.getChildren().addAll(b1, b2, b3, b6, b4, b5);
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(hBox1, hBox2);
		
		//student Task #4:
		//  instantiate the DataManager instance
		dataManager = new DataManager();
		//  set margins and set alignment of the components
		Insets inset = new Insets(10);

		// task #4
		HBox.setMargin(b1, inset);
		HBox.setMargin(b2, inset);
		HBox.setMargin(b3, inset);
		HBox.setMargin(b4, inset);
		HBox.setMargin(b5, inset);

		hBox1.setAlignment(Pos.CENTER);
		hBox2.setAlignment(Pos.CENTER);

		ButtonListener buttonListener = new ButtonListener();
		b1.setOnAction(buttonListener);
		b2.setOnAction(buttonListener);
		b3.setOnAction(buttonListener);
		b4.setOnAction(buttonListener);
		b5.setOnAction(buttonListener);
		b6.setOnAction(buttonListener);



		


	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	class ButtonListener implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event) {
			Object source = event.getTarget();
			if (source == b1)
			{
				textField.setText(dataManager.getHello());
				System.out.println(textField.getText());
			}
			else if(source == b2)
			{
				textField.setText(dataManager.getHowdy());
				System.out.println(textField.getText());
			}
			else if(source == b3)
			{
				textField.setText(dataManager.getChinese());
				System.out.println(textField.getText());
			}
			else if(source == b4)
			{
				textField.setText("");
			}
			else if(source == b5)
			{
				Platform.exit();
				System.exit(0);
			}
			else if(source == b6)
			{
				textField.setText(dataManager.getFrench());
				System.out.println(textField.getText());
			}
		}
	}
}
	
