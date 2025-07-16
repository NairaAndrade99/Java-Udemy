public abstract class Shape {
    
    private Color color;

    public Shape(){

    }
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public  double area(){
        return 0.00;
    }
}
