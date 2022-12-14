package building;

public abstract class Building {
    private String dateOfConstruction;
    private int numberOfFloors;
    private int numberOfRooms;

    public Building(String dateOfConstruction, int numberOfFloors, int numberOfRoom){
        this.dateOfConstruction = dateOfConstruction;
        this.numberOfFloors = numberOfFloors;
        this.numberOfRooms = numberOfRoom;
    }

    //getters and setters

    public String getDateOfConstruction(){
        return dateOfConstruction;
    }
    public void setDateOfConstruction(String dateOfConstruction){
        this.dateOfConstruction = dateOfConstruction;
    }

    public int getNumberOfFloors(){
        return numberOfFloors;
    }
    public void setNumberOfFloors(int numberOfFloors){
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfRooms(){
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms){
        this.numberOfRooms = numberOfRooms;
    }

}
