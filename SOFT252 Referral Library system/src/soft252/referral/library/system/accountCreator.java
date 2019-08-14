/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.referral.library.system;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gearing
 */
public class accountCreator {
    
    protected static List<Client> userList = new ArrayList();
    protected static List<Admin> adminList = new ArrayList();
    protected static List<resources> resourceList = new ArrayList();
    
    protected static List<resources> resourceRequestList = new ArrayList();
    
    protected static List<String> dueDateExtenstions = new ArrayList();
    
    protected static List<resources> newResourceList = new ArrayList();
    
    private static accountCreator instance = new accountCreator();
    
    private accountCreator(){}
    
    public static accountCreator GetInstance()
    {
        return instance;
    }
    
    public static void createAdmin(String ID, String Password){
        Admin admin = new Admin(ID, Password);
        adminList.add(admin);
        try {
         FileOutputStream fileOut = new FileOutputStream("admins.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(accountCreator.adminList);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in SOFT252-Referral-Library-system\\SOFT252 Referral Library system\\admins.ser");
        } 
        catch (IOException i) {
         i.printStackTrace();
        }
    }
    
    public static void createUser(String ID, String Password){
        Client user = new Client(ID, Password);
        userList.add(user);
        try {
         FileOutputStream fileOut = new FileOutputStream("users.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(accountCreator.userList);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in SOFT252-Referral-Library-system\\SOFT252 Referral Library system\\users.ser");
        } 
        catch (IOException i) {
         i.printStackTrace();
        }
    }
    
    public static void createResource(String catagorey, String title, String type, boolean borrowed, String borrowType){
        resources resource = new resources(catagorey, title, type, borrowed, borrowType);
        resourceList.add(resource);
        newResourceList.add(resource);
        try {
         FileOutputStream fileOut = new FileOutputStream("resources.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(accountCreator.resourceList);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in SOFT252-Referral-Library-system\\SOFT252 Referral Library system\\resources.ser");
        } 
        catch (IOException i) {
         i.printStackTrace();
        }
        try {
         FileOutputStream fileOut = new FileOutputStream("newResourceList.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(accountCreator.newResourceList);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in SOFT252-Referral-Library-system\\SOFT252 Referral Library system\\newResourceList.ser");
        } 
        catch (IOException i) {
         i.printStackTrace();
        }
    }
    
    public static void createResourceRequest(String title, String type){
        resources resource = new resources(null, title, type, false, null);
        resourceRequestList.add(resource);
        try {
         FileOutputStream fileOut = new FileOutputStream("resourceRequests.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(accountCreator.resourceRequestList);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in SOFT252-Referral-Library-system\\SOFT252 Referral Library system\\resourceRequests.ser");
        } 
        catch (IOException i) {
         i.printStackTrace();
        }
    }
}
