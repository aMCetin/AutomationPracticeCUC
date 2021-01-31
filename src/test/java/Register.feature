  ## //https://bit.ly/3th95HN
  Feature: Register Test

    Scenario Outline: Create an Account

      Given navigate to website
      And click sign in button
      And type email "<Email>"
      And click on create an account button
      And choose title "<title>"
      And type firstname "<firstname>" and lastname "<lastname>"
      And type password "<password>"
      And choose day "<day>"
      And choose month "<month>"
      And choose year "<year>"
      And type company "<company>"
      And type address "<address>"
      And type city "<city>"
      And choose state "<state>"
      And type zipcode "<zipcode>"
      And choose country "<country>"
      And type phone no "<phone number>"
      And type alias "<alias>"
      And click register
      Then verify successfully login
      Examples:
        | Email           | title | firstname | lastname | password | day | month | year | company | address        | city  | state   | zipcode | country       | phone number | alias       |

        | omer1@gmail.com | Mr.   | omer      | amca     | omer111  | 11  | 1     | 2011 | BOSCH   | rock street 11 | Adger | Alabama | 35006   | United States | 205-423-0232 | max@pbt.com |
    #     | lady2@gmail.com | Mrs.  | lady      | teyze    | lady222  | 22  | 2     | 2022 | Mercedes | lady weg 2 ||||2222222222|


    #    | tom3@gmail.com  | Mr.   | tom       | dayi     | tom333   | 33  | 3     | 2033 | BmW      | tom weg 3  ||||3333333333|
