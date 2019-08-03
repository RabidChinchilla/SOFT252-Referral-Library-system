/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.referral.library.system;

import java.util.ArrayList;
import java.util.List;
import static soft252.referral.library.system.accountCreator.adminList;
import static soft252.referral.library.system.accountCreator.userList;

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
//        List<Client> userList = new ArrayList();
//        List<Admin> adminList = new ArrayList();
        
        accountCreator.createAdmin("admin001", "ultimate987");      
        accountCreator.createUser("user001", "education");
        accountCreator.createUser("user002", "killingtime");
        accountCreator.createUser("user003", "movies");
        accountCreator.createUser("user004", "password");
        accountCreator.createUser("user005", "books");
        
        for(Client user : userList) { 
            System.out.println(user.ID);
            System.out.println(user.password);
        }
        
        for(Admin admin : adminList) { 
            System.out.println(admin.ID);
            System.out.println(admin.password);
        }
        
        new firstFrame().setVisible(true);
    }
    
}
