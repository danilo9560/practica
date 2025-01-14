public class temp {
  public static void main(String[] args) {
    int testCore = 90;
    char grade;
    String message = "";
    if(testCore>=90){
      grade =  'A';    
    }else if(testCore>=80){
      grade =  'B';    
    }else if(testCore>=70){
      grade =  'C';    
    }else if(testCore>=60){
      grade =  'D';    
    }else{
      grade =  'F';    
    }
    if(testCore>=80){
      message= " Aprobado";
    }else{
      message= " Reprobado";
    }

    System.out.println("Grade = " + grade + message);
  }
}
