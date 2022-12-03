$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/fbRegistration.feature");
formatter.feature({
  "name": "To validate login functionality of facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To launch the chromebrowser and maximize window",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLogin.to_launch_the_chromebrowser_and_maximize_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login  with valid username and  invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launch the url of the facebook application",
  "keyword": "When "
});
formatter.match({
  "location": "FbLogin.to_launch_the_url_of_the_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid usermname in email field",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.to_pass_the_valid_usermname_in_email_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass invalid password  in password field",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.to_pass_invalid_password_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To check whether navigate to the home page or not",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.to_check_whether_navigate_to_the_home_page_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close thhe browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbLogin.to_close_thhe_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To vaidate the positive and nagative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to hit the facebook url",
  "keyword": "When "
});
formatter.step({
  "name": "User has to pass the data \"\u003cemaildatas\u003e\" in email field",
  "keyword": "And "
});
formatter.step({
  "name": "User has to pass the data \"\u003cpassworddatas\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "name": "User has to click login button",
  "keyword": "And "
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emaildatas",
        "passworddatas"
      ]
    },
    {
      "cells": [
        "seleniuum@gmail.com",
        "inmakes"
      ]
    },
    {
      "cells": [
        "nssnj@gmail.com",
        "1234"
      ]
    },
    {
      "cells": [
        "bjhgsh@gmail.com",
        "hhft23"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To launch the chromebrowser and maximize window",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLogin.to_launch_the_chromebrowser_and_maximize_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To vaidate the positive and nagative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to hit the facebook url",
  "keyword": "When "
});
formatter.match({
  "location": "positiveAndNegative.user_has_to_hit_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"seleniuum@gmail.com\" in email field",
  "keyword": "And "
});
formatter.match({
  "location": "positiveAndNegative.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"inmakes\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "positiveAndNegative.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "positiveAndNegative.user_has_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "positiveAndNegative.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To launch the chromebrowser and maximize window",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLogin.to_launch_the_chromebrowser_and_maximize_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To vaidate the positive and nagative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to hit the facebook url",
  "keyword": "When "
});
formatter.match({
  "location": "positiveAndNegative.user_has_to_hit_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"nssnj@gmail.com\" in email field",
  "keyword": "And "
});
formatter.match({
  "location": "positiveAndNegative.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"1234\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "positiveAndNegative.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "positiveAndNegative.user_has_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "positiveAndNegative.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To launch the chromebrowser and maximize window",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLogin.to_launch_the_chromebrowser_and_maximize_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To vaidate the positive and nagative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to hit the facebook url",
  "keyword": "When "
});
formatter.match({
  "location": "positiveAndNegative.user_has_to_hit_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"bjhgsh@gmail.com\" in email field",
  "keyword": "And "
});
formatter.match({
  "location": "positiveAndNegative.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"hhft23\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "positiveAndNegative.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "positiveAndNegative.user_has_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "positiveAndNegative.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});