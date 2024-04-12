15.6 Climate Data (Individual Assignment)
Rules

# Required Skills Inventory

## Write a class to specifications

Declare a private instance variable in a Java class
Initialize a private instance variable in a Java class
Implement an attribute as a private instance variable in a Java class
Write a method that takes no arguments and returns no value
Assign a value to an instance variable from within a constructor method
Implement an overloaded parameterized constructor method in a Java class
Write a method that takes no arguments and returns a value
Retrieve the value stored in an instance variable from within an instance method
Implement a getter method in a Java class
Write a method that takes an argument and returns no value
use parameter variables in a method
Assign a value to an instance variable from within an instance method
Implement a setter method in a Java class
Use a FileInputStream to open a file for reading
Use a Scanner to read input from a file
Use the Scanner methods to determine if there is more data in a file to read
Use a loop to iterate over the elements of an ArrayList
Declare and instantiate an ArrayList
Use an if statement to get the computer to make a decision
Use a loop to repeat instructions
Search an array or ArrayList for a specific item
Use System.out.printf to print out formatted text
Read and understand given Java code
Develop a project using an Integrated Development Environment
This project requires the use of an Integrated Development Environment (IDE) to develop your code. An editor will not be provided in this assignment, please see the previous sections for instructions on how to setup and use an IDE.

Problem Description and Given Info
A local climate researcher would like some help with their climate data analysis. They would like a program to help them identify the hottest and coldest cities in various climate zones. They have temperature data for the major U. S. cities within each climate zone, stored in text files that contain the name of the city, the name of the state, the high temperature, and the low temperature for each city in the climate zone. Each data field is separated by a space. For example, one line in a climate zone data file would look like:

Denver Colorado 31.0 -6.2
The researcher would like the program to do the following:

Present a menu with the following options:

1. Open a climate zone data file
2. List all cities
3. List hottest cities
4. List coldest cities
5. Add a city
6. Change a city's temperatures
7. Count cities
8. Quit program
When the user chooses 1 to open a climate zone data file, the program will ask for the file name of a climate zone data file, then open and read the data from that file into an ArrayList.

When the user chooses 2 to list all cities, the program will list the name, state, high temp. and low temp. of all cities in the current climate zone.

When the user chooses 3 to list the hottest cities, the program will determine and list the name, state, high temp. and low temp. of the 2 cities with the highest high temperatures in the current climate zone.

When the user chooses 4 to list coldest cities, the program will determine and list the name, state, high temp. and low temp. of the 2 cities with the lowest low temperatures in the current climate zone.

When the user chooses 5 to add a city, the program will prompt the user to enter the new city's name, state name, high temp. (double), and low temp. (double). The program should collect this information from the user, and then instantiate a new City object with the given name and info, and add that city to the current ClimateZone.

When the user chooses 6 to change a city's stats, the program will prompt the user to enter the city's name and the state name. If there is a City in the current climate zone with the given name and state, then the program will collect the new high temp. (double), and low temp. (double), and will update the temperature values for this city.

When the user chooses 7 to count the cities in the current climate zone, the program will display the number of cities in the current climate zone.

When the user chooses 8 the program will end.

The Main class has already been designed and written for this program. Carefully review the code in the Main.java file and be sure that you understand how it works.

Your task is to implement the City and ClimateZone classes. The City class will allow us to instantiate City objects that will store the important information (name, state, high temp., low temp.) for a city. The ClimateZone class will allow us to create and manage a list of cities - we will use an ArrayList<City> to store the City objects.

# Part 1 - Implement the City Class

In a file named City.java, implement the class described below.

The City class must have the following private instance variables:

a variable named name that will store a String
a variable named state that will store a String
a variable named highTemp that will store a double
a variable named lowTemp that will store a double
The City class must have the following public constructor method:

an overloaded constructor that takes four arguments. The first argument will be a String (city name). The second argument will be a String (state name). The third (high temp.) and fourth (low temp.) arguments will be type double.
The City class must have the following public methods:

a method named getName. This accessor method will take no arguments. This method will return a String.
a method named getState. This accessor method will take no arguments. This method will return a String.
a method named getHighTemp. This accessor method will take no arguments. This method will return a double.
a method named setHighTemp. This mutator method will take one double argument. This method will not return anything.
a method named getLowTemp. This accessor method will take no arguments. This method will return a double.
a method named setLowTemp. This mutator method will take one double argument. This method will not return anything.
a method named printInfo. This method will take no arguments. This method will not return anything.

# Other Details

The overloaded constructor should initialize the object's name, state, highTemp and lowTemp variables with the values passed in to the parameter variables.
The getName accessor method should simply return the value stored in the object's name variable.
The getState accessor method should simply return the value stored in the object's state variable.
The getHighTemp accessor method should simply return the value currently stored in the object's highTemp variable.
The setHighTemp mutator method should store the value passed in as an argument in the object's highTemp variable.
The getLowTemp accessor method should simply return the value currently stored in the object's lowTemp variable.
The setLowTemp mutator method should store the value passed in as an argument in the object's lowTemp variable.
The printInfo method should print out to the console, the name, state, high temp., and low temp. The printout should look like this:
Denver, Colorado (High = 31.00, Low = -6.00)
Note that the temperature values always have 2 decimal places of precision.

# Part 2 - Implement the ClimateZone Class

In a file named ClimateZone.java, implement the class described below.

The ClimateZone class must have the following private instance variables:

* a variable named cityList that will store a reference to an ArrayList<City>
The ClimateZone class must have the following public constructor methods:

* a default constructor
an overloaded constructor that takes one argument. This argument will be a String.
The ClimateZone class must have the following public methods:

* a method named addCity. This method will take four arguments. The first argument will be a String (city name). The second argument will be a String (state name). The third (high temp.) and fourth (low temp.) arguments will be type double.
* a method named getCityCount. This method will take no arguments. This method will return an int.
* a method named getCityByName. This method will take two String arguments. This method will return a City reference.
* a method named printHottestCities. This method will take no arguments. This method will not return anything.
* a method named printColdestCities. This method will take no arguments. This method will not return anything.
* a method named printAllCities. This method will take no arguments. This method will not return anything.
Other Details

The default constructor should instantiate a new ArrayList object, and store a reference to this object in the ClimateZone's cityList instance variable.
The overloaded constructor should instantiate a new ArrayList object, and store a reference to this object in the ClimateZone's cityList instance variable. It should then open the climate zone data file named in the parameter variable. It should then read in the data from this file and, for each line in the file, it should create (instantiate) a new City object with the name, state, high temp., and low temp. on that line, and add this City to the ArrayList cityList.
The addCity method should instantiate a new City object with the name, state, high temp., and low temp. provided in the argument values, and then add this City to the ClimateZone's ArrayList<City> object.
The getCityCount method should return the number of cities currently stored in the ClimateZone's ArrayList<City> object.
The getCityByName method should iterate through the ClimateZone's ArrayList<City> object and search for a City with a name and state that are equal to the argument values. If such a City is found, then this method should return a reference to that City object, otherwise this method should return null.
The printHottestCities method should determine the two Cities objects with the highest high temps. (in descending order). It should then call the printInfo method on these City objects.
The printColdestCities method should determine the two City objects with the lowest low temps. (in ascending order). It should then call the printInfo method on these City objects.
The printAllCities method should iterate through the ClimateZone's ArrayList<City> object and call the printInfo method on each of these City objects.