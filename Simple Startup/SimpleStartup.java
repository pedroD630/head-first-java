public class SimpleStartup {
    private int[] locationCells = new int[3];
    private int numOfHits = 0;

    public String checkYourself(int userGuess){

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

    public void setLocationCells(int[] cellsLocation){
        locationCells = cellsLocation;
    }
}