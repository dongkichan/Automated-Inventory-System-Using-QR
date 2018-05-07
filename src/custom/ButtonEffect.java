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



import javafx.scene.image.Image;

/**
 *
 * @author rifat
 */
public class ButtonEffect {
    
    Image menuImage = new Image("/icon/menu.png");
    Image menuImageRed = new Image("/icon/menuRed.png");
    
    String defultStyle = "-fx-border-width: 0px 0px 0px 5px;"
            + "-fx-border-color:none";
    
    String activeStyle = "-fx-border-width: 0px 0px 0px 5px;"
            + "-fx-border-color:#FF4E3C";
    
    String hoverStyle = "";
    
    Image home = new Image("/icon/home.png");
    Image homeRed = new Image("/icon/homeRed.png");
    Image stock = new Image("/icon/stock.png");
    Image stockRed = new Image("/icon/stockRed.png");
    Image sell = new Image("/icon/sell2.png");
    Image sellRed = new Image("/icon/sell2Red.png");
    Image employee = new Image("/icon/employe.png");
    Image employeeRed = new Image("/icon/employeRed.png");
    Image setting = new Image("/icon/settings.png");
    Image settingRed = new Image("/icon/settingsRed.png");
    Image about = new Image("/icon/about.png");
    Image aboutRed = new Image("/icon/aboutRed.png");
    
    
    public void btnHomeEffect(){
        
    }
}
