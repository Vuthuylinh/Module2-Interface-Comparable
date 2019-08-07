public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>{

    public ComparableRectangle() {

    }

    public ComparableRectangle(double length, double width) {
        super(length, width);
    }

    public ComparableRectangle(String color, boolean filled, double length, double width) {
        super(color, filled, length, width);
    }

    @Override
    public int compareTo(ComparableRectangle rec1) {
        if(this.getArea()>rec1.getArea())
        return 1;
        else if(this.getArea()<rec1.getArea()){
            return -1;

        }else{
            return 0;
        }
    }


}
