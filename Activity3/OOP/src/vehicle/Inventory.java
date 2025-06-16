package vehicle;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {
    private ArrayList<Vehicle> vehicles;

    public Inventory() {
        vehicles = new ArrayList<>();
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle v) {
        vehicles.add(v);
    }

    public void getAveragePrice(){
        if(vehicles.isEmpty()){
            System.out.println("No items found");
        }
        else{
            double sum = 0;
            for (Vehicle i : vehicles){
                sum += ((double) i.getPrice());
            }
            System.out.println("Average Price is : " + (sum/vehicles.size()));
        }
    }


    public ArrayList<Vehicle> searchByMakeAndModel(String make, String model){
        if(vehicles.isEmpty()){
            System.out.println("No items found");
        }
        else{
            ArrayList<Vehicle> sel = new ArrayList<>();
            for (Vehicle i : vehicles){
                if (i.getMake().equals(make) && i.getModel().equals(model)){
                    sel.add(i);
                }
            }
            return sel;
        }

        return null;
    }


    public static void main(String[] args) {

        //Polymorphism used to give different Classes but same common object type

        Car car1 = new Car("Toyota", "Camry", 2022, "Red", 25000.0, 4, 5, false);
        Car car2 = new Car("Honda", "Civic", 2021, "Blue", 22000.0, 4, 5, false);
        Truck truck1 = new Truck("Ford", "F-150", 2020, "Black", 35000.0, 8, 1500.0);
        Truck truck2 = new Truck("Chevy", "Silverado", 2022, "White", 37000.0, 6, 1600.0);


        Inventory japan = new Inventory();

        //Abstracted to simply calling methods without specifying each object seprately


        japan.setVehicles(car1);
        japan.setVehicles(car2);
        japan.setVehicles(truck1);
        japan.setVehicles(truck2);

        japan.getAveragePrice();
        ArrayList<Vehicle> search = japan.searchByMakeAndModel("Toyota","Camry");
        Iterator itr = search.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
