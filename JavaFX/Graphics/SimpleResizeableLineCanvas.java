package JavaFX.Graphics;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Draw a simple line using a canvas
 * Also make this line responsive, so the length will depends on window size
 */
public class SimpleResizeableLineCanvas extends Application {
	private final double INITIAL_SIZE = 100;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group gr = new Group();
		Canvas can = new Canvas(INITIAL_SIZE, INITIAL_SIZE);
		can.getGraphicsContext2D().setStroke(Color.GREEN);
		can.getGraphicsContext2D().strokeLine(0, 0, INITIAL_SIZE, INITIAL_SIZE);
		gr.getChildren().addAll(can);
		Scene sc = new Scene(gr);
		primaryStage.setScene(sc);
		primaryStage.show();

		//Set line resizeable
		sc.widthProperty().addListener((observable, oldValue, newValue) -> {
			can.setWidth((double)newValue);
			can.getGraphicsContext2D().clearRect(0, 0, can.getWidth(), can.getHeight());
			can.getGraphicsContext2D().strokeLine(0, 0, can.getWidth(), can.getHeight());
		});

		sc.heightProperty().addListener((observable, oldValue, newValue) -> {
			can.setHeight((double)newValue);
			can.getGraphicsContext2D().clearRect(0, 0, can.getWidth(), can.getHeight());
			can.getGraphicsContext2D().strokeLine(0, 0, can.getWidth(), can.getHeight());
		});

	}
}
