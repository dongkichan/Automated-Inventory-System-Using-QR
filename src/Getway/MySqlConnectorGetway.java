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

import DAL.MysqlConnector;
import dataBase.DBProperties;
import dataBase.SQLightConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rifat
 */
public class MySqlConnectorGetway {

    SQLightConnection qLightConnection = new SQLightConnection();
    Connection con = qLightConnection.sqliteConnection();
    PreparedStatement pst;
    ResultSet rs;
    
    DBProperties dBProperties = new DBProperties();
    String db = dBProperties.loadPropertiesFile();

    public void save(MysqlConnector connector) {
        try {
            pst = con.prepareStatement("insert into mysqlInfo values(?,?,?,?,?)");
            pst.setInt(1, 1);
            pst.setString(2, connector.hostName);
            pst.setString(3, connector.portName);
            pst.setString(4, connector.userName);
            pst.setString(5, connector.password);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConnectorGetway.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void view(MysqlConnector connector) {
        try {
            pst = con.prepareStatement("select * from mysqlInfo where Id=1");
            rs = pst.executeQuery();
            while(rs.next()){
                connector.hostName = rs.getString(2);
                connector.portName = rs.getString(3);
                connector.userName = rs.getString(4);
                connector.password = rs.getString(5);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConnectorGetway.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
