package sandbox;

import java.io.File;

/**
 * Created by leo on 26.05.13.
 */
public class Try1 {

    public static void main(String[] args) {

        File file1 = new File("./WorkWithFiles/data/file1.txt");
        assert file1.exists();

    }


}
