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

import List.ListEmployee;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import java.sql.*;

/**
 * Created by rifat on 8/2/15.
 */
public class Users {

    public ObservableList<String> allUser = FXCollections.observableArrayList();

    public String id;
    public String userName;
    public String fullName;
    public String emailAddress;
    public String contactNumber;
    public String salary;
    public String address;
    public String password;
    public String status;
    public String imagePath;
    public Blob userImage;
//    public File userImage;
    public String date;
    public String creatorId;
    public Image image;

    public ObservableList<ListEmployee> employeeLists = FXCollections.observableArrayList();


}
