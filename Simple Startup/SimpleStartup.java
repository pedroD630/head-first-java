public class SimpleStartup {
    private int[] locationCells = new int[3];
    private int numOfHits = 0;

    public String checkYourself(int userGuess){

        String result = "miss";

        for(int i = 0; i < locationCells.length; i++){
            if(userGuess == locationCells[i]){
                numOfHits++;

                if(numOfHits == 3){
                    result = "kill";
                } else {
                    result = "hit";
                }
            }
        }
        return result;
    }

    public void setLocationCells(int[] cellsLocation){
        for(int i = 0; i < 3; i++){
            locationCells[i] = cellsLocation[i];
        }
    }
}