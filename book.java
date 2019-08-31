import java.util.*;

class book
{
    String name ;
    String author;
    int price;
    int num_pages;
    public void book()
    {
        name = "" ;
        author = "";
        price = 0;
        num_pages = 0;
    }
    
    public void get()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the details :");
        System.out.println("Enter the name of the Book");
        name = sc.nextLine();
        System.out.println("Enter the name of the Author");
        author = sc.nextLine();
        System.out.println("Enter the price of the Book");
        price = sc.nextInt();
        System.out.println("Enter the total number of pages");
        num_pages = sc.nextInt();
    }
    
    public String toString()
    {
        return "\n" + "Name : " + name + " \n" + "Author : " + author + " \n" + "Price : " + price + " \n" + "Total number of pages : " + num_pages;
    }

    public static void main(String args[])
    {
        book b = new book();
        
        b.get();
        System.out.println(b);
      
        
    }

}