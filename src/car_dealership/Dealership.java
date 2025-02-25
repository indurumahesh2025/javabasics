package car_dealership;

public class Dealership {
    public static void main(String[] args) {

        Customer cust1 = new Customer();

        /**
         * getters and setters from Customer class to set the values for the customer
         * Private variables in Customer class so we need to use getters and setters to access them
        */
        cust1.setName("Tom");
        cust1.setAddress("123 Anything St. ");
        cust1.setCashOnHand(12000);

        /**
         * We can use the constructor to set the values for the vehicle without using getters and setters
        */
        Vehicle vehicle = new Vehicle("BMW", "M3", 10000);


        Employee emp = new Employee();

        cust1.purchaseCar(vehicle, emp, false);




        /**
         *
         * handleCustomer(Customer cust, boolean finance, Vehicle vehicle)
         *if(finance == true)
         *      runCreditHistory(Customer cust, double doubleAmount)
         * else if(vehicle.getPrice() <= cust.getCashOnHand())
         *      processTransaction(Customer cust, Vehicle vehicle)
         * else:
         *    tell customer to bring more money
         */

    }
}
