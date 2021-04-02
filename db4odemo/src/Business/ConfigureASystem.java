package Business;

import Business.Admin.Admin;
import Business.Admin.AdminDirectory;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Manager.Manager;
import Business.Manager.ManagerDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.User;
import static Business.UserAccount.User.Role.Customer;
import Business.UserAccount.UserAccount;
import Business.pojo.Item;
import Business.pojo.Order;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        system.setAdminDirectory(new AdminDirectory());
        system.setManagerDirectory(new ManagerDirectory());
        system.setCustomerDirectory(new CustomerDirectory());
        system.setRestaurantDirectory(new RestaurantDirectory());
        system.setDeliveryManDirectory(new DeliveryManDirectory());
        
        Restaurant res1 = system.getRestaurantDirectory().createRestaurant("Maharaja");     
        Restaurant res2 = system.getRestaurantDirectory().createRestaurant("Dunkin");
        
        system.getUserAccountDirectory().createUserAccount("kalyani", "johare","kalyani", "kalyani$",User.Role.Admin);
        
        UserAccount m1 = system.getUserAccountDirectory().createUserAccount("oliver","j","oliver","oliver$",User.Role.Manager);
        ((Manager)(m1.getUser())).setRestaurant(res1);
        UserAccount m2 = system.getUserAccountDirectory().createUserAccount("emma","watson","emma","emma$",User.Role.Manager);
        ((Manager)(m2.getUser())).setRestaurant(res2);
        UserAccount d1 = system.getUserAccountDirectory().createUserAccount("emily", "w", "emily", "emily$", User.Role.DeliveryMan);
        ((DeliveryMan)(d1.getUser())).setRestaurant(res1);
        UserAccount d2 = system.getUserAccountDirectory().createUserAccount("sophia", "D", "sohpia", "shopia$", User.Role.DeliveryMan);
        ((DeliveryMan)(d2.getUser())).setRestaurant(res1);
        UserAccount d3 = system.getUserAccountDirectory().createUserAccount("alex", "smith", "alex", "alex$", User.Role.DeliveryMan);
        ((DeliveryMan)(d3.getUser())).setRestaurant(res2);
        UserAccount c1 = system.getUserAccountDirectory().createUserAccount("james", "B", "james", "james$", User.Role.Customer);
        ((Customer)(c1.getUser())).setAddress("1422 Park Drive");
        UserAccount c2 = system.getUserAccountDirectory().createUserAccount("jim", "J", "jim", "jim$", User.Role.Customer);
        ((Customer)(c2.getUser())).setAddress("1298 New Bury St");
        
        Item i1 = new Item("Paneer", 4.99f,res1);
        Item i2 = new Item("DalTadka", 2.99f,res1);
        Item i3 = new Item("Biryani", 9.99f,res1); 
        
        Item i4 = new Item("HotChocolate", 3.99f,res2);
        Item i5 = new Item("Coffee", 5.05f,res2);
        Item i6 = new Item("ChaiLatte", 8.00f,res2);
        
        res1.addMenuItem(i1);
        res1.addMenuItem(i2);
        res1.addMenuItem(i3);
        res2.addMenuItem(i4);
        res2.addMenuItem(i5);
        res2.addMenuItem(i6);
        
        List<Item> order = new ArrayList();
        order.add(i1);
        order.add(i3);
        List<Item> order2 = new ArrayList();
        order2.add(i4);
        order2.add(i5);
       
        
        return system;
    }
    
}
