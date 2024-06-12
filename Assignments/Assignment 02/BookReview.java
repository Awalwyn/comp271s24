import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.io.InputStream;

/*
NO IMPORT STATEMENTS. NO CALLS TO SYSTEM.anything, except for 
System.out.println or print or printf as needed.
 */ 
public class BookReview {

    /**
     * Establishes a Scanner on a weblink. If the connection can not be made,
     * the method returns a null. That's how we can tell something went wrong
     * and decide what to do next.
     * @param link String with link to website with text to scan
     * @return Scanner connected to the website or null if connection cannot be made
     */
    public static Scanner connectToBook(String link) {
        Scanner bookScanner;
        try {
            URL url = new URL(link);
            URLConnection connection = url.openConnection();
            InputStream stream = connection.getInputStream();
            bookScanner = new Scanner(stream);
        } catch (Exception e) {
            bookScanner = null;
        }
        return bookScanner;
    } // method connecttoBook

    public static int reader (Scanner book) {
        //initialize counter variable
        int counter = 0;
        //traverse through book token by token 
        while (book.hasNext()) {
            //set current token to string variable
            String word = book.next();
            //determine if word is unique and can be added or not
            if (DynamicArray.addUnique(word)) {
                counter++;
            })
        }
        //return the new word read from book
        return counter; 
    }//method reader

    public static 

    public static void main(String[] args) {
        // https://gutenberg.org/cache/epub/98/pg98.txt is a link
        // to the text of "Tale of Two Cities" from Project Gutenberg
        String book = "https://gutenberg.org/cache/epub/98/pg98.txt";
        connectToBook(book);
        reader(bookScanner);
        System.out.printf("The total number of unique words is " + reader(book));
    } // method main
} // class BookReview
