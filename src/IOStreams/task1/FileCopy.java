package IOStreams.task1;

import java.io.*;

public class FileCopy {
   String src;
   String dest;

    public FileCopy(String src, String dest) {
        this.src = src;
        this.dest = dest;
    }
    void copyFileFileReaderWriter() {
        try(
            FileReader reader = new FileReader(src);
            FileWriter writer = new FileWriter(dest))
        {
            char[] buffer = new char[65536]; // 128Kb
            while (reader.ready())
            {
                int real = reader.read(buffer);
                writer.write(buffer, 0, real);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void copyFileBufferedReaderBufferedWriter(){
        try(
                BufferedReader br = new BufferedReader(new FileReader(src));
                BufferedWriter bw = new BufferedWriter(new FileWriter(dest))
        )
        {
            char[] buffer = new char[65536]; // 128Kb
            while (br.ready())
            {
                int real = br.read(buffer);
                bw.write(buffer, 0, real);
            }
/*
            int i;
            do {
                i = br.read();
                if (i != -1) {
                    if (Character.isLowerCase((char) i))
                        bw.write(Character.toUpperCase((char) i));
                    else if (Character.isUpperCase((char) i))
                        bw.write(Character.toLowerCase((char) i));
                    else
                        bw.write((char) i);
                }
            } while (i != -1);
            br.close();
            bw.close();*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
