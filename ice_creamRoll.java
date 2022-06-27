//ice-creamRoll Truck Selling

public class ice_creamRoll {
  //attributes
  Integer numRolls;
  Integer numFlavors;
  double oneIceCreamRoll = 0.80; 
  double oneFlavor = 0.50; //when you want to have more than one flavor, it will start to add up by $1.25
  Double rollsPrice;
  Double flavorsPrice;
  Double finalBill; 
  

  //Integer Constructor
  public ice_creamRoll(Integer rollsNumber, Integer flavorsNumber ){
    numRolls = rollsNumber;
    numFlavors = flavorsNumber;
  }

  //The intValue method: wrapping because you're going from int to Integer
  public void getNumofRolls(){
    System.out.println("Ordered Numbers of Rolls: "+ numRolls.intValue()); //The intValue method
  }

  public void getFlavorNumofKinds(){
    System.out.println("Ordered Numbers of Flavors: "+ numFlavors.intValue()); //The intValue method
  }


  public void calculatingBill(double chooseIce_CreamSizePortion){
    rollsPrice = numRolls * oneIceCreamRoll;
    flavorsPrice = numFlavors * oneFlavor;
    finalBill = rollsPrice + flavorsPrice;
    System.out.println(finalBill.doubleValue()); //The doubleValue method

    System.out.println("Your Bill: " + finalBill);
  }



  
}
