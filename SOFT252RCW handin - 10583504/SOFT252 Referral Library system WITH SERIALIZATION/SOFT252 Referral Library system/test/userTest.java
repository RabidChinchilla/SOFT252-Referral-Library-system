/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import junit.framework.*;
import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;
import soft252.referral.library.system.Client;
/**
 *
 * @author Gearing
 */
public class userTest {
    
    public String userID = "user000";
    public String userPassword = "testPassword";
    
    
    @Test
    public void userTestAccessor(){
        Client testUser = new Client(userID, userPassword);
        assertEquals(userID, testUser.ID);
        assertEquals(userPassword, testUser.password);
    }
    
}
