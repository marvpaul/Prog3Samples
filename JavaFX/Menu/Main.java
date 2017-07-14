package JavaFX.Menu;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * A simple javaFX Frame with menubar
 */
public class Main extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Hello World");

		VBox div = new VBox(0);
		Label txt = new Label("Hello World :)");
		MenuBar mb = new MenuBar();
		Menu menu = new Menu("Menu");
		MenuItem mI = new MenuItem("Quit");

		mI.setOnAction(event -> System.exit(0));
		mb.getMenus().add(menu);
		menu.getItems().addAll(mI);

		div.getChildren().addAll(mb, txt);

		Scene sc = new Scene(div);
		primaryStage.setScene(sc);
		primaryStage.show();
	}
}
