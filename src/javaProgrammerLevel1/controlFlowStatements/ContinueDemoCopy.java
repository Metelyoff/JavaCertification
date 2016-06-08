package javaProgrammerLevel1.controlFlowStatements;

class ContinueDemoCopy {
	public static void main(String[] args) {

        String searchMe = "-5 -4 -2 12 -40 4 2 18 11 5";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != '1')
                continue;
            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
}
