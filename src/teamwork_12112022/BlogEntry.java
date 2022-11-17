package teamwork_12112022;

import java.util.Scanner;

public class BlogEntry {
    Scanner input = new Scanner(System.in);
    private String username;
    private String text;
    private String date;


    public BlogEntry() {
        System.out.println("Poster's Username : ");
        username = input.nextLine();
        System.out.println("Date : ");
        date = input.nextLine();
        System.out.println("Enter Your Text : \n");
        text = input.nextLine();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String displayEntry() {
        return "Your user name: " + this.username + "\nDate of your post: " + this.date + "\nText you wrote: ";
    }

    public String getSummary() {
        String summary ="";
        if (this.text.length() < 10) {
            summary = this.text;
        } else {
            for (int i = 0; i < 10; i++) {
                summary += this.text.charAt(i);

            }
        }
        return summary;
    }
}
