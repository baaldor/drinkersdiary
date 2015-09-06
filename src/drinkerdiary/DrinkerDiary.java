/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkerdiary;

import drinkerdiary.Core.impl.BasicEntityFactory;
import drinkerdiary.Core.EntityFactory;
import drinkerdiary.presentation.FXMLDocumentController;
import drinkerdiary.business.BusinessFacade;
import drinkerdiary.business.BusinessFacadeImpl;
import drinkerdiary.data.DataFacade;
import drinkerdiary.data.impl.DataFacadeImpl;
import drinkerdiary.data.LoadFacade;
import drinkerdiary.data.PersistenceFacade;
import drinkerdiary.data.mock.LoadMock;
import drinkerdiary.data.mock.StoreMock;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author BaalDor
 */
public class DrinkerDiary extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {        
        
        
        LoadFacade myLoadFacade = new LoadMock();
        PersistenceFacade myPersistenceFacade = new StoreMock();
        DataFacade myDataFacade = new DataFacadeImpl(myLoadFacade,myPersistenceFacade);
        
        EntityFactory entFact = new BasicEntityFactory();
        
        BusinessFacade myBusinessFacade = new BusinessFacadeImpl(myDataFacade, entFact);
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("presentation/FXMLDocument.fxml"));
        Parent root=loader.load();
        
        FXMLDocumentController ctrl = loader.getController();
        ctrl.setBusinessFacade(myBusinessFacade);
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
