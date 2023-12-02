package assignments.question_12_28;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Question_12_28 {
    public static void main(String[] args) throws IOException {

        ArrayList<String> files = new ArrayList<>(List.of(args));


        for (int i = 0; i < files.size(); i++) {

            File file = new File(files.get(i));
            //File file = new File(directory + "/" + files.get(i));

            String name = files.get(i);
            for (int j = 0; j < name.length(); j++) {
                if (    j < name.length() - 2 &&
                        name.charAt(j) == '_' &&
                        Character.isDigit(name.charAt(j + 1)) &&
                        !Character.isDigit(name.charAt(j + 2))
                ) {
                    String before = name.substring(0, j + 1);
                    before += "0" + name.substring(j + 1);
                    name = before;
                }

                else if (
                        j == name.length() - 2 &&
                                name.charAt(j) == '_' &&
                                Character.isDigit(name.charAt(j + 1))
                ) {
                    String before = name.substring(0, j + 1);
                    before += "0" + name.substring(j + 1);
                    name = before;
                }

            }
            String path = file.getCanonicalPath();
            path = path.substring(0,path.lastIndexOf("\\"));
            file.renameTo(new File(path + "/" + name));
        }
    }
}
