package test.automate;

import com.tg.octopus.base.TGOWrapper;
import com.tg.octopus.libs.testng.listener.TestListener;
import static com.tg.octopus.base.TGOWrapper.Action.*;
import static com.tg.octopus.base.TGOWrapper.LOGGER;
import com.tg.octopus.wrapper.ActionWrapper;

import com.jayway.jsonpath.JsonPath;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.JSONArray;
import org.json.JSONObject;
import helper.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.sql.*;
import com.testautomationguru.utility.PDFUtil;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.multipdf.Splitter;

import java.util.*;
import org.openqa.selenium.*;
import java.io.*;
import java.net.*;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import static io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

}

public void scheduletask() {

    // No need to declare / print method name here, handled by TestNg listener
    // declare("scheduletask");

    TYPE.$("ELE_EMAILINPUT","//input[@placeholder='Email']","ridainspector@test.com","FALSE","TGTYPESCREENREG");

    TYPE.$("ELE_PASSWORDINPUT","div#root > div > div > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > form > div > div:nth-of-type(2) > inputTGWEBCOMMACssSelectorTGWEBCOMMA0","eod777","FALSE","TGTYPESCREENREG");

    TAP.$("ELE_SIGNIN","div#root > div > div > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > form > div > buttonTGWEBCOMMACssSelectorTGWEBCOMMA0","TGTYPESCREENREG");

    WAIT.$(5,"TGTYPESCREENREG");

    TYPE.$("ELE_OTP1","div#root > div > div > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > form > div > div > inputTGWEBCOMMACssSelectorTGWEBCOMMA5","7","FALSE","TGTYPESCREENREG");

    TYPE.$("ELE_OTP2","div#root > div > div > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > form > div > div > input:nth-of-type(2)TGWEBCOMMACssSelectorTGWEBCOMMA0","8","FALSE","TGTYPESCREENREG");

    TYPE.$("ELE_OTP3","div#root > div > div > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > form > div > div > input:nth-of-type(3)TGWEBCOMMACssSelectorTGWEBCOMMA0","6","FALSE","TGTYPESCREENREG");

    TYPE.$("ELE_OTP4","div#root > div > div > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > form > div > div > input:nth-of-type(4)TGWEBCOMMACssSelectorTGWEBCOMMA0","7","FALSE","TGTYPESCREENREG");

    TYPE.$("ELE_OTP5","div#root > div > div > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > form > div > div > input:nth-of-type(5)TGWEBCOMMACssSelectorTGWEBCOMMA0","8","FALSE","TGTYPESCREENREG");

    TYPE.$("ELE_OTP6","div#root > div > div > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > form > div > div > input:nth-of-type(6)TGWEBCOMMACssSelectorTGWEBCOMMA0","6","FALSE","TGTYPESCREENREG");

    TAP.$("ELE_VERIFYCODE","div#root > div > div > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > form > div > buttonTGWEBCOMMACssSelectorTGWEBCOMMA0","TGTYPESCREENREG");

    WAIT.$(5,"TGTYPESCREENREG");

    TAP.$("ELE_SCHEDULETASKFORM","//span[normalize-space()='Schedule Task Form']TGWEBSELECTORdiv#root > div > div > div:nth-of-type(3) > ul > li:nth-of-type(2) > a > span:nth-of-type(2)TGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTOR//span[normalize-space()='Schedule Task Form']TGWEBSELECTOR//html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[2]/a[1]/span[2]TGWEBSELECTORmenu-item text-truncateTGWEBCOMMAclassTGWEBCOMMA0TGWEBSELECTORspanTGWEBCOMMATagTGWEBCOMMA21","TGTYPESCREENREG");

    TAP.$("ELE_ADDSCHEDULETASK","//button[normalize-space()='Add']TGWEBSELECTORdiv#root > div > div:nth-of-type(2) > div:nth-of-type(3) > div > header > buttonTGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTOR//button[normalize-space()='Add']TGWEBSELECTOR//html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/header[1]/button[1]TGWEBSELECTORwaves-effect waves-effect round btn btn-outline-primaryTGWEBCOMMAclassTGWEBCOMMA0TGWEBSELECTORbuttonTGWEBCOMMATagTGWEBCOMMA4","TGTYPESCREENREG");

    TAP.$("ELE_TRACKTYPE","//body/div[@id='root']/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div[1]/div[1]/div[2]TGWEBSELECTORdiv#root > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > div > div > div > div > div > div > div > div > div:nth-of-type(2)TGWEBCOMMACssSelectorTGWEBCOMMA5TGWEBSELECTOR//body/div[@id='root']/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div[1]/div[1]/div[2]TGWEBSELECTOR//html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]TGWEBSELECTORselect__input-container css-ackcqlTGWEBCOMMAclassTGWEBCOMMA0TGWEBSELECTORdivTGWEBCOMMATagTGWEBCOMMA121","TGTYPESCREENREG");

    WAIT.$(3,"TGTYPESCREENREG");

    TAP.$("ELE_EXCAVATIONPATHWAY","div#react-select-2-option-0TGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTORreact-select-2-option-0TGWEBCOMMAidTGWEBCOMMA0TGWEBSELECTORdiv#react-select-2-option-0TGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTOR//div[@id='react-select-2-option-0']TGWEBSELECTOR//html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]TGWEBSELECTORselect__option select__option--is-focused css-1qxoxwj-optionTGWEBCOMMAclassTGWEBCOMMA0TGWEBSELECTORdivTGWEBCOMMATagTGWEBCOMMA126","TGTYPESCREENREG");

    TAP.$("ELE_SELECTFORM","div#root > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > div > div > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2)TGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTORdiv#root > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > div > div > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2)TGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTOR//body//div[@id='root']//div//div//div[2]//div[1]//div[1]//div[1]//div[2]TGWEBSELECTOR//html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]TGWEBSELECTORselect__input-container css-ackcqlTGWEBCOMMAclassTGWEBCOMMA0TGWEBSELECTORdivTGWEBCOMMATagTGWEBCOMMA121","TGTYPESCREENREG");

    WAIT.$(3,"TGTYPESCREENREG");

    TAP.$("ELE_INSPECTIONVISIT","div#react-select-15-option-0TGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTORreact-select-15-option-0TGWEBCOMMAidTGWEBCOMMA0TGWEBSELECTORdiv#react-select-15-option-0TGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTOR//div[@id='react-select-15-option-0']TGWEBSELECTOR//html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]TGWEBSELECTORselect__option select__option--is-focused css-1qxoxwj-optionTGWEBCOMMAclassTGWEBCOMMA0TGWEBSELECTORdivTGWEBCOMMATagTGWEBCOMMA126","TGTYPESCREENREG");

    TAP.$("ELE_DIV408","//div[5]//div[1]//div[1]//div[1]//div[2]TGWEBSELECTORdiv#root > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > div > div > div > div > div:nth-of-type(5) > div > div > div > div:nth-of-type(2)TGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTOR//div[5]//div[1]//div[1]//div[1]//div[2]TGWEBSELECTOR//html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]TGWEBSELECTORselect__input-container css-ackcqlTGWEBCOMMAclassTGWEBCOMMA0TGWEBSELECTORdivTGWEBCOMMATagTGWEBCOMMA121","TGTYPESCREENREG");

    WAIT.$(3,"TGTYPESCREENREG");

    TAP.$("ELE_MUNCIPILITYOPTIONSELECT","div#react-select-16-option-0TGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTORreact-select-16-option-0TGWEBCOMMAidTGWEBCOMMA0TGWEBSELECTORdiv#react-select-16-option-0TGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTOR//div[@id='react-select-16-option-0']TGWEBSELECTOR//html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]TGWEBSELECTORselect__option select__option--is-focused css-1qxoxwj-optionTGWEBCOMMAclassTGWEBCOMMA0TGWEBSELECTORdivTGWEBCOMMATagTGWEBCOMMA140","TGTYPESCREENREG");

    TAP.$("ELE_LICENSESCOUNTBUTTON","div#root > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > div > div > div > div > div:nth-of-type(8) > div > div:nth-of-type(3) > div > buttonTGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTORdiv#root > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > div > div > div > div > div:nth-of-type(8) > div > div:nth-of-type(3) > div > buttonTGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTOR//button[normalize-space()='Licenses Count']TGWEBSELECTOR//html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[3]/div[1]/button[1]TGWEBSELECTORbtn btn-primaryTGWEBCOMMAclassTGWEBCOMMA0TGWEBSELECTORbuttonTGWEBCOMMATagTGWEBCOMMA3","TGTYPESCREENREG");

    WAIT.$(5,"TGTYPESCREENREG");

    TYPE.$("ELE_ENTERLISCENECECOUNT","//input[@placeholder='(Randomly taken the NOs)']TGWEBSELECTORdiv#root > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > div > div > div > div > div:nth-of-type(8) > div > div > inputTGWEBCOMMACssSelectorTGWEBCOMMA1TGWEBSELECTOR//input[@placeholder='(Randomly taken the NOs)']TGWEBSELECTOR//html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/input[1]TGWEBSELECTORinput-style form-controlTGWEBCOMMAclassTGWEBCOMMA0TGWEBSELECTORinputTGWEBCOMMATagTGWEBCOMMA14","5","FALSE","TGTYPESCREENREG");

    WAIT.$(3,"TGTYPESCREENREG");

    TAP.$("ELE_GETLICENSES","div#root > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > div > div > div > div > div:nth-of-type(8) > div > div:nth-of-type(5) > div > buttonTGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTORdiv#root > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > div > div > div > div > div:nth-of-type(8) > div > div:nth-of-type(5) > div > buttonTGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTOR//button[normalize-space()='Get Licenses']TGWEBSELECTOR//html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[5]/div[1]/button[1]TGWEBSELECTORbtn btn-primaryTGWEBCOMMAclassTGWEBCOMMA0TGWEBSELECTORbuttonTGWEBCOMMATagTGWEBCOMMA3","TGTYPESCREENREG");

    CLICKANDHOLD.$("ELE_CLICKANDHOLDDROPDOWNINSPECTOR","//body/div[@id='root']/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div[2]TGWEBSELECTORdiv#root > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > div > div > div > div > div:nth-of-type(8) > div > div > div > div > div > div:nth-of-type(2)TGWEBCOMMACssSelectorTGWEBCOMMA1TGWEBSELECTOR//body/div[@id='root']/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div[2]TGWEBSELECTOR//html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]TGWEBSELECTORselect__input-container css-ackcqlTGWEBCOMMAclassTGWEBCOMMA0TGWEBSELECTORdivTGWEBCOMMATagTGWEBCOMMA253","TGTYPESCREENREG");

    WAIT.$(5,"TGTYPESCREENREG");

    WAIT.$(5,"TGTYPESCREENREG");

    TYPE.$("ELE_SELECTINSPECTORR","div#root > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > div > div > div > div > div:nth-of-type(8) > div > div > div > div > divTGWEBCOMMACssSelectorTGWEBCOMMA2TGWEBSELECTORdiv#root > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > div > div > div > div > div:nth-of-type(8) > div > div > div > div > divTGWEBCOMMACssSelectorTGWEBCOMMA2TGWEBSELECTOR//body/div[@id='root']/div/div/div/div/div/div/div/div/div/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]TGWEBSELECTOR//html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]TGWEBSELECTORselect__value-container css-1d8n9btTGWEBCOMMAclassTGWEBCOMMA0TGWEBSELECTORdivTGWEBCOMMATagTGWEBCOMMA135","rida","TRUE","TGTYPESCREENREG");

    WAIT.$(5,"TGTYPESCREENREG");

    TAP.$("ELE_RIDAINSPECTORSELECTED","react-select-49-option-0TGWEBCOMMAIdTGWEBCOMMA0TGWEBSELECTORreact-select-49-option-0TGWEBCOMMAidTGWEBCOMMA0TGWEBSELECTORdiv#react-select-49-option-0TGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTOR//div[@id='react-select-49-option-0']TGWEBSELECTOR//html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]TGWEBSELECTORselect__option select__option--is-focused css-1qxoxwj-optionTGWEBCOMMAclassTGWEBCOMMA0TGWEBSELECTORdivTGWEBCOMMATagTGWEBCOMMA126","TGTYPESCREENREG");

    WAIT.$(5,"TGTYPESCREENREG");

    TAP.$("ELE_DROPDOWNINSPECTORARROW","//body/div[@id='root']/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[@aria-hidden='true']/*[1]TGWEBSELECTORdiv#root > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > div > div > div > div > div:nth-of-type(8) > div > div > div > div > div:nth-of-type(2) > div > svgTGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTOR//body/div[@id='root']/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[@aria-hidden='true']/*[1]TGWEBSELECTOR//html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/svg[1]TGWEBSELECTORsvgTGWEBCOMMATagTGWEBCOMMA0","TGTYPESCREENREG");

    SCROLL.$("ELE_INSPECTORDROPDOWNN","div#root > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > div > div > div > div > div:nth-of-type(8) > div > div > div > div > div > div:nth-of-type(2)TGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTORdiv#root > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > div > div > div > div > div:nth-of-type(8) > div > div > div > div > div > div:nth-of-type(2)TGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTOR//body//div[@id='root']//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div[2]TGWEBSELECTOR//html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]TGWEBSELECTORselect__input-container css-ackcqlTGWEBCOMMAclassTGWEBCOMMA0TGWEBSELECTORdivTGWEBCOMMATagTGWEBCOMMA123","DOWN","TGTYPESCREENREG");

    TAP.$("ELE_SUBMIT","//span[normalize-space()='Submit']TGWEBSELECTORdiv#root > div > div:nth-of-type(2) > div:nth-of-type(3) > div > div > div > div > div:nth-of-type(2) > div > button > spanTGWEBCOMMACssSelectorTGWEBCOMMA0TGWEBSELECTOR//span[normalize-space()='Submit']TGWEBSELECTOR//html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/span[1]TGWEBSELECTORspanTGWEBCOMMATagTGWEBCOMMA102","TGTYPESCREENREG");


}


}