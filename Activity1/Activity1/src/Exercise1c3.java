public class Exercise1c3 {

    // can not use loops like structures inside the class without static void
    //like a method

    public static void main(String[] args) {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }
        }
    }

}
