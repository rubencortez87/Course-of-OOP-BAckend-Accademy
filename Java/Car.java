class Car {
   private Integer id;
   private String license;
   private Account drive;
    private Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;

    }

    void printDataCar() {
        if (passenger != null) {
            System.out.println("License:" + license + "Name Driver:" + Namedrive + "Passengers:" + passenger);
        }
    }
    public Integer getPassenger(){
        return passenger;
    }
public void setPassenger(Integer passenger){
        if(passenger == 4) {
            this.passenger = passenger;
        }else{
            System.out.println("You need to assign 4 passengers");
        }
}

    public Account getDrive() {
        return drive;
    }

    public void setDrive(Account drive) {
        this.drive = drive;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}