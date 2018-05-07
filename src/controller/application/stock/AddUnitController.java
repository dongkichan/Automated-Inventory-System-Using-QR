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
package controller.application.stock;

import BLL.UnitBLL;
import java.net.URL;
import java.util.ResourceBundle;

import Getway.UnitGetway;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import media.userNameMedia;
import custom.*;
import dataBase.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.beans.binding.BooleanBinding;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import DAL.Unit;

/**
 * FXML Controller class
 *
 * @author rifat
 */
public class AddUnitController implements Initializable {

    Unit unit = new Unit();
    UnitGetway unitGetway = new UnitGetway();
    UnitBLL unitBLL = new UnitBLL();

    public String unitId;
    @FXML
    public Button btnSave;
    @FXML
    private TextField tfUnitName;
    
    @FXML
    private Button btnClrUnitName;
    
    private String usrId;
    
    private userNameMedia nameMedia;
    
    CustomTf ctf = new CustomTf();
    DBConnection dbCon = new DBConnection();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    @FXML
    private TextArea taDescription;
    @FXML
    public Button btnUpdate;
    @FXML
    public Label lblContent;
    @FXML
    private Button btnClose;

    public userNameMedia getNameMedia() {
        return nameMedia;
    }

    public void setNameMedia(userNameMedia nameMedia) {
        usrId =  nameMedia.getId();
        this.nameMedia = nameMedia;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ctf.clearTextFieldByButton(tfUnitName, btnClrUnitName);
        BooleanBinding bb = tfUnitName.textProperty().isEmpty();
        btnSave.disableProperty().bind(bb);

        
    }    

    @FXML
    private void btnSaveOnAction(ActionEvent event) {

        unit.unitName = tfUnitName.getText().trim();
        unit.unitDescription = taDescription.getText().trim();
        unit.creatorId = usrId;
        unitBLL.save(unit);
    }

    @FXML
    private void btnUpdateOnAction(ActionEvent event) {
        unit.id = unitId;
        unit.unitName = tfUnitName.getText().trim();
        unit.unitDescription =taDescription.getText().trim();
        unitGetway.update(unit);
    }

    @FXML
    private void btnCloseOnAction(ActionEvent event) {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        stage.close();
    }


    public void showDetails() {
        unit.id = unitId;
        unitGetway.selectedView(unit);
        tfUnitName.setText(unit.unitName);
        taDescription.setText(unit.unitDescription);
    }


}
