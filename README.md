# autochek-latest
This repository was created with Groovy and katalon studio.
To run this code, download and install katalon studio from katalon.com, then clone this repo in katalon studio and run the regression test suite.
This code is also ready for CI using any CI tool of your choosing. To run this code in CI/CD pipeline, run the command below;

./katalonc -noSplash -runMode=console -projectPath="/Users/Fabian/Katalon Studio/autochek/autochek.prj" -retry=0 -testSuitePath="Test Suites/regression" -executionProfile="default" -browserType="Chrome" -apiKey="de2bc8a3-a8e4-47ff-a8b7-c7e5660424f9" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true

