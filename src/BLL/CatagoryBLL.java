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
package BLL;

import DAL.Catagory;
import DAL.Supplyer;
import Getway.CatagoryGetway;
import dataBase.DBConnection;
import dataBase.DBProperties;
import dataBase.SQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.stage.StageStyle;

/**
 * Created by rifat on 8/15/15.
 */
public class CatagoryBLL {

    SQL sql = new SQL();
    CatagoryGetway catagoryGetway = new CatagoryGetway();
    DBConnection dbCon = new DBConnection();
    Connection con = dbCon.geConnection();
    PreparedStatement pst;
    ResultSet rs;
    
    DBProperties dBProperties = new DBProperties();
    String db = dBProperties.loadPropertiesFile();

    public void save(Catagory catagory){
        if (isUniqName(catagory)){
            catagoryGetway.save(catagory);
        }
    }

    public void update(Catagory catagory){
        if(checkUpdate(catagory)){
            catagoryGetway.update(catagory);
        }else if(isUniqName(catagory)){
            catagoryGetway.update(catagory);
        }
    }
    
    public void delete(Catagory catagory){
        if(catagoryGetway.isNotUse(catagory)){
            catagoryGetway.delete(catagory);
        }else{
            //noting
        }
    }

    public boolean checkUpdate(Catagory catagory){
        boolean isTrueUpdate = false;
        catagory.brandId = sql.getIdNo(catagory.brandName, catagory.brandId, "Brands", "BrandName");
        catagory.supplyerId = sql.getIdNo(catagory.supplyerName, catagory.supplyerId, "Supplyer", "SupplyerName");

        try {
            pst = con.prepareStatement("select * from "+db+".Catagory where CatagoryName=? and BrandId=? and SupplyerId=? and Id=?");
            pst.setString(1, catagory.catagoryName);
            pst.setString(2, catagory.brandId);
            pst.setString(3, catagory.supplyerId);
            pst.setString(4, catagory.id);
            rs = pst.executeQuery();
            while (rs.next()) {
                return isTrueUpdate = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isTrueUpdate;
    }

    public boolean isUniqName(Catagory catagory) {

        boolean uniqSupplyer = false;
        catagory.brandId = sql.getIdNo(catagory.brandName, catagory.brandId, "Brands", "BrandName");
        catagory.supplyerId = sql.getIdNo(catagory.supplyerName, catagory.supplyerId, "Supplyer", "SupplyerName");
        try {
            pst = con.prepareCall("select * from "+db+".Catagory where CatagoryName=? and BrandId=? and SupplyerId=?");
            pst.setString(1, catagory.catagoryName);
            pst.setString(2, catagory.brandId);
            pst.setString(3, catagory.supplyerId);
            rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println("in not uniq");
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sucess");
                alert.setHeaderText("ERROR : used");
                alert.setContentText("Catagory" + "  '" + catagory.catagoryName + "' " + "Already exist");
                alert.initStyle(StageStyle.UNDECORATED);
                alert.showAndWait();
                
                return uniqSupplyer;
            }
            uniqSupplyer = true;
        } catch (SQLException ex) {
            Logger.getLogger(Supplyer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uniqSupplyer;
    }
}
