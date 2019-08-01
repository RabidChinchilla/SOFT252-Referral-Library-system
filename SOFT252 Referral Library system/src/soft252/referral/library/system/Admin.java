/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.referral.library.system;

/**
 *
 * @author Gearing
 */
public class Admin extends Client{
    protected boolean adminPrivileges = true;
    
    Admin(String ID, String password){
        super(ID, password);
    }
    
}
