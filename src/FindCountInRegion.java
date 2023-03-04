import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FindCountInRegion {
    public List<String> getRegions(List<City> cityList) {
      // long count = cityList.stream().filter(city -> city.getRegion().equals("Татарстан")).count();

        return cityList.stream().map(city -> city.getRegion()).collect(Collectors.toList());
    }

    public HashMap<String, Long> countTownByRegion(List<City> cityList, List<String> regions){
        HashMap<String, Long> hashMapRegions = new HashMap<>();

        for(int i[] = {0}; i[0] < regions.size();i[0]++)
            hashMapRegions.put(regions.get(i[0]),cityList.stream().filter(city ->
                    city.getRegion().equals(regions.get(i[0]))).count());
        return hashMapRegions;
    }
    public String mapAsString(HashMap<String,Long> hashMap){
        StringBuilder mapAsString = new StringBuilder("");
        for (String key: hashMap.keySet()){
            mapAsString.append(key + " = " + hashMap.get(key) +"\n");
        }
        return mapAsString.toString();
    }
}
