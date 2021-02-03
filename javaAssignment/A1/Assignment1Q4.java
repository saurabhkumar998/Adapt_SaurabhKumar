class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
        String msg = "";
        
        if(subject1Marks + subject2Marks + subject3Marks < 60.0){
            msg = "failed";
        }
        
        if(subject1Marks+subject2Marks+subject3Marks > 60.0){
            msg = "passed";
        }
        
        if(subject1Marks+subject2Marks > 60.0 || subject2Marks+subject3Marks > 60.0 || subject1Marks+subject3Marks > 60.0){
                msg = "promoted";
        }
            
        if(subject1Marks > 60.0 && subject2Marks + subject3Marks < 60.0){
               msg = "failed";
        }
        
        if(subject2Marks > 60.0 && subject1Marks + subject3Marks < 60.0){
               msg = "failed";
        }
        
        if(subject3Marks > 60.0 && subject2Marks + subject1Marks < 60.0){
               msg = "failed";
        }
        
        return msg;
    }
}
public class Assignment1Q4 {
    public static void main(String[] args) {
        ResultDeclaration obj = new ResultDeclaration();
        
        System.out.println(obj.declareResults(10,10,10));
        System.out.println(obj.declareResults(70,10,10));
        System.out.println(obj.declareResults(10,20,40));
    }
}