package FindingClosestNumbersToInput;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		int lessClosest;
		int greaterClosest;
		int[]list= {11,15,12,788,1,-1,-778,2,0};
		System.out.print("Please enter a number:");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		 int min = list[0];
	        int  max= list[0];

	        for (int j : list)
	        {
	            if (j < min)
	            {
	                min = j; //dizinin min değeri bulundu
	            }
	            if (j > max)
	            {
	                max = j; //dizinin max değeri bulunda
	            }
	        }
	        for (int j : list)
	        {
	            if (j > num)
	            { //dizinin elemanları girilen elemandan büyük mü
	                if (j <= max)
	                { //dizinin eleman değerleri max ile kıyaslandı
	                    max = j;
	                }
	            }

	            if (j < num)
	            { //dizinin elemanları girilen elemandan küçük mü
	                if (j >= min)
	                {
	                    min = j; //dizinin eleman değerleri min ile kıyaslandı
	                }
	            }
	        }
	    	System.out.println("Number which is less than input and nearest to it: " + min);
	        System.out.println("Number which is less than input and nearest to it: " + max);

	}
		
	

			
		}
	
		
		
		
	


