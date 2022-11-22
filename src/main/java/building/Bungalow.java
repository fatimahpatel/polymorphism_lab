package building;

public class Bungalow extends Building{

    private boolean centralHeating;

    public Bungalow (String dateOfConstruction, int numberOfFloors, int numberOfRooms, boolean centralHeating){
        super(dateOfConstruction, numberOfFloors, numberOfRooms);
        this.centralHeating = centralHeating
    }

}
