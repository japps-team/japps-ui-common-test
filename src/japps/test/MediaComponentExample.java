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
import japps.ui.component.Media;
import japps.ui.component.Panel;
import java.awt.Component;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Williams Lopez - JApps
 */
public class MediaComponentExample {
    
    public static void main(String[] args) throws Exception{
        DesktopApp.init("test", new String[]{"reconfigure"});
        Panel main = new Panel();
        Media mc = new Media();
        Path p = Paths.get(("res/img/video.mp4"));
        mc.setMedia(p,Media.VIDEO);
        Button button = new Button("play", (e)->{ mc.play(); });
        main.setComponents(new Component[][]{
            {mc},
        });
        
        DesktopApp.start(main);
    }
    
}
