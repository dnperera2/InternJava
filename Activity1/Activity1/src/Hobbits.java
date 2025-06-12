public class Hobbits {

    String name;
    public static void main(String[] args) {

        //Array size should be 4 to hold keep in the bound

        Hobbits[] h = new Hobbits[4];
        int z = 0;
        while (z < 4) {
            //z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "bilbo";

            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");

            //This should come below to stop getting null pointer exception due to accessing
            // uninitialized objects
            z = z + 1;
        }
    }
}
