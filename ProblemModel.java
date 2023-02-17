public class ProblemModel {
     private String pen_brand;
     private String pen_color;
     private float pen_price;
     private int pen_quantity;

     ProblemModel(String pen_brand,String pen_color,float pen_price,int pen_quantity){
          this.pen_brand=pen_brand;
          this.pen_color=pen_color;
          this.pen_price=pen_price;
          this.pen_quantity=pen_quantity;
     }

     public void setBrand(String pen_brand){
          this.pen_brand=pen_brand;
     }

     public String getBrand(){
          return pen_brand; 
     }

     public void setColor(String pen_color){
          this.pen_color=pen_color;
     }

     public String getColor(){
          return pen_color; 
     }

     public void setPrice(float pen_price){
          this.pen_price=pen_price;
     }

     public float getPrice(){
          return pen_price; 
     }

     public void setQuantity(int pen_quantity){
          this.pen_quantity=pen_quantity;
     }

     public int getQuantity(){
          return pen_quantity; 
     }
}
