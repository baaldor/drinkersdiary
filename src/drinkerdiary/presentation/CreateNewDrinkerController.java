/**
 * Sample Skeleton for 'CreateNewDrinker.fxml' Controller Class
 */
package drinkerdiary.presentation;

import drinkerdiary.Core.Drinker;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CreateNewDrinkerController {

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

    @FXML
    void handleCancelButton(ActionEvent actionEvent) {
        // close the dialog.
        this.closeThisWindow(actionEvent);
    }

    @FXML
    void handleOkButton(ActionEvent actionEvent) {
        this.myDrinker.setName(this.drinkersName.getText());
        this.isOkClicked=true;
        this.closeThisWindow(actionEvent);
    }
    
    protected void closeThisWindow(ActionEvent actionEvent){
        // close the dialog.
        Node  source = (Node)  actionEvent.getSource(); 
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'CreateNewDrinker.fxml'.";
        assert detailsLabel != null : "fx:id=\"detailsLabel\" was not injected: check your FXML file 'CreateNewDrinker.fxml'.";
        assert okButton != null : "fx:id=\"okButton\" was not injected: check your FXML file 'CreateNewDrinker.fxml'.";
        assert okParent != null : "fx:id=\"okParent\" was not injected: check your FXML file 'CreateNewDrinker.fxml'.";
        assert messageLabel != null : "fx:id=\"messageLabel\" was not injected: check your FXML file 'CreateNewDrinker.fxml'.";
    }
    
    protected boolean isOkClicked(){
        return this.isOkClicked;
    }
    
    CreateNewDrinkerController(Drinker drinker){
        this.myDrinker=drinker;
    }
    
    private Drinker myDrinker;
    private boolean isOkClicked=false;
}
