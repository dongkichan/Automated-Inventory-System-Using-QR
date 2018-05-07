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
package controller.application;

import controller.application.sell.ViewCustomerController;
import controller.application.sell.ViewSellController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import media.userNameMedia;

/**
 * FXML Controller class
 *
 * @author rifat
 */
public class SellController implements Initializable {

    @FXML
    private ToggleButton tbtnSell;
    @FXML
    private ToggleButton tbtnCustomer;
    @FXML
    private ToggleButton tbtnReports;
    @FXML
    private Label lblPathInfo;
    @FXML
    private StackPane spMainContent;

    userNameMedia nameMedia;

    String userId;
    @FXML
    public AnchorPane acMainSells;

    public void setNameMedia(userNameMedia nameMedia) {
        userId = nameMedia.getId();
        this.nameMedia = nameMedia;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ToggleGroup group = new ToggleGroup();
        tbtnSell.setSelected(true);
        tbtnCustomer.setToggleGroup(group);
        tbtnSell.setToggleGroup(group);
        tbtnReports.setToggleGroup(group);
    }

    @FXML
    public void tbtnSellOnAction(ActionEvent event) throws IOException {
        lblPathInfo.setText("Sells");
        ViewSellController sellController = new ViewSellController();
        userNameMedia media = new userNameMedia();
        FXMLLoader fXMLLoader = new FXMLLoader();
        fXMLLoader.load(getClass().getResource("/view/application/sell/ViewSell.fxml").openStream());
        media.setId(userId);
        ViewSellController controller = fXMLLoader.getController();
        controller.setNameMedia(nameMedia);
        controller.viewDetails();
//        controller.viewDetails();
        spMainContent.getChildren().clear();
        spMainContent.getChildren().add(fXMLLoader.getRoot());
    }

    @FXML
    private void tbtnCustomerOnAction(ActionEvent event) throws IOException {
        lblPathInfo.setText("Customers");
        ViewCustomerController customerController = new ViewCustomerController();
        userNameMedia media = new userNameMedia();
        FXMLLoader fXMLLoader = new FXMLLoader();
        fXMLLoader.load(getClass().getResource("/view/application/sell/ViewCustomer.fxml").openStream());
        media.setId(userId);
        ViewCustomerController controller = fXMLLoader.getController();
        controller.setNameMedia(nameMedia);
        controller.viewDetails();
        spMainContent.getChildren().clear();
        spMainContent.getChildren().add(fXMLLoader.getRoot());
    }

    @FXML
    private void tbtnReportsOnAction(ActionEvent event) throws IOException {

    }

}
