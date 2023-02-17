public class ProblemController {
     private ProblemModel pen;
     private ProblemView view;

     public ProblemController(ProblemModel pen,ProblemView view){
          this.pen=pen;
          this.view=view;
     }

     public void sell(int quantity){
          int currentQuantity=pen.getQuantity();
          if(currentQuantity>=quantity)
               pen.setQuantity(currentQuantity-quantity);

          else
               System.out.println("Sorry!!There is not enough pens in stock");
     }

     public void setBrand(String pen_brand){
          pen.setBrand(pen_brand);
     }

     public String getBrand(){
          return pen.getBrand(); 
     }

     public void setColor(String pen_color){
          pen.setColor(pen_color);;
     }

     public String getColor(){
          return pen.getColor(); 
     }

     public void setPrice(float pen_price){
          pen.setPrice(pen_price);;
     }

     public float getPrice(){
          return pen.getPrice(); 
     }

     public void setQuantity(int pen_quantity){
          pen.setQuantity(pen_quantity);;
     }

     public int getQuantity(){
          return pen.getQuantity(); 
     }

     public void updateView(){
          view.viewPenDetails(pen.getBrand(),pen.getColor(),pen.getPrice(),pen.getQuantity());
     }
}
