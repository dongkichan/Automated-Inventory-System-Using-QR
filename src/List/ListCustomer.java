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
public class ListCustomer {
    
    public String id;
    public String customerName;
    public String customerContNo;
    public String customerAddress;
    public String totalBuy;
    public String addBy;
    public String addedDate;

    public ListCustomer(String id, String customerName, String customerContNo, String customerAddress, String totalBuy, String addBy, String addedDate) {
        this.id = id;
        this.customerName = customerName;
        this.customerContNo = customerContNo;
        this.customerAddress = customerAddress;
        this.totalBuy = totalBuy;
        this.addBy = addBy;
        this.addedDate = addedDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerContNo() {
        return customerContNo;
    }

    public void setCustomerContNo(String customerContNo) {
        this.customerContNo = customerContNo;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getTotalBuy() {
        return totalBuy;
    }

    public void setTotalBuy(String totalBuy) {
        this.totalBuy = totalBuy;
    }

    public String getAddBy() {
        return addBy;
    }

    public void setAddBy(String addBy) {
        this.addBy = addBy;
    }

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }
    
    
    
}
