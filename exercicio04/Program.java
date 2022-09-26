package exercicio04;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Shape> shapes = new ArrayList<Shape>();

        System.out.print("Enter the number of shapes: ");
        int nShapes = sc.nextInt();

        for(int c=0; c<nShapes; c++){
            System.out.println("**Shape #"+ (c+1) +" data:**");

            System.out.print("Rectangle or Circle (r/c)? ");
            String type = sc.next();
            
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.next().toUpperCase();

            Shape shape;

            if (type.equalsIgnoreCase("r")){
                Rectangle rect = new Rectangle();
                System.out.print("Width: ");
                rect.setWidth(sc.nextDouble());
                
                System.out.print("Height: ");
                rect.setHeight(sc.nextDouble());
                
                shape = rect;
            }else{
                Circle cir = new Circle();
                System.out.print("Radius: ");
                cir.setRadius(sc.nextDouble());
                
                shape = cir;
            }
            shape.setColor(Color.valueOf(color));

            shapes.add(shape);
        }

        System.out.println("SHAPE AREAS:");
        for (Shape s: shapes){
            System.out.println(String.format("%.2f",s.area()));
        }

        sc.close();

    }
}