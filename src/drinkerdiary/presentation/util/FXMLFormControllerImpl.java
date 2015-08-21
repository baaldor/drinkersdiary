/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkerdiary.presentation.util;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;


public abstract class FXMLFormControllerImpl<T> extends FormControllerImpl<T> {
    private Stage controlledStage;
    
    public void setControlledStage(Stage stage){
        this.controlledStage=stage;
    }
    
    @FXML
    public void handleCancelButton(ActionEvent actionEvent) {
        // close the dialog.
        this.setExitCode(FormController.CANCEL_CLICKED);
        this.controlledStage.close();
    }
    
    @FXML
    public void handleOkButton(ActionEvent actionEvent){
        this.performOkButtonWork();
        this.setExitCode(FormController.OK_CLICKED);
        this.controlledStage.close();
    }
    
    public abstract void performOkButtonWork();
}
