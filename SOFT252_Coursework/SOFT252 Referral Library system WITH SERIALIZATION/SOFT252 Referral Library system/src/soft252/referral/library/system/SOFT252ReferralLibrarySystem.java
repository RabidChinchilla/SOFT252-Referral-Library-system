/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.referral.library.system;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
//        List<Client> userList = new ArrayList();
//        List<Admin> adminList = new ArrayList();
                
        //ONLY USE IF SERIALIZATION DOES NOT WORK
//        accountCreator.createAdmin("admin001", "ultimate987");
//        accountCreator.createAdmin("admin002", "adminpass");
//        accountCreator.createUser("user001", "education");
//        accountCreator.createUser("user002", "killingtime");
//        accountCreator.createUser("user003", "movies");
//        accountCreator.createUser("user004", "password");
//        accountCreator.createUser("user005", "books");
//        
//        accountCreator.createResource("000 - Computer science, information & general works", "Thinking In Java", "Book", false, "Short Term");
//        accountCreator.createResource("000 - Computer science, information & general works", "Programming in Unity", "Book", false, "Short Term");
//        accountCreator.createResource("100 - Philosophy and psychology", "Socrates Teachings", "Book", false, "Long Term");
//        accountCreator.createResource("100 - Philosophy and psychology", "Psychology basics", "Book", false, "Long Term");
//        accountCreator.createResource("200 – Religion", "Passion of the christ", "DVD", false, "Reference");
//        accountCreator.createResource("200 – Religion", "The bible", "Book", false, "Reference");
//        accountCreator.createResource("300 – Social sciences", "Social Studies", "DVD", false, "Short Term");
//        accountCreator.createResource("300 – Social sciences", "The Tipping Point", "Book", false, "Long Term");
//        accountCreator.createResource("400 – Language", "French for dummies", "Book", false, "Short Term");
//        accountCreator.createResource("400 – Language", "German lessons", "DVD", false, "Short Term");
//        accountCreator.createResource("400 – Language", "Learn Japanese", "Book", false, "Long Term");
//        accountCreator.createResource("500 – Pure Science", "Chemistry basics", "Book", false, "Long Term");
//        accountCreator.createResource("500 – Pure Science", "Physics basics", "Book", false, "Long Term");
//        accountCreator.createResource("500 – Pure Science", "Biology basics", "Book", false, "Long Term");
//        accountCreator.createResource("600 – Technology", "How it's made", "DVD", false, "Short Term");
//        accountCreator.createResource("600 – Technology", "The Second Machine Age: Work, Progress, and Prosperity in a Time of Brilliant Technologies", "Book", false, "Long Term");
//        accountCreator.createResource("700 – Arts & recreation", "The joy of painting", "DVD", false, "Short Term");
//        accountCreator.createResource("800 – Literature", "Of Mice and Men", "Book", false, "Long Term");
//        accountCreator.createResource("800 – Literature", "Newspaper from 11/09/1998", "Newspaper", false, "Reference");
//        accountCreator.createResource("900 – History & geography", "General history of the world", "Book", false, "Short Term");
//        
//        for (resources resource : resourceList){
//            System.out.println(resource.catagorey + " " + resource.title + " " + resource.resourceType);
//        }
//        
//        for(Client user : userList) { 
//            System.out.println(user.ID + " " + user.password);
//            if (user.ID.equals("user005")){
//                user.resourcesBorrowed.add("Of Mice and Men");
//                for (resources resource : resourceList){
//                    if (resource.title.equals("Of Mice and Men")){
//                        resource.borrowed = true;
//                        resource.daysBorrowed = -30;
//                    }
//                }
//            }
//            else if (user.ID.equals("user002")){
//                for (resources resource : resourceList){
//                    if (resource.title.equals("Social Studies")){
//                        resource.borrowed = true;
//                        resource.daysBorrowed = -5;
//                    }
//                }
//            }
//        }
//        
//        for(Admin admin : adminList) { 
//            System.out.println(admin.ID + " " + admin.password);
//        }
//        
//        try {
//         FileOutputStream fileOut = new FileOutputStream("users.ser");
//         ObjectOutputStream out = new ObjectOutputStream(fileOut);
//         out.writeObject(accountCreator.userList);
//         out.close();
//         fileOut.close();
//         System.out.printf("Serialized data is saved in SOFT252-Referral-Library-system\\SOFT252 Referral Library system\\users.ser");
//        } 
//        catch (IOException i) {
//         i.printStackTrace();
//        }
//        
//        try {
//         FileOutputStream fileOut = new FileOutputStream("admins.ser");
//         ObjectOutputStream out = new ObjectOutputStream(fileOut);
//         out.writeObject(accountCreator.adminList);
//         out.close();
//         fileOut.close();
//         System.out.printf("Serialized data is saved in SOFT252-Referral-Library-system\\SOFT252 Referral Library system\\admins.ser");
//        } 
//        catch (IOException i) {
//         i.printStackTrace();
//        }
//        
//        try {
//         FileOutputStream fileOut = new FileOutputStream("resources.ser");
//         ObjectOutputStream out = new ObjectOutputStream(fileOut);
//         out.writeObject(accountCreator.resourceList);
//         out.close();
//         fileOut.close();
//         System.out.printf("Serialized data is saved in SOFT252-Referral-Library-system\\SOFT252 Referral Library system\\resources.ser");
//        } 
//        catch (IOException i) {
//         i.printStackTrace();
//        }
//        
//        try {
//         FileOutputStream fileOut = new FileOutputStream("resourceRequests.ser");
//         ObjectOutputStream out = new ObjectOutputStream(fileOut);
//         out.writeObject(accountCreator.resourceRequestList);
//         out.close();
//         fileOut.close();
//         System.out.printf("Serialized data is saved in SOFT252-Referral-Library-system\\SOFT252 Referral Library system\\resourceRequests.ser");
//        } 
//        catch (IOException i) {
//         i.printStackTrace();
//        }
//        
//        try {
//         FileOutputStream fileOut = new FileOutputStream("dueDateExtensions.ser");
//         ObjectOutputStream out = new ObjectOutputStream(fileOut);
//         out.writeObject(accountCreator.dueDateExtenstions);
//         out.close();
//         fileOut.close();
//         System.out.printf("Serialized data is saved in SOFT252-Referral-Library-system\\SOFT252 Referral Library system\\dueDateExtensions.ser");
//        } 
//        catch (IOException i) {
//         i.printStackTrace();
//        }
//        
//        try {
//         FileOutputStream fileOut = new FileOutputStream("newResourceList.ser");
//         ObjectOutputStream out = new ObjectOutputStream(fileOut);
//         out.writeObject(accountCreator.newResourceList);
//         out.close();
//         fileOut.close();
//         System.out.printf("Serialized data is saved in SOFT252-Referral-Library-system\\SOFT252 Referral Library system\\newResourceList.ser");
//        } 
//        catch (IOException i) {
//         i.printStackTrace();
//        }

        try {
            FileInputStream fileIn = new FileInputStream("users.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            accountCreator.userList = (List<Client>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("loaded users");
        } 
        catch (IOException i) {
            i.printStackTrace();
            return;
        } 
        
        try {
            FileInputStream fileIn = new FileInputStream("admins.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            accountCreator.adminList = (List<Admin>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("loaded admins");
        } 
        catch (IOException i) {
            i.printStackTrace();
            return;
        }
        
        try {
            FileInputStream fileIn = new FileInputStream("newResourceList.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            accountCreator.newResourceList = (List<resources>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("loaded newResourceList");
        } 
        catch (IOException i) {
            i.printStackTrace();
            return;
        }
        
        try {
            FileInputStream fileIn = new FileInputStream("dueDateExtensions.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            accountCreator.dueDateExtenstions = (List<String>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("loaded dueDateExtensions");
        } 
        catch (IOException i) {
            i.printStackTrace();
            return;
        }
        
        try {
            FileInputStream fileIn = new FileInputStream("resourceRequests.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            accountCreator.resourceRequestList = (List<resources>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("loaded resourceRequests");
        } 
        catch (IOException i) {
            i.printStackTrace();
            return;
        }
        
        try {
            FileInputStream fileIn = new FileInputStream("resources.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            accountCreator.resourceList = (List<resources>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("loaded resources");
        } 
        catch (IOException i) {
            i.printStackTrace();
            return;
        }
        
    new firstFrame().setVisible(true);
    }
}