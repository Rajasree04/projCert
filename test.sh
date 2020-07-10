#!/bin/sh
echo "Started Executing Selenium Test Cases"
java -jar latest_app.jar > sample.txt
app=`tail -1 sample.txt`
app=`echo $app| tr -d ' '`
echo "Variable $app"
if [ $app = "TestSuccessfull" ]
then 
	echo "Test is successfull"
else
	docker rm -f phpproject
	echo "test is un successfull"
fi
echo "Completed Testing"
