/* This is a stub for the House class
 * @Author:Gracia Bareti /Worked with & pair programmed with Rachel Tolentino
 */
import java.util.ArrayList;
/*
 * Extends house to building.
 */
public class House extends Building {

  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

/* Construct the House
 * 
 */

  public House(String name, String address, int nFloors, boolean hasDR) {
    super( name, address, nFloors);
    this.hasDiningRoom = hasDR;
    this.residents = new ArrayList<String>();
    System.out.println("You have built a house: 🏠");
  }
/*
 * Boolean that helps in creating dining room
 */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }
/*
 * nResident accessor created to provide the amount of residents.
 */
  public int nResidents() {
    return this.residents.size();
  }
  /*
   * Returns the amount of residents that are moving in.
   */
  public void moveIn(String name) {
  
    this.residents.add(name);  
  }
/*Returns name of the person who moved out
 * 
 */
  public String moveOut(String name){
    this.residents.remove(name);
    return name;
  } 

  public boolean isResident(String person){
    return this.residents.contains(person);
  }

/*
 * Prints house
 */
  public static void main(String[] args) {
    House myhouse = new House("Gracia", "123 candy lane",5,true);
    myhouse.moveIn("Gracia");

    System.out.print(myhouse.nResidents());
  }

}