import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Comment.Comment;
import Post.Post;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:MM:SS");
    Comment c1 = new Comment("Have a nice trip");
    Comment c2 = new Comment("Wow that's awesome!");
    Post p1 = new Post ( sdf.parse("21/06/2018 13:05:44") ,"Traveling to New Zealand", "I'm going to visit this wonderful country!",12);
    p1.addComment(c1);
    p1.addComment(c2);
     
    System.out.println(p1);

      
    }
}
