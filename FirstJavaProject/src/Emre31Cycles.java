//3.1 Generate array of random integers between 50 and 150 (easy option - size is fixed and equals 100, more complex option - 
//user should input amount of items he/she wants to have in array) and count amount of number “100” in that array. 
//If there is no even 1 “100" please inform user about that.

    import java.util.Random;


    public class Emre31Cycles {


        private static double[] anArray;

        public static double[] list(){
            anArray = new double[10];   
            return anArray;
        }

        public static void print(){
            for(double n: anArray){
            System.out.println(n+" ");
            }
        }


        public static double randomFill(){

        Random rand = new Random();
        int randomNum = rand.nextInt();
        return randomNum;
        }

        public static void main(String args[]) {

        }


    }

    public static void print(){
        for(double n: anArray){
        System.out.println(n+" ");
        }
    }


    public static double randomFill(){

    Random rand = new Random();
    int randomNum = rand.nextInt();
    return randomNum;
    }

    public static void main(String args[]) {

    }


}
