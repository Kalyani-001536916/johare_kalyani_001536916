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
        
        Restaurant re1 = system.getRestaurantDirectory().createRestaurant("restaurant1");     
        Restaurant re2 = system.getRestaurantDirectory().createRestaurant("restaurant2");
        
        system.getUserAccountDirectory().createUserAccount("a", "A1","a", "a",User.Role.Admin);
        UserAccount m1 = system.getUserAccountDirectory().createUserAccount("manager","M1","m","m",User.Role.Manager);
        ((Manager)(m1.getUser())).setRestaurant(re1);
        UserAccount m2 = system.getUserAccountDirectory().createUserAccount("manager","M2","m2","m",User.Role.Manager);
        ((Manager)(m2.getUser())).setRestaurant(re2);
        UserAccount d1 = system.getUserAccountDirectory().createUserAccount("delivery", "D1", "d", "d", User.Role.DeliveryMan);
        ((DeliveryMan)(d1.getUser())).setRestaurant(re1);
        UserAccount d2 = system.getUserAccountDirectory().createUserAccount("delivery", "D2", "d2", "d", User.Role.DeliveryMan);
        ((DeliveryMan)(d2.getUser())).setRestaurant(re1);
        UserAccount d3 = system.getUserAccountDirectory().createUserAccount("delivery", "D3", "d3", "d", User.Role.DeliveryMan);
        ((DeliveryMan)(d3.getUser())).setRestaurant(re2);
        UserAccount c1 = system.getUserAccountDirectory().createUserAccount("Customer", "C1", "c", "c", User.Role.Customer);
        ((Customer)(c1.getUser())).setAddress("1422 Park Drive");
        UserAccount c2 = system.getUserAccountDirectory().createUserAccount("Customer", "C2", "c2", "c", User.Role.Customer);
        ((Customer)(c2.getUser())).setAddress("1298 New Bury St");
        
        Item i1 = new Item("Tacos", 4.99f,re1);
        Item i2 = new Item("Chipotle", 2.99f,re1);
        Item i3 = new Item("Pasta", 9.99f,re1);
        Item i4 = new Item("Soup", 1.99f,re2);
        Item i5 = new Item("Rice", 2.99f,re2);
        Item i6 = new Item("Noodles", 6.99f,re2);
        
        re1.addMenuItem(i1);
        re1.addMenuItem(i2);
        re1.addMenuItem(i3);
        re2.addMenuItem(i4);
        re2.addMenuItem(i5);
        re2.addMenuItem(i6);
        
        List<Item> order = new ArrayList();
        order.add(i1);
        order.add(i3);
        List<Item> order2 = new ArrayList();
        order2.add(i4);
        order2.add(i5);
        Order orderObject1 = new Order((Customer)c1.getUser(),order,"spicy",re1);
        Order orderObject2 = new Order((Customer)c1.getUser(),order2,"sweet",re2);
        re1.getOrders().add(orderObject1);
        ((Customer)c1.getUser()).addOrder(orderObject1);
        re2.getOrders().add(orderObject2);
        ((Customer)c1.getUser()).addOrder(orderObject2);
        
        return system;
    }
    
}
