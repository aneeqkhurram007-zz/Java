package task5;

/**
 * animal
 */
public class animal {
    private String speciesName;
    private double population;
    private double growthRate;

    // Getters and Setters
    public String getSpeciesName() {
        return this.speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public double getPopulation() {
        return this.population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getGrowthRate() {
        return this.growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    // Constructor
    public animal(String name, double pop, double growth) {
        speciesName = name;
        population = pop;
        growthRate = growth;
    }

    // toString method
    public String toString() {
        return " Animal Data\n\tSpecie Name: " + speciesName + "\n\tPopulation: " + population + "\n\tGrowth Rate: "
                + growthRate;
    }

    // equals method
    public boolean isEquals(animal a) {
        return speciesName.equals(a.speciesName);
    }

    public boolean endangered() {

        return growthRate < 0;

    }
}