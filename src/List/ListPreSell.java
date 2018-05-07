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
package List;

/**
 * @author rifat
 */
public class ListPreSell {

    String Id;
    String productID;
    String customerID;
    String pursesPrice;
    String sellPrice;
    String oldQuantity;
    String quantity;
    String totalPrice;
    String pursrsDate;
    String warrentyVoidDate;
    String sellerID;
    String sellDate;

    public ListPreSell(String Id, String productID, String customerID, String pursesPrice, String sellPrice, String oldQuantity, String quantity, String totalPrice, String pursrsDate, String warrentyVoidDate, String sellerID, String sellDate) {
        this.Id = Id;
        this.productID = productID;
        this.customerID = customerID;
        this.pursesPrice = pursesPrice;
        this.sellPrice = sellPrice;
        this.oldQuantity = oldQuantity;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.pursrsDate = pursrsDate;
        this.warrentyVoidDate = warrentyVoidDate;
        this.sellerID = sellerID;
        this.sellDate = sellDate;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getPursesPrice() {
        return pursesPrice;
    }

    public void setPursesPrice(String pursesPrice) {
        this.pursesPrice = pursesPrice;
    }

    public String getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getOldQuantity() {
        return oldQuantity;
    }

    public void setOldQuantity(String oldQuantity) {
        this.oldQuantity = oldQuantity;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPursrsDate() {
        return pursrsDate;
    }

    public void setPursrsDate(String pursrsDate) {
        this.pursrsDate = pursrsDate;
    }

    public String getWarrentyVoidDate() {
        return warrentyVoidDate;
    }

    public void setWarrentyVoidDate(String warrentyVoidDate) {
        this.warrentyVoidDate = warrentyVoidDate;
    }

    public String getSellerID() {
        return sellerID;
    }

    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }

    public String getSellDate() {
        return sellDate;
    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    

    
    
    
    
   
}
