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

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

/**
 * @author Rifat
 */
public class CustomTf {

    public void clearTextFieldByButton(TextField value, Button btn) {



        btn.setVisible(false);
        btn.setText(null);
        btn.minHeight(35.0);
        btn.minHeight(25.0);
        btn.getStylesheets().add("");
        value.setOnKeyReleased((KeyEvent event) -> {
            if ((value.textProperty().get().length() < 0) || (value.textProperty().get().equals(""))) {
                btn.setVisible(false);
            } else if (value.textProperty().get().length() > -1 || (!value.textProperty().get().equals(""))) {
                btn.setVisible(true);
            }
        });
        value.setOnKeyTyped((KeyEvent event) -> {
            if ((value.textProperty().get().length() < 0) || (value.textProperty().get().equals(""))) {
                btn.setVisible(false);
            } else if (value.textProperty().get().length() > -1 || (!value.textProperty().get().equals(""))) {
                btn.setVisible(true);
            }
        });
        value.setOnKeyPressed((KeyEvent event) -> {
            if ((value.textProperty().get().length() < 0) || (value.textProperty().get().equals(""))) {
                btn.setVisible(false);
            } else if (value.textProperty().get().length() > -1 || (!value.textProperty().get().equals(""))) {
                btn.setVisible(true);
            }
        });
        btn.setOnAction((ActionEvent event) -> {
            value.clear();
            btn.setVisible(false);
            value.requestFocus();
        });

    }

    public void numaricTextfield(TextField tField) {
        tField.setOnKeyReleased((KeyEvent event) -> {
            if (!tField.getText().matches("[0-9.]*")) {
                tField.deletePreviousChar();
            }
        });
        tField.setOnKeyPressed((KeyEvent event) -> {
            if (!tField.getText().matches("[0-9.]*")) {
                tField.deletePreviousChar();
            }
        });
        tField.setOnKeyTyped((KeyEvent event) -> {
            if (!tField.getText().matches("[0-9.]*")) {
                tField.deletePreviousChar();
            }
        });
    }
}
