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
import soft252.referral.library.system.Admin;
/**
 *
 * @author Gearing
 */
public class adminTest {
    public String adminID = "admin000";
    public String adminPassword = "testAdminPass";
    
    
    @Test
    public void userTestAccessor(){
        Admin testAdmin = new Admin(adminID, adminPassword);
        assertEquals(adminID, testAdmin.ID);
        assertEquals(adminPassword, testAdmin.password);
    }
}
