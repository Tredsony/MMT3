package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.runnerclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition {
	public static WebDriver driver=runnerclass.driver;
	@Given("^user Launch the Url in Adactin Web Appliction$")
	public void user_Launch_the_Url_in_Adactin_Web_Appliction() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
}
	@When("^user Enter the Username in Username Field$")
	public void user_Enter_the_Username_in_Username_Field() throws Throwable {
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("sonysebaa88");
	}

	@When("^user Enter the Password in Password Field$")
	public void user_Enter_the_Password_in_Password_Field() throws Throwable {
		WebElement passw = driver.findElement(By.xpath("//input[@id='password']"));
		passw.sendKeys("8ZJYXC");
	}

	@Then("^user click the Login Button And It Navigate To Search Hotel Page$")
	public void user_click_the_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		login.click();
	}

	@When("^user Select the Hotel Location in Location dropdown$")
	public void user_Select_the_Hotel_Location_in_Location_dropdown() throws Throwable {
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select loc=new Select(location);
		loc.selectByVisibleText("Melbourne");
	}
	@When("^user Select the Hotel  in hotel dropdown$")
	public void user_Select_the_Hotel_in_hotel_dropdown() throws Throwable {
		WebElement hotel = driver.findElement(By.xpath("(//select[@class='search_combobox'])[2]"));
		Select hot = new Select(hotel);
		hot.selectByValue("Hotel Sunshine");
	}

	@When("^user Select the Roomtype in Room-Type dropdown$")
	public void user_Select_the_Roomtype_in_Room_Type_dropdown() throws Throwable {
		WebElement roomtyp = driver.findElement(By.id("room_type"));
		Select roomtyp1 = new Select(roomtyp);
		roomtyp1.selectByVisibleText("Deluxe");
	}

	@When("^user Select Number Of Rooms  in Number Of Rooms dropdown$")
	public void user_Select_Number_Of_Rooms_in_Number_Of_Rooms_dropdown() throws Throwable {
		WebElement rooms = driver.findElement(By.id("room_nos"));
		Select rom = new Select(rooms);
		rom.selectByVisibleText("3 - Three");
	}

	@When("^user Enter the Check-In Date  in Check-In Date Field$")
	public void user_Enter_the_Check_In_Date_in_Check_In_Date_Field() throws Throwable {
		WebElement adults = driver.findElement(By.name("adult_room"));
		Select adu = new Select(adults);
		adu.selectByIndex(1);
	}

	@When("^user Enter the Check-Out Date  in Check-Out Date Field$")
	public void user_Enter_the_Check_Out_Date_in_Check_Out_Date_Field() throws Throwable {
		WebElement children = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select child = new Select(children);
		child.selectByVisibleText("4 - Four");
	}

	@When("^user Select the how many Adults per room in Adults per Room dropdown$")
	public void user_Select_the_how_many_Adults_per_room_in_Adults_per_Room_dropdown() throws Throwable {
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		
	}

	@When("^user Select the how many Child per room in Child per Room dropdown$")
	public void user_Select_the_how_many_Child_per_room_in_Child_per_Room_dropdown() throws Throwable {
		WebElement child = driver.findElement(By.id("child_room"));
		Select c = new Select(child);
		c.selectByVisibleText("2 - Two");
	}
		 
	@Then("^user Click the Search Button And It Navigate To Select Hotel Page$")
	public void user_Click_the_Search_Button_And_It_Navigate_To_Select_Hotel_Page() throws Throwable {
		WebElement button = driver.findElement(By.id("radiobutton_0"));
		button.click();
	}

	@When("^user Click the Hotel in Hotel name Radio Button$")
	public void user_Click_the_Hotel_in_Hotel_name_Radio_Button() throws Throwable {
		WebElement butt = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		butt.click();
		WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
		cont.click();
	}

	@Then("^user Click the Contine Button And It Navigate to Book A Hotel Page$")
	public void user_Click_the_Contine_Button_And_It_Navigate_to_Book_A_Hotel_Page() throws Throwable {
		WebElement frstname = driver.findElement(By.xpath("(//input[@class='reg_input'])[1]"));
		frstname.sendKeys("Murali");
	}

	@When("^user Enter the Firstname in the Firstname Field$")
	public void user_Enter_the_Firstname_in_the_Firstname_Field() throws Throwable {
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("J");
	}

	@When("^user Enter the Lastname in the Lastname Field$")
	public void user_Enter_the_Lastname_in_the_Lastname_Field() throws Throwable {
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.sendKeys("772/a - byepass road, chennai");
	}

	@When("^user Enter the Address in the Address Field$")
	public void user_Enter_the_Address_in_the_Address_Field() throws Throwable {
		WebElement credit = driver.findElement(By.xpath("//input[@id='cc_num']"));
		credit.sendKeys("1234567891023455");
	}

	@When("^user Enter the Credit card Number in Credit card Number Field$")
	public void user_Enter_the_Credit_card_Number_in_Credit_card_Number_Field() throws Throwable {
		WebElement cardtype = driver.findElement(By.id("cc_type"));
	     Select type = new Select(cardtype);
	     type.selectByIndex(1);
	}

	@When("^user Select the Credit Card Type in Credit Card Type Dropdown$")
	public void user_Select_the_Credit_Card_Type_in_Credit_Card_Type_Dropdown() throws Throwable {
		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month'] "));
	     Select mon = new Select(month);
	     mon.selectByValue("2");
	}

	@When("^user Select the Expiry Month and Year in the Expiry Month and Year Dropdown$")
	public void user_Select_the_Expiry_Month_and_Year_in_the_Expiry_Month_and_Year_Dropdown() throws Throwable {
		WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select yr = new Select(year);
		yr.selectByVisibleText("2014");
	}

	@When("^user Enter the CVV Number in CVV number Field$")
	public void user_Enter_the_CVV_Number_in_CVV_number_Field() throws Throwable {
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	    cvv.sendKeys("232");
	}

	
		
	}

	
	

