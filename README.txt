Run Instructions:
I have created this page object framework using Cucumber, java, selenium web driver, Junit and Maven. 
To run the scripts, I have created a cucumber runner  class called CucumberRunner . This file has to run to execute the feature file.
The scripts can be run on both fire fox and chrome. Just you need to pass browser name. if nothing is passed, scripts will execute on fire fox default.
To execute the scripts on chrome, you have to download chrome driver and have to provide the path of the chrome driver as below.
-Dbrowser=chrome -Dwebdriver.chrome.driver=<Give the path here>

