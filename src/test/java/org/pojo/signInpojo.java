package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signInpojo  extends BaseClass{
	public void signinpojo() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement createNewacc;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstname;
	@FindBy(xpath = "(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")
	private WebElement secname;
	@FindBy(name="reg_email__")
	private WebElement moboremail;
	@FindBy(name="reg_passwd__")
	private WebElement newpass;
	public WebElement getCreateNewacc() {
		return createNewacc;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getSecname() {
		return secname;
	}
	public WebElement getMoboremail() {
		return moboremail;
	}
	public WebElement getNewpass() {
		return newpass;
	}
	
}
