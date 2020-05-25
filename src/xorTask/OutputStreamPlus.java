package xorTask;

import java.io.*;

public class OutputStreamPlus extends FilterOutputStream {
    /**
     * Creates an output stream filter built on top of the specified
     * underlying output stream.
     *
     * @param out the underlying output stream to be assigned to
     *            the field {@code this.out} for later use, or
     *            {@code null} if this instance is to be
     *            created without an underlying stream.
     */
    public OutputStreamPlus(OutputStream out) {
        super(out);
    }


    public static void encode(String text, String key, File file) throws IOException {
        byte[] message = null;
        byte[] byteKey = null;

        message = text.getBytes();
        byteKey = key.getBytes();

        byte[] result = new byte[text.length()];

        for (int i = 0; i < message.length; i++) {
            result[i] = (byte) (message[i] ^ byteKey[i % byteKey.length]);
        }

        try (FileOutputStream fileOutput = new FileOutputStream(file)) {
            fileOutput.write(result);


        }


    }
}
