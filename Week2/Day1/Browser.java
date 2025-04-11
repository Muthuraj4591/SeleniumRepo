package Week2.Day1;

public class Browser {
	public String launchBrowser(String browserName) {
		System.out.println(browserName + "Lanunched Successfully");
		return browserName;
	}
	public void loadUrl() {
		System.out.println("Application loaded successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browserOption = new Browser();
		System.out.println(browserOption.launchBrowser("Chrome"));
		//browserOption.launchBrowser("Chrome");
		browserOption.loadUrl();

	}
}
