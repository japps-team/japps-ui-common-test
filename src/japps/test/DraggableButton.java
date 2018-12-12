/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japps.test;

import japps.ui.DesktopApp;
import japps.ui.component.Button;
import japps.ui.component.Panel;
import japps.ui.util.Dnd;
import japps.ui.util.Log;
import java.awt.Color;
import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author Williams Lopez - JApps
 */
public class DraggableButton {
    
    public JFrame frame;
    
    
    public static void main(String[] args) {
        DesktopApp.init("test", args);
        
        Panel panel = new Panel();
        Button dragComponent = new Button("Prueba1",null);
        Button dropComponent = new Button("Prueba2",null);
        dragComponent.setDndMode(Dnd.DRAGGABLE);
        dropComponent.setDndMode(Dnd.DROPPABLE);
        dropComponent.setDropAction((o,d)->{
            Button bo = (Button)o;
            Button bd = (Button)d;
            System.out.println("Droped "+bo.getText()+" into "+bd.getText());
            
            bd.setText(bd.getText()+","+bo.getText());
            
        });
        panel.setComponents(new Component[][]{{dragComponent},{dropComponent}});
        DesktopApp.start(panel);
        
    }
    

            
            
            
            
            
            
        
    
}
