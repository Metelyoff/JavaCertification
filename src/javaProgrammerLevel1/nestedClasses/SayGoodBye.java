package javaProgrammerLevel1.nestedClasses;

class SayGoodBye {
	public void sayGoodbyeInEnglish() {
        class EnglishGoodbye {
            public static final String farewell = "Bye bye";
            public void sayGoodbye() {
                System.out.println(farewell);
            }
        }
        EnglishGoodbye myEnglishGoodbye = new EnglishGoodbye();
        myEnglishGoodbye.sayGoodbye();
    }
	public static void main(String[] args){
		SayGoodBye bye=new SayGoodBye();
		bye.sayGoodbyeInEnglish();
	}
}
 