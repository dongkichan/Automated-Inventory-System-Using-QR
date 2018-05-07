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


import InventorySys.InventorySys;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rifat
 */
public class DBProperties {
    Properties properties = new Properties();
    InputStream inputStream;
    OutputStream output = null;

    public void mkDbProperties() {
        
        try {
            output = new FileOutputStream("database.properties");
            properties.setProperty("host", "localhost");
            properties.setProperty("port", "3306");
            properties.setProperty("db", "storekeeper");
            properties.setProperty("user", "root");
            properties.setProperty("password", "");
            properties.store(output, null);
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InventorySys.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InventorySys.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String loadPropertiesFile() {
        try {
            inputStream = new FileInputStream("database.properties");
            properties.load(inputStream);
            return properties.getProperty("db");
        } catch (IOException e) {
            System.out.println("DDDD");
        }
        return "";
    }
}
