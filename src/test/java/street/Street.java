package street;

import building.Building;

import java.util.ArrayList;

public class Street {
    private String name;
    private ArrayList<Building> buildings;

    public Street(String name) {
        this.name = name;
        this.buildings new ArrayList<>();
    }

}
