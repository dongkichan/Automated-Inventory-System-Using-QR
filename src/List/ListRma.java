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

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by rifat on 7/31/15.
 */
public class ListRma {

    public String ramId;
    public String rmaName;
    public String rmaDays;
    public String rmaComment;
    public String creatorName;
    public String date;

    public ListRma(String ramId, String rmaName, String rmaDays, String rmaComment, String creatorName, String date) {
        this.ramId = ramId;
        this.rmaName = rmaName;
        this.rmaDays = rmaDays;
        this.rmaComment = rmaComment;
        this.creatorName = creatorName;
        this.date = date;
    }

    public String getRamId() {
        return ramId;
    }

    public void setRamId(String ramId) {
        this.ramId = ramId;
    }

    public String getRmaName() {
        return rmaName;
    }

    public void setRmaName(String rmaName) {
        this.rmaName = rmaName;
    }

    public String getRmaDays() {
        return rmaDays;
    }

    public void setRmaDays(String rmaDays) {
        this.rmaDays = rmaDays;
    }

    public String getRmaComment() {
        return rmaComment;
    }

    public void setRmaComment(String rmaComment) {
        this.rmaComment = rmaComment;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
