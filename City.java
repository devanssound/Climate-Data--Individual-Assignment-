/* City class */
public class City {
    private String name = "";
    private String state = "";
    private double highTemp = 0.0;
    private double lowTemp = 0.0;

    public City(String name, String state, double highTemp, double lowTemp) {
        name = this.name;
        state = this.state;
        highTemp = this.highTemp;
        lowTemp = this.lowTemp;
    }

    public String getName() {
        return this.name;
    }

    public String getState() {
        return this.state;
    }

    public double getHighTemp() {
        return this.getHighTemp();
    }

    public double getLowTemp() {
        return this.getLowTemp();
    }

    public void setHighTemp(double arg) {
        this.highTemp = arg;
    }

    public void setLowTemp(double arg) {
        this.lowTemp = arg;
    }

    public void printInfo() {
        System.out.println("printInfo");
    }
}