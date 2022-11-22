package building;
public class StudentFlat extends Building {
    private long numberOfPartiesHosted;

    public StudentFlat (String dateOfConstruction, int numberOfFloors, int numberOfRooms, int numberOfPartiesHosted){
        super(dateOfConstruction, numberOfFloors, numberOfRooms);
        this.numberOfPartiesHosted = numberOfPartiesHosted;
    }


}
