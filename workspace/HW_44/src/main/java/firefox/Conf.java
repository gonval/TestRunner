package firefox;


import org.openqa.selenium.WebDriver;

public class Conf {
	
	public static void validate(WebDriver driver, String url) {
		
		Common.open(url);
		
		Common.pageValidation("01. Element [Title]: ", 				Common.item_01);
		Common.pageValidation("02. UI element [Sign Up title]: ", Common.item_02);
		Common.pageValidation("03. UI element [First name title]: ", Common.item_03);
		Common.pageValidation("04. UI element [First name field]: ", Common.item_04);
		Common.pageValidation("05. UI element [Email title]: ", Common.item_05);
		
		Common.pageValidation("06. UI element [Email field]: ", Common.item_06);
		Common.pageValidation("07. UI element [Gender title]: ", Common.item_07);
		Common.pageValidation("08. UI element [Gender area for Male]: ", Common.item_08);
		Common.pageValidation("09. UI element [Gender text for Male]: ", Common.item_09);
		Common.pageValidation("10. UI element [Check button for Male]: ", Common.item_10);
				
		Common.pageValidation("11. UI element [Gender text Female]: ", Common.item_11);
		Common.pageValidation("12. UI element [Sign Up &confirmation]: ", Common.item_12);
		Common.pageValidation("13. UI element [Check button Female]: ", Common.item_13);
		Common.pageValidation("14. UI element [I agree text]: ", Common.item_14);
		Common.pageValidation("15. UI element [I agree check button]: ", Common.item_15);
				
		Common.pageValidation("16. UI element [Facebook link]: ",Common.item_16);
		Common.pageValidation("17. UI element [Twitter link]: ", Common.item_17);
		Common.pageValidation("18. UI element [Flickr link]: ",Common.item_18);
		Common.pageValidation("19. UI element [Youtube link]: ", Common.item_19);
		Common.pageValidation("20. UI element [Reset button]: ", Common.item_20);
		
		Common.pageValidation("21. UI element [Submit botton]: ",Common.item_21);
		Common.pageValidation("22. UI element [Current location]: ", Common.item_22);
		Common.pageValidation("23. UI element [Current temperature]: ", Common.item_23);
		Common.pageValidation("24. UI element [Wether icon]: ", Common.item_24);
		Common.pageValidation("25. UI element [Last Name text]: ", Common.item_25);
		
		Common.pageValidation("26. UI element [Last Name field]: ", Common.item_26);
		Common.pageValidation("27. UI element [Phone number text]: ", Common.item_27);
		Common.pageValidation("28. UI element [Phone number field]: ", Common.item_28);
		Common.pageValidation("29. UI element [State name]: ", Common.item_29);
		Common.pageValidation("30. UI element [State dropdown]: ",Common.item_30);
		
		Common.pageValidation("31. UI element [OS and browser]: ", Common.item_31);
		Common.pageValidation("32. UI element [Copyrights]: ",Common.item_32);
		
		Common.pageValidation("33. UI element [Current date]: ", Common.item_33);
		
		Common.pageValidation("34. UI element [Error First Name]: ", Common.item_34);
		Common.pageValidation("35. UI element [Error Text field]: ", Common.item_35);
		Common.pageValidation("36. UI element [Error Last Name]: ", Common.item_36);
		Common.pageValidation("37. UI element [Error Email]: ", Common.item_37);

		Common.pageValidation("38. UI element [Error phone number]: ",Common.item_38);
		Common.pageValidation("39. UI element [Error Massage area]: ",Common.item_39);
		Common.pageValidation("40. UI element [Web services area]: ", Common.item_40);
		Common.pageValidation("41. UI element [Header]: ", Common.item_41);
		
		Common.pageValidation("42. UI element [View pain area): ", Common.item_42);
		Common.pageValidation("43. UI element [Footer line]: ", Common.item_43);
		}
}