import enums.ClientsAppsPwa;
import io.qameta.allure.restassured.AllureRestAssured;
import org.testng.annotations.Test;
import utils.DataSuppliers;

import static io.restassured.RestAssured.*;

public class ApiPwaTest {
    String pwaUrlV52 = ".getmeback.ru/rest/mobile/v52/app";
    String pwaUrlV53 = ".getmeback.ru/rest/mobile/v53/app";

    @Test(description = "Check opening PWA v52", dataProvider = "checkClientsAppsPwa", dataProviderClass = DataSuppliers.class)
    public void openPwaV52(ClientsAppsPwa clientsAppsPwa) {
        given()
                .filter(new AllureRestAssured())
                .log().all()
                .when()
                .post("https://" + clientsAppsPwa.nameClient + pwaUrlV52)
                .then()
                .statusCode(200);
    }

    @Test(description = "Check opening PWA v53", dataProvider = "checkClientsAppsPwa", dataProviderClass = DataSuppliers.class)
    public void openPwaV53(ClientsAppsPwa clientsAppsPwa) {
        given()
                .filter(new AllureRestAssured())
                .log().all()
                .when()
                .post("https://" + clientsAppsPwa.nameClient + pwaUrlV53)
                .then()
                .statusCode(200);
    }
}
