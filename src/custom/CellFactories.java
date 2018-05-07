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

import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;

/**
 * Created by rifat on 8/7/15.
 */
public class CellFactories {

    public  Callback<TableColumn, TableCell> cellFactoryCheckBox = new Callback<TableColumn, TableCell>() {

        @Override
        public TableCell call(final TableColumn param) {
            final CheckBox checkBox = new CheckBox();
            TableView tableView = new TableView();
            final TableCell cell = new TableCell() {

                public void updateItem(Object item, boolean empty) {
                    super.updateItem(item, empty);
                    if(item == null){
                        checkBox.setVisible(false);

                    }else {
                        checkBox.setVisible(true);
                        checkBox.setOnMouseClicked(new EventHandler<MouseEvent>() {
                            @Override
                            public void handle(MouseEvent event) {
                                  

                            }
                        });


                    }
                }
            };
            cell.setGraphic(checkBox);
            return cell;
        }
    };


}
