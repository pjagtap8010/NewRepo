
@home
Feature: Home Page 

@tag1
Scenario: scenario1 
Given user on home page
When user enters name & email
Then user is able to enter


@tag2 
Scenario Outline: scenario2
Given user on home page
When user enter "<MoNo>" annd "<Date>"
Then user is able to enter Mo & Date

Examples:
 | MoNo | Date        | 
  | 123  | 02-02-2025 | 
  | 45   | 02-03-2025 | 
  | 25   | 02-04-2025 | 

@tag3 
Scenario Outline: scenario3
Given user on home page
When user enter "<subject>"
And user enters "<Add>"
Then user is able to enter sub & Add

Examples:
 | subject | Add |
 | a       | xyz |
 | b       | abc |
 | m       |  n  |




