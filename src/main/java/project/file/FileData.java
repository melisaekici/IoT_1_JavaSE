package project.file;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.UUID;

public class FileData {

    // Variable
    private String id;
    private Date systemCreatedDate;

    // private java.io.File file;
    private File file;
    private String fileName;
    private String directoryUrl;
    private String url;

    // Constructor
    public FileData() {
        this.id = UUID.randomUUID().toString(); // rastgele id oluşturur
        this.systemCreatedDate = new Date(System.currentTimeMillis()); // milisaniyede cinsi anlık zamanı gösterir

        // File Create

        try {
            // Önce Dizin Oluştur

            // C:\io\bm
            this.directoryUrl = FilePathUrl.FILE_PATH;
            this.file = new File(directoryUrl);
            boolean directoryMakeDirs = file.mkdirs();
            if (directoryMakeDirs) {
                System.out.println(directoryUrl + "File created successfully" + directoryMakeDirs);
                // Sonra dosya oluştur
                this.url = FilePathUrl.FILE_PATH.concat("\\atm.txt");
                this.file = new File(url);
                // Eğer benim belirlediğim dosya yoksa yeni dosya ekle
                if (file.exists()) {
                    System.err.println(url + " File already exists");
                } else {
                    file.createNewFile();
                    System.out.println(url + " File created");
                }
            } else {
                System.err.println(directoryUrl + " File not created");
            }

        } catch (Exception e) {       // istisnayı atar???
            e.printStackTrace();
        }


        // bu dosya 1 yıl sonra kendiliğinden silinsin
        // delete()
    }

    // toString
    @Override
    public String toString() {
        return "FileData{" +
                "id='" + id + '\'' +
                ", systemCreatedDate=" + systemCreatedDate +
                ", file=" + file +
                ", fileName='" + fileName + '\'' +
                ", directoryUrl='" + directoryUrl + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    /////////////////
    //Tarih
    public String logLocalTurkishDate() {
        Locale locale = new Locale("tr", "TR");
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss", locale);
        Date date = new Date();
        String changedTurkishTime = sdf.format(date).toString();
        System.out.println("LocalTurkishDate: " + changedTurkishTime);
        return changedTurkishTime;
    }

    // Dosya Oluştur
    public void createFile() {
        Scanner sc = new Scanner(System.in);
        // File Create
        try {
            // Önce dizin oluştur
            char disk;
            String directory = "", subDirectory = "", fileName = "";
            System.out.println("\nPlease specify memory to use (C:, D: etc.)");
            disk = sc.nextLine().toUpperCase().charAt(0);
            System.out.println("Please specify directory to use");
            directory = sc.nextLine();
            System.out.println("Please specify subdirectory to use");
            subDirectory = sc.nextLine();

            StringBuilder sb = new StringBuilder();
            sb
                    .append(disk).append(":\\").append(directory)
                    .append("\\").append(subDirectory);
            String specialDirectoryUrl = sb.toString();

            this.file = new File(specialDirectoryUrl);
            boolean directoryMakeDirs = file.mkdirs();
            if (directoryMakeDirs) {
                System.out.println(specialDirectoryUrl + " named file created successfully " + directoryMakeDirs);
                // Sonra dosya oluştur
                System.out.println("Please specify file name");
                fileName = sc.nextLine();
                this.url = sb.append("\\").append(fileName).append(".txt").toString();
                this.file = new File(url);
                // Eğer benim belirlediğim dosya yoksa yeni dosya ekle
                if (file.exists()) {
                    System.err.println(url + " File already exists");
                } else {
                    file.createNewFile();
                    System.out.println(url + " File created");
                }
            } else {
                System.err.println(directoryUrl + " File not created");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Dosya Listele
    public void fileList(String url) {
        String specialUrl = null;
        File fileList;

        try {
            // Eğer kullanıcı herhangi bir url girmezse default url alsın
            if (url == null || url.isEmpty()) {
                specialUrl = FilePathUrl.FILE_PATH;
                fileList = new File(specialUrl);
                for (File temp : fileList.listFiles()) {
                    System.out.println(temp.getName());
                }
            } else {
                fileList = new File(url);
                for (File temp : fileList.listFiles()) {
                    System.out.println(temp.getName());
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Dosya Özellikleri
    public void fileInfo(String url) {
        String specialUrl = null, fileName = null;
        Scanner scFileInfo = new Scanner(System.in);
        File fileInfo;
        try {
            // Kullanıcı herhangi bir url girmezse default url alsın
            if (url == null | url.isEmpty()) {
                // url:"" böyle girilecek çünkü default url gelsin
                fileList("");
                System.out.println("Please specify file name");
                fileName = scFileInfo.nextLine();
                specialUrl = FilePathUrl.FILE_PATH.concat("\\").concat(fileName).concat(".txt");
                fileInfo = new File(specialUrl);
            } else {
                fileList("");
                System.out.println("Please specify file name");
                fileName = scFileInfo.nextLine();
                specialUrl = FilePathUrl.FILE_PATH.concat("\\").concat(fileName).concat(".txt");
                fileInfo = new File(specialUrl);
            }
            System.out.println("PATH: " + fileInfo.getPath());
            System.out.println("PARENT: " + fileInfo.getParent());
            // izinleri
            System.out.println("IS READ? : " + fileInfo.canRead());
            System.out.println("IS WRITE? : " + fileInfo.canWrite());
            System.out.println("IS EXECUTE? : " + fileInfo.canExecute());
            //
            System.out.println("IS FILE? : " + fileInfo.isFile());
            System.out.println("IS DIRECTORY? : " + fileInfo.isDirectory());
            System.out.println("IS HIDDEN? : " + fileInfo.isHidden());
            //
            System.out.println("TOTAL SPACE (harddisk): " + fileInfo.getTotalSpace());
            System.out.println("FREE SPACE (harddisk): " + fileInfo.getFreeSpace());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Hesaba para ekleme
    public void customerDepositMoney(String url, Double amount) {

        try (BufferedWriter bWriter = new BufferedWriter(new FileWriter(url, true))) { // true: yeni geleni aşağı ekler, false(default): öncekini siler yenisini ekler
            System.out.println(logLocalTurkishDate());
            bWriter.write(String.valueOf(amount));
            bWriter.flush();    // refresh atar

            // para için validation: - (eksi giremezsin) 0
            System.out.println("Amount of money: " + amount);
            System.out.println("Deposited money: " + amount + " Total money: " + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Promosyon (1000.0 TL)
    public void customerPromotion(String url, Double amount) {

    }

    // Dosya Oku
    public Double customerAccountMoney(String url) {
        String rows = null;   // okunan satır
        Double amount = null;

        try (BufferedReader bReader = new BufferedReader(new FileReader(url))) {
            while ((rows = bReader.readLine()) != null) {
                amount = Double.valueOf(rows);
            }
            logLocalTurkishDate();
            System.out.println("Amount of money in account: " + amount);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return amount;
    }

    // Dosya Oku
    public void customerWithdrawMoney(String url, Double amount) {

        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Hesap Sil
    public void customerDeleteAcc(String url) {
        String fileName;
        String filePathName;
        Scanner scDelete = new Scanner(System.in);

        fileList(url);
        System.out.println("Please specify file name to delete");
        fileName = scDelete.nextLine().concat(".txt");
        System.out.println(fileName);
        filePathName = FilePathUrl.FILE_PATH.concat("\\").concat(fileName);
        System.out.println("PATH: " + filePathName);

        // Kullanıcıdan gelen isteğe göre sil
        char choice;
        System.out.println(fileName + " u sure? ");
        choice = scDelete.nextLine().toUpperCase().charAt(0); // E EVET evet Evet (hepsini kabul etsin)
        System.out.println(choice);
        if (choice == 'Y') {
            System.out.println(fileName + " named file is to be deleted");
            try {
                File fileDelete = new File(filePathName);
                System.out.println("Deleting file: " + fileDelete);

                // Böyle bir dosya var mı yok mu?
                if (fileDelete.exists()) {
                    fileDelete.delete();
                    //System.out.println("Deleted file: " + fileDelete);
                    System.out.println("File deleted successfully");
                }else{
                    System.err.println("File not deleted ()");
                }



            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(fileName + " named file couldn't be deleted");
        }

    }

// Interface

// Inheritance | abstract

// Login

/////////////////////////////////
//GETTER AND SETTER

    //PSVM
    public static void main(String[] args) {
        FileData fd = new FileData();
//        System.out.println(fd);
//        fd.logLocalTurkishDate();

        //************ CREATE *********
        //fd.createFile();

        /*
        // *********** LIST ***********
        Scanner scList = new Scanner(System.in);
        char disk;
        String directory = "", subDirectory = "";
        System.out.println("\nPlease specify memory to list (C:, D: etc.)");
        disk = scList.nextLine().toUpperCase().charAt(0);
        System.out.println("Please specify directory name");
        directory = scList.nextLine();
        System.out.println("Please specify subdirectory name");
        subDirectory = scList.nextLine();

        StringBuilder sb = new StringBuilder();
        sb
                .append(disk).append(":\\").append(directory)
                .append("\\").append(subDirectory);
        String specialListUrl = sb.toString();

        fd.fileList(specialListUrl);
        */

        /*
        // ********* FILE INFO **********
        Scanner scInfo = new Scanner(System.in);
        char disk;
        String directory = "", subDirectory = "";
        System.out.println("\nPlease specify memory to list (C:, D: etc.)");
        disk = scInfo.nextLine().toUpperCase().charAt(0);
        System.out.println("Please specify directory name");
        directory = scInfo.nextLine();
        System.out.println("Please specify subdirectory name");
        subDirectory = scInfo.nextLine();

        StringBuilder sb = new StringBuilder();
        sb
                .append(disk).append(":\\").append(directory)
                .append("\\").append(subDirectory);
        String specialFileInfoUrl = sb.toString();
        fd.fileInfo(specialFileInfoUrl);
        */

    /*
    // *********** FILE WRITER *************
    Scanner scWriter = new Scanner(System.in);
    System.out.println("Please enter amount of money to deposit");
    Double amount = scWriter.nextDouble();
    fd.customerDepositMoney("C:\\io\\bm\\user.txt", amount);
     */

    /*
    // *********** FILE READER *************
    fd.customerAccountMoney("C:\\io\\bm\\user.txt");

     */

        // *********** ACCOUNT DELETE **********
        fd.customerDeleteAcc("C:\\io\\bm");

    }

} // end class
