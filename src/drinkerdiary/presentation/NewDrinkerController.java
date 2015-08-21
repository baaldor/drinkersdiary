/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkerdiary.presentation;

import drinkerdiary.presentation.util.FXMLFormControllerImpl;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import drinkerdiary.Core.Drinker;

/**
 *
 * @author BaalDor
 */
public class NewDrinkerController extends FXMLFormControllerImpl<Drinker> {
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="drinkersName"
    private TextField drinkersName; // Value injected by FXMLLoader
    
    @FXML // fx:id="cancelButton"
    private Button cancelButton; // Value injected by FXMLLoader

    @FXML // fx:id="detailsLabel"
    private Label detailsLabel; // Value injected by FXMLLoader

    @FXML // fx:id="okButton"
    private Button okButton; // Value injected by FXMLLoader

    @FXML // fx:id="okParent"
    private HBox okParent; // Value injected by FXMLLoader

    @FXML // fx:id="messageLabel"
    private Label messageLabel; // Value injected by FXMLLoader
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'CreateNewDrinker.fxml'.";
        assert detailsLabel != null : "fx:id=\"detailsLabel\" was not injected: check your FXML file 'CreateNewDrinker.fxml'.";
        assert okButton != null : "fx:id=\"okButton\" was not injected: check your FXML file 'CreateNewDrinker.fxml'.";
        assert okParent != null : "fx:id=\"okParent\" was not injected: check your FXML file 'CreateNewDrinker.fxml'.";
        assert messageLabel != null : "fx:id=\"messageLabel\" was not injected: check your FXML file 'CreateNewDrinker.fxml'.";
        
        this.drinkersName.setText(this.getDependency().getName());
    }
    
    @Override
    public void performOkButtonWork() {
        Drinker drinker = this.getDependency();
        drinker.setName(this.drinkersName.getText());
    }
    
}
