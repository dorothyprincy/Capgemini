package samplejava;

public class ArrayExample {
	/*static void printArray(String a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}*/

	public static void main(String[] args) {
		int arr[][]=new int [3][7];{
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[0][3]=4;
		arr[0][4]=5;
		arr[1][0]=6;
		arr[1][1]=7;
		arr[1][2]=8;
		arr[1][3]=9;
		arr[1][4]=1;
		arr[2][0]=2;
		arr[2][1]=3;
		arr[2][2]=4;
		arr[2][3]=5;
		arr[2][4]=6;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[j].length;j++) {
				System.out.print(arr[i][j]);
			
			}
			System.out.println();
		}
		
	
	
	}
}
}