import java.util.ArrayList;

public class SimpleStartup {
    private ArrayList<String> locationCells;
    private int numOfHits = 0;

    public String checkYourself(String userInput){

        String result = "miss";

        int index = locationCells.indexOf(userInput);
        return result;
    }

    public void setLocationCells(ArrayList<String> cellsLocation){
        locationCells = cellsLocation;
    }
}