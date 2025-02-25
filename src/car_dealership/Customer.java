package car_dealership;

public class Customer {

    private String name;
    private String address;
    private double cashOnHand;

    public String getName() {
        return name;
    }

    //added getters and setters for the private variables
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    /**
     * This method is called when the customer wants to purchase a vehicle
     */
    public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance) {
        //employee will handle the customer and the vehicle
        employee.handleCustomer(this, finance, vehicle);
    }


}
