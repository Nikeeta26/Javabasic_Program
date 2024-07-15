package nikeeta;

public class SortArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "  nikeeta kaudare";
String b = s.stripIndent();
System.out.println(b);
String[] a = b.split(" ");
String capitalizedSentence = "";

for(int i =0; i<a.length; i++) {
			String temp = a[i].substring(0,1).toUpperCase() + a[i].substring(1);
			capitalizedSentence+=temp;
			
			if(i<a.length-1) {
				capitalizedSentence+="\t";
			}
}

System.out.println(capitalizedSentence);


	}

}
