public class pattern  {

    public static void printStars(int n) {

        int i, j;

        for (i = 0; i < n; i++) { 
            
            for (j = 2 * (n - i); j >= 0; j--) { 
	  

                System.out.print(" "); 

            }     
	    
            for (j = 0; j <= i; j++) { 


                System.out.println();

            }

            System.out.println();

            }

        }

        public static void main(String args[]) {

            int n = 5;

            printStars(n);

        }
	    
    }
