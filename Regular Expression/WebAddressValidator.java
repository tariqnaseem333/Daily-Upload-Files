package thursday_16_nov;

public class WebAddressValidator {

	public boolean isValidWebAddress(String webAddress){
		String webAddressRegex = "(http|https)(:\\/\\/)(www.)([\\w]+)[.](com|org|net)";
		return webAddress.matches(webAddressRegex);
	}

}
