# BelongCodingChallenge

This is a springboot project which has 2 get and 1 post operation 

 Data is available in the telephoneNumber.json resource file

GetAllPhoneNumbers
-  and returns list of phone numbers
e.g. http://localhost:8080/phoneNumbers

getPhoneNumbersByCustomerID
 - will return active phone numbers assigned to a customer
 
 e.g. http://localhost:8080/phoneNumbers/214341
 
 ActivatePhoneNumber (post)
 - activate phone number is a post operation number to be provided in the uri and customerID in the body
 - phone number must be available in the resource file and not assigned to a customer (inactive) 

e.g. http://localhost:8080/phoneNumbers/activateService/245465769
      { "customerID": "214343"}
