import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

        ArrayList<GeometricObject> arrayList = new ArrayList<>();
        arrayList.add(new Circle(4.0));
        arrayList.add(new Circle(5.0));
        arrayList.add(new ResizableCircle(4.0));
        arrayList.add(new ResizableCircle(5.0));
        for (GeometricObject geometricObject : arrayList) {
            System.out.println(geometricObject);
        }

    }
}
