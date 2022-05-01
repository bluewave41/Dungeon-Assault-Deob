import java.util.*;
import java.io.*;

public class nc_
{
	//original name: _c
    private static String userHomeDirectory;
    //original name: _b
    private static boolean hasHomeDirectoryBeenRead;
    //original name: _d
    private static int osBitVersion;
    //original name: _e
    private static String gameName;
    private static Hashtable _a;
    
    //original signature: public static void a871(final int d, final String e) {
    public static void a871(final int osBitVersion, final String gameName) {
        nc_.gameName = gameName;
        nc_.osBitVersion = osBitVersion;
        try {
            nc_.userHomeDirectory = System.getProperty("user.home");
            if (null != nc_.userHomeDirectory) {
                nc_.userHomeDirectory += "/";
            }
        }
        catch (Exception ex) {}
        if (null == nc_.userHomeDirectory) {
            nc_.userHomeDirectory = "~/";
        }
        nc_.hasHomeDirectoryBeenRead = true;
    }
    
    //original signature: public static File a384(final String s, final int n, final String s2) {
    public static File readCacheFile(final String fileName, final int osBitVersion, final String gameName) {
        if (!nc_.hasHomeDirectoryBeenRead) {
            throw new RuntimeException("");
        }
        final File file = (File)nc_._a.get(fileName);
        if (null != file) {
            return file;
        }
        final String[] array = { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", nc_.userHomeDirectory, "/tmp/", "" };
        final String[] array2 = { ".jagex_cache_" + osBitVersion, ".file_store_" + osBitVersion };
        for (int i = 0; i < 2; ++i) {
            for (int n2 = 0; array2.length > n2; ++n2) {
                for (int n3 = 0; array.length > n3; ++n3) {
                    final String string = array[n3] + array2[n2] + "/" + ((gameName == null) ? "" : (gameName + "/")) + fileName;
                    RandomAccessFile randomAccessFile = null;
                    try {
                        final File file2 = new File(string);
                        if (file2.exists()) {
                            final String s3 = array[n3];
                            if (i == 0 || s3.length() <= 0 || new File(s3).exists()) {
                                new File(array[n3] + array2[n2]).mkdir();
                                if (gameName != null) {
                                    new File(array[n3] + array2[n2] + "/" + gameName).mkdir();
                                }
                                randomAccessFile = new RandomAccessFile(file2, "rw");
                                final int read = randomAccessFile.read();
                                randomAccessFile.seek(0L);
                                randomAccessFile.write(read);
                                randomAccessFile.seek(0L);
                                randomAccessFile.close();
                                nc_._a.put(fileName, file2);
                                return file2;
                            }
                        }
                    }
                    catch (Exception ex) {
                        try {
                            if (null != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        }
                        catch (Exception ex2) {}
                    }
                }
            }
        }
        throw new RuntimeException();
    }
    
    //original signature: public static File a885(final String s) {
    public static File readCacheFile(final String fileName) {
        return readCacheFile(fileName, nc_.osBitVersion, nc_.gameName);
    }
    
    private nc_() throws Throwable {
        throw new Error();
    }
    
    static {
        nc_.hasHomeDirectoryBeenRead = false;
        nc_._a = new Hashtable(16);
    }
}
