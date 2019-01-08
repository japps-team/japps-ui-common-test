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
package japps.test.other;

import japps.ui.component.TextField;
import java.awt.FontMetrics;

/**
 *
 * @author Williams Lopez - JApps
 */
public class Various {
    
    public static void main(String[] args) {
        String tooltiptext = "Esta es una prueba de word wrap\npara el TextField\nEsta es una prueba de word wrap\npara el TextField\nEsta es una prueba de word wrap\npara el TextField\nEsta es una prueba de word wrap\npara el TextField\nEsta es una prueba de word wrap\npara el TextField\nEsta es una prueba de word wrap\npara el TextField\nEsta es una prueba de word wrap\npara el TextField\nFIN";
        int width = 1000;

        char[] buff = new char[1000];
        int count = 0;
        int line = 0;

        for (int i = 0; i < tooltiptext.length(); i++) {
            
            char c = tooltiptext.charAt(i);
            
            if (c == '\n') {
                System.out.println(line+":"+new String(buff,0,count));
                line++;
                count = 0;
            }else if(c==' ' || c=='\t'){
                int w = g.charsWidth(buff,0,count);
                if(w >= width){
                    System.out.println(line+":"+new String(buff,0,count));
                    line++;
                    count = 0;
                }else{
                    buff[count] = c;
                    count++;
                }
            }else if( i == tooltiptext.length()-1){
                buff[count] = c;
                System.out.println(line+":"+new String(buff,0,count+1));
            }else{
                buff[count] = c;
                count++;
            }
        }
    }
    
    
    static class g{
        public static int charsWidth(char[] str, int offset, int length){
             return length*5;
        }
        
        
    }
}
