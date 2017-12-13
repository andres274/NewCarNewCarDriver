public class NewCarDriver {
    public static void main(String[] args) {

        System.out.println("Number of Cars: " + NewCar.getCount());

        NewCar myCar = new NewCar();

        NewCar hisCar = new NewCar("Black", 400, 3.5, "Honda");

        NewCar herCar = new NewCar("Pink", 300, 2.5, "Volks");

        System.out.println(myCar);
        System.out.println(hisCar);
        System.out.println(herCar);

        myCar.setColor("Blue"); myCar.setHorsePower(600); myCar.setEngineSize(5.4); myCar.setMake("Honda");
        myCar.setColor("Blue"); hisCar.setHorsePower(600); hisCar.setEngineSize(5.4); hisCar.setMake("Honda");
        myCar.setColor("Blue"); herCar.setHorsePower(600); herCar.setEngineSize(5.4); herCar.setMake("Honda");

        System.out.println("My Car: " +myCar.getColor()+" "+ myCar.getHorsePower()+" "+ myCar.getEngineSize()+ " " + myCar.getMake());
        System.out.println("His Car: "+hisCar.getColor()+" "+ hisCar.getHorsePower()+" "+ hisCar.getEngineSize()+ " " + hisCar.getMake());
        System.out.println("Her Car: "+herCar.getColor()+" "+ herCar.getHorsePower()+" "+ herCar.getEngineSize()+ " " + herCar.getMake());
        System.out.println("Number of Cars: "+ NewCar.getCount());
    }
}
