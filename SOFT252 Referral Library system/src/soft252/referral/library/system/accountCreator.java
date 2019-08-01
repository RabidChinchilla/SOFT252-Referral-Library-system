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
public class accountCreator {
    
    protected static List<Client> userList = new ArrayList();
    protected static List<Admin> adminList = new ArrayList();
    
    private static accountCreator instance = new accountCreator();
    
    private accountCreator(){}
    
    public static accountCreator GetInstance()
    {
        return instance;
    }
    
    public static void createAdmin(String ID, String Password){
        Admin admin = new Admin(ID, Password);
        adminList.add(admin);
    }
    
    public static void createUser(String ID, String Password){
        Client user = new Client(ID, Password);
        userList.add(user);
    }
}
