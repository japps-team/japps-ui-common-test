package japps.test.other;



import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

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
public class ConvertImages {
    
    public static void main(String[] args) throws Exception{
       String path= "/home/fernando/Descargas/Google Material Design icons.iconjar/gmaterial/icon";
                
       File dir = new File(path);
       
       File[] files = dir.listFiles();
       
       for(File f : files){
           if(f.getName().endsWith(".svg")){
               String out = "png/"+f.getName().substring(0,f.getName().length()-3)+"png";
               String in  = f.getName();
               System.out.println("inkscape -z -e \""+out+"\" -w 512 -h 512 \""+in+"\"");
               ProcessBuilder pb = new ProcessBuilder("inkscape","-z","-e",out,"-w","512","-h","512",in);
               pb.directory(new File(path));
               try {
                    Process p = pb.start();
                    BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
                    String line = null;
                    while((line=br.readLine())!=null){
                        System.out.println(line);
                    }

                }catch(Exception e) {
                       e.printStackTrace();
                }
           }
       }
    }
    
}
