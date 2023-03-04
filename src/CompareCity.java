import java.util.List;

public class CompareCity {

    public List<City> sortByName(List<City> list, boolean isIgnoreCase){
        if (isIgnoreCase)  list.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        else list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        return list;

    }
    public List<City> sortByDistrict(List<City> list, boolean isIgnoreCase){
        if (isIgnoreCase)  list.sort((o1, o2) -> o1.getDistrict().compareToIgnoreCase(o2.getDistrict()));
        else list.sort((o1, o2) -> o1.getDistrict().compareTo(o2.getDistrict()));
        return list;

    }

    public List<?> sortByNameAndDistrict(List<City> list){

        sortByDistrict(sortByName(list,false),false);
        return list;
    }

}
