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
package controller.application.home;

import Getway.CurrentProductGetway;
import dataBase.DBConnection;
import dataBase.DBProperties;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author rifat
 */
public class HomeController implements Initializable {
    @FXML
    private Label lblTotalItem;
    @FXML
    private Label lblStockValue;
    @FXML
    private Label lblTotalSupplyer;
    @FXML
    private Label lblTotalEmployee;
    
    DBConnection dbCon = new DBConnection();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    @FXML
    private Label lblTotalSell;
    @FXML
    private Label lblSellValue;
    @FXML
    private Label lblOrgName;
    @FXML
    private Text txtOrgAddress;
    @FXML
    private Text txtorgPhoneNumber;
    
    DBProperties dBProperties = new DBProperties();
    String db = dBProperties.loadPropertiesFile();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        valueCount();
        totalCount();
    }    
    
    public void valueCount(){
        con = dbCon.geConnection();
        try {
            pst = con.prepareStatement("select sum(PursesPrice) from "+db+".Products");
            rs = pst.executeQuery();
            while (rs.next()) {
                lblStockValue.setText(rs.getString(1));
            }con.close();
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CurrentProductGetway.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void totalCount(){
        con = dbCon.geConnection();
        try {
            pst = con.prepareStatement("select count(*) from "+db+".Sell");
            rs = pst.executeQuery();
            while (rs.next()) {
                lblTotalSell.setText(rs.getString(1));
            }
            pst = con.prepareStatement("select count(*) from "+db+".Supplyer");
            rs = pst.executeQuery();
            while(rs.next()){
                lblTotalSupplyer.setText(rs.getString(1));
            }
            pst = con.prepareStatement("select count(*) from "+db+".Products");
            rs = pst.executeQuery();
            while(rs.next()){
                lblTotalItem.setText(rs.getString(1));
            }
            pst = con.prepareStatement("select sum(TotalPrice) from "+db+".Sell");
            rs = pst.executeQuery();
            while(rs.next()){
                lblSellValue.setText(rs.getString(1));
            }
            pst = con.prepareStatement("select count(*) from "+db+".User");
            rs = pst.executeQuery();
            while(rs.next()){
                lblTotalEmployee.setText(rs.getString(1));
            }
            pst =con.prepareStatement("select * from "+db+".Organize where Id=1");
            rs = pst.executeQuery();
            while(rs.next()){
                lblOrgName.setText(rs.getString(2));
                txtOrgAddress.setText(rs.getString(5));
                txtorgPhoneNumber.setText(rs.getString(4));
            }
            con.close();
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CurrentProductGetway.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
