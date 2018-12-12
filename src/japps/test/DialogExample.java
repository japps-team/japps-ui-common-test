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
import japps.ui.component.Dialogs;
import japps.ui.component.Panel;
import japps.ui.util.Util;
import java.awt.Image;
import javax.swing.JComponent;

/**
 *
 * @author Williams Lopez - JApps
 */
public class DialogExample {
    
    
    public static void main(String[] args) {
        DesktopApp.init("test", args);
        DesktopApp.start(new Panel());
        Image image = Util.readImage("res/img/great.png");
        
        Dialogs.message("Message dialog", "This is a message dialog");
        Dialogs.message("Message dialog", "Message dialog with image", image);
        Dialogs.error("Error dialog", "This is an error dialog");
        int result = Dialogs.question("Question dialog", "Simple Question dialog");
        if(result == Dialogs.APPROVE){
            Dialogs.message("Question dialog", "Approved/Accepted");
        }else{
            Dialogs.message("Question dialog", "Canceled");
        }
        result = Dialogs.question("Question dialog", "Simple Question dialog",image);
        if(result == Dialogs.APPROVE){
            Dialogs.message("Question dialog", "Approved/Accepted");
        }else{
            Dialogs.message("Question dialog", "Canceled");
        }
        
    }
    
}
