import java.util.ArrayList;

public class StartupBust {
    public static void main(String[] args) {
        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();
        SimpleStartup theStartup = new SimpleStartup();

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
    } 
}