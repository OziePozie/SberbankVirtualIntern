import java.util.Comparator;
import java.util.Scanner;

public class City {
    String name;
    String region;
    String district;
    String population;
    String foundation;
    City(String name,String region, String district, String population, String foundation){
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "\nCity{name=" + name + ", region=" + region + ", district=" + district + ", population=" + population + ", foundation=" + foundation + "}";
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getDistrict() {
        return district;
    }

    public String getPopulation() {
        return population;
    }

    public String getFoundation() {
        return foundation;
    }
}
