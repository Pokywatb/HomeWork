package xorTask;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamPlus extends FilterInputStream {


    protected InputStreamPlus(InputStream in) {
        super(in);
    }

    public static String decode(byte[] result, String key) {
        byte[] code = new byte[result.length];
        byte[] bkey = key.getBytes();

        for (int i = 0; i < result.length; i++) {
            result[i] = (byte) (result[i] ^ bkey[i % bkey.length]);
        }
        return new String(result);
    }



    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return super.read(b, off, len);
    }
}
