class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX uberX = new UberX("AMD123", new Account(" Andres Herrera", "ADD2323"), "Chevrolet", "Spark");// metodo
        uberX.setPassenger(4); // constructor
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FEFR333", new Account("Jose Gonzalez", "DSS33"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

    }
}