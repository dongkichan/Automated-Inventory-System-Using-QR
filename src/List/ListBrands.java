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
 * Created by rifat on 8/4/15.
 */
public class ListBrands {
    public String id;
    public String brandName;
    public String brandComment;
    public String supplyerName;
    public String creatorId;
    public String date;

    public ListBrands(String id, String brandName, String brandComment, String supplyerName, String creatorId, String date) {
        this.id = id;
        this.brandName = brandName;
        this.brandComment = brandComment;
        this.supplyerName = supplyerName;
        this.creatorId = creatorId;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandComment() {
        return brandComment;
    }

    public void setBrandComment(String brandComment) {
        this.brandComment = brandComment;
    }

    public String getSupplyerName() {
        return supplyerName;
    }

    public void setSupplyerName(String supplyerName) {
        this.supplyerName = supplyerName;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
