import java.util.Scanner;

class integer_space{  

    public static void main(String args[]){  
     
        System.out.println("enter input");
        try (Scanner s = new Scanner(System.in)) {
			int num[] = new int[10];
			int i;
			for(i=0;i<num.length;i++){

			    num[i] = s.nextInt();
			}
			System.out.println("space:");
			for(i=0;i<num.length;i++){
			    System.out.print(num[i]+" ");
			}
			s.close();
		}
    }  
}  