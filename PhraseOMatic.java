public class PhraseOMatic {
	public static void main(String args[]){
		String[] wordListOne = {
			"opinionated",
			"stronglyTyped",
			"aiEnabled",
			"cloudNative",
			"eventDriven",
			"hyperScalable",
			"faultTolerant",
			"zeroTrust",
			"selfOptimizing",
			"predictive"
		};

		String[] wordListTwo = {
			"microservice",
			"pipeline",
			"orchestration",
			"framework",
			"runtime",
			"platform",
			"architecture",
			"engine",
			"ecosystem",
			"inferenceLayer"
		};

		String[] wordListThree = {
			"accelerator",
			"optimizer",
			"coordinator",
			"gateway",
			"controller",
			"adapter",
			"compiler",
			"resolver",
			"aggregator",
			"transformer"
		};
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		java.util.Random randomGenerator = new java.util.Random();
		int rand1 = randomGenerator.nextInt(oneLength);
		int rand2 = randomGenerator.nextInt(twoLength);
		int rand3 = randomGenerator.nextInt(threeLength);
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		System.out.println("We need a " + phrase);
	}
}