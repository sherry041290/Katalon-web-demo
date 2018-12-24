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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.foody.vn/')

WebUI.click(findTestObject('Object Repository/Login-Failed/Page_a im n ung m thc n g  u ti H N/span_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Login-Failed/Page_Login/input_hoc bng email_Email'), 'sherry9999')

WebUI.setEncryptedText(findTestObject('Object Repository/Login-Failed/Page_Login/input_hoc bng email_Password'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/Login-Failed/Page_Login/input_Qun mt khu_bt_submit'))

WebUI.closeBrowser()

