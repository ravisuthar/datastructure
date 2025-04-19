package java8.file;

 
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class DownloadFile {

    // Directory to save downloaded files
    private static final String DOWNLOAD_DIR = "C:\\Users\\sutha\\Documents\\Aarohi_Suthar\\G3\\PDF_English\\";

    public static void main(String[] args) {
        // Path to the file
        String pdfFilesPath = "src/main/resources/g3_pdf_v3.txt";

        // Read the file line by line
        try (BufferedReader br = new BufferedReader(new FileReader(pdfFilesPath))) {
            Set<String> urls = new HashSet<>();
            String line;
            while ((line = br.readLine()) != null) {
                urls.add(line);
            }

            System.out.println("url unique count"+ urls.size());
            for(String u: urls){
                downloadFile(u);
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

/*
        // Path to the file
        String filePath = "src/main/resources/g2_png.txt";

        // Read the file line by line
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (int i = 0; i < 250; i++) {
                    downloadFile(line +"_"+ i + ".png");
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }*/


    }

    private static void downloadFile(String fileURL) {
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(fileURL);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                String fileName = fileURL.substring(fileURL.lastIndexOf("/") + 1);
                File file = new File(DOWNLOAD_DIR, fileName);
                try (BufferedInputStream in = new BufferedInputStream(httpURLConnection.getInputStream());
                     FileOutputStream fileOutputStream = new FileOutputStream(file)) {

                    byte[] dataBuffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }

                    System.out.println("Downloaded " + fileName + " from " + fileURL);
                }
            } else {
                System.out.println("Failed to download " + fileURL + ": Server returned HTTP response code " + responseCode);
            }
        } catch (IOException e) {
            System.out.println("Failed to download " + fileURL + ": " + e.getMessage());
        } finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }

    }
}