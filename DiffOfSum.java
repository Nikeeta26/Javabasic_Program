package nikeeta;

public class DiffOfSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {8,1,7,9,2};
int sum = 0;
for(int i=0;i<arr.length-1;i++) {
	for(int j = 0; j < arr.length-1; j++){
		
			 if(arr[j] < arr[j+1]) {

			int temp = arr[j+1];
			arr[j+1] = arr[j];
			arr[j] = temp;
		}
	}
	
}
for(int i=0; i<arr.length/2; i++) {
	sum  = sum+(arr[i]-arr[arr.length-i-1]);
}
System.out.println("sum"+sum);
				
	}

}
