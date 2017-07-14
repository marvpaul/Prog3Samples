package JavaFX.Base;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * Hello JavaFX
 */
public class Main extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Hello World");
		Label txt = new Label("Hello World :)");
		Scene sc = new Scene(txt);
		primaryStage.setScene(sc);
		primaryStage.show();
	}
}
