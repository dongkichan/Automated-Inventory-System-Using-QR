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
public class ListSupplyer {
    
    public String supplyerId;
    public String supplyerName;
    public String supplyerPhoneNumber;
    public String supplyerAddress;
    public String supplyerDescription;
    public String creatorId;
    public String dataOfjoining;

    public ListSupplyer(String supplyerId, String supplyerName) {
        this.supplyerId = supplyerId;
        this.supplyerName = supplyerName;
    }

    public void setSupplyerAddress(String supplyerAddress) {
        this.supplyerAddress = supplyerAddress;
    }



    public String getSupplyerPhoneNumber() {
        return supplyerPhoneNumber;
    }

    public String getSupplyerAddress() {
        return supplyerAddress;
    }

    public String getSupplyerDescription() {
        return supplyerDescription;
    }

    public String getDataOfjoining() {
        return dataOfjoining;
    }

    public ListSupplyer(String supplyerId, String supplyerName, String supplyerPhoneNumber, String supplyerAddress, String supplyerDescription, String dataOfjoining) {
        this.supplyerId = supplyerId;
        this.supplyerName = supplyerName;
        this.supplyerPhoneNumber = supplyerPhoneNumber;
        this.supplyerAddress = supplyerAddress;
        this.supplyerDescription = supplyerDescription;
        this.dataOfjoining = dataOfjoining;
    }





    public String getSupplyerId() {
        return supplyerId;
    }

    public void setSupplyerId(String supplyerId) {
        this.supplyerId = supplyerId;
    }

    public String getSupplyerName() {
        return supplyerName;
    }

    public void setSupplyerName(String supplyerName) {
        this.supplyerName = supplyerName;
    }

}
