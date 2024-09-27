import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import enums.ClientsAppsPwa;
import org.testng.annotations.Test;
import utils.DataSuppliers;

import static enums.ClientsAppsPwa.*;

public class ApiPwaTest {
    String pwaUrl = ".pwa.getmeback.ru/?debug=1";

    @Test(description = "Check opening PWA", dataProvider = "checkClientsAppsPwa", dataProviderClass = DataSuppliers.class)
    public void openPwa(ClientsAppsPwa clientsAppsPwa) throws IOException {
        URL url = new URL("https://" + clientsAppsPwa.nameClient + pwaUrl);
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        Integer responseCode = http.getResponseCode();
        assert responseCode.equals(200);
    }

}
