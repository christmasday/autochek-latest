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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/sell car/Page_Autochek Buy  Sell Cars in Nigeria  Fi_0cc9da/span_Sell A Car'))

WebUI.click(findTestObject('Object Repository/sell car/Page_Sell Cars Online, Quick  Easy - Autochek/span_Get started'))

WebUI.setText(findTestObject('Object Repository/sell car/Page_Sell Cars Online, Quick  Easy - Autochek/input_What make is it_input'), 
    'volkswagen')

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/book inspection/Page_Sell Cars Online, Quick  Easy - Autochek/volks img'), 
    15)

WebUI.click(findTestObject('Object Repository/book inspection/Page_Sell Cars Online, Quick  Easy - Autochek/volks img'))

WebUI.click(findTestObject('Object Repository/sell car/Page_Sell Cars Online, Quick  Easy - Autochek/button_Next'))

WebUI.setText(findTestObject('Object Repository/sell car/Page_Sell Cars Online, Quick  Easy - Autochek/input_What model is it_input'), 
    'passat')

WebUI.click(findTestObject('Object Repository/sell car/Page_Sell Cars Online, Quick  Easy - Autochek/span_Passat'))

WebUI.click(findTestObject('Object Repository/sell car/Page_Sell Cars Online, Quick  Easy - Autochek/button_Next'))

WebUI.click(findTestObject('Object Repository/sell car/Page_Sell Cars Online, Quick  Easy - Autochek/div_What year is the vehicle_input select-c_9f0836'))

WebUI.click(findTestObject('Object Repository/sell car/Page_Sell Cars Online, Quick  Easy - Autochek/li_2007'))

WebUI.click(findTestObject('Object Repository/sell car/Page_Sell Cars Online, Quick  Easy - Autochek/div_What year is the vehicle_input select-c_9f0836'))

WebUI.click(findTestObject('Object Repository/sell car/Page_Sell Cars Online, Quick  Easy - Autochek/li_Saloon'))

WebUI.setText(findTestObject('Object Repository/sell car/Page_Sell Cars Online, Quick  Easy - Autochek/input_What is the mileage_mileage'), 
    '90000')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/sell car/Page_Sell Cars Online, Quick  Easy - Autochek/div_Automatic'))

WebUI.scrollToElement(findTestObject('Object Repository/sell car/Page_Sell Cars Online, Quick  Easy - Autochek/div_Petrol'), 
    0)

WebUI.click(findTestObject('Object Repository/sell car/Page_Sell Cars Online, Quick  Easy - Autochek/div_Petrol'))

WebUI.click(findTestObject('Object Repository/sell car/Page_Sell Cars Online, Quick  Easy - Autochek/span_Foreign Used_radio-display'))

not_run: WebUI.click(findTestObject('Object Repository/sell car/Page_Sell Cars Online, Quick  Easy - Autochek/div_Location dropdown'))

WebUI.click(findTestObject('Object Repository/sell car/Page_Sell Cars Online, Quick  Easy - Autochek/input_Location_react-select-2-input'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/sell car/Page_Sell Cars Online, Quick  Easy - Autochek/div_Lagos'))

WebUI.click(findTestObject('Object Repository/sell car/Page_Sell Cars Online, Quick  Easy - Autochek/button_Finish'))

WebUI.verifyElementVisible(findTestObject('Object Repository/book inspection/Page_AutoChek/span_BOOK INSPECTION APPOINTMENT'))

WebUI.click(findTestObject('Object Repository/book inspection/Page_AutoChek/button_Continue'))

WebUI.setText(findTestObject('Object Repository/book inspection/Page_AutoChek/input_Name_name'), 'fabian amicki')

WebUI.setText(findTestObject('Object Repository/book inspection/Page_AutoChek/input_Phone_react-phone-input form-control'), 
    '7037857985')

WebUI.setText(findTestObject('Object Repository/book inspection/Page_AutoChek/input_Email address_email'), 'ojbauer24@gmail.com')

WebUI.click(findTestObject('Object Repository/book inspection/Page_AutoChek/span_Inspect at Autochek center'))

WebUI.click(findTestObject('Object Repository/book inspection/Page_AutoChek/button_Next'))

WebUI.click(findTestObject('Object Repository/book inspection/Page_AutoChek/div_Select location'))

WebUI.click(findTestObject('Object Repository/book inspection/Page_AutoChek/button_Submit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/book inspection/Page_AutoChek/div_failed to connect to all addresses'))

WebUI.closeBrowser()

