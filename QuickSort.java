
public class QuickSort {

	public static void quickSort(int[] list, int lo, int hi) {
		if(lo < hi) {
			int pivotIndex = partition(list, lo, hi);
			quickSort(list, lo, pivotIndex - 1);
			quickSort(list, pivotIndex + 1, hi);
		}
	}
	
	public static int partition(int[] list, int lo, int hi) {
		int pivot = list[lo];
		int i = lo + 1;
		int j = hi;
		int temp;
		boolean notSwapped = true;

		System.out.println("New Partition");
		System.out.println("Partitioning " + lo + " to " + hi);
		
        while (i < j) {
        	System.out.println("Restarting Loop");
        	System.out.println("~~");
            
        	while (list[i] <= pivot && i < hi) {
                i++;
                int tempi = i - 1;
                System.out.println("i has increased from " + tempi + " to " + i);
            }
            
        	while (list[j] >= pivot && j > lo) {
                j--;
                int tempj = j + 1;
                System.out.println("j has decreased from " + tempj + " to " + j);
            }

            if (i <= j && notSwapped) {
            	temp = list[i];
            	list[i] = list[j];
            	list[j] = temp;
            	notSwapped = false;
            	System.out.println("Swapping " + list[i] + " and " + list[j]);
            }
        }
        
        if(i == j && i == hi && j == hi && list[j] > pivot) {
        	temp = list[j];
            list[j] = list[lo];
            list[lo] = temp;
            System.out.println("Special Case Swap of " + list[j] + " and " + list[lo]);
        }
        
        temp = list[j];
        list[j] = list[lo];
        list[lo] = temp;
        System.out.println("Final Swap of " + list[lo] + " and " + list[j]);
        System.out.println("");
        
        return j;
        
    }
}
