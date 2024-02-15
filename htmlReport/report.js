$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/emoha/eclipse-workspace/CucumberNew/src/test/resources/FeatureFile/login.feature");
formatter.feature({
  "name": "",
  "description": "To validate login funtionality of facebook application",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "To validate login with valid username and invalid password",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To Launch the chrome browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinication.to_Launch_the_chrome_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the valid username in email field",
  "rows": [
    {
      "cells": [
        "java123@gmail.com",
        "selenium546@gmail.com",
        "sql765@gmail.com",
        "cucumber098@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinication.enter_the_valid_username_in_email_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the invalid password in Password field",
  "rows": [
    {
      "cells": [
        "java",
        "selenium",
        "sql"
      ]
    },
    {
      "cells": [
        "123",
        "456",
        "789"
      ]
    },
    {
      "cells": [
        "abc",
        "def",
        "ghi"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinication.enter_the_invalid_password_in_Password_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinication.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinication.to_close_the_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "",
  "description": "To validate login with Invalid Username and Invalid password",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To hit the chorome Browser and hit the url",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter the valid username \"\u003cUserName\u003e\" in email field",
  "keyword": "When "
});
formatter.step({
  "name": "Enter the Valid \"\u003cPassword\u003e\" password in password field",
  "keyword": "And "
});
formatter.step({
  "name": "Click the Login button",
  "keyword": "And "
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ]
    },
    {
      "cells": [
        "emohan23@gmail.com",
        "mohan123"
      ]
    },
    {
      "cells": [
        "kablilanm1234@gmail.com",
        "kabilan123"
      ]
    },
    {
      "cells": [
        "rose1234@gmail.com",
        "mnbdfg"
      ]
    },
    {
      "cells": [
        "elaverasanra98765@gmail.com",
        "jhgfds23456"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "To validate login with Invalid Username and Invalid password",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To hit the chorome Browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenerioOutLine.to_hit_the_chorome_Browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the valid username \"emohan23@gmail.com\" in email field",
  "keyword": "When "
});
formatter.match({
  "location": "ScenerioOutLine.enter_the_valid_username_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Valid \"mohan123\" password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "ScenerioOutLine.enter_the_Valid_password_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "ScenerioOutLine.click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenerioOutLine.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "To validate login with Invalid Username and Invalid password",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To hit the chorome Browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenerioOutLine.to_hit_the_chorome_Browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the valid username \"kablilanm1234@gmail.com\" in email field",
  "keyword": "When "
});
formatter.match({
  "location": "ScenerioOutLine.enter_the_valid_username_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Valid \"kabilan123\" password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "ScenerioOutLine.enter_the_Valid_password_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "ScenerioOutLine.click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenerioOutLine.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "To validate login with Invalid Username and Invalid password",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To hit the chorome Browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenerioOutLine.to_hit_the_chorome_Browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the valid username \"rose1234@gmail.com\" in email field",
  "keyword": "When "
});
formatter.match({
  "location": "ScenerioOutLine.enter_the_valid_username_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Valid \"mnbdfg\" password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "ScenerioOutLine.enter_the_Valid_password_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "ScenerioOutLine.click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenerioOutLine.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "To validate login with Invalid Username and Invalid password",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To hit the chorome Browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenerioOutLine.to_hit_the_chorome_Browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the valid username \"elaverasanra98765@gmail.com\" in email field",
  "keyword": "When "
});
formatter.match({
  "location": "ScenerioOutLine.enter_the_valid_username_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Valid \"jhgfds23456\" password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "ScenerioOutLine.enter_the_Valid_password_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "ScenerioOutLine.click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenerioOutLine.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});