package building;

public class Office extends Building {

    private String companyName;

    public Office(String dateOfConstruction, int numberOfFloors, int numberOfRooms, String companyName){
        super(dateOfConstruction, numberOfFloors, numberOfRooms);
    }

}
