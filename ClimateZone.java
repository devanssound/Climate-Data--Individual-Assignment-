/* ClimateZone.java */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
// ClimateZone is an object class blueprint
// ClimateZone constructor
public class ClimateZone {

    private ArrayList<City> cityList;

    public ClimateZone() {
        this.cityList = new ArrayList<City>();
    }

    public ClimateZone(String fileName) {
        this.cityList = new ArrayList<City>();
        File dataFile = new File(fileName);
        try (Scanner scan = new Scanner(dataFile)) {
            while (scan.hasNextLine()) {
                String cityZone = scan.nextLine();
                String[] data = cityZone.split("\\s");
                String cityName = data[0];
                String stateName = data[1];
                double highTemp = Double.parseDouble(data[2]);
                double lowTemp = Double.parseDouble(data[3]);

                // Create a new City object
                City newCity = new City(cityName, stateName, highTemp, lowTemp);
                cityList.add(newCity);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public void addCity(String name, String state, double highTemp, double lowTemp) {
        // After creating a new city object, add that value into the Array List
        City newCity = new City(name, state, highTemp, lowTemp);
        cityList.add(newCity);
    }

    public int getCityCount() {
        // this method returns an int counting the number of cities in the ClimateZone ArrayList object
        return this.cityList.size();
    }

    public City getCityByName(String name, String state) {
        for (City city : cityList) {
            if (city.getName().equals(name) && city.getState().equals(state)) {
                return city;
            }
        }
        return null;
    }

    public void printHottestCities() {
        // We need to iterate through the cityList object, use .getHighTemp()
        // Call printInfo method on Cit objects
        double aHotTemp = 0.0;
        double bHotTemp = 0.0;
        City aHotCity = null;
        City bHotCity = null;
        for (City city : cityList) {
            if (city.getHighTemp() > aHotTemp) {
                bHotTemp = aHotTemp;
                bHotCity = aHotCity;
                aHotTemp = city.getHighTemp();
                aHotCity = city;
            } else if (city.getHighTemp() > bHotTemp) {
                bHotTemp = city.getHighTemp();
                bHotCity = city;
            }
        }
        if (aHotCity != null)
            aHotCity.printInfo();
        if (bHotCity != null)
            bHotCity.printInfo();
    }

    public void printColdestCities() {
        double aColdTemp = Double.MAX_VALUE;
        double bColdTemp = Double.MAX_VALUE;
        City aColdCity = null;
        City bColdCity = null;
        for (City city : cityList) {
            if (city.getLowTemp() < aColdTemp) {
                bColdTemp = aColdTemp;
                bColdCity = aColdCity;
                aColdTemp = city.getLowTemp();
                aColdCity = city;
            } else if (city.getLowTemp() < bColdTemp) {
                bColdTemp = city.getLowTemp();
                bColdCity = city;
            }
        }
        if (aColdCity != null)
            aColdCity.printInfo();
        if (bColdCity != null)
            bColdCity.printInfo();
    }

    public void printAllCities() {
        // this method will need to use .printInfo
        if (cityList.isEmpty()) {
            System.out.println("ity List object is empty.");
        } else {
            for (City city : cityList) {
                city.printInfo();
            }
        }
    }
}
