package LMSAssignment.Assignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while (true)
//        {
//            String x = sc.nextLine();
//            if(x.equals("q"))
//            {
//                System.out.println("quit!");
//                break;
//            }
//            else
//            {
//                int num = x.charAt(0) - '0';
//                if(num > 0)
//                {
//                    System.out.println(doSomething(num));
//                }
//                else
//                {
//                    System.out.println("x<0 input error");
//                }
//            }
//        }
/*          int[] arr1 = {5,6,7,8,9};
          int[] arr2 = {1,3,5,8,10};
          int[] sum = mergeIntArr(arr1,arr2);

          for (int i = 0; i < sum.length; i++)
          {
              System.out.println(sum[i]);
          }

        System.out.println(findTheSecondLarge(sum));*/

    }

    public static int doSomething(int x)
    {
        int sum = 0;
        for(int i = 1; i <= x; i++)
        {
             sum += i;
        }
        return sum;
    }


    public static boolean checkNum(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            if(!Character.isDigit(str.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
    public static int[] mergeIntArr(int[] arr1, int[] arr2)
    {
        int[] rst = new int[arr1.length + arr2.length];
        int x = 0;
        int y = 0;
        int c = 0;
        while(x < arr1.length && y < arr2.length)
        {
            if(arr1[x] < arr2[y])
            {
                rst[c++] = arr1[x++];
            }
            else
            {
                rst[c++] = arr2[y++];
            }
        }
        while(x<arr1.length)
        {
            rst[c++] = arr1[x++];
        }
        while(y<arr2.length)
        {
            rst[c++] = arr1[y++];
        }
        return rst;
    }
    public static int findTheSecondLarge(int[] arr)
    {
        if(arr.length < 2)
        {
            return -1;
        }
        int maxNum = arr[0];
        int secNum = 0;
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] > maxNum)
            {
                secNum = maxNum;
                maxNum = arr[i];

            }
            else
            {
                if(arr[i] > secNum)
                {
                    secNum = arr[i];
                }
            }
        }
        return secNum;
    }
}



