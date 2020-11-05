import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Date {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		java.util.Date y1 = sdf1.parse("10/30/2020");
		java.util.Date y2 = sdf2.parse("10/30/2020 14:10:01");
		
		System.out.println(y1);
		System.out.println(y2);
	
		
		sc.close();

	}

}
