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
package Getway;

import DAL.Catagory;
import DAL.Supplyer;
import List.ListCatagory;
import dataBase.DBConnection;
import dataBase.DBProperties;
import dataBase.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.stage.StageStyle;

/**
 * @author rifat
 */
public class CatagoryGetway {

    SQL sql = new SQL();
    DBConnection dbCon = new DBConnection();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    DBProperties dBProperties = new DBProperties();
    String db = dBProperties.loadPropertiesFile();

    public void save(Catagory catagory) {
        con = dbCon.geConnection();
        catagory.brandName = sql.getIdNo(catagory.brandName, catagory.brandId, "Brands", "BrandName");
        catagory.brandId = sql.getIdNo(catagory.brandName, catagory.brandId, "Brands", "BrandName");
        catagory.supplyerId = sql.getIdNo(catagory.supplyerName, catagory.supplyerId, "Supplyer", "SupplyerName");
        try {
            pst = con.prepareStatement("insert into "+db+".Catagory values(?,?,?,?,?,?,?)");
            pst.setString(1, null);
            pst.setString(2, catagory.catagoryName);
            pst.setString(3, catagory.catagoryDescription);
            pst.setString(4, catagory.brandId);
            pst.setString(5, catagory.supplyerId);
            pst.setString(6, catagory.creatorId);
            pst.setString(7, LocalDate.now().toString());
            pst.executeUpdate();
            pst.close();
            con.close();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sucess");
            alert.setHeaderText("Sucess : save sucess");
            alert.setContentText("Category" + "  '" + catagory.catagoryName + "' " + "Added Sucessfuly");
            alert.initStyle(StageStyle.UNDECORATED);
            alert.showAndWait();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void view(Catagory catagory) {
        con = dbCon.geConnection();
        try {
            con = dbCon.geConnection();
            pst = con.prepareCall("select * from "+db+".Catagory");
            rs = pst.executeQuery();
            while (rs.next()) {
                catagory.id = rs.getString(1);
                catagory.catagoryName = rs.getString(2);
                catagory.catagoryDescription = rs.getString(3);
                catagory.brandId = rs.getString(4);
                catagory.supplyerId = rs.getString(5);
                catagory.creatorId = rs.getString(6);
                catagory.date = rs.getString(7);
                catagory.brandName = sql.getName(catagory.brandId, catagory.brandName, "Brands");
                catagory.supplyerName = sql.getName(catagory.supplyerId, catagory.supplyerName, "Supplyer");
                catagory.creatorName = sql.getName(catagory.creatorId, catagory.catagoryName, "User");
                catagory.catagoryDetails.addAll(new ListCatagory(catagory.id, catagory.catagoryName, catagory.catagoryDescription, catagory.brandName, catagory.supplyerName, catagory.creatorName, catagory.date));
            }
            pst.close();
            con.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Supplyer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void selectedView(Catagory catagory) {
        con = dbCon.geConnection();
        try {
            pst = con.prepareStatement("select * from "+db+".Catagory where Id=?");
            pst.setString(1, catagory.id);
            rs = pst.executeQuery();
            while (rs.next()) {
                catagory.id = rs.getString(1);
                catagory.catagoryName = rs.getString(2);
                catagory.catagoryDescription = rs.getString(3);
                catagory.brandId = rs.getString(4);
                catagory.supplyerId = rs.getString(5);
                catagory.brandName = sql.getName(catagory.brandId, catagory.brandName, "Brands");
                catagory.supplyerName = sql.getName(catagory.supplyerId, catagory.supplyerName, "Supplyer");
            }
            pst.close();
            con.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void brandView(Catagory catagory) {
        con = dbCon.geConnection();

        try {
            pst = con.prepareStatement("select * from "+db+".Brands where SupplyerId=?");
            pst.setString(1, catagory.supplyerId);
            rs = pst.executeQuery();
            while (rs.next()) {
                catagory.brandName = rs.getString(2);
            }
            pst.close();
            con.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void searchView(Catagory catagory) {
        con = dbCon.geConnection();
        catagory.catagoryDetails.clear();

        try {
            pst = con.prepareStatement("select * from "+db+".Catagory where CatagoryName like ? ORDER BY CatagoryName");

            pst.setString(1, "%" + catagory.catagoryName + "%");
            rs = pst.executeQuery();
            while (rs.next()) {
                catagory.id = rs.getString(1);
                catagory.catagoryName = rs.getString(2);
                catagory.catagoryDescription = rs.getString(3);
                catagory.brandId = rs.getString(4);
                catagory.supplyerId = rs.getString(5);
                catagory.creatorId = rs.getString(6);
                catagory.date = rs.getString(7);

                catagory.brandName = sql.getName(catagory.brandId, catagory.brandName, "Brands");
                catagory.supplyerName = sql.getName(catagory.supplyerId, catagory.supplyerName, "Supplyer");
                catagory.creatorName = sql.getName(catagory.creatorId, catagory.catagoryName, "User");

                catagory.catagoryDetails.addAll(new ListCatagory(catagory.id, catagory.catagoryName, catagory.catagoryDescription, catagory.brandName, catagory.supplyerName, catagory.creatorName, catagory.date));
            }
            pst.close();
            con.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Catagory catagory) {
        con = dbCon.geConnection();
        catagory.brandId = sql.getIdNo(catagory.brandName, catagory.brandId, "Brands", "BrandName");
        catagory.supplyerId = sql.getIdNo(catagory.supplyerName, catagory.supplyerId, "Supplyer", "SupplyerName");

        try {
            pst = con.prepareStatement("update "+db+".Catagory set CatagoryName=? , CatagoryDescription=?,BrandId=?,SupplyerId=? where Id=?");
            pst.setString(1, catagory.catagoryName);
            pst.setString(2, catagory.catagoryDescription);
            pst.setString(3, catagory.brandId);
            pst.setString(4, catagory.supplyerId);
            pst.setString(5, catagory.id);
            pst.executeUpdate();
            pst.close();
            con.close();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sucess");
            alert.setHeaderText("Update : update sucess");
            alert.setContentText("Category" + "  '" + catagory.catagoryName + "' " + "Update Sucessfuly");
            alert.initStyle(StageStyle.UNDECORATED);
            alert.showAndWait();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void delete(Catagory catagory) {
        con = dbCon.geConnection();
        try {
            pst = con.prepareStatement("delete from "+db+".Catagory where Id=?");
            pst.setString(1, catagory.id);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean isNotUse(Catagory catagory) {
        con = dbCon.geConnection();
        boolean isNotUse = false;
        try {
            pst = con.prepareCall("select * from "+db+".Products where CatagoryId=?");
            pst.setString(1, catagory.id);
            rs = pst.executeQuery();
            while (rs.next()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("ERROE : Already exist ");
                alert.setContentText("Category" + "  '" + rs.getString(2) + "' " + "Already exist");
                alert.initStyle(StageStyle.UNDECORATED);
                alert.showAndWait();
                return isNotUse;
            }
            pst.close();
            rs.close();
            con.close();
            isNotUse = true;
        } catch (SQLException ex) {
            Logger.getLogger(CatagoryGetway.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isNotUse;
    }

}
