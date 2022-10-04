
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Danja Bali UNYT
 */
public class Table {

      
    private ArrayList<Item> appetizers = new ArrayList<>();
    private ArrayList<Item> pizza = new ArrayList<>();
    private ArrayList<Item> desserts = new ArrayList<>();
    private ArrayList<Item> drinks = new ArrayList<>();
    
    private static final AtomicInteger count = new AtomicInteger(0);

private final int id;
    private double netAmount;
    private double totalAmount;
    private double VAT;
    private List<Item> listOfItems;
    private Date dateAndTimeOfPurchase;
    private String addressOfTheRestaurant;
    private String nameOfCashier;

    public Table() {

        super();

        this.id = count.incrementAndGet();

    }

    public Table(final double netAmount, final double totalAmount, final double vAT, final List<Item> listOfItems,
            final Date dateAndTimeOfPurchase, final String addressOfTheRestaurant, final String nameOfCashier) {

        super();

        this.id = count.incrementAndGet();
        this.netAmount = netAmount;
        this.totalAmount = totalAmount;
        VAT = vAT;
        this.listOfItems = listOfItems;
        this.dateAndTimeOfPurchase = dateAndTimeOfPurchase;
        this.addressOfTheRestaurant = addressOfTheRestaurant;
        this.nameOfCashier = nameOfCashier;
    }

    public double getNetAmount() {
        return netAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getVAT() {
        return VAT;
    }

    public List<Item> getListOfItems() {
        return listOfItems;
    }

    public Date getDateAndTimeOfPurchase() {
        return dateAndTimeOfPurchase;
    }

    public String getAddressOfTheBarOrRestaurant() {
        return addressOfTheRestaurant;
    }

    public String getNameOfCashier() {
        return nameOfCashier;
    }

    public void setNetAmount(final double netAmount) {
        this.netAmount = netAmount;
    }

    public void setTotalAmount(final double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setVAT(final double vAT) {
        VAT = vAT;
    }

    public void setListOfItems(final List<Item> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public void setDateAndTimeOfPurchase(final Date dateAndTimeOfPurchase) {
        this.dateAndTimeOfPurchase = dateAndTimeOfPurchase;
    }

    public void setAddressOfTheBarOrRestaurant(final String addressOfTheBarOrRestaurant) {
        this.addressOfTheRestaurant = addressOfTheBarOrRestaurant;
    }

    public void setNameOfCashier(final String nameOfCashier) {
        this.nameOfCashier = nameOfCashier;
    }

    public static AtomicInteger getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

public void populateMenu() {
    
        System.out.println("                 Welcome to our                      ");
        System.out.println("                Rrestaurant Menu !                   ");

        appetizers.add(new Item("Bruschetta", 1, 9));
        appetizers.add(new Item("French Fries", 2, 6));
        appetizers.add(new Item("Pizza Bread", 3, 4.95));
        appetizers.add(new Item("Garlic Bread", 4, 2.50));
        appetizers.add(new Item("Marinara Sauce", 5, 3.95));
        appetizers.add(new Item("Meat Sauce", 6, 6.95));

        pizza.add(new Item("Pepperoni Pizza", 7, 6));
        pizza.add(new Item("Cheese Pizza", 8, 6.5));
        pizza.add(new Item("Deluxe Pizza", 9, 12));
        pizza.add(new Item("Chicken Supreme Pizza", 10, 12));
        pizza.add(new Item("Margarita", 11, 10));
        pizza.add(new Item("Tuna and Sweetcorn Flatbread", 12, 8));

        desserts.add(new Item("Waffles", 13, 11));
        desserts.add(new Item("Cheesy Cake", 14, 15));
        desserts.add(new Item("Tiramisu", 15, 5.75));
        desserts.add(new Item("Vanilla Cheesecake", 16, 12));
        desserts.add(new Item("Panna Cotta", 17, 8));
        desserts.add(new Item("Cannoli", 18, 4));

        drinks.add(new Item("Water", 19, 1));
        drinks.add(new Item("Pepsi ", 20, 2.85));
        drinks.add(new Item("7up Free ", 21, 2.85));
        drinks.add(new Item("Apple Juice ", 22, 3.25));
        drinks.add(new Item("Dom Perignon ", 23, 179));
        drinks.add(new Item("Jack Daniels ", 24, 130));
    }
}
