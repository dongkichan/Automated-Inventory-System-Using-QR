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
 *
 * @author rifat
 */
public class ListSold {
    String Id;
    String sellId;
    String productId;
    String productGId;
    String customerId;
    String customerName;
    String pursesPrice;
    String sellPrice;
    String oldQuantity;
    String quantity;
    String totalPrice;
    String pursrsDate;
    String warrentyVoidDate;
    
    String sellerID;
    String sellerName;
    String sellDate;

    public ListSold(String Id, String sellId, String productId, String productGId, String customerId, String customerName, String pursesPrice, String sellPrice, String oldQuantity, String quantity, String totalPrice, String pursrsDate, String warrentyVoidDate, String sellerID, String sellerName, String sellDate) {
        this.Id = Id;
        this.sellId = sellId;
        this.productId = productId;
        this.productGId = productGId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.pursesPrice = pursesPrice;
        this.sellPrice = sellPrice;
        this.oldQuantity = oldQuantity;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.pursrsDate = pursrsDate;
        this.warrentyVoidDate = warrentyVoidDate;
        this.sellerID = sellerID;
        this.sellerName = sellerName;
        this.sellDate = sellDate;
    }

    

    public String getSellId() {
        return sellId;
    }

    public void setSellId(String sellId) {
        this.sellId = sellId;
    }
    
    

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductGId() {
        return productGId;
    }

    public void setProductGId(String productGId) {
        this.productGId = productGId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellDate() {
        return sellDate;
    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }
    
    
}
