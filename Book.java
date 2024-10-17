class Book{
    String title;

public void displayTitle(){
    System.out.println(title);
}

public void setTitle(String title){
    this.title = title;
}
public static void main(String args[]){
    Book myBook = new Book();
    myBook.title = "The Alchemist";
    myBook.displayTitle();
    myBook.setTitle("Gulliver Travels");
    myBook.displayTitle();
}
}
