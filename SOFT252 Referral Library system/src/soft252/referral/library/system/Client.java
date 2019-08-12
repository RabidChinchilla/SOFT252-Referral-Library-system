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
public class Client {
    
    protected String ID;
    protected String password;
    
    List<Object> resourcesBorrowed = new ArrayList();
    List<Object> Reminders = new ArrayList();
    
    Client(String ID, String password){
        this.ID = ID;
        this.password = password;
        //this.resourcesBorrowed ;
    }
    
}
