import java.io.*;

final class CacheIndex
{
	//original name: _c
    static String create_createanaccount;
    //original name: _g
    private RandomAccessFile randomAccessFile;
    //original name: _e
    static String fs_accept_aftercancel;
    static Graphic _a;
    private long maxSize;
    //original name: _b
    private long index;
    //original name: _f
    static String[] ability_fireimmunity;
    
    //original signature: final void a150(final int n) throws IOException {
    final void closeFile() throws IOException {
        if (this.randomAccessFile != null) {
            this.randomAccessFile.close();
            this.randomAccessFile = null;
        }
    }
    
    //original signature: final void a209(final int n, final int n2, final byte[] array, final int n3) throws IOException {
    final void a209(final int n, final byte[] array, final int n3) throws IOException {
        if (this.index + n3 > this.maxSize) {
            this.randomAccessFile.seek(this.maxSize);
            this.randomAccessFile.write(1);
            throw new EOFException();
        }
        this.randomAccessFile.write(array, n, n3);
        this.index += n3;
    }
    
    static final Graphic a749() {
        final Graphic cn_ = new Graphic(20, 20);
        jh_.a303(cn_);
        gf_.b050(0, 0, 20, 20, 16711680);
        gf_.f115(10, 10, 6, 0);
        for (int i = 0; i < 20; ++i) {
            gf_.b115(-i + 18, i, 4, 16711680);
        }
        int n = 0;
        for (int n2 = 0; 20 > n2; ++n2) {
            for (int j = 0; j < 20; ++j) {
                if ((n2 - 10) * (n2 - 10) + (j - 10) * (j - 10) > 100) {
                    cn_._B[n] = 0;
                }
                ++n;
            }
        }
        jh_.b797();
        return cn_;
    }
    
    //original signature: final long a411(final byte b) throws IOException {
    final long getFileLength() throws IOException {
        return this.randomAccessFile.length();
    }
    
    //original signature: final void a884(final long b, final int n) throws IOException {
    final void seek(final long b) throws IOException {
        this.randomAccessFile.seek(b);
        this.index = b;
    }
    
    //original signature: final int a552(final int n, final int n2, final int n3, final byte[] array) throws IOException {
    final int readFromFile(final int offset, final int length, final byte[] array) throws IOException {
        final int read = this.randomAccessFile.read(array, offset, length);
        if (read > 0) {
            this.index += read;
        }
        return read;
    }
    
    public static void b423() {
        CacheIndex._a = null;
        CacheIndex.create_createanaccount = null;
        CacheIndex.ability_fireimmunity = null;
        CacheIndex.fs_accept_aftercancel = null;
    }
    
    @Override
    protected final void finalize() throws Throwable {
        if (null != this.randomAccessFile) {
            System.out.println("");
            this.closeFile();
        }
    }
    
    //original signature: static final void a016(final int n, final boolean b) {
    static final void a016(final int n) {
        if (n != -1) {
            bf_._f[n].a487(true);
        }
        else {
            tb_.a540();
        }
    }
    
    //original signature: qp_(final File file, final String s, long d) throws IOException {
    CacheIndex(final File cacheIndexFile, final String fileOptions, long maxSize) throws IOException {
        if (maxSize == -1L) {
            maxSize = Long.MAX_VALUE;
        }
        if (maxSize < cacheIndexFile.length()) {
            cacheIndexFile.delete();
        }
        this.randomAccessFile = new RandomAccessFile(cacheIndexFile, fileOptions);
        this.maxSize = maxSize;
        this.index = 0L;
        final int read = this.randomAccessFile.read();
        if (-1 != read) {
            if (!fileOptions.equals("r")) {
                this.randomAccessFile.seek(0L);
                this.randomAccessFile.write(read);
            }
        }
        this.randomAccessFile.seek(0L);
    }
    
    static {
        CacheIndex.fs_accept_aftercancel = "to return to the normal view.";
        CacheIndex.create_createanaccount = "Create a free Account";
        CacheIndex.ability_fireimmunity = new String[] { "Fire Immunity", "A creature of the lower planes, the <%0> cannot be harmed by any form of fire - such as that of a dragon." };
    }
}
