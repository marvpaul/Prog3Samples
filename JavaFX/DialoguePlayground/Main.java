package JavaFX.DialoguePlayground;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Optional;

/**
 * This is a playground for some simple javafx dialogues and alerts
 */
public class Main extends Application{
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Dialogue Playground");

		VBox div = new VBox(10);

		Button informationButton = new Button("Information");
		informationButton.setOnAction(event -> informationAlert("This is an information"));

		Button confirmationButton = new Button("Confirmation");
		confirmationButton.setOnAction(event -> confirmationAlert());

		Button textInputButton = new Button("Textinput");
		textInputButton.setOnAction(event -> textInputDialogue());

		Button choiceButton = new Button("Choice");
		choiceButton.setOnAction(event -> choiceDialogue());

		MenuBar mb = new MenuBar();
		Menu menu = new Menu("Menu");
		MenuItem mI = new MenuItem("Quit");
		mI.setOnAction(event -> System.exit(0));
		mb.getMenus().add(menu);
		menu.getItems().addAll(mI);

		div.getChildren().addAll(mb, informationButton, confirmationButton, textInputButton, choiceButton);

		Scene sc = new Scene(div);
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	public void informationAlert(String myPersonalText){
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Information");
		alert.setContentText(myPersonalText);
		alert.showAndWait();
	}

	public void confirmationAlert(){
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Confirmation");
		alert.setContentText("Do you really wanna to exit this nice playground?");
		ButtonType yes = new ButtonType("Yes");
		ButtonType no = new ButtonType("No");
		alert.getButtonTypes().addAll(yes, no);
		Optional<ButtonType> res = alert.showAndWait();
		if(res.get() == yes){
			System.exit(0);
		}
	}

	public void textInputDialogue(){
		TextInputDialog dialogue = new TextInputDialog("Your text");
		dialogue.setTitle("Enter a text");
		dialogue.setContentText("Just enter any text you want!");
		dialogue.setHeaderText("Here we go!");

		Optional<String> text = dialogue.showAndWait();
		informationAlert(text.get());
	}

	public void choiceDialogue(){
		ArrayList<String> choices = new ArrayList<>();
		choices.add("Exit");
		choices.add("Continue playing");
		ChoiceDialog<String> dialogue = new ChoiceDialog<String>("Make a choice", choices);
		dialogue.setTitle("Make a choice");
		dialogue.setContentText("Just select sth");
		dialogue.setHeaderText("Here we go!");

		Optional<String> text = dialogue.showAndWait();
		if(text.get().equals("Exit")){
			System.exit(0);
		}
	}
}
