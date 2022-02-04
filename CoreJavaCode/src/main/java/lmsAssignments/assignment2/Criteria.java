package lmsAssignments.assignment2;


import java.io.File;
import java.util.HashSet;
import java.util.TreeSet;

public class Criteria {
    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public void setSubFolderNum(int subFolderNum) {
        this.subFolderNum = subFolderNum;
    }

    public void setFileNum(int fileNum) {
        this.fileNum = fileNum;
    }

    public void setExtensionName(String extensionName) {
        this.extensionName = extensionName;
    }

    private String folderPath;
    private int subFolderNum;
    private  int fileNum;
    private String extensionName;

    public Criteria(String path)
    {
        this.folderPath = path;
    }

    public String getFolderPath() {
        return folderPath;
    }

    public int getSubFolderNum() {
        return subFolderNum;
    }

    public int getFileNum() {
        return fileNum;
    }

    public String getExtensionName() {
        return extensionName;
    }
}
