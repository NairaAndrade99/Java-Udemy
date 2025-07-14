package Post;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import Comment.Comment;

public class Post {
    private Date moment;
    private String title;
    private String content;
    private int like;

private List<Comment> comments = new ArrayList<>();

SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:MM:SS");

public Post  (java.util.Date date, String string, String string2, int i){

}
public Post(Date moment, String title, String content, int like, Comment comment) {
    this.moment = moment;
    this.title = title;
    this.content = content;
    this.like = like;


}

public Date getMoment() {
    return moment;
}
public void setMoment(Date moment) {
    this.moment = moment;
}
public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
}
public String getContent() {
    return content;
}
public void setContent(String content) {
    this.content = content;
}
public int getLike() {
    return like;
}
public void setLike(int like) {
    this.like = like;
}
public List<Comment> getComment() {
    return comments;
}
public void addComment(Comment comment) {
    comments.add(comment);
}
public void removerComment(Comment comment) {
    comments.remove(comment);
}
 public String toString (){
       
     StringBuilder sb = new StringBuilder();
     sb.append(title + "\n");
     sb.append(like );
     sb.append( "likes - ");
     sb.append(sdf.format(moment) + "\n");
     sb.append(content +"\n"); 
     sb.append(" Comments: \n"); 

     for(Comment c : comments){
           sb.append(c.getText()+"\n"); 

     }
      return sb.toString();
 }

}

