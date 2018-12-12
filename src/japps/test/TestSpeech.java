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
import japps.ui.util.Resources;
import japps.ui.util.Sound;
import java.nio.file.Path;

/**
 *
 * @author Williams Lopez - JApps
 */
public class TestSpeech {
    
    public static void main(String[] args) throws Exception{
        
            /**
             * This is a speech text test
             */
            DesktopApp.init("test", new String[]{ "reconfigure"});
            Path p =Resources.getSpeech("Esta es una prueba");
            Sound.play(p);
    }
    
}
