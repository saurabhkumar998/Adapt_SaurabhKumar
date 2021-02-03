import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment3Q3 {
    public static List traverseReverse(ArrayList<String> aList)
    {
    	 ArrayList<String> revArrayList = new ArrayList<String>(); 
         for (int i = aList.size() - 1; i >= 0; i--) 
         { 
             revArrayList.add(aList.get(i)); 
         }
		return revArrayList;
	}
    public static void main(String[] args) 
    {
    	ArrayList<String> nList = new ArrayList<String>();
    	ArrayList<String> rList = new ArrayList<String>();
        nList.add("Saurabh");
        nList.add("Aryan");
        nList.add("Kishan");
        nList.add("Ram");
        nList.add("Shashank");
        System.out.println(nList);
        rList=(ArrayList<String>) traverseReverse(nList);
        ListIterator<String> revList=rList.listIterator();
        while (revList.hasNext()) {
            System.out.print(revList.next()+" ");
         }
    }
}