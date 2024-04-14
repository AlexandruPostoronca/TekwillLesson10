class ManufacturingController {
    // here you may declare a field
    static int requestedProducts;

    public static String requestProduct(String product) {
        // write your code here
        String[] detail = product.split(" ");
        requestedProducts = Integer.valueOf(detail[1]);
        return "Requested detail "+requestedProducts;
    }

    public static int getNumberOfProducts() {
        // write your code here
        return  ++requestedProducts;
    }
}