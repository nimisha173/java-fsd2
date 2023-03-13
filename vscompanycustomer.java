package ustbatchno3.testng;

import java.util.Arrays;
import java.util.List;

public class vscompanycustomer {
    private String nameOfCity;
    private double priceWithMaterial;
    private double priceWithoutMaterial;

    public vscompanycustomer(String nameOfCity, double priceWithMaterial, double priceWithoutMaterial) {
        this.nameOfCity = nameOfCity;
        this.priceWithMaterial = priceWithMaterial;
        this.priceWithoutMaterial = priceWithoutMaterial;
    }
    public String getNameOfCity() {
        return nameOfCity;
    }
    public double getPriceWithMaterial() {
        return priceWithMaterial;
    }

    public double getPriceWithoutMaterial() {
        return priceWithoutMaterial;
    }
    public List getThePriceOnSquareFeet(double squareFeet) {
        double priceWithM = squareFeet * getPriceWithMaterial();
        double priceWithoutM = squareFeet * getPriceWithoutMaterial();
        return Arrays.asList(priceWithM, priceWithoutM);
        
        
    }
}

