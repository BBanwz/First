public class Triangle extends  Triangle_Shape{
    private Double height;
    private Double length;


    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }


    public Double calcarea(){
        Triangle_Shape area = new Triangle_Shape();
        area.setArea((this.height * this.length) / 2);
        return area.getArea();
    }

    public Double calcper(){
        Triangle_Shape area = new Triangle_Shape();
        area.setPerimetr(this.length * 3);
        return area.getPerimetr();
    }
}
