package Inheritance;

public class Book 
{
	String name;
	int price;
	Author author;
	Publisher publisher;

	Book(String name,int price, Author author2, Publisher publisher2)
	{
		this.name=name;
		this.price=price;
		this.author = author2;
        this.publisher = publisher2;
	}
	
	void display()
	{
		 System.out.println("Book name: " + name);
	     System.out.println("Book price: " + price);
	     System.out.println("---------------------Author Details------------------------");
	     System.out.println("Author Name: " + author.name);
	     System.out.println("Author Age: " + author.age);
	     System.out.println("Author Place: " + author.Place);
	     System.out.println("---------------------Publisher Details------------------------");
	     System.out.println("Publisher Name: " + publisher.name);
	     System.out.println("Publisher ID: " + publisher.id);
	     System.out.println("Publisher City: " + publisher.city);

	}
	
	public static void main(String[] args) 
	{
        Author a = new Author("Micheal", 32, "USA");
        Publisher p = new Publisher("Sun Publisher",1110, "London");
        Book book = new Book("Core Java", 800, a, p);
        book.display();
    }

}
