package lmsAssignments.assignment2;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            Criteria c = new Criteria(".\\IO", "txt", true);
            count(c);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void count(Criteria criteria) {
        try {
            File f = new File(criteria.fpath);
            String[] paths = f.list();
            int count_file = 0;
            int count_folder = 0;
            String extension = "";

            if (paths.length == 0) {
                System.out.println("There is no file or folder in the folder " + criteria.fpath);
                return;
            }

            for (String p: paths) {
                extension = p.substring(p.indexOf(".") + 1);
                if (extension.equals(p)) {
                    if (criteria.isSubfoler == true) {
                        Criteria c = new Criteria(criteria.fpath + "\\" + p, criteria.extension, criteria.isSubfoler);
                        count(c);
                    }
                    count_folder += 1;
                }
                if (extension.equals(criteria.extension)) {
                    count_file += 1;
                }
            }

            System.out.println("There are " + count_file + " file(s) and " + count_folder + " folder(s) inside folder " + criteria.fpath + " with extension " + criteria.extension + ".");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}