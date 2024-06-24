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

Mobile.startExistingApplication('id.indocyber.level_up')

Mobile.waitForElementPresent(findTestObject('field_Username'), 5)

Mobile.setText(findTestObject('Object Repository/field_Username'), 'administrator', 0)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('field_Password'), 5)

Mobile.clearText(findTestObject('field_Password'), 5)

Mobile.setText(findTestObject('Object Repository/field_Password'), '', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/button_Login'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/VerifyLoginSuccess'), 30)

Mobile.verifyElementVisible(findTestObject('Object Repository/VerifyLoginSuccess'), 0)

