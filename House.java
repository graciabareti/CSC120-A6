/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building {

  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDR) {
    super( name, address, nFloors);
    this.hasDiningRoom = hasDR;
    this.residents = new ArrayList<String>();
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  public int nResidents() {
    return this.residents.size();
  }
  public void moveIn(String name) {
  
    this.residents.add(name);  
  }

  public String moveOut(String name){
    this.residents.remove(name);
    return name;
  } // return the name of the person who moved out

  public boolean isResident(String person){
    return this.residents.contains(person);
  }

  public static void main(String[] args) {
    House myhouse = new House("bobi", "123 candy lane",5,true);
    myhouse.moveIn("Gracia");

    System.out.print(myhouse.nResidents());
  }

}