package Array.Utility;

public class  Swap {
    public  static  void Swap(int[] a,int i,int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
