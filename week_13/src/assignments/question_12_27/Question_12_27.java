package assignments.question_12_27;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Question_12_27 {
    public static void main(String[] args) throws IOException {

        //File directory = new File("week_13/src/assignments/question_12_27");
        //File directory = new File(args[0]);
        ArrayList<String> files = new ArrayList<>(List.of(args));


        for (int i = 0; i < files.size(); i++) {

            File file = new File(files.get(i));
            //File file = new File(directory + "/" + files.get(i));

                    String name = files.get(i);
                    for (int j = 0; j < name.length(); j++) {
                        if (
                                j < name.length() - 1 &&
                                        Character.isDigit(name.charAt(j)) &&
                                        name.charAt(j+1) == '_' &&
                                        !Character.isDigit(name.charAt(j - 1))
                        ){
                            String before = name.substring(0, j);
                            before += "0" + name.substring(j);
                            name = before;
                            j++;
                        }

                    }
            String path = file.getCanonicalPath();
            path = path.substring(0,path.lastIndexOf("\\"));
            file.renameTo(new File(path + "/" + name));
        }
    }
}
