import java.util.*;
class Fruit {
    public String name;
    private int calories;
	private int price;
    private String color;
    public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
    
}
public class Assignment5Q1 {

    public static List<Fruit> reverseSort(ArrayList<Fruit> fruits) 
    {
    	Collections.reverse(fruits);
    	fruits.stream().filter(p->p.getCalories()<100).forEach((fruit)->System.out.println(fruit.getName()+"   "+fruit.getCalories()));
		return fruits;
    	
    }
    public static ArrayList<Fruit> sort(ArrayList<Fruit> Fruits)
    {
    	Fruits.stream().sorted(Comparator.comparing(Fruit::getColor)).forEach((fruit)->System.out.println(fruit.getName()));
    	return Fruits;
    }

    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> FRuits)
    {
    	FRuits.stream().filter(p->p.getColor()=="Red").forEach((fruit)->System.out.println(fruit.getName()));
    	
    	return FRuits;
    }

    @SuppressWarnings("static-access")
	public static void main(String[] args) 
    {
    	
    	
    	ArrayList<Fruit> Fruits=new ArrayList<Fruit>();
    	Fruits.add(new Fruit("Apple",1000,100,"red"));
    	Fruits.add(new Fruit("mango",10,50," Green"));
    	Fruits.add(new Fruit("grapes",30,100,"green"));
    	Fruits.add(new Fruit("banana",400,200,"yellow"));
    	 
    	List<Fruit> Fruits1=new ArrayList<Fruit>(); 
		Fruits1=(ArrayList<Fruit>) reverseSort(Fruits);
        System.out.println("------");
        
    	ArrayList<Fruit> Fruits2=new ArrayList<Fruit>(); 
		Fruits2=(ArrayList<Fruit>) sort(Fruits);
    	System.out.println("------");
    	
    	ArrayList<Fruit> Fruits3=new ArrayList<Fruit>(); 
		Fruits3=(ArrayList<Fruit>) filterRedSortPrice(Fruits);  	
     }

}