import java.util.ArrayList;

public class Startup {
    private ArrayList<String> locationCells;
    private String name;

    public String checkYourself(String userInput){

        String result = "miss";
        int index = locationCells.indexOf(userInput);

        if(index >= 0) {
            locationCells.remove(index);

            if(locationCells.isEmpty()){
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }

    public void setLocationCells(ArrayList<String> cellsLocation){
        locationCells = cellsLocation;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}