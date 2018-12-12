///*
// * Copyright (C) 2018 Williams Lopez - JApps
// *
// * This program is free software: you can redistribute it and/or modify
// * it under the terms of the GNU General Public License as published by
// * the Free Software Foundation, either version 3 of the License, or
// * (at your option) any later version.
// *
// * This program is distributed in the hope that it will be useful,
// * but WITHOUT ANY WARRANTY; without even the implied warranty of
// * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// * GNU General Public License for more details.
// *
// * You should have received a copy of the GNU General Public License
// * along with this program.  If not, see <http://www.gnu.org/licenses/>.
// */
//package japps.ui.component;
//
//import japps.ui.util.Resources;
//import java.awt.Color;
//import java.awt.Cursor;
//import java.awt.Font;
//import java.awt.Image;
//import javax.swing.ImageIcon;
//import javax.swing.JLabel;
//
///**
// *
// * @author Williams Lopez - JApps
// */
//public class Label extends Component{
//
//
//    private JLabel label;
//    private String icon;
//    
//    /**
//     * Text vertical aligment to TOP
//     */
//    public static int TOP = JLabel.TOP;
//    /**
//     * Text vertical|horizontal aligment to CENTER
//     */
//    public static int CENTER = JLabel.CENTER;
//    /**
//     * Text vertical aligment to BOTTOM
//     */
//    public static int BOTTOM = JLabel.BOTTOM;
//    /**
//     * Text horizontal aligment to RIGHT
//     */
//    public static int RIGHT = JLabel.RIGHT;
//    /**
//     * Text horizontal aligment to LEFT
//     */
//    public static int LEFT = JLabel.LEFT;
//    /**
//     * Text horizontal aligment to LEADING
//     */
//    public static int LEADING = JLabel.LEADING;
//    
//    /**
//     * Constructs a Label object with a initial text
//     * @param text 
//     */
//    public Label(String text) {
//        super();
//
//        
//        
//        label = new JLabel();
//        label.setText(text);
//        label.setFont(getFont());
//        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setVerticalAlignment(JLabel.CENTER);
//        add(label);
//    }
//    
//    /**
//     * Constructs a Label component
//     */
//    public Label(){
//        super();
//        label = new JLabel();
//        label.setFont(getFont());
//        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setVerticalAlignment(JLabel.CENTER);
//        add(label);
//    }
//    
//    /**
//     * Set the text label
//     * @param text 
//     */
//    public void setText(String text){
//        this.label.setText(text);
//    }
//    
//    /**
//     * Get the text on label
//     * @return 
//     */
//    public String getText(){
//        return this.label.getText();
//    }
//
//    /**
//     * Set an scaled image
//     * @param img
//     * @param w
//     * @param h 
//     */
//    public void setImage(Image img, int w, int h){
//        this.label.setIcon(new ImageIcon(img.getScaledInstance(w, h, Image.SCALE_SMOOTH)));
//    }
//    
//    
//    /**
//     * Set an image to this component
//     * @param img 
//     */
//    public void setImage(Image img){
//        this.label.setIcon(new ImageIcon(img));
//    }
//    
//    /**
//     * Get the image
//     * @return 
//     */
//    public Image getImage(){
//        ImageIcon icon = (ImageIcon)this.label.getIcon();
//        if(icon !=null){
//            return icon.getImage();
//        }
//        return null;
//    }
//    
//    /**
//     * Sets an icon from the iconset by its name
//     * @param iconName 
//     */
//    public void setIcon(String iconName){
//        this.icon = iconName;
//        Image image = Resources.icon(iconName);
//        if(image!=null){
//            setImage(image);
//        }
//    }
//    
//    /**
//     * Set an image icon for this label useful when setting gif images
//     * @param imageIcon 
//     */
//    public void setImageIcon(ImageIcon imageIcon){
//        this.label.setIcon(imageIcon);
//    }
//    
//    /**
//     * Sets an icon from the iconset by its name
//     * @param iconName 
//     * @param width 
//     * @param height 
//     */
//    public void setIcon(String iconName, int width, int height){
//        this.icon = iconName;
//        Image image = Resources.icon(iconName);
//        if(image!=null){
//            setImage(image.getScaledInstance(width, height, Image.SCALE_SMOOTH));
//        }
//    }
//
//    /**
//     * Get icon name
//     * @return 
//     */
//    public String getIcon() {
//        return icon;
//    }
//    
//    
//
//
//    @Override
//    public void setCursor(Cursor cursor) {
//        super.setCursor(cursor);
//        this.label.setCursor(cursor);
//    }
//
//    @Override
//    public void setFont(Font font) {
//        super.setFont(font);
//        if(this.label != null){
//            this.label.setFont(font);
//        }
//    }
//
//    /**
//     * Set text vertical position
//     * @param pos 
//     */
//    public void setVerticalTextPosition(int pos){
//        this.label.setVerticalTextPosition(pos);
//    }
//    
//    /**
//     * Sets the text horizontal position
//     * @param pos 
//     */
//    public void setHorizontalTextPosition(int pos){
//        this.label.setHorizontalTextPosition(pos);
//    }
//
//    @Override
//    public void setBackground(Color bg) {
//        super.setBackground(bg);
//        this.label.setBackground(bg);
//    }
//    
//    
//    
//    
//    
//    
//    
//    
//}
