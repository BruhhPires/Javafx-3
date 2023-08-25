package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML                              // DECLARAÇÃO CORRESTPONDENTE AO CONTROLE VISUAL
	private Button btTest;

	@FXML
	public void onBtTestAction() {     // METODO DE ALERTA COM O SEUS ATRIBUTOS
		Alerts.showAlert("Alert Title", null, "Hello", AlertType.ERROR);
	}
}
