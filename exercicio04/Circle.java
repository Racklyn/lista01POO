package exercicio04;

public class Circle extends Shape {

    private Double radius;

    Double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        if (radius >= 0){
            this.radius = radius;
        }else{
            this.radius = 0.0;
        }
    }
    
}
