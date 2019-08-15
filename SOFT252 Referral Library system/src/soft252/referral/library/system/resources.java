/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.referral.library.system;

import java.io.Serializable;

/**
 *
 * @author Gearing
 */
public class resources implements Serializable{
    public String catagorey;
    //protected String resourceID;
    public String title;
    public String resourceType;
    public boolean borrowed;
    public String borrowedType;
    public int daysBorrowed = 0;
    public int rating = 0;
    
    
    public resources(String catagorey, String title, String type, boolean isBorrowed, String borrowTy){
        this.catagorey = catagorey;
        //this.resourceID = ID;
        this.title = title;
        this.resourceType = type;
        this.borrowed = isBorrowed;
        this.borrowedType = borrowTy;
    }
}
