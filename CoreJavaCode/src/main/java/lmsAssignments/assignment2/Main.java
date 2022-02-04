package lmsAssignments.assignment2;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

/**
public class Main {
    public static void main(String[] args) {
        //String dirName = "C:\\Users\\Administrator\\Desktop\\ojdbc8-full\\OJDBC8-Full";
       // String dirName = "faefef213";
        Scanner sc = new Scanner(System.in);
        String dirName = sc.nextLine();

        Criteria ct = new Criteria(dirName);
        count(ct);
    }
    public static void count(Criteria criteria){
        File file = new File(criteria.getFolderPath());
        HashSet<String> set = new HashSet<>();
        int countDirctory = 0;
        int countFile = 0;
        StringBuilder sb = new StringBuilder();
        if(file.isDirectory()){
            File []files = file.listFiles();
            for(File fileIndex:files){
                if(fileIndex.isDirectory()){
                    countDirctory++;
                }else {
                    countFile++;
                    set.add(Files.getFileExtension(fileIndex.getName()));
                }

            }

        }
        for ( String str : set)
        {
            sb.append(str).append(" ");
        }

        System.out.println("Folder num："+countDirctory);
        System.out.println("File Num："+countFile);
        System.out.println("Extension includes："+sb);
        criteria.setFileNum(countFile);
        criteria.setSubFolderNum(countDirctory);
        criteria.setExtensionName(sb.toString());

    }


}
 **/