public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points
        
        if (gryffindor > (ravenclaw+300)) {
            System.out.println("Gryffindor wins");
        } else if (gryffindor >= ravenclaw) {
            System.out.println("Gryffindor places 2nd");
        } else if (gryffindor <= (ravenclaw-100)) {
            System.out.println("Gryffindor places 3rd");
        } else if (gryffindor < (ravenclaw-100)) {
            System.out.println("Gryffindor places 4th");
        }
        // int margin = amount of points by which gryffindor scored over ravenclaw;
        
    }
}
