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
package DAL;

import List.ListPreSell;
import List.ListSold;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Created by rifat on 8/16/15.
 */
public class SellCart {
    
    public String Id;
    public String sellID;
    public String customerID;
    public String productID;
    public String pursesPrice;
    public String sellPrice;
    public String quantity;
    public String totalPrice;
    public String pursrsDate;
    public String warrentyVoidDate;
    public String sellerID;
    public String sellDate;
    public String oldQuentity;
    //Names
    
    public String customerName;
    public String sellerName;
    public String givenProductID;
    
    
    
    public ObservableList<ListPreSell> carts = FXCollections.observableArrayList();
    public ObservableList<ListSold> soldList = FXCollections.observableArrayList();

}
