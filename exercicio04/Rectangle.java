package exercicio04;

public class Rectangle extends Shape {

    private Double width;
    private Double height;

    Double area() {
        return this.width * this.height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        if (width >= 0){
            this.width = width;
        }else{
            this.width = 0.0;
        }
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        if (height >= 0){
            this.height = height;
        }else{
            this.height = 0.0;
        }
    }
    
}
