/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.referral.library.system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gearing
 */
public class SOFT252ReferralLibrarySystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Client> userList = new ArrayList();
        List<Admin> adminList = new ArrayList();
        
        new firstFrame().setVisible(true);
    }
    
}
