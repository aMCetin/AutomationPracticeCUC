  ## //https://bit.ly/3th95HN
  Feature: Register Test

    Scenario Outline: Create an Account

      Given navigate to website
      And click sign in button
      And type email "<Email>"
      And click on create an account button
      And choose title
      And type firstname "<firstname>" and lastname "<lastname>"
      And type password "<password>"
      And type company "<company>"
      And type address "<address>"
      Examples:
        | Email           | firstname | lastname | password | company  | address    |

        | omer1@gmail.com | omer      | amca     | omer111  | VW       | omer weg 1 |
        | lady2@gmail.com | lady      | teyze    | lady222  | Mercedes | lady weg 2 |

      ###
        # | tom3@gmail.com  | tom       | dayi     | tom333   | BmW      | tom weg 3  |
