# Ocean_Monitoring_System.GS24
This project aims to develop a comprehensive system for monitoring ocean waters by collecting crucial data. The system will enable users to consult and classify areas that require increased attention, ensuring effective and targeted ocean conservation efforts.


## Introduction

This Ocean Monitoring System is a Java application designed to collect and analyze crucial data for monitoring ocean waters. This system can store, query, and generate classifications for areas that require closer attention based on environmental data collected from ocean buoys.

## Project Overview

To understand the processes occurring in the marine environment, it is essential to collect information that allows for observation of the ocean's surface, water column, seabed, and substrate below. Various methods exist for studying the sea, some involving direct collection and measurement in the field, while others use remote sensing to obtain data.

One effective way to observe a large maritime area is through satellite remote sensing, which provides near real-time observations. These observations allow for the spatial assessment of phenomena typically studied locally with field equipment. Calibration and validation of satellite data are performed using field sensors.

In Brazil, the PIRATA project monitors the waters of the tropical Atlantic Ocean using a network of buoys equipped with various sensors to measure atmospheric and oceanic variables. These buoys, manufactured as part of a technology transfer from the United States, collect data on rainfall, wind direction and speed, solar radiation, GPS coordinates, temperature, relative humidity, CO2 concentration, salinity, and other important parameters.

## Features

The GS24 Ocean Monitoring System includes the following features:
* **Data Storage**: Stores various points identified by GPS coordinates where buoys are installed, along with their salinity and temperature measurements.
* **Area Classification**: Generates a list of locations requiring more detailed studies based on measurements indicating potential environmental issues.
* **Data Query**: Allows for querying specific measurements over the day using a table of sensor coordinates and a hash code for optimized data storage.

## Tasks

The project involves the following tasks:
1. **Define the Boia Class**: Implement the Boia class to represent buoy records.
2. **Generate Hash Code**: Implement a function to generate a hash code based on the buoy's coordinates.
3. **Read Coordinates from File**: Implement a function to read buoy coordinates from a file and store them in the Boia class, generating the hash code.
4. **Read Salinity and Temperature**: Implement a function to read salinity and temperature measurements from the keyboard and store them in the Boia class.
5. **Sort by Hash Code**: Implement a sorting algorithm to order the buoys by hash code.
6. **Binary Search**: Implement a binary search algorithm to find buoy measurements based on the hash code.

## Getting Started

To get started with the GS24 Ocean Monitoring System, follow these steps:

1. **Clone the Repository**: 
    ```sh
   git clone https://github.com/pcnasc/Ocean_Monitoring_System.GS24.git

    ```

2. **Open the Project in Your Preferred IDE**: Import the project into your preferred Java IDE (Eclipse, IntelliJ IDEA, or NetBeans).

3. **Compile and Run**: Compile and run the `Main` class to start the application.

## Usage

The application provides a menu with the following options:

1. **Presentation of Buoys**: Displays all buoy records.
2. **Insertion of Buoy**: Inserts a new buoy record.
3. **Update Measurements**: Updates measurements for each buoy record.
4. **Search Measurements**: Searches for buoy measurements by hash code.
0. **Exit**: Exits the program.

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is licensed under the MIT License.

## References

* [PIRATA Project](https://www.gov.br/mcti/pt-br/acompanhe-o-mcti/noticias/2022/10/pirata-projeto-de-cooperacaointernacional-oceanografico-celebra-25-anos-com-avancos-cientificos)
* [National Oceanic and Atmospheric Administration (NOAA)](https://www.noaa.gov/)

## Acknowledgments

Special thanks to the professors and staff at FIAP for their guidance and support throughout this project.
