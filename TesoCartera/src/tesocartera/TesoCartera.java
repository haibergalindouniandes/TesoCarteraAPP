/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tesocartera;

import Frames.F_Escritorio;
import Frames.F_Loggin;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author zlaifer
 */
public class TesoCartera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
       UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
        F_Loggin JF_P = new F_Loggin();
        JF_P.setVisible(true);
    }
    
}
