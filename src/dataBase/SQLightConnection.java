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
package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rifat
 */
public class SQLightConnection {

    Connection con;
    ResultSet rs;
    PreparedStatement pst;

    String table = "CREATE TABLE if not exists mysqlInfo "
            + "(ID INT PRIMARY KEY     NOT NULL,"
            + " hostName          VARCHAR(30) , "
            + " portName          VARCHAR(30) , "
            + " userName        VARCHAR(30) , "
            + " password         VARCHAR(30) )";

    String demoValue = "insert into mysqlInof values(?,?,?,?,?)";

    public Connection sqliteConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:storekeeperConnection.db");
            System.out.println("SQLIGHT DATABASE OPENED SUCESSFULY");
            pst = con.prepareStatement(table);
            pst.execute();
            System.out.println("SUcessfuly crrate table");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLightConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SQLightConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

}
