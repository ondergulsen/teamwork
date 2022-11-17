package teamwork_12112022;

import java.util.Scanner;

public class TestBlogEntry {
    public static void main(String[] args) {
//        Define a class called BlogEntry that could be used to store an entry for a Web blog.
//        You should get below information with Scanner from user.
//        The class should have PRIVATE instance variables to store :
//        1-the poster’s username,
//        2-text of the entry,
//        3-date of the entry
//        Add a constructor that allows the user of the class to set all instance variables.
//        Also add a method, displayEntry() , that outputs usernames and dates, and another method
//        called getSummary() that returns the first 10 characters from the text (or the entire
//        text if it is less than 10 chracters).
//        Test your class from your main method.

        Scanner input= new Scanner(System.in);

        BlogEntry post1 = new BlogEntry();
        System.out.println(post1.displayEntry());
        System.out.println(post1.getSummary());
        BlogEntry post2= new BlogEntry();
        System.out.println(post2.displayEntry());
        System.out.println(post2.getSummary());


    }
}
