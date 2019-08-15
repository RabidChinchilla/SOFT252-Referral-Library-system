/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.referral.library.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gearing
 */
public class Admin extends Client implements Serializable{
    
    
    public Admin(String ID, String password){
        super(ID, password);
    }
    
}
