package Fundamentals.Lab16;

import java.util.Scanner;

public class Articles {
    String title, content, author;

    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit(String newContent) {
       content = newContent;
    }

    public void changeAuthor(String newAuthor) {
        author = newAuthor;
    }

    public void rename(String newTitle) {
        title = newTitle;
    }

    public String toString() {
        return title + " - " + content + ": " + author;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] articleInformation  = input.nextLine().split(", ");
        Articles article = new Articles(articleInformation[0], articleInformation[1], articleInformation[2]);
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = input.nextLine().split(": ");


            switch (command[0]) {
                case "ChangeAuthor":
                    article.changeAuthor(command[1]);
                    break;
                case "Edit":
                    article.edit(command[1]);
                    break;
                case "Rename":
                    article.rename(command[1]);
                    break;
            }
        }

        System.out.println(article.toString());
    }
}


