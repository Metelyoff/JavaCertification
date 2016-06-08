package javaProgrammerLevel1.operators;

class BitDemo {
	public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        System.out.print("val="+val+"\n"+"bitmask="+bitmask+"\n"+"val & bitmask=");
        System.out.print(val & bitmask);
    }
}
