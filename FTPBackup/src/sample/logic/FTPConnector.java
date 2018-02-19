package sample.logic;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

public class FTPConnector {

    public static void connect(String user, String password, String serverAddress) {
        FTPClient ftpClient = new FTPClient();

        try {



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
