import java.util.Scanner;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

class Calc{
	public static void main(String[] args){
		String year, month, date;
		Scanner input = new Scanner(System.in);
		System.out.println("Input your date (ex : 11)");
		date = input.nextLine();
		System.out.println("Input your month (ex : 05)");
		month = input.nextLine();
		System.out.println("Input your year (ex : 2005)");
		year = input.nextLine();
		
		//this code sucks and i wanna die
		long timeInMillis;
		long Start = System.currentTimeMillis();
		long YourTime;
		String myDate =  year+"/"+month+"/"+date;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			Date calen = sdf.parse(myDate);
			timeInMillis = calen.getTime();
			YourTime = Start - timeInMillis;
			System.out.println("Your age is " + (YourTime/31556952000L));
			System.out.println("In seconds, its " + (YourTime/1000));
		} catch (ParseException e){
			e.printStackTrace();
		}
	}
}
