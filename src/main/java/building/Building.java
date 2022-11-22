package building;

public class Building {
    private String name;
    private String dateOfConstruction;
    private int numberOfFloors;
    private int numberOfRooms;

    public Building(String name, String dateOfConstruction, int numberOfFloors, int numberOfRoom){
        this.name = name;
        this.dateOfConstruction = dateOfConstruction;
        this.numberOfFloors = numberOfFloors;
        this.numberOfRooms = numberOfRoom;
    }

    //getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

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
