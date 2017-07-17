package JavaFX.Graphics;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Draw a simple ellipse / circle filled with black using a canvas
 */
public class SimpleCircleCanvas extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group gr = new Group();
		Canvas can = new Canvas(100, 100);
		can.getGraphicsContext2D().setFill(Color.BLACK);
		can.getGraphicsContext2D().fillOval(50, 50, 50, 50);
		gr.getChildren().addAll(can);
		Scene sc = new Scene(gr);
		primaryStage.setScene(sc);
		primaryStage.show();
	}
}
