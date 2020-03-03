package pages.ManufacturingOrdersOytun;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateOrderPage {
    public CreateOrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButton;

    @FindBy(xpath = "(//div[@class='o_input_dropdown']//input)[1]")
    public WebElement productDropdwon;

    @FindBy(xpath = "(//a[@class='o_form_uri o_field_widget o_invisible_modifier o_readonly_modifier']) [1]")
    public WebElement caseComputer;

    @FindBy(css = "input.o_field_float.o_field_number.o_field_widget.o_input.o_required_modifier")
    public WebElement quatityToProduce;

    @FindBy(xpath = "(//div[@class='o_input_dropdown']//input)[3]")
    public WebElement billOfMaterials;

    @FindBy(xpath = "//div[@name='date_planned_start']//input")
    public WebElement daedlineStart;

    @FindBy(xpath = "//div[@name='user_id']//div//input")
    public WebElement responsible;

    @FindBy(css = "input.o_field_char.o_field_widget.o_input")
    public WebElement source;

    @FindBy(css = "div.o_dialog_warning.modal-body")
    public WebElement FailText;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']//span")
    public WebElement okayButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButtOn;



}
