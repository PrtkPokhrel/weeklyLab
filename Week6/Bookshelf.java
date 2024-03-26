 
// Design and implement a class called Book that contains instance data for title, author, publisher and copyright date.
// -   Define that Book constructor to accept and initialize these data.
// -   Include setter and getter methods for all instance data.
// -   Include a toString method that returns a nicely formatted, multiline description of the book.
// -   Create a driver class called Bookshelf, whose main method instantiates and updates several Book objects.


package Week6;
 
public class Bookshelf{
    public static void main(String[] args) {
     
    Books book=new Books("One Piece","Eichiro Oda","Shounen Jump","None");
    Books book2=new Books("Computer Science","Computer Teacher","Computer Lab ","4 years"); 
    System.out.println(book.toString());
    System.out.println(book2.toString());

    }
        
    }


    class Books{

        private String title;
        private String author;
        private String publisher;
        private String copyrightDate;
    //constructor
        public Books(String title,String author,String publisher,String copyrightDate){
            this.title=title;
            this.author=author;
            this.publisher=publisher;
            this.copyrightDate=copyrightDate;
    
        }
    
        //set method
        public void setTitle(String title){
            this.title=title;
        }
        public void author(String author){
            this.author=author;
        }
        public void setpublisher(String publisher){
            this.publisher=publisher;
        }
        public void setcopyrightDate(String copyrightDate){
            this.copyrightDate=copyrightDate;
        }
    
        //get method
    
        public String getTitle(){
            return title;
        }
        public String getAuthor(){
            return author;
        }
        public String getPublisher(){
            return publisher;
        }
        public String copyrightDate(){
            return copyrightDate;
        }
    
        public String toString(){
            return "Book title is : "+ title+" which is written by "+author+" published by "+publisher+"and the copyright date is "+copyrightDate;
    
        }
    }
