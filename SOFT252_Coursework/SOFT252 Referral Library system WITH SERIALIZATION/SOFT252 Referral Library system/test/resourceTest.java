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
import soft252.referral.library.system.resources;
/**
 *
 * @author Gearing
 */
public class resourceTest {
    public String resourceTitle = "admin000";
    public String resourceCategory = "testAdminPass";
    public String resourceType = "Book";
    public boolean borrowed = true;
    public String borrowType = "Short Term";
    public int daysBorrowed = 14;
    public int rating = 3;
    
    
    @Test
    public void userTestAccessor(){
        resources testResource = new resources(resourceCategory, resourceTitle, resourceType, borrowed, borrowType);
        assertEquals(resourceTitle, testResource.title);
        assertEquals(resourceCategory, testResource.catagorey);
        assertEquals(resourceType, testResource.resourceType);
        assertEquals(borrowed, true);
        assertEquals(borrowType, "shortTerm");
        assertEquals(daysBorrowed, 14);
        assertEquals(rating, 3);
    }
}
