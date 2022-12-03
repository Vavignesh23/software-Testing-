package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.FbLoginpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass {
	FbLoginpojo f;

	@Given("To launch the chromebrowser and maximize window")
	public void to_launch_the_chromebrowser_and_maximize_window() {
		launchBrowser();
		windowMaximize();
	}

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
		launchUrl("https://www.facebook.com/");
	}

	@When("To pass the valid usermname in email field")
	public void to_pass_the_valid_usermname_in_email_field() {
		f = new FbLoginpojo();
		passText("selenium", f.getEmail());
	}

	@When("To pass invalid password  in password field")
	public void to_pass_invalid_password_in_password_field() {
		f = new FbLoginpojo();
		passText("inmakes", f.getPassword());
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		f = new FbLoginpojo();
		clickBtn(f.getLoginn());
	}

	@When("To check whether navigate to the home page or not")
	public void to_check_whether_navigate_to_the_home_page_or_not() {
		System.out.println("To check your credential");
	}

	@Then("To close thhe browser")
	public void to_close_thhe_browser() {
		closeEntireBrowser();
	}

}
