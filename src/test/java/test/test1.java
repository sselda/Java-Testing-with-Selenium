package test;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.File;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Driver;
import java.time.Duration;

public class test1 {

    public static <ElementClickInterceptedException extends Throwable> void main(String[] args) {

       //       System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
       //         WebDriver driver = new ChromeDriver();


       //      driver.get("https://demoqa.com/text-box");
       //      driver.manage().window().maximize();

       // WebElement fullName = driver.findElement(By.id("userName"));
       // fullName.click();
       // fullName.sendKeys("selda");

       // WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
       // email.click();
       // email.sendKeys("selda@gmail.com");

       // WebElement currentAdress = driver.findElement(new By.ByCssSelector(".form-control[placeHolder='Current Address']"));
       // currentAdress.click();
       // currentAdress.sendKeys("istanbul-bağcılar");


       // WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
       // permanentAddress.click();
       // permanentAddress.sendKeys("Köln - Almanya");

       // WebElement submitButton=driver.findElement(new By.ByCssSelector("button.btn"));
       // submitButton.click();


       ////////////////////


       // WebElement nameText = driver.findElement(By.xpath("//div/p[@id='email']"));
       // String emailText = nameText.getText();
       // System.out.println(emailText);

       // CHECKBOX TIKLANMASI KONTROLÜ

       // System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
       // WebDriver driver = new ChromeDriver();

       //driver.get("https://demoqa.com/checkbox");
       //driver.manage().window().maximize();

       //String homeCheckBoxCssValue = "label[for='tree-node-home'] span.rct-checkbox svg";
       //WebElement homeCheckBox = driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
       //homeCheckBox.click();

       //homeCheckBox = driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue)); //chechboxı yeniden bulması lazım

       //String homeCheckboxClassName = homeCheckBox.getAttribute("class"); //attribute : bize class attribute lazım=rct-icon rct-icon-check


       //if (homeCheckboxClassName.equals("rct-icon rct-icon-check")){
       // System.out.printf("Checkbox is checked!");
       // } else {
       // System.out.printf("Checkbox is unchecked!");
       //}

       //ÜÇ AYRI CHECKBOX VARSA CHECKBOX TIKLANMASI isEnabled true=tıklanması false=tıklanamaması

       //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
       //WebDriver driver = new ChromeDriver();

       //driver.get("https://demoqa.com/automation-practice-form");
       //driver.manage().window().maximize();


       /* WebElement sportCheckbox = driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnabled = sportCheckbox.isEnabled(); //isEnabled true-false gösterir booleen değerdir tıklanıp tıklanmadığını anlarız.
        System.out.println(isEnabled);
        WebElement sportCheckboxlabel = driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));

        if(isEnabled){
        try{
            System.out.println("Entered try block!");
        }
         sportCheckbox.click();
         }catch (ElementClickInterceptedException e){
            sportCheckboxlabel.click();

              System.out.println("Entered catch block!");
           }
        } /*

        //boolean isSelected = sportCheckbox.isSelected();
        // System.out.println();

//////////////////// RADİOBUTTON TIKLANMASI

        //System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        ///driver.get("https://demoqa.com/radio-button");
        //driver.manage().window().maximize();

        //WebElement yesRadioButtonLabel = driver.findElement(new By.ByCssSelector("label[for='yesRadio']"));
        //Boolean isEnabled = yesRadioButtonLabel.isEnabled();

        //if(isEnabled){
        //  yesRadioButtonLabel.click();
        //    System.out.println("Clicked yesRadioButton!");
        // }

        //WebElement yesRadioButton = driver.findElement(By.id("yesRadio"));

        ////////// örneğin yes butonun tıklı olup olmadığının anlaşılması

        //Boolean isSelected = yesRadioButton.isSelected();
        //if(isSelected){
        //    System.out.println("Yes radio button is selected");
        //}

        // WebElement output = driver.findElement(new By.ByCssSelector("p.mt-3"));
        // System.out.println(output.getText()); //OUTPUT içindeki textin oknduğunun kontrolü

        // WebElement noRadio = driver.findElement(By.id("noRadio"));
        //System.out.println(noRadio.isEnabled());


        /////////////// ÇİFT TIKLAMA (ACTIONS CLASSI KULLAN -DOUBLECLİCK METHODU KULLAN - SAĞ TIKLAMA KONTROLÜ

       /* System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn")); //doubleClickBtn=objem

        Actions action = new Actions(driver); //web elementin double tıklama için methodu yok biz de Actions classını kullanırız.actions driver parameteresini oluşturduk .
        action.doubleClick(doubleClickBtn).perform(); //action burda objedir. doubleClick methodumuz, perform

        WebElement doubleClickMessage = driver.findElement(By.id("doubleClickMessage"));
        String messageText = doubleClickMessage.getText(); //text ifade kontrolü
        System.out.println("you have done double clicked !");

        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        action.contextClick(rightClickBtn).perform(); //contextClick= sağ tıklama için method action classından

        WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));
        String rightClickmessageText = rightClickMessage.getText();
        System.out.println("you have right clicked message"); */

       /////////////DİNAMİK ELEMENTLERİ NASIL HANDLE EDERİZ

        /*System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        //div/button[starts-with(text(), 'Click Me')]
        //div[last()]/button

        //WebElement dinamicClickButton = driver.findElement(By.xpath("//div/button[starts-with(text(), 'Click Me')]"));
        //dinamicClickButton.click();

        WebElement dinamicClickButton = driver.findElement(By.xpath("//div[last()]/button"));
        dinamicClickButton.click();*/

       ///////////////////////////////////////////////////////////////////////////////////////////


        /*System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/dynamic-properties");

        WebElement textElement = driver.findElement(By.xpath("//div/p"));
        String TextElement = textElement.getText();
        System.out.println("Will enable 5 seconds");


        WebElement dinamictextElement = driver.findElement(By.xpath("//div/p"));
        dinamictextElement.click();

        WebElement firstButton = driver.findElement(By.id("enableAfter"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); //WebDriverWait 5 saniyede bir aktif olan bir button için kullandım.
        wait.until(ExpectedConditions.elementToBeClickable(firstButton));
        firstButton.click();

        WebElement colorChangeButton = driver.findElement(By.id("colorChange"));
        String className = colorChangeButton.getAttribute("class");
        System.out.println("Before Change : " + className);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.attributeToBe(colorChangeButton, "class" , "mt-4 text-danger btn btn-primary"));
        //class attribute bu özellik olana kadar bekle mt-4 text-danger btn btn-primary
        className = colorChangeButton.getAttribute("class"); //className değişimin olduğunu görmek için güncellememiz lazım
        System.out.println("After change : " + className); //renk değişmeden önceki halini console yazdırdık.anlaşılır olması için classname yazdık.
        //cevabı : Will enable 5 seconds
        //Before Change : mt-4 btn btn-primary
        //After change : mt-4 text-danger btn btn-primary olmalıdır.

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5)); //visible butonu 5 saniye sonra aktif oluyor
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter"))); //visible elemnti gelene kadar bekle
        driver.findElement(By.id("visibleAfter")).click(); //visible element gelince tıkla */


       ///////////////KIRIK LİNK BULMA


       /* System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();



        /////////// server side request atmak - request oluşturmamız lazım.get-post-delete gibi requstler

        HttpClient client = HttpClientBuilder.create().build();  //client objesi oluşturuyorum.

         //linke tıkladığımızda get requesti atıyor ve dönen response buluruz.request oluşturmalıyız.

        HttpGet request = new HttpGet("https://demoqa.com/"); // hangi linki hangi servera request atacağız ? servere request attık
        HttpResponse response = client.(request);     //response objesi oluşturmalıyız. requesten dönen response atamış oluruz.
        int statusCode = response.statusCode();
        System.out.println(statusCode);*/

       /////////////// WEB DOSYASINDA DOSYA İNDİRME KONTROLÜ

       /* System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/upload-download");

        WebElement downloadButton = driver.findElement(By.id("downloadButton"));
        downloadButton.click();

        String path = "/Users/User/Downloads/sampleFile.jpeg";
        String fileName = "sampleFile.jpeg";
        Thread.sleep(5000); //inip direk silmeden biraz beklesin dedik
        boolean isDownloaded = isFileDownLoaded(path, fileName);   //indirilip indirilmediğini kontrol ediyoruz.isFileDownloaded methodunu kullanırız.
        System.out.println(isDownloaded); //boolean ifadeyi console yazdırıyoruz.

    }

    ///path deki tüm file ları aramak istiyoruz. for ile yapabiliriz. bunun için method oluşturuyoruz

    public static boolean isFileDownLoaded(String downloadPath, String fileName) {  //method oluşturduk. tüm pathlerde o filename mevcut mu? true -false dönsün
        File file = new File(downloadPath);
        File[] files = file.listFiles(); //array oluşturuyoruz files, listfiles arrayı döner.bütün file ler burda

        for (int i = 0; i < files.length; i++) {   //tüm file leri biraraya toplayıp aradığımız file bulmak için for açtık
            if (files[i].getName().equals(fileName)) {//i=1.file, 2.file,3.file...den getName dosyayı getir. ve equals fileName ile karşılaştır.doğru true yanlışsa false
                files[1].delete();
                return true;
            }
        }
        return false;
    } */


       /////////////////////////// DOSYA UPLOAD ////////////////

       System.setProperty("webdriver.chrome.driver", "/Users//User//Selenium//ChromeDriver//chromedriver.exe/");
       WebDriver driver = new ChromeDriver();
       driver.get("https://demoqa.com/upload-download");

       WebElement uploadButton = driver.findElement(By.id("uploadFile"));
       uploadButton.sendKeys("/Users//User//Desktop//selenium.png/");
    }

}