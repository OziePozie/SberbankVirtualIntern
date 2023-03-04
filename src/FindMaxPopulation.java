import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class FindMaxPopulation {
    public String maxPopulation(List<City> listCity){
        City[] cityArray = listCity.toArray(new City[0]);
        long maxPop = Long.MIN_VALUE;
        int finalIndex = 0;
        int i = 0;
        for (City city:cityArray) {

            if (Long.parseLong(city.getPopulation()) > maxPop) {
                finalIndex = i;
                maxPop = Long.parseLong(city.getPopulation());
            }
            i++;
        }
        return "[" + finalIndex +"] = " + maxPop;
    }
}
