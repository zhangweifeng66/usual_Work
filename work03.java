package ex02;
import java.util.Scanner;

public class work03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();
        
        int minutes = seconds / 60;
        
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + " seconds is " + minutes +
        		 " minutes and " + remainingSeconds + " seconds");
        
        input.close();
        
	}

}
