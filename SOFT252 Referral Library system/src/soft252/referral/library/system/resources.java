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
public class resources {
    protected String catagorey;
    //protected String resourceID;
    protected String title;
    protected String resourceType;
    
    protected boolean borrowed;
    protected boolean borrowedLong;
    protected int daysBorrowed = 0;
    protected int rating = 0;
    
    
    resources(String catagorey, String title, String type){
        this.catagorey = catagorey;
        //this.resourceID = ID;
        this.title = title;
        this.resourceType = type;
    }
}
