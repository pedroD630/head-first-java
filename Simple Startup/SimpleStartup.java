public class SimpleStartup {
    private int[] locationCells;
    private int numOfHits = 0;

    public String checkYourself(int userGuess){
        for(int i = 0; i < locationCells.length; i + 1){
            if(userGuess == locationCells[i]){
                numOfHits = numOfHits + 1;

                if(numOfHits == 3){
                    return "kill";
                } else {
                    return "hit";
                }
            } else {
                return "miss";
            }
        }
    }
}