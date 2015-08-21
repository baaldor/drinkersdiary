/**
 * Sample Skeleton for 'FXMLDocument.fxml' Controller Class
 */

package drinkerdiary.presentation;

import drinkerdiary.Core.Substance;
import drinkerdiary.business.BusinessFacade;
import drinkerdiary.presentation.util.FormBuilder;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

public class FXMLDocumentController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="button"
    private Button button; // Value injected by FXMLLoader

    @FXML // fx:id="buttonNewDrinker"
    private Button buttonNewDrinker; // Value injected by FXMLLoader
    
    @FXML // fx:id="newSubstanceButton"
    private Button newSubstanceButton; // Value injected by FXMLLoader
    
    @FXML // fx:id="drinkerNameList"
    private ChoiceBox<String> drinkerNameList; // Value injected by FXMLLoader

    @FXML
    void handleButtonAction(ActionEvent event) {
        Set<String> allDrinkerNames=this.myBusinessFacade.loadAllDrinkerNames();
        this.drinkerNameList.setItems(FXCollections.observableArrayList(allDrinkerNames));
    }

    @FXML
    void handleNewDrinkerButton(ActionEvent event) throws Exception {
        Window parentWindow = ((Node)event.getSource()).getScene().getWindow();
        
        NewDrinkerController drinkerCtrl = new NewDrinkerController();
        drinkerCtrl.setDependency(this.myBusinessFacade.createNewDrinker());        
        
        FormBuilder.buildFXMLFormToStage(
                NewDrinkerController.class.getResource("CreateNewDrinker.fxml"), 
                drinkerCtrl, 
                Modality.WINDOW_MODAL, 
                parentWindow,
                "New Drinker")
                .showAndWait();
        
//        FormBuilder.buildFXMLFormToPopup(
//                NewDrinkerController.class.getResource("CreateNewDrinker.fxml"),
//                drinkerCtrl)
//                .show(parentWindow);
        
        if (drinkerCtrl.isOkClicked()){
            this.myBusinessFacade.storeDrinker(drinkerCtrl.getDependency());
        }
    }
    
    @FXML
    void handleNewSubstanceButton(ActionEvent event) throws Exception {
//        Window parentWindow = ((Node)event.getSource()).getScene().getWindow();
//        
//        NewDrinkerController drinkerCtrl = new NewDrinkerController();
//        drinkerCtrl.setDependency(this.myBusinessFacade.createNewDrinker());        
//        
//        FormBuilder.buildFXMLFormToStage(
//                NewDrinkerController.class.getResource("CreateNewDrinker.fxml"), 
//                drinkerCtrl, 
//                Modality.WINDOW_MODAL, 
//                parentWindow,
//                "New Drinker")
//                .showAndWait();      
//
//        
//        if (drinkerCtrl.isOkClicked()){
//            this.myBusinessFacade.storeDrinker(drinkerCtrl.getDependency());
//        }
        Substance newSubstance = this.myBusinessFacade.createNewSubstance();
        FormBuilder.buildControlsFXFormToStage(newSubstance).showAndWait();
        this.myBusinessFacade.storeSubstance(newSubstance);
    }
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert newSubstanceButton != null : "fx:id=\"newSubstanceButton\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert buttonNewDrinker != null : "fx:id=\"buttonNewDrinker\" was not injected: check your FXML file 'FXMLDocument.fxml'.";        
        assert drinkerNameList != null : "fx:id=\"drinkerNameList\" was not injected: check your FXML file 'FXMLDocument.fxml'.";

    }

    public void setBusinessFacade(BusinessFacade myBusinessFacade) {
        this.myBusinessFacade = myBusinessFacade;
    }
    
    private BusinessFacade myBusinessFacade;
}