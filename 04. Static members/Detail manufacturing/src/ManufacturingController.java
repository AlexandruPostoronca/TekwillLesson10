class ManufacturingController {
    // here you may declare a field
    static int detail=0;

    public static String requestProduct(String product) {
        // write your code here
       if(!product.isEmpty()){
           detail++;
       }
        return detail+". Requested Screw";
    }

    public static int getNumberOfProducts() {
        // write your code here
        return detail;
    }
}