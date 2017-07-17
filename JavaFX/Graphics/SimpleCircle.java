package JavaFX.Graphics;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;


/**
 * Draw a simple ellipse / circle filled with black
 */
public class SimpleCircle extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Ellipse ellipse = new Ellipse(50, 50);
		ellipse.setFill(Color.BLACK);
		ellipse.setCenterX(50);
		ellipse.setCenterY(50);
		Group gr = new Group();
		gr.getChildren().addAll(ellipse);
		Scene sc = new Scene(gr);
		primaryStage.setWidth(150);
		primaryStage.setHeight(150);
		primaryStage.setScene(sc);
		primaryStage.show();

	}
}
