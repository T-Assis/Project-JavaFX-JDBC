package controller;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable{

	@FXML
	private TextField textFieldId;
	
	@FXML
	private TextField textFieldName;
	
	@FXML
	private Label labelErrorName;
	
	@FXML
	private Button buttonSave;
	
	@FXML
	private Button buttonCancel;
	
	@FXML
	public void onButtonSaveAction() {
		System.out.println("onButtonSaveAction");
	}
	
	@FXML
	public void onButtonCancelAction() {
		System.out.println("onButtonCancelAction");
	}
	
	
	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		initializeNodes();
	}

	private void initializeNodes() {
		Constraints.setTextFieldInteger(textFieldId);
		Constraints.setTextFieldMaxLength(textFieldName, 30);
	}
	
}
