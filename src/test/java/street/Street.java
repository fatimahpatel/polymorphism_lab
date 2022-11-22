package street;

import building.Building;

import java.util.ArrayList;

public class Street {
    private String name;
    private ArrayList<Building> buildings;

    public Street(String name) {
        this.name = name;
        this.buildings =  new ArrayList<>();
    }

    //getter and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Building> getBuildings(){
        return buildings;
    }
    public void setBuildings(ArrayList<Building> buildings){
        this.buildings = buildings;
    }





}
