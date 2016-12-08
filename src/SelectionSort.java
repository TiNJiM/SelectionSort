
public class SelectionSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int theArray[] = {1, 89, 76, 5, 3, 21, 45, 30};
		sort(theArray);
		for(int j = 0; j<theArray.length; j++){
			System.out.print(theArray[j] + " ");
		}
		System.out.println(" ");
	}
	public static void sort(int a[]){
		int min, minIndex;
		for(int i = 0; i<a.length;++i){
			min = a[i];
			minIndex = i;
			for(int j = i+1; j<a.length; j++){
				if(a[j]<min){
					min = a[j];
					minIndex = j;
				}
			}
			a[minIndex] = a[i];
			a[i] = min;
		}
	}
}
