import java.util.ArrayList;

public class StartupBust {

    int numOfGuesses = 0;
    GameHelper helper = new GameHelper();
    ArrayList<Startup> startups = new ArrayList<>();

    public void setUpGame(){
        Startup one = new Startup();
        one.setName("poniez");
        Startup two = new Startup();
        two.setName("hacqi");
        Startup three = new Startup();
        three.setName("cabista");
        startups.add(one);
        startups.add(two);
        startups.add(three);

        System.out.println("Your goal is to sink three startups.");
        System.out.println("poniez, hacqi, cabista");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (Startup startup : startups) {
            ArrayList<String> newLocation = helper.placeStartup(3);
            startup.setLocationCells(newLocation);
        }
    }

    public void startPlaying() {
        while (!startups.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    
    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        
        String result = "miss";

        for(Startup startupToTest : startups) {
            result = startupToTest.checkYourself(userGuess);

            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")){
                startups.remove(startupToTest);
                break;
            }
        }

        System.out.println(result);
    }
    /*public static void main(String[] args) {
        
        Startup theStartup = new Startup();

        // declara randomNum e utiliza (int) para fazer um cast, converter double (retorno) para int, cortando parte fracionaria
        int randomNum = (int) (Math.random() * 5); 
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        ArrayList<String> locationsList = new ArrayList<>();

        for (int num : locations) {
            locationsList.add(String.valueOf(num));
        }

        theStartup.setLocationCells(locationsList);

        while (true){
            int guess = helper.getUserInput("enter a number");

            String result = theStartup.checkYourself(String.valueOf(guess));
            System.out.println(result);
            numOfGuesses++;

            if(result.equals("kill")){
                System.out.println("You took " + numOfGuesses + " guesses");
                break;
            }
        }
    }*/
}