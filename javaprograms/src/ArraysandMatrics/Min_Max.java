package ArraysandMatrics;

public class Min_Max {
    public static void main(String[] args) {
		
	
     int a[] = { 20,  30, 60, 70, 125 };
        int min = a[0], max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
          

        }
        System.out.println("Max " + max + " Min " + min); 
    }

}
 