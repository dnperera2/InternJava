class Books {
    String title;
    String author;
}
class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];


        //Here problem is this create initially an array that can contain 3 books
        //but it still not initiated with 3 books so just 3 null objects

        //we have to instantiate objects before use

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();


        int x = 0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";
        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}