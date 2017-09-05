
public class Functions {
	
	public JavascriptExecutor js;

	// Home  functions

	// Switch to canvas are frame
	public void switchToFrame() {
		driver.switchTo().frame("frame");
	}
	
	// Click something
	public void clickSomething(){
		something.click();
	}
	
	// Sends keys to element
	public void sendKeysToField(String user) {
		nameOfElement.sendKeys(user);
	}
	
	// Explicit wait to element to be shown
	public void waitForSomeElement() {
		(new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("xpath")));
	}
	
	// Fluent wait to element to be shown
	public void waitFluently() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(60, TimeUnit.SECONDS)
				.pollingEvery(3, TimeUnit.SECONDS)
				.ignoring(NoSuchCookieException.class);
		
		wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("xpath"));
			}
		});
	}
	
	
	// Scroll page to top
	public void scrollPageToTop() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, -1900);")
	}
	
	// Scroll to security clearance information
	public void scrollToSomeElement() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", elementName);
	}
	
	// Check is element present
	public void checkAccess(boolean expected) {
		boolean value = false;
		if(driver.findElements(By.xpath("xpath")).size() != 0){
			System.out.println("Element is Present");
			value = true;
			}else{
			System.out.println("Element is Absent");
			}
		assertEquals(value, expected);
	}
	
	
	
	
	
	
	
	
	}