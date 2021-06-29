class Main {

    public static void main(String[] args) {
       System.out.println("Hola Mundo");
       UberX uberX= new UberX("AMK123", new Account("Maria Renteria", "AND142"), "Chevrolet", "Sonic");
        UberX.setPassenger(4);
        UberX.printDataCar();

        UberVan uberVan = new UberVan("GTD324" new Account("Ruben Cortez"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        /*Car car2 = new Car("SST435", new Account("Maria REnteria", SAR876));
        car2.passenger = 3;
        car2.printDataCar();*/
    }
}

