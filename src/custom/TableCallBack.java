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

import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.util.Callback;

/**
 * Created by rifat on 8/4/15.
 */
public class TableCallBack implements Callback<TableColumn<Object, Object>, TableCell<Object, Object>> {

    Callback<TableColumn<Object, Object>, TableCell<Object, Object>> callback = new Callback<TableColumn<Object, Object>, TableCell<Object, Object>>() {
        @Override
        public TableCell<Object, Object> call(TableColumn<Object, Object> param) {
            final TableCell cell = new TableCell() {


                public void updateItem(Object item, boolean empty) {
                    Text text = new Text();
                    super.updateItem(item, empty);
                    if (!isEmpty()) {
                        text = new Text(item.toString());
                        text.setWrappingWidth(200);
                        text.setFill(Color.BLACK);
                        setGraphic(text);
                    } else if (isEmpty()) {
                        text.setText(null);
                        setGraphic(null);
                    }
                }
            };
            return cell;
        }
    };

    @Override
    public TableCell<Object, Object> call(TableColumn<Object, Object> param) {
        return null;
    }
}
