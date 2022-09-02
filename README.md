# BelongCodingChallenge

this is a springboot project which has 2 get and 1 post operation 

GetAllPhoneNumbers
- reads data from the json input file under resources and returns list of phone numbers

getPhoneNumbersByCustomerID
 - will return active phone numbers assigned to a customer
 
 ActivatePhoneNumber (post)
 - activate phone number is a post operation number to be provided in the uri and customerID in the body
 - phone number must be available in the resource file and not assigned to a customer (inactive) 
