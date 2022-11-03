/* This is a stub for the Cafe class */
public class Cafe extends Building {
    
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
   
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces= 120;
        this.nSugarPackets= 100;
        this.nCreams= 100;
        this.nCups= 100;

        System.out.println("You have built a cafe: ☕");
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if(this.nCoffeeOunces ==0 || this.nSugarPackets == 0 || this.nCreams==0 || this.nCups==0);
            restock(10,10,10,10);
        

        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
    }
    
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
            this.nCoffeeOunces += nCoffeeOunces;
            this.nSugarPackets += nSugarPackets;
            this.nCreams += nCreams;
            this.nCups += nCups;
    }
    //print statement for testing
    public static void main(String[] args) {
        Cafe shop= new Cafe("Bareti Cafe", "2024 Graduation Ave",6);
        System.out.println(shop);
        shop.sellCoffee(12,6,2);

    }
    
}
