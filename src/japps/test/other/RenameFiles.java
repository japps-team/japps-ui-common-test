package japps.test.other;


import java.io.File;
import java.util.List;

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

/**
 *
 * @author Williams Lopez - JApps
 */
public class RenameFiles {
    
    public static void main(String[] args) {
       String path = "/home/fernando/Descargas/Google Material Design icons.iconjar/icons";     
       
       File dir = new File(path);
       
       File[] files = dir.listFiles();
       
       for(File f : files){
           
           int count = 0;
           File mvTo;
           do{
               count++;
               mvTo = new File(path + File.separator + rename(f.getName(), count));
           }while(mvTo.exists());
           
           f.renameTo(mvTo);
           
       }
       
        
        
    }
    
    
    public static String rename(String name, int count){

        String newname;
        
        if(count<2){
            newname = name.substring(9);
        }else{
            String extension = name.substring(name.length()-4);
            newname = name.substring(9, name.length()-4);
            newname =  newname + "_" + count + extension;
        }
        return newname.replaceAll("[ ]", "-");
    }
    
    
}
