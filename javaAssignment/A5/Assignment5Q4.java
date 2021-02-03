import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Trader {
    private String name;
    private String city;
    
    
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	public String getName() {
		return name;
		}
	public String getCity() {
		return city;}
	
	public String toString(){ return "{name='"+this.name+"', city='"+this.city+"'}";}


}
class Transaction {
    private Trader trader;
    private int year;
    private int value;
    
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	
	public Trader getTrader() {return trader;}
	public int getYear() {return year;}
	public int getValue() {return value;}
	
	public String toString(){ return "Transaction{trader=Trader"+this.trader+", year="+this.year+", value="+this.value+"}";}

}


public class Assignment5Q4 {
    

    public static void main(String[] args) {
    
		
		List<Transaction> list=new ArrayList<Transaction>();
    	list.add(new Transaction(new Trader("Basant","Kanput"),2012,687300000));
    	list.add(new Transaction(new Trader("Aman","Sikkim"),2009,67500000));
    	list.add(new Transaction(new Trader("Arnab","Mumbai"),1999,893200000));
    	list.add(new Transaction(new Trader("Saurabh","Patna"),2008,135760000));
    	
        sortTransactions(list).forEach(k-> System.out.println(k));
        System.out.println("\n");
        transaction3sValuesDelhi(list).forEach(k-> System.out.println(k));
        System.out.println("\n");
        System.out.println(highestTransaction2(list));
        System.out.println("\n");
        System.out.print(smallestTransaction1(list));
    }
    
    
    
    public static List<Transaction> sortTransactions(List <Transaction> transactions) {
        List<Transaction> l = new ArrayList<>();
        transactions.stream().filter(c -> c.getYear()==2011).forEach(e -> l.add(e));
  	    Collections.sort(l,new Sortbyvalue());
  	    return l;
     }
    
    

    public static List<Integer> transaction3sValuesDelhi(List<Transaction> transactions) {
        List<Integer> l = new ArrayList<>();
        transactions.stream().filter(c -> c.getTrader().getCity().equalsIgnoreCase("delhi")).forEach(e -> l.add(e.getValue()));
   	    return l;
     }
     
   
     
    public static int highestTransaction2(List<Transaction> transactions){
     	List<Integer> l = new ArrayList<>();
     	transactions.stream().forEach(e -> l.add(e.getValue()));

     	int max = l.stream().max(Comparator.comparing(i -> i)).get();
     	return max;
     }

     
     
    public static int smallestTransaction1(List<Transaction> transactions){
     	List<Integer> l = new ArrayList<>();
     	transactions.stream().forEach(e -> l.add(e.getValue()));

     	int min = l.stream().max(Comparator.comparing(i -> -i)).get();
     	return min;
     }
}
class Sortbyvalue implements Comparator<Transaction> 
{ 
    public int compare(Transaction a, Transaction b) { return a.getValue()-(b.getValue()); } 

}