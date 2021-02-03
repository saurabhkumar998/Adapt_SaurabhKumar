import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator; 
class Assignment4Q6 {
    public static void main(String[] args) {
    	ArrayList<String> list = new ArrayList<>();
        list.add("Siddharth");
        list.add("Mahesh");
        list.add("Krishna");
        list.add("Anil");
        list.add("Suraj");
        System.out.print(new Assignment4Q6().convertToUpperCase(list));
    }
    public List<String> convertToUpperCase(List<String> list) {
    	UnaryOperator<String> uo = item -> item.toUpperCase();
    	list.forEach(n -> Collections.replaceAll(list,n,uo.apply(n)));
    	
    	return list;

    }
}