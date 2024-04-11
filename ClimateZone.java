/* ClimateZone class */
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
// ClimateZone is an object class blueprint
// ClimateZone constructor
public class ClimateZone {
    public ClimateZone() {

    }

    public ClimateZone(String fileName) {
        try {
            File dataFile = new File(fileName);
            FileReader nerd = new FileReader(dataFile);
            Scanner scan = new Scanner(nerd);
            if (dataFile.exists()) {
                System.out.println("Absolute path: " + dataFile.getAbsolutePath());
            }
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                System.out.println(data);

            }

            scan.close();
        } catch (FileNotFoundException e) {
        System.out.println("Una problema?\n");
        e.printStackTrace();
    }

    }

}