public class ArrayDisp{

static <T> void display(T[] arr){
	for(int i=0; i<arr.length; ++i){
		if(arr[i] != null){
			System.out.print(arr[i]+" ");
		}
	}
}

public static void main(String[] args){

	String[] names = new String[10];
	names[0] = "James";
	names[1] = "James1";
	names[2] = "James2";
	names[3] = "James3";
	names[4] = "James4";
	names[5] = "James5";	
	names[6] = "James6";
	names[7] = "James7";
	names[8] = "James8";
	display(names);	
System.out.println();
}

}	
	
