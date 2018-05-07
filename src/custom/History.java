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

import controller.HistoryController;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author rifat
 */
public class History {
    
    public void writeText(String Catagorys,String nameOrId, String userName){
        System.out.println("Hited");
        try {
            String content = "Update By    :" + userName + "\nUpdate Date\t:" + LocalDate.now().toString() + "\n------------------------";

            File file = new File("logs/"+ Catagorys+"_" + nameOrId+"_" +"updateinfo.txt");
            if (!file.exists()) {
                file.getParentFile().mkdir();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(content);

            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void viewText(String Catagoryes,String nameOrId, String userName){
        try {
            HistoryController hc = new HistoryController();
            StringBuilder sb = new StringBuilder();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/history.fxml"));
            loader.load();
            Parent root = loader.getRoot();
            Stage s1 = new Stage();
            HistoryController historyController = loader.getController();
            
        BufferedReader in;

        try {
            in = new BufferedReader(new FileReader("logs/"+ Catagoryes +nameOrId + "UpdateDetails.text"));
            String str;

            while ((str = in.readLine()) != null) {
                sb.append(str).append("\n");

            }
        } catch (FileNotFoundException ex) {
            System.out.println("File Not found");
//            Logger.getLogger(ViewEmployeController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            historyController.tfHistory.appendText(sb.toString());
            Scene s2 = new Scene(root);
            s1.setScene(s2);
            s1.setTitle("History");
            s1.setResizable(false);
            s1.show();
        } catch (IOException ex) {
            Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
