import org.openqa.selenium.chrome.ChromeDriver

environments {
    chrome {
        driver = {
            def osPath = System.getProperty("os.name").toLowerCase().split(" ").first()

            def chromeDriver = new File("chromedrivers", osPath).listFiles(new FilenameFilter() {
                @Override
                boolean accept(File dir, String name) { name.startsWith("chromedriver") }
            }).first()

            System.setProperty("webdriver.chrome.driver", chromeDriver.getAbsolutePath())

            new ChromeDriver()
        }
}
}
