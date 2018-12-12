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
import japps.ui.component.Button;
import japps.ui.component.ComboBox;
import japps.ui.component.DateField;
import japps.ui.component.FileField;
import japps.ui.component.ImageComponent;
import japps.ui.component.Label;
import japps.ui.component.Panel;
import japps.ui.component.TextField;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static japps.ui.util.Resources.*;
import japps.ui.util.Util;
import java.awt.Component;
import javax.swing.JComponent;

/**
 *
 * @author Williams Lopez - JApps
 */
public class ComponentsExample {
    
    
    public static void main(String[] args) {
        DesktopApp.init("test", args) ;
        Panel main = build();
        DesktopApp.start(main);
    }
    
    public static Panel build(){
        
        Panel main = new Panel();
        Panel fields = new Panel();
        Panel other = new Panel();
        
        fields.setGroupName("fields");
        other.setGroupName("others");
        
        DateField date  = new DateField();
        Component text  = new TextField();
        TextField text2  = new TextField();
        text2.setMultiline(true);
        FileField file1 = new FileField(FileField.MODE_FILE_SINGLE, FileField.TYPE_OPEN);
        FileField file2 = new FileField(FileField.MODE_FILE_SINGLE, FileField.TYPE_SAVE);
        FileField file3 = new FileField(FileField.MODE_FILE_MULTIPLE, FileField.TYPE_OPEN);
        FileField file4 = new FileField(FileField.MODE_FILE_MULTIPLE, FileField.TYPE_SAVE);
        FileField file5 = new FileField(FileField.MODE_DIRECTORY_SINGLE, FileField.TYPE_OPEN);
        FileField file6 = new FileField(FileField.MODE_DIRECTORY_SINGLE, FileField.TYPE_SAVE);
        FileField file7 = new FileField(FileField.MODE_DIRECTORY_MULTIPLE, FileField.TYPE_OPEN);
        FileField file8 = new FileField(FileField.MODE_DIRECTORY_MULTIPLE, FileField.TYPE_SAVE);
        FileField file9 = new FileField(FileField.MODE_FILES_AND_DIRS, FileField.TYPE_OPEN);
        FileField file10= new FileField(FileField.MODE_FILES_AND_DIRS, FileField.TYPE_SAVE);
        file10.setToolTipText("Este es el campo de archivo 10");
        
        Component label = new Label("Label de prueba");
        Button button = new Button((e)->{ JOptionPane.showMessageDialog(other, "Mensaje de prueba"); });
        button.setImage(new ImageIcon("res/img/great.png").getImage(),30,30);
        button.setToolTipText("Este es el botón uno");
        
        Button button2 = new Button("Button 2",(e)->{ JOptionPane.showMessageDialog(other, "Mensaje de prueba 2");});
        button2.setImage(icon("cell.png"),40,40);
        button2.setToolTipText("Este es el botón 2");
        
        ComboBox<String> combo = new ComboBox<>(false);
        combo.setViewMode(ComboBox.TABLE);
        combo.setValues("Uno","Dos","Tres","Cuatro","Cinco","seis","siete","ocho","nueve");
        combo.setAction((e)->{ JOptionPane.showMessageDialog(combo, combo.getValue());});
        
        ComboBox<Integer> combo2 = new ComboBox<>(true);
        combo2.setViewMode(ComboBox.ROW);
        combo2.setValues(111111111,22222222,33333333,4444444,5555555,666666,7,8,9,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);
        combo2.setMaxDisplayedValues(5);
        
        ImageComponent image = new ImageComponent();
        image.setImage(Util.readImage("res/img/great.png"));
        //image.setPreferredSize(new Dimension(100, 100));
        
        fields.setComponents(new Component[][]{
            { date,   text,   text2 },
            { file1,  file2,  text2 },
            { file3,  file3,  file4 },
            { file5,  file6,  file6 },
            { file7,  file8,  file8 },
            { file10, file9, file9  }
        });
        
        other.setComponents(new Component[][]{
            { label,  image, button },
            { button2, button2,button2 },
            { combo,  combo2, null  }
        });
        
        main.setComponents(new Component[][]{
            { fields },
            { other  } 
        });
        
        return main;
        
    }
    
    
    
}
