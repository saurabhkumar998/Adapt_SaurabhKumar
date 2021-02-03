import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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
		return city;
	}
}

public class Assignment5Q3 {
    public static List<Trader> printUniqueCities (List <Trader> traders) 
    {
    	
    	traders.stream().sorted(Comparator.comparing(Trader::getCity)).forEach((Trader)->System.out.println(Trader.getCity()));
    	return  traders;
    }
    public static List<Trader> tradersFromPuneSortByName(List<Trader> traders) 
    {
    	traders.stream().filter(p->p.getCity()=="Pune").sorted(Comparator.comparing(Trader::getName)).forEach((Trader)->System.out.println(Trader.getName()));
    	return traders;
    }
    public static List<Trader> alltrader3Names(List<Trader> traders) 
    {
    	traders.stream().sorted(Comparator.comparing(Trader::getName)).forEach((Trader)->System.out.println(Trader.getName()));
    	return traders;
    }
    public static ArrayList<Trader> areAnyTradersFromIndore(ArrayList<Trader> traders) 
    {
    	traders.stream().filter(p->p.getCity()=="Indore").forEach((Trader)->System.out.println(Trader.getName()));
		return traders;
    }
    
    
    @SuppressWarnings("unused")
	public static void main(String[] args) 
    {
    	ArrayList<Trader> traders=new ArrayList<Trader>();
    	traders.add(new Trader("Aditya gupta","Bihar"));
    	traders.add(new Trader("Rajan Kumar","Uttar Pradesh"));
    	traders.add(new Trader("Harsh mishra","Odisha"));
    	traders.add(new Trader("Ashish sharma","Hyderabad"));
    	traders.add(new Trader("Santosh Raj","Uttarakhand"));
    	traders.add(new Trader("Kansiska ","Mumbai"));
    	ArrayList<Trader> traders1=new ArrayList<Trader>();
    	traders1=(ArrayList<Trader>) printUniqueCities(traders);
    	ArrayList<Trader> traders2=new ArrayList<Trader>();
    	traders2=(ArrayList<Trader>) tradersFromPuneSortByName(traders);
    	ArrayList<Trader> traders3=new ArrayList<Trader>();
    	traders3=(ArrayList<Trader>) alltrader3Names(traders);
    	ArrayList<Trader> traders4=new ArrayList<Trader>();
    	traders4=(ArrayList<Trader>) areAnyTradersFromIndore(traders);
    	
    }
}