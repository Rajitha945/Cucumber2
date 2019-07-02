
Feature: Add Customer
  I want to use this template for my feature file
   
    Background:
         Given Use is in the Add Customer Page
          And Click on Add Customer page 
         
  
  
     Scenario: Tarrif PLan
         When Fill the detailss
         |Rajitha|Kataru|rajithak@gmail.com|nellore|7338979844|
         And click on submit button
         Then validate the successfull message is displayed
     @sanity    
     Scenario: Tarrif PLan
         When Fill the detailse
         |fName|Rajitha|
         |lName|Kataru|
         |email|rajithak@gmail.com|
         |Address|nellore|
         |Phno|7338979844|
         And click on submit button
         Then validate the successfull message is displayed    
         
      Scenario Outline: 
         When Fill the details "<Fname>","<Lastname>","<email>","<add>","<phNo>"
        And click on submit button
        Then validate the successfull message is displayed
        
      Examples:
        |Fname|Lastname|email|add|phNo|
        |Rajitha|Kataru|rajithak@gmail.com|nellore|7338979844|
        |Rajith|Katar|rajitak@gmail.com|nellore|7338979844|
      
      
         

 


