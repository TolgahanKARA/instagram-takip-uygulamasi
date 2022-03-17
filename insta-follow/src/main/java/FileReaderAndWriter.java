import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.*;


public class FileReaderAndWriter extends BasePage{

    private File file;
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private FileReader fileReader;
    private BufferedReader bufferedReader;
    GoToOtherProfilePage goToOtherProfilePage;
    By noName = By.cssSelector(".mLCHD._1OSdk");
    By otherProfileName = By.cssSelector("._7UhW9.fKFbl.yUEEX.KV-D4.fDxYl");
    By otherProfileFollowButton = By.cssSelector("._7UhW9.xLCgt.qyrsm.uL8Hv.T0kll");

    public FileReaderAndWriter(WebDriver driver) {

        super(driver);

    }

    public GoToOtherProfilePage goToOtherProfilePage(){

        return this.goToOtherProfilePage;

    }


    public boolean createFile(String text) throws IOException {

        String filePath="C:\\Users\\tolga\\Desktop";

        try {
            file = new File(text +".txt") ;
            if (!file.exists()){

                file.createNewFile();

            }
            return true;
        }catch (Exception e){
            System.out.println("Hata : " + e);
            return false;
        }



    }

    public void writer(String text) throws IOException {

        fileWriter = new FileWriter(file,true);
        bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(text);
    }

    public boolean writerClose() throws IOException {

        try {
            bufferedWriter.close();
            return true;
        }catch (Exception e){
            System.out.println("Hata : " + e);
            return false;
        }
    }

    public void readFile(String text) throws FileNotFoundException {

        try {

            file = new File(text + ".txt");
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

        }catch (FileNotFoundException e){

            System.err.println("Hata :" + e);

        }


    }

    public void read() throws IOException {

        String line;

        while ((line = bufferedReader.readLine()) != null){

            driver.get("https://www.instagram.com/" + line);
            //goToOtherProfilePage.toDoOtherProfilePage();
            waiting(otherProfileName,5);
            click(otherProfileFollowButton);

        }


    }

    public boolean readFileClose(){

        try {
            bufferedReader.close();
            return true;
        }catch (Exception e){
            System.out.println("Hata : " + e);
            return false;
        }

    }





}
