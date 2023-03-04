import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        if(B < D) {
            System.out.println(A + (D-B)*C);
        } else System.out.println(A);


    }
}
//    Scanner scanner = new Scanner(new File("CityTable.csv"));
//    FindCountInRegion findCountInRegion = new FindCountInRegion();
//    List<City> cityArrayList = new ArrayList<>();
//        while (scanner.hasNextLine()) {
//                String[] strings = scanner.nextLine().split(";");
//                City city = null;
//                try {
//
//                city = new City(strings[1],strings[2],strings[3],strings[4],strings[5]);
//
//                } catch (ArrayIndexOutOfBoundsException e){
//
//                city = new City(strings[1],strings[2],strings[3],strings[4],"undefined");
//
//                } finally {
//
//                cityArrayList.add(city);
//
//                }
//                }
//                String content = findCountInRegion.mapAsString(
//                findCountInRegion.countTownByRegion(cityArrayList,findCountInRegion.getRegions(cityArrayList)));
//                System.out.println(content);