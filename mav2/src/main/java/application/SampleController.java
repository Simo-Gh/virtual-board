package application;

import java.awt.Button;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;


public class SampleController implements Initializable {
	
	@FXML
	private Button mode_manuelle ;
	
	@FXML
	private AnchorPane rootPane;
	
	//event listener on button mode_manuelle 
	@FXML
	private void button_mode_manuelle(ActionEvent event) throws IOException {
		AnchorPane pane =(AnchorPane)FXMLLoader.load(getClass().getResource("/manuelle2.fxml"));
		rootPane.getChildren().setAll(pane);
	}
	
	@SuppressWarnings("unused")
	private void button_mode_automatique(ActionEvent event) throws IOException {
		AnchorPane pane =(AnchorPane)FXMLLoader.load(getClass().getResource("/automatique.fxml"));
		rootPane.getChildren().setAll(pane);
	}

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
}
