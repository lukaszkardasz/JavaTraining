package training.core.inOut;

import javax.sound.midi.Patch;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class nio {

    public static void main(String[] args) throws IOException {
        File xml = new File("./src/training/configFiles/disches.xml");
        File file = new File("./src/training/core/inOut/dataFile.txt");

        writeTo(file);
        readFrom(file);

        //testujemy z jakim rodzajem pliku mamy do czynienia czyli co to za plik - tu akurat txt
        Path path = Paths.get(file.toURI());
        testMINEType(path);
        testMINEType(xml.toPath());
    }

    private static void testMINEType(Path path) throws IOException {
        String type = Files.probeContentType(path);
        System.out.println("File type: " + type);
    }

    private static void readFrom(File file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            FileChannel fc = fis.getChannel();

            ByteBuffer bb =  ByteBuffer.allocate(100);

            while(fc.read(bb) > 0) {
                bb.rewind();
                String str = Charset.forName("UTF-8").decode(bb).toString();
                System.out.println(str);
                bb.flip();

            }

        } catch (IOException e) {

        }
    }

    private static void writeTo(File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            FileChannel fc = fos.getChannel();

            ByteBuffer bb =  ByteBuffer.allocate(1000);

            String deal = "upto 10% off on fashion";
            bb.put(deal.getBytes());
            bb.flip();
            fc.write(bb);

            deal = "\nupto 30% off on bags";
            bb.flip();
            bb.put(deal.getBytes());
            bb.flip();
            fc.write(bb);
        } catch (IOException e) {

        }
    }
}
