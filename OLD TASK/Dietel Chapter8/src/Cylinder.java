public class Cylinder {

private double radius = 1;
private double height = 1;

public double calculateVolume(){

return Math.PI * radius * radius * height;}

public void setRadius(double radius){
if(radius > 0){this.radius= radius;}
else if(radius < 0) System.out.println("Radius cannot be negative");
        }
    public void setHeight(double height){
if (height > 0){this.height = height;}
else if(height < 0) System.out.println("Height cannot be negative");}

public double getRadius(){return radius;}



public double getHeight(){return height;}
}