import java.util.*;

public class Problem{
     public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          ProblemModel pen=getProblemModelFromDB();
          ProblemView view=new ProblemView();
          ProblemController controller=new ProblemController(pen, view);
          controller.updateView();
          System.out.println("Enter the quantity: ");
          int quantity=sc.nextInt();
          controller.sell(quantity);
          double bill=quantity*pen.getPrice();
          System.out.println("Your bill: "+bill+"\nThank you for shopping");
          controller.updateView();
     }

     public static ProblemModel getProblemModelFromDB(){
          return new ProblemModel("Pierre Cardin", "Black", 120, 100);
     }
}
