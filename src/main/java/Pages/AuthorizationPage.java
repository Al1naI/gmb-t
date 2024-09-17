package page;

import utils.Locators;
import widget.*;

public class AuthorizationPage {
    public Input nameInput = new Input(Locators.Authorization.nameInputLoc);
    public Input passwordInput = new Input(Locators.Authorization.passwordInputLoc);
    public Button enterButton = new Button(Locators.Authorization.enterBtnLoc);
}