public class AreaOfCircle {
   
        // Create the usefull attributes
        int radius;
    
        AreaOfCircle(int radius){
            this.radius = radius;
        }
    
        void display(){
            System.out.println("Area of Circle of radius is "+this.radius + " is "+ Math.PI * Math.pow(radius,2 ));
        }
    
        public static void main(String[] args) {
            AreaOfCircle area = new AreaOfCircle(2);
            area.display();
        }
    }

