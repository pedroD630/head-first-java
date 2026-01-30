public class SimpleStartup {
    private int[] locationCells = new int[3];
    private int numOfHits = 0;

    public String checkYourself(int userGuess){
        for(int i = 0; i < locationCells.length; i++){
            if(userGuess == locationCells[i]){
                numOfHits = numOfHits + 1;

                if(numOfHits == 3){
                    return "kill";
                } else {
                    return "hit";
                }
            }
        }
        return "miss";
    }

    public void setLocationCells(int[] cellsLocation){
        for(int i = 0; i < 3; i++){
            locationCells[i] = cellsLocation[i];
        }
    }
}