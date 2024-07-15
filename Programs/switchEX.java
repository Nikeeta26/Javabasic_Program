package nikeeta;

public class switchEX {

	public static void main(String[] args) {
		
		
		int n = 2;
		int x = switch(n)
		{
		  case 1, 2, 3, 4, 5, 6, 7:
			  yield n;
		  default:
			  yield -1;
		};
		System.out.println(x);
		
		String number="sun";
		switch(number)
		{
		case "sun":
		System.out.println("sunday");
		break;
		case "mon":
		System.out.println("mon");
		break;
		case "tue":
		System.out.println("tue");
		break;
		case "wednesday":
		System.out.println("wednesday");
		break;
		case "thursday":
		System.out.println("thursday");
		break;
		case "friday":
		System.out.println("friday");
		break;
		case "saturday":
		System.out.println("saturday");
		default:
		System.out.println("Not match");
		};
	}
	
	

}
