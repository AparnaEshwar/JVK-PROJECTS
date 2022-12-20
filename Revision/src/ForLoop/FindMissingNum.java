package ForLoop;

public class FindMissingNum {
	public static int getMissingNumber(int a[], int n) {
		int i, total,sum=0;
		total = n*(n + 1) /2;
		for (i = 0; i < n-1; i++) {
			sum += a[i];
		}
		return total-sum;
	}

	public static void main(String[] args) {
		int a[] = { 1,2,3,4,5,6,7,9,10 };
		int missingnumber = getMissingNumber(a, 10);
		System.out.println(missingnumber);

	}

}
