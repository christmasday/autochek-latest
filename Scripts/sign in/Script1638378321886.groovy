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

WebUI.click(findTestObject('Object Repository/sign in/Page_Autochek Buy  Sell Cars in Nigeria  Fi_0cc9da/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/sign in/Page_Login  AutoChek/input_Email Address_email'), 'ojbauer24@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/sign in/Page_Login  AutoChek/input_Password_password'), '1sXjaZykvEqGy4GmfKyi4A==')

WebUI.click(findTestObject('Object Repository/sign in/Page_Login  AutoChek/button_Log In'))

WebUI.verifyElementVisible(findTestObject('Object Repository/sign in/Page_Autochek Buy  Sell Cars in Nigeria  Fi_0cc9da/div_Sign Out'))

WebUI.verifyElementVisible(findTestObject('Object Repository/sign in/Page_Autochek Buy  Sell Cars in Nigeria  Fi_0cc9da/a_Sign Out'))

