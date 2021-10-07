package comp.comp152;

public abstract class Employee {

    public void fileW2Forms(){
        System.out.println("Now Generating the W-2 Form for This Employee.");
    }

    public abstract double calculateBiWeeklyPay();

    public void withHoldTaxes(){
        System.out.println("Now Withholding $" + calculateBiWeeklyPay()*0.2 + " in Taxes.");
    }



}
