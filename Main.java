class Main {
  public static void main(String[] args) {
    ice_creamRoll IceCream1 = new ice_creamRoll(2,2);
    IceCream1.getNumofRolls(); 
    IceCream1.getFlavorNumofKinds();
    System.out.println("Choose your serving size that you'd to order and insert it into the constructor for the 'bill' calculation. Serving Sizes with Prices:");
    System.out.println("small portion: $1.0; medium portion = $1.5; large portion = $2.5");
    IceCream1.calculatingBill(2.5);
    
    ice_creamRoll IceCream2 = new ice_creamRoll(10,2);
    IceCream2.getNumofRolls(); 
    IceCream2.getFlavorNumofKinds();
    IceCream1.calculatingBill(2.0);

    
  }
}
