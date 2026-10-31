import org.openqa.selenium.By;

public class Locators {

    private static By idLocator = By.id("user-name");
    private static By nameLocator = By.name("robots");
    private static By classNameLocator = By.className("form_column");
    private static By tagLocator = By.tagName("<div>");
    private static By linkTextLocator = By.linkText("item_4_title_link");
    private static By partialLinkTextLocator = By.partialLinkText("_link");


    private static By attributeXpathLocator =
            By.xpath("//a[@href='https://www.linkedin.com/company/sauce-labs/]");
    private static By textXpathLocator = By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']");
    private static By partialAttributeXpathLocator = By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']");
    private static By partialTexttXpathLocator =
            By.xpath("//div[contains(text(),'Reinforced 3-snap bottom')]");
    private static By ancestorXpathLocator =
            By.xpath("//img[contains(@class, 'bm-i')]/ancestor::div[@class='primary_header']");
    private static By descendantXpathLocator =
            By.xpath("//div[@id='menu_button_container']/descendant ::div[contains(@style, 'position: absolute')]");
    private static By followingXpathLocator = By.xpath("//script[@type='text/javascript']/following::div");
    private static By parentXpathLocator = By.xpath("//a[@id='dynamic_catalog_sidebar_link']/parent::nav");
    private static By precedingXpathLocator = By.xpath("//li[@class='social_x']/preceding::a");
    private static By ANDXpathLocator = By.xpath("//button[@type='button' and contains(@style,'position')]");


}
