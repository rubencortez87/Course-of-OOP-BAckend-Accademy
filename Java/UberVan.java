class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger;

    public UberVan(String license, Account driver){
            super(license, driver);

            public UberVan(String license, Account driver,
                Map<String, Map<String, Integer>> typeCarAccepted,
                ArrayList<String> seatsMaterial){
                super(license, driver);
                this.typeCarAccepted = typeCarAccepted;
                this.seatsMaterial = seatsMaterial;
        }

        public void setPassenger(Integer passenger) {
            if(passenger == ) {
                this.passenger = passenger;
            }else{
                System.out.println("You need to assign 6 passengers");
            }
        }
        }
