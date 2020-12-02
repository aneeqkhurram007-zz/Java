import java.util.ArrayList;
import java.util.Arrays;

public class CountryClass implements Stats {
    private String name = "Pakistan";
    private Integer[] provincesArea = new Integer[] { 4000, 5000, 6000 };
    private ArrayList<Integer> statesArea = new ArrayList<>(Arrays.asList(7000, 8000, 9000));

    @Override
    public void computeArea() {

        int total = 0;

        for (int i = 0; i < provincesArea.length; i++) {
            total += getProvincesArea()[i] + getStatesArea().get(i);
        }

        System.out.println(getName() + " has a total area = " + total);

    }

    public CountryClass() {

    }

    @Override
    public void reset() {
        for (int i = 0; i < provincesArea.length; i++) {
            provincesArea[i] = 0;
            statesArea.set(i, 0);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer[] getProvincesArea() {
        return provincesArea;
    }

    public void setProvincesArea(Integer[] provincesArea) {
        this.provincesArea = provincesArea;
    }

    public ArrayList<Integer> getStatesArea() {
        return statesArea;
    }

    public void setStatesArea(ArrayList<Integer> statesArea) {
        this.statesArea = statesArea;
    }
}
