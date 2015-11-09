abstract class Vehicle { //capitalized vehicle, made this class abstract
  int seats;
  int mileage;
  int baseHourlyRate;
  
  Vehicle (int seats, int mileage, int baseHourlyRate) { //added these construct here
    this.seats = seats;
    this.mileage = mileage;
    this.baseHourlyRate = baseHourlyRate;
  }
  int rentalCost(int numHours) {
    return numHours * this.baseHourlyRate;
  }
   boolean NeedsOilChange() { //added needsoilchange to abstract class vehicle
    return false;
  }
}

abstract class Luxury extends Vehicle{ //capitalized luxury, made this class abstract, extrended vehicle
  int premiumPrice;
  Luxury (int seats, int mileage, int baseHourlyRate,int premiumPrice) { //added these construct here
    super(seats, mileage, baseHourlyRate);
    this.premiumPrice = premiumPrice;
  }
    int hourlyCost() {
  return  this.premiumPrice + this.baseHourlyRate; 
    
  }
  int rentalCost(int numHours) { //added rentalCost to override RentalCost from vehicle
    return numHours * hourlyCost();
  }
}

class Rickshaw extends Vehicle { 
  Rickshaw(int seats, int mileage, int baseHourlyRate) { //added int baseHourlyRate
    super(seats, 0, baseHourlyRate); // set mileage to 0
  }
 
}

class SchoolBus extends Vehicle {
  String color;
  SchoolBus (int seats, int mileage, int baseHourlyRate, String color) { //added construct here
  super(seats, mileage, baseHourlyRate);
   this.color =  color;
  }
  boolean NeedsOilChange() {
    return (this.mileage > 6000);
  }
}

class Limo extends Luxury { //exteneded Luxury abstract class, eliminated extending abstract class Vehicle
  boolean hasDiscoLights;
  Limo (int seats, int mileage, int baseHourlyRate,int premiumPrice, boolean hasDiscoLights) { //added construct
    super(seats, mileage, baseHourlyRate, premiumPrice);
    this.hasDiscoLights = hasDiscoLights;
  }
  //removed hourlyCost method and added to Luxury abstract class
  boolean NeedsOilChange() {
    return (this.mileage > 3000);
  }
  
}
class Unicycle extends Vehicle {
  Unicycle(int seats, int mileage, int baseHourlyRate) { //added int baseHourlyRate
    super(1, 0, baseHourlyRate); //made mileage 0
  }
  //removed needsOilChange method
}