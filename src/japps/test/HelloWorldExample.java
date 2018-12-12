/*
 * Copyright (C) 2018 Williams Lopez - JApps
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
package japps.test;

import japps.ui.DesktopApp;
import japps.ui.component.Label;
import japps.ui.component.Panel;
import java.awt.Component;

/**
 * Hello World Example - JApps
 *
 * @author Williams Lopez - JApps
 */
public class HelloWorldExample {
    
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
        
        /**
         * Any component, in this case the content is a label with hellow world
         */
        Label labelHelloWorld1 = new Label("Hello World 1");
        
        /**
         * Adding content is easy with Panel
         */
        mainPanel.setComponents(new Component[][]{
            {labelHelloWorld1}
        });
        
        DesktopApp.start(mainPanel);
        
    }
    
}
