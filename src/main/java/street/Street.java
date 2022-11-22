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
    public void setBuildings(ArrayList<Building> building){
        this.buildings = building;
    }


    public void addBuilding(Building building) {
        this.buildings.add(building);
    }

    public int countBuilidngsInStreet(){
        return this.buildings.size();
    }




}
