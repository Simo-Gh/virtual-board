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


public class ManuelleController implements Initializable {
	
	@FXML
	private Button mode_manuelle ;
	
	@FXML
	private AnchorPane rootPane_manuelle;
	
	//event listener on button mode_manuelle 
	@FXML
	private void button_retour_menu(ActionEvent event) throws IOException {
		AnchorPane pane =(AnchorPane)FXMLLoader.load(getClass().getResource("/principale2.fxml"));
		rootPane_manuelle.getChildren().setAll(pane);
	}

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
}