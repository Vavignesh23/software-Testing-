package org.pojo;


import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginpojo extends BaseClass {
	public FbLoginpojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement email;
	@FindBy(name="pass")
	private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginn;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginn() {
		return loginn;
	}
}
