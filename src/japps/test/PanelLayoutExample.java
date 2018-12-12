/*
 * Copyright (C) 2018 Williams Lopez - JApps
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package japps.test;

import japps.ui.DesktopApp;
import japps.ui.component.Button;
import japps.ui.component.Label;
import japps.ui.component.Panel;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Williams Lopez - JApps
 */
public class PanelLayoutExample {
    
    public static void main(String[] args) {
        /**
         * Every japp desktop application must starts with this line
         * "test" is the global name of this new app
         *  args are the command line arguments, 
         * To restart configuration add "reconfigure" to command line
         **/ 
        DesktopApp.init("test", args);
        
        /**
         * Frecuently but not necessary every app hav a main Panel
         */
        Panel mainPanel = new Panel();
        mainPanel.setOpaque(true);
        
        /**
         * Any component, in this case the content is a label with hellow world
         */
        ActionListener action = (e)->{JOptionPane.showMessageDialog(mainPanel, "Hello");};
        Button l1 = new Button("Button 1",action); l1.setOpaque(true); l1.setBackground(Color.red);
        Button l2 = new Button("Button 2",action); l2.setOpaque(true); l2.setBackground(Color.yellow);
        Button l3 = new Button("Button 3",action); l3.setOpaque(true); l3.setBackground(Color.green);
        Button l4 = new Button("Button 4",action); l4.setOpaque(true); l4.setBackground(Color.pink);
        Button l5 = new Button("Button 5",action); l5.setOpaque(true); l5.setBackground(Color.gray);
        Button l6 = new Button("Button 6",action); l6.setOpaque(true); l6.setBackground(Color.cyan);
        Button l7 = new Button("Button 7",action); l7.setOpaque(true); l7.setBackground(Color.blue);
        
        /**
         * Adding content is easy with Panel
         * Every component is added in a matrix
         */
        Component[][] comp = new Component[][]{
            {l1,l2,l2}, //To expand a component in two columns repeat the component in the columns you want
            {l3,l3,l4}, //You can expand in columns or in rows like l3, 
            {l3,l3,l5}, //repeating the component in cells you want to expand 
            {l6,null,l7}//add null value in cell you want empty space
        };
        
        
        
        /**
         * You can costumize some properties for columns and rows
         * One array entry for every column
         */
        String[] columnConstraints = new String[] { 
            Panel.FILL_GROW_CENTER,
            Panel.FILL_GROW_CENTER,
            Panel.GROW + "," + Panel.RIGHT
        };
        
        /**
         * You can costumeze some properties for rows
         */
        String[] rowConstraints = new String[] { 
            Panel.FILL_GROW_CENTER,
            Panel.FILL_GROW_CENTER,
            Panel.FILL_GROW_CENTER,
            Panel.NONE
        };
        
        /**
         * mainPanel.setComponents(comp).
         * You can add components with default value
         * Or you can add column and row constraints
         */
        mainPanel.setComponents(comp, columnConstraints, rowConstraints);

        
        /**
         * Starts the application with a main panel
         */
        DesktopApp.start(mainPanel);
        
    }
    
}
