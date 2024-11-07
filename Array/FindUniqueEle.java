package Array;

public class FindUniqueEle {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,2,1,3};
        int uEle = findUniqueEle(arr);

       if (uEle != -1) {
           System.out.println("Unique element is : " + uEle);
       } else  {
           System.out.println("There is no unique element");
       }
    }

    public  static  int findUniqueEle(int[] arr) {
        int cnt = 0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i + 1; j <arr.length ; j++) {
                if (arr[i] == arr[j]) cnt++;
            }
            if (cnt != 0) {
                cnt = 0;
            } else  {
                return arr[i];
            }
        }

        return  -1;
    }
}
