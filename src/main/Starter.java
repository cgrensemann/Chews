package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Starter extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Test");
		Button btn = new Button();
		btn.setText("Hello World");
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		stage.setScene(new Scene(root, 1280, 720));
		stage.show();
	}

}
