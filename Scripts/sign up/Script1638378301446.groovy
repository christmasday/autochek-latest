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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseURL)

WebUI.click(findTestObject('Object Repository/sign up/Page_Autochek Buy  Sell Cars in Nigeria  Fi_0cc9da/a_Register'))

WebUI.setText(findTestObject('Object Repository/sign up/Page_Register  AutoChek/input_First Name_firstname'), 'fabian')

WebUI.setText(findTestObject('Object Repository/sign up/Page_Register  AutoChek/input_Last Name_lastname'), 'amicki')

WebUI.setText(findTestObject('Object Repository/sign up/Page_Register  AutoChek/input_Email Address_email'), 'ojbauer24@gmail.com')

WebUI.setText(findTestObject('Object Repository/sign up/Page_Register  AutoChek/input_Phone number_form-control'), '7037857985')

WebUI.setEncryptedText(findTestObject('Object Repository/sign up/Page_Register  AutoChek/input_Password_password'), '1sXjaZykvEqGy4GmfKyi4A==')

WebUI.click(findTestObject('Object Repository/sign up/Page_Register  AutoChek/button_Show'))

WebUI.click(findTestObject('Object Repository/sign up/Page_Register  AutoChek/button_Register'))

if (WebUI.verifyElementVisible(findTestObject('Object Repository/sign up/Page_Register  AutoChek/h2_Error')) && WebUI.verifyElementVisible(
    findTestObject('Object Repository/sign up/Page_Register  AutoChek/div_Email already exist'))) {
    WebUI.click(findTestObject('Object Repository/sign up/Page_Register  AutoChek/button_OK'))

    WebUI.callTestCase(findTestCase('sign in'), [:], FailureHandling.STOP_ON_FAILURE)
}

