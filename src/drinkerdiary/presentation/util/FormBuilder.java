/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkerdiary.presentation.util;

import java.io.IOException;
import java.net.URL;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import org.controlsfx.control.PropertySheet;
import org.controlsfx.property.BeanPropertyUtils;

/**
 *
 * @author BaalDor
 */
public class FormBuilder {
    public static Parent buildFXMLScene(URL resource, FXMLFormControllerImpl ctrl) throws IOException{
        FXMLLoader loader = new FXMLLoader(resource);       
        
        if (ctrl!=null) loader.setController(ctrl);        
        
        return loader.load();         
    }
    
    public static Stage buildFXMLFormToStage(URL resource, FXMLFormControllerImpl ctrl, Modality mod, Window parent, String stageTitle) throws IOException{                 
        Scene scene = new Scene(buildFXMLScene(resource,ctrl));     
        
        Stage stage = new Stage();
        
        if(mod!=null) stage.initModality(mod);
        
        if(parent!=null) stage.initOwner(parent);
        
        if(stageTitle!=null) stage.setTitle(stageTitle);
        
        stage.setScene(scene);
        
        ctrl.setControlledStage(stage);
        
        return stage;
    }
    
    public static Stage buildFXMLFormToStage(URL resource, FXMLFormControllerImpl ctrl, String stageTitle) throws IOException{
        return buildFXMLFormToStage(resource, ctrl, Modality.NONE, null, stageTitle);
    }
    
    public static Stage buildFXMLFormToStage(URL resource, FXMLFormControllerImpl ctrl) throws IOException{
        return buildFXMLFormToStage(resource, ctrl, Modality.NONE, null, null);
    }

    public static Stage buildControlsFXFormToStage(Object bean){
        ObservableList<PropertySheet.Item> itemList = BeanPropertyUtils.getProperties(bean);
        PropertySheet propSheet = new PropertySheet(itemList);
         
        Scene scene = new Scene(propSheet);     
        
        Stage stage = new Stage();
        stage.setScene(scene);
        return stage;
    }
}
