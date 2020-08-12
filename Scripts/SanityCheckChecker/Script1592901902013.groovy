import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.hrurl)

WebUI.delay(2)

WebUI.setText(findTestObject('input_CIPD Membership No_membership-number'), '111111')

WebUI.click(findTestObject('input_HR-inform email address_check'))

WebUI.verifyElementPresent(findTestObject('td_Mr Chris Reilly'), 0)

WebUI.clearText(findTestObject('input_CIPD Membership No_membership-number'))

WebUI.setText(findTestObject('input_HR-inform email address_user-email'), 'paul.hughes@croner.co.uk')

WebUI.click(findTestObject('input_HR-inform email address_check'))

WebUI.delay(2)

WebUI.click(findTestObject('button_NO'))

WebUI.verifyElementPresent(findTestObject('td_Paul Hughes'), 0)

WebUI.verifyElementPresent(findTestObject('button_Copy All'), 0)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

