import java.util.ArrayList;

public class SimpleStartup {
    private ArrayList<String> locationCells;
    private int numOfHits = 0;

    public String checkYourself(String userInput){

        String result = "miss";

        for(int cell : locationCells) {
            if(userGuess == cell){
                numOfHits++;
                result = "hit";
                break;
            }
        }

        if(numOfHits == 3){
            result = "kill";
        }
        return result;
    }

    public void setLocationCells(ArrayList<String> cellsLocation){
        locationCells = cellsLocation;
    }
}