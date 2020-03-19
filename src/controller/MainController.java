package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
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
		Button btn_start = new Button();
		btn_start.setText("Start Game");
		btn_start.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Starting...");
				try {
					showField();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Button btn_exit = new Button();
		btn_exit.setText("Exit");
		btn_exit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
			}
		});
        HBox root = new HBox();
        root.setAlignment(Pos.CENTER);
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().add(btn_start);
        vbox.getChildren().add(btn_exit);
        root.getChildren().add(vbox);
		Scene scene = new Scene(root, 600, 600);
        
        stage.setTitle("Chews");
        stage.setScene(scene);
        stage.show();
	}
	
	public void showField() throws IOException {
		GridPane grid = new GridPane();
		Label testlabel = new Label("TestLabel");
		grid.add(testlabel, 7, 7);
		HBox root = new HBox();
		HBox menu = new HBox();
		menu.setAlignment(Pos.TOP_CENTER);
		grid.setAlignment(Pos.CENTER);
		
		root.getChildren().add(grid);
		root.getChildren().add(menu);
        Scene scene = new Scene(root, 600, 600);
        stage.setTitle("Chews");
        stage.setScene(scene);
        stage.show();
	}
}
