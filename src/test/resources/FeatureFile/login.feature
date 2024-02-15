Feature:

To validate login funtionality of facebook application

Scenario:
To validate login with valid username and invalid password

Given To Launch the chrome browser and hit the url

When Enter the valid username in email field
|java123@gmail.com|selenium546@gmail.com|sql765@gmail.com|cucumber098@gmail.com|

And  Enter the invalid password in Password field
|java|selenium|sql|
|123|456|789|
|abc|def|ghi|

And Click the login button

Then To close the Browser

Scenario Outline:

To validate login with Invalid Username and Invalid password

Given To hit the chorome Browser and hit the url

When Enter the valid username "<UserName>" in email field

And Enter the Valid "<Password>" password in password field

And Click the Login button 

Then To close the browser

Examples:
|UserName|Password|
|emohan23@gmail.com|mohan123|
|kablilanm1234@gmail.com|kabilan123|
|rose1234@gmail.com|mnbdfg|
|elaverasanra98765@gmail.com|jhgfds23456|