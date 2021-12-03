import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('sign in'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/fix car/Page_Autochek Buy  Sell Cars in Nigeria  Fi_0cc9da/span_Fix Your Car'))

WebUI.click(findTestObject('Object Repository/fix car/Page_Car Repair  Maintenance Services in Ni_319ace/h2_Scheduled Car Service'))

WebUI.setText(findTestObject('Object Repository/fix car/Page_Scheduled Car Service in Nigeria  Autochek/input_Full name_name'), 
    'fabian amicki')

WebUI.setText(findTestObject('Object Repository/fix car/Page_Scheduled Car Service in Nigeria  Autochek/input_Phone_react-phone-input form-control'), 
    '7037857985')

WebUI.setText(findTestObject('Object Repository/fix car/Page_Scheduled Car Service in Nigeria  Autochek/input_Email address_email'), 
    'ojbauer24@gmail.com')

WebUI.click(findTestObject('Object Repository/fix car/Page_Scheduled Car Service in Nigeria  Autochek/form_Full namePhone Number PhoneEmail addre_0c5440'))

WebUI.setText(findTestObject('Object Repository/fix car/Page_Scheduled Car Service in Nigeria  Autochek/input_Your Car_react-select-2-input'), 
    'volkswagen passat')

WebUI.click(findTestObject('Object Repository/fix car/Page_Scheduled Car Service in Nigeria  Autochek/div_Volkswagen Passat'))

WebUI.click(findTestObject('Object Repository/fix car/Page_Scheduled Car Service in Nigeria  Autochek/label_Pick up from my location'))

WebUI.click(findTestObject('Object Repository/fix car/Page_Scheduled Car Service in Nigeria  Autochek/div_Select_css-1gtu0rj-indicatorContainer'))

WebUI.setText(findTestObject('Object Repository/fix car/Page_Scheduled Car Service in Nigeria  Autochek/input_Select your state_react-select-3-input'), 
    'lag')

WebUI.click(findTestObject('Object Repository/fix car/Page_Scheduled Car Service in Nigeria  Autochek/div_Select'))

WebUI.click(findTestObject('Object Repository/fix car/Page_Scheduled Car Service in Nigeria  Autochek/div_Select'))

WebUI.setText(findTestObject('Object Repository/fix car/Page_Scheduled Car Service in Nigeria  Autochek/input_Select your state_react-select-3-input'), 
    'lag')

WebUI.click(findTestObject('Object Repository/fix car/Page_Scheduled Car Service in Nigeria  Autochek/div_Lagos'))

WebUI.click(findTestObject('Object Repository/fix car/Page_Scheduled Car Service in Nigeria  Autochek/div_Select'))

WebUI.setText(findTestObject('Object Repository/fix car/Page_Scheduled Car Service in Nigeria  Autochek/input_Select city_react-select-4-input'), 
    'lekki')

WebUI.click(findTestObject('Object Repository/fix car/Page_Scheduled Car Service in Nigeria  Autochek/div_Lekki'))

WebUI.setText(findTestObject('Object Repository/fix car/Page_Scheduled Car Service in Nigeria  Autochek/textarea_a'), '666 cemetry road, sangotedo')

WebUI.click(findTestObject('Object Repository/fix car/Page_Scheduled Car Service in Nigeria  Autochek/button_Confirm'))

WebUI.click(findTestObject('Object Repository/fix car/Page_Scheduled Car Service in Nigeria  Autochek/button_Confirm appointment'))

WebUI.verifyElementVisible(findTestObject('Object Repository/fix car/Page_AutoChek/div_Votre rendez-vous au service de voiture_c85a4f'))

WebUI.click(findTestObject('Object Repository/fix car/Page_AutoChek/button_Back to Home'))

