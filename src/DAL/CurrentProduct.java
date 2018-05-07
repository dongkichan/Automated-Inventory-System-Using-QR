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

import List.ListProduct;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Created by rifat on 8/2/15.
 */
public class CurrentProduct {

    public String id;
    public String productId;
    public String productName;
    public String quantity;
    public String description;
    public String supplierId;
    public String brandId;
    public String catagoryId;
    public String unitId;
    public String pursesPrice;
    public String sellPrice;
    public String rmaId;
    public String userId;
    public String date;
    public String warrentyVoidDate;
    public String supplierName;
    public String brandName;
    public String catagoryName;
    public String unitName;
    public String rmaName;
    public String userName;
    public String rmaDayesss;
    public String rmaDayes;
    public String supplyerList;
    
    public ObservableList<ListProduct> currentProductList = FXCollections.observableArrayList();
}
