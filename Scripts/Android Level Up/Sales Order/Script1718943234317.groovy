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

Mobile.startApplication('C:\\Users\\0767\\Downloads\\app-debug.apk', true)

Mobile.tap(findTestObject('Object Repository/Sales Order/Button_login'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Sales Order/Button_garis_tiga'), 0)

Mobile.tap(findTestObject('Object Repository/Sales Order/Sales'), 0)

Mobile.tap(findTestObject('Object Repository/Sales Order/Sales_order'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/Sales Order/Button_plus_sales_order'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/Sales Order/Customer_id'), 0)

//Mobile.hideKeyboard()

WebUI.delay(2)

Mobile.tap(findTestObject('Sales Order/Customer-id-feni'), 0)

Mobile.tap(findTestObject('Object Repository/Sales Order/Seller'), 0)

Mobile.tap(findTestObject('Object Repository/Sales Order/Saller_wiliam'), 0)

Mobile.tap(findTestObject('Sales Order/Owner'), 0)

Mobile.tap(findTestObject('Sales Order/Owner-dimas'), 0)

Mobile.tap(findTestObject('Sales Order/Customer-ref'), 0)

Mobile.setText(findTestObject('Sales Order/Customer-ref'), 'qwerty12345', 0)

//Mobile.hideKeyboard()

Mobile.tap(findTestObject('Sales Order/Order-type'), 0)

Mobile.tap(findTestObject('Sales Order/Order-type-item'), 0)

Mobile.tap(findTestObject('Sales Order/Trans-type'), 0)

Mobile.tap(findTestObject('Sales Order/Order-type-item'), 0)

Mobile.tap(findTestObject('Sales Order/So-number'), 0)

Mobile.tap(findTestObject('Sales Order/So-number-manual'), 0)

Mobile.tap(findTestObject('Sales Order/Currency'), 0)

Mobile.tap(findTestObject('Sales Order/Currency-idr'), 0)

Mobile.tap(findTestObject('Sales Order/Button-next'), 0)

