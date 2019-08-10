/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.referral.library.system;

import java.util.ArrayList;
import java.util.List;
import static soft252.referral.library.system.accountCreator.adminList;
import static soft252.referral.library.system.accountCreator.resourceList;
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
        
        accountCreator.createResource("000 - Computer science, information & general works", "Thinking In Java", "Book", false);
        accountCreator.createResource("000 - Computer science, information & general works", "Programming in Unity", "Book", false);
        accountCreator.createResource("100 - Philosophy and psychology", "Socrates Teachings", "Book", false);
        accountCreator.createResource("100 - Philosophy and psychology", "Psychology basics", "Book", false);
        accountCreator.createResource("200 – Religion", "Passion of the christ", "DVD", true);
        accountCreator.createResource("200 – Religion", "The bible", "Book", false);
        accountCreator.createResource("300 – Social sciences", "Social Studies", "DVD", true);
        accountCreator.createResource("300 – Social sciences", "The Tipping Point", "Book", false);
        accountCreator.createResource("400 – Language", "French for dummies", "Book", false);
        accountCreator.createResource("400 – Language", "German lessons", "DVD", true);
        accountCreator.createResource("400 – Language", "Learn Japanese", "Book", false);
        accountCreator.createResource("500 – Pure Science", "Chemistry basics", "Book", false);
        accountCreator.createResource("500 – Pure Science", "Physics basics", "Book", false);
        accountCreator.createResource("500 – Pure Science", "Biology basics", "Book", false);
        accountCreator.createResource("500 – Pure Science", "AQA Biology revision guide", "Book", false);
        accountCreator.createResource("600 – Technology", "How it's made", "DVD", true);
        accountCreator.createResource("600 – Technology", "The Second Machine Age: Work, Progress, and Prosperity in a Time of Brilliant Technologies", "Book", false);
        accountCreator.createResource("700 – Arts & recreation", "The joy of painting", "DVD", true);
        accountCreator.createResource("800 – Literature", "Of Mice and Men", "Book", false);
        accountCreator.createResource("900 – History & geography", "General history of the world", "Book", false);
        
        for (resources resource : resourceList){
            System.out.println(resource.catagorey + " " + resource.title + " " + resource.resourceType);
        }
        
        for(Client user : userList) { 
            System.out.println(user.ID + " " + user.password);
        }
        
        for(Admin admin : adminList) { 
            System.out.println(admin.ID + " " + admin.password);
        }
        
        new firstFrame().setVisible(true);
    }
    
}
