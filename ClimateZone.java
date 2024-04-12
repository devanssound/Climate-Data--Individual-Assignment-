/* ClimateZone class */
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
// ClimateZone is an object class blueprint
// ClimateZone constructor
public class ClimateZone {

    String dataString;
    public ArrayList<ClimateZone> cityList;

    public ClimateZone(String fileName) {
        cityList = new ArrayList<ClimateZone>();
        try {
            File dataFile = new File(fileName);
            FileReader nerd = new FileReader(dataFile);
            Scanner scan = new Scanner(nerd);
            if (dataFile.exists()) {
                System.out.println("Absolute path: " + dataFile.getAbsolutePath());
            }
            while (scan.hasNextLine()) {
                cityList.add(scan.nextLine());
                System.out.println(cityList);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Una problema?\n");
            e.printStackTrace();
        }
    }

    public City addCity(String name, String state, double highTemp, double lowTemp) {
        City.add(name);

    }

    public int getCityCount() {
        return City.Count();
    }

    public City getCityByName() {

    }

    public void printHottestCities() {
        System.out.println("HOT HOT HOT");
    }

    public void printColdestCitites() {
        System.out.println("BURRRRRRRR");
    }

    public void printAllCities() {
        System.out.println("all cities.");
    }

    public static void listAllCities(ClimateZone cityList) {
        int i = 0;
        while (i < cityList.size()) {
            System.out.println(cityList.get(i));
        }
    }
}