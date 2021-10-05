class common{
	int interpolationSearch(int arr[], int l, int r, int val){
		if(val < arr[l] || val > arr[r]) return -1;
		int m = l + ((val - arr[l])*(r-l) / (arr[r] - arr[l]));
		if(val > arr[m]) return interpolationSearch(arr, m+1, r, val);
		else if(val < arr[m]) return interpolationSearch(arr, l, m-1, val);
		return m;
	}
}


class interpolation{
	public static void main(String[] args){
		int[] arr = new int[6];
		for(int i = 0; i < 6; i++)
			arr[i] = i+1;
		common ob = new common();
		System.out.println("The index is " + ob.interpolationSearch(arr, 0, 5,  4));
	}
}