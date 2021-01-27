public class Parallelogram extends Par_Shape{

    private Double height;
    private Double length_a;
    private Double length_b;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }


    public Double getLength_a() {
        return length_a;
    }

    public void setLength_a(Double length_a) {
        this.length_a = length_a;
    }

    public Double getLength_b() {
        return length_b;
    }

    public void setLength_b(Double length_b) {
        this.length_b = length_b;
    }

    public Double calcarea(){
        Par_Shape area = new Par_Shape();
        area.setArea(this.height * this.length_a);
        return area.getArea();
    }

    public Double calcper(){
        Par_Shape area = new Par_Shape();
        area.setperimetr(2 * (this.length_b + this.length_a));
        return area.getperimetr();
    }

}
