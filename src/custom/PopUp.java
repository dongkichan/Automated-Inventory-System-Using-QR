/* 
 * Copyright (C) 2018
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package custom;

import controller.popup.SucessController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author rifat
 */
public class PopUp {
    
    
    public void sucessMessage(){
        SucessController sc = new SucessController();
        System.out.println("COmm");
        try {
            FXMLLoader fXMLLoader = new FXMLLoader();
            fXMLLoader.load(getClass().getResource("/view/popup/Sucess.fxml").openStream());
            fXMLLoader.load();
            SucessController sucessController = fXMLLoader.getController();
            System.out.println("Come 2");
//            sucessController.message.setText("d");
            Parent parent = fXMLLoader.getRoot();
            Scene scene = new Scene(parent);
            Stage nStage = new Stage();
            nStage.setScene(scene);
            nStage.setResizable(false);
            nStage.show();
        } catch (IOException ex) {
            Logger.getLogger(PopUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
