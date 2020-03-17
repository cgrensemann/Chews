package controller;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {
	
	private Stage stage;
	
	public MainController(Stage stage) {
		this.stage = stage;
	}
	
	public Stage getStage() {
		return stage;
	}
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	public void showMenu() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/menu.fxml"));
        Scene scene = new Scene(root, 1280, 720);
        stage.setTitle("Chews");
        stage.setScene(scene);
        stage.show();
	}
	
	public void showField() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/field.fxml"));
        Scene scene = new Scene(root, 1280, 720);
        stage.setTitle("Chews");
        stage.setScene(scene);
        stage.show();
	}
}
