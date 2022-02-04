package lmsAssignments.assignment1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Merge Int Array");
        int[] arr1 = {2,4,6,8,10};
        int[] arr2 = {1,3,5,7,9,10};
        int[] sum = mergeIntArr(arr1,arr2);

        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " ");
        }

        System.out.println("\n" + "Find The Second Large Sum");
        System.out.println(findTheSecondLarge(sum));

        System.out.println("Check Number or Not");
        boolean checkNum = checkNum("666");
        System.out.println(checkNum);

        System.out.println("Get Keyboard Input");
        getKeyboardInput();


    }

    public static void getKeyboardInput() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String x = sc.nextLine();
            if(x.equals("q")) {
                System.out.println("quit!");
                break;
            } else if (x.equals(" ") || x.isEmpty()) {
                System.out.println("Input is Empty");
            } else {
                int i = Integer.parseInt(x);
                System.out.println(i);
                //int num = Integer.getInteger(x) - '0';
                if(i > 0)
                    System.out.println(doSomething(i));
                else
                    System.out.println("x <= 0 input error");
            }
        }
    }

    public static int doSomething(int x) {
        int sum = 0;
        for(int i = 1; i <= x; i++) {
            sum += i;
        }
        System.out.println(System.currentTimeMillis());
        System.out.println(x);
        createFile(x, String.valueOf(sum));
        return sum;
    }

    public static void createFile(int x, String sum) {
        File file = new File(x + ".txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            fw.write(sum);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(x + ".txt " + "File has created");
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
    public static int findTheSecondLarge(int[] arr) {
        if(arr.length < 2) {
            return -1;
        }
        int maxNum = arr[0];
        int secNum = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxNum) {
                secNum = maxNum;
                maxNum = arr[i];
            } else {
                if(arr[i] > secNum) {
                    secNum = arr[i];
                }
            }
        }
        return secNum;
    }

}

/*

"E:\Program Files\jdk1.8.0_111\bin\java" "-javaagent:E:\Program Files\IntelliJ IDEA 2017.2.6\lib\idea_rt.jar=53429:E:\Program Files\IntelliJ IDEA 2017.2.6\bin" -Dfile.encoding=UTF-8 -classpath "E:\Program Files\jdk1.8.0_111\jre\lib\charsets.jar;E:\Program Files\jdk1.8.0_111\jre\lib\deploy.jar;E:\Program Files\jdk1.8.0_111\jre\lib\ext\access-bridge-64.jar;E:\Program Files\jdk1.8.0_111\jre\lib\ext\cldrdata.jar;E:\Program Files\jdk1.8.0_111\jre\lib\ext\dnsns.jar;E:\Program Files\jdk1.8.0_111\jre\lib\ext\jaccess.jar;E:\Program Files\jdk1.8.0_111\jre\lib\ext\jfxrt.jar;E:\Program Files\jdk1.8.0_111\jre\lib\ext\localedata.jar;E:\Program Files\jdk1.8.0_111\jre\lib\ext\nashorn.jar;E:\Program Files\jdk1.8.0_111\jre\lib\ext\sunec.jar;E:\Program Files\jdk1.8.0_111\jre\lib\ext\sunjce_provider.jar;E:\Program Files\jdk1.8.0_111\jre\lib\ext\sunmscapi.jar;E:\Program Files\jdk1.8.0_111\jre\lib\ext\sunpkcs11.jar;E:\Program Files\jdk1.8.0_111\jre\lib\ext\zipfs.jar;E:\Program Files\jdk1.8.0_111\jre\lib\javaws.jar;E:\Program Files\jdk1.8.0_111\jre\lib\jce.jar;E:\Program Files\jdk1.8.0_111\jre\lib\jfr.jar;E:\Program Files\jdk1.8.0_111\jre\lib\jfxswt.jar;E:\Program Files\jdk1.8.0_111\jre\lib\jsse.jar;E:\Program Files\jdk1.8.0_111\jre\lib\management-agent.jar;E:\Program Files\jdk1.8.0_111\jre\lib\plugin.jar;E:\Program Files\jdk1.8.0_111\jre\lib\resources.jar;E:\Program Files\jdk1.8.0_111\jre\lib\rt.jar;D:\IdeaProjects\Core-Java-Basic\out\production\CoreJavaCode" lmsAssignments.assignment1.Main
Merge Int Array
1 2 3 4 5 6 7 8 9 10 10
Find The Second Large Sum
10
Check Number or Not
true
Get Keyboard Input
12
12
1643954508098
12
12.txt File has created
78

Process finished with exit code 1

 */


