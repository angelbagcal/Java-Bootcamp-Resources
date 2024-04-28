public class Chorus {
    
    public static void main(String[] args) {
        // Chorus needs to be sung 5 times
        int amount = 5;
        
        for (int i = 0 ; i < amount ; i++) {
        singChorus();
        }

    }
    
    public static void singChorus() {
        System.out.println("Don't blame it on the sunshine");
        System.out.println("Don't blame it on the moonlight");
        System.out.println("Don't blame it on good times");
        System.out.println("Don't blame it on the boogie\n");
    }
}
