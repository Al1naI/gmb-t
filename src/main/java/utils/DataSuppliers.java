package utils;

import enums.ClientsAppsPwa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testng.annotations.DataProvider;

public class DataSuppliers {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class ClientName {
        ClientsAppsPwa clientsAppsPwa;
    }

    @DataProvider(name = "checkClientsAppsPwa")
    public Object[][] checkClientsAppsPwa() {
        return new Object[][] {
                {ClientsAppsPwa.S2B},
                {ClientsAppsPwa.PODOROGNIK},
                {ClientsAppsPwa.CAPITALSKILLS},
                {ClientsAppsPwa.GILIS},
                {ClientsAppsPwa.KANKADZESCHOOL},
                {ClientsAppsPwa.MYELISACLUB},
                {ClientsAppsPwa.DELAYT},
                {ClientsAppsPwa.GUSIGROUP},
                {ClientsAppsPwa.MYSTERIOHOTEL},
                {ClientsAppsPwa.LEOLECLER},
                {ClientsAppsPwa.ZUB33},
                {ClientsAppsPwa.GDERAKI},
                {ClientsAppsPwa.PIVNOJDVORIK},
                {ClientsAppsPwa.TABASKOFRIENDS},
                {ClientsAppsPwa.IZBA},
                {ClientsAppsPwa.MPRSHOP},
                {ClientsAppsPwa.MAYAKOVSKIHOTEL},
                {ClientsAppsPwa.MYASNOYBARON},
                {ClientsAppsPwa.FRIENDSCLUB},
                {ClientsAppsPwa.CHB_ADMIN},
                {ClientsAppsPwa.AVTOMIR},
                {ClientsAppsPwa.INJIR},
                {ClientsAppsPwa.PARSPB},
                {ClientsAppsPwa.KIMCHI},
                {ClientsAppsPwa.EXPRESSBUKET24},
                {ClientsAppsPwa.JETSONNEW},
                {ClientsAppsPwa.VOSHODVAPESHOP},
                {ClientsAppsPwa.RIVERSIDE},
                {ClientsAppsPwa.GMB},
                {ClientsAppsPwa.TARELKA},
                {ClientsAppsPwa.TOYSWAGON},
                {ClientsAppsPwa.YARUMEN},
                {ClientsAppsPwa.COFFEEMAKE},
                {ClientsAppsPwa.UMIKITCHEN},
                {ClientsAppsPwa.MONACOCLINIC},
                {ClientsAppsPwa.ELECTRABIKE},
                {ClientsAppsPwa.NARUTORAMEN},
                {ClientsAppsPwa.PERMGAZGARANT},
                {ClientsAppsPwa.FRANZ},
                {ClientsAppsPwa.VSEHOROSHO},
                {ClientsAppsPwa.PLATAN},
                {ClientsAppsPwa.SANTEHCITY},
                {ClientsAppsPwa.EXPERT3D},
                {ClientsAppsPwa.SBBURGERS},
                {ClientsAppsPwa.YABLOKI},
                {ClientsAppsPwa.BIGSHOP},
                {ClientsAppsPwa.CRYSTALHOUSE},
                {ClientsAppsPwa.KOSOUHOFF29},
                {ClientsAppsPwa.LEDESSERT},
                {ClientsAppsPwa.CHOCOLANTINI},
                {ClientsAppsPwa.VSHOP},
                {ClientsAppsPwa.DAYNAVA},
                {ClientsAppsPwa.NELLAFORESTA},
                {ClientsAppsPwa.TIMEBIZ},
                {ClientsAppsPwa.SWEETV},
                {ClientsAppsPwa.HMELSOLOD},
                {ClientsAppsPwa.ANTU},
                {ClientsAppsPwa.COFFEANA},
                {ClientsAppsPwa.DIETICA},
                {ClientsAppsPwa.TSARSKAYA_OHOTA},
                {ClientsAppsPwa.RIVERMC},
                {ClientsAppsPwa.CHILLISBAR},
                {ClientsAppsPwa.VELSKIY},
                {ClientsAppsPwa.KEYCOFFEE},
                {ClientsAppsPwa.TMSHE},
                {ClientsAppsPwa.PIVOPEI},
                {ClientsAppsPwa.GOODTASTEFAMILY},
                {ClientsAppsPwa.RUDENTA},
                {ClientsAppsPwa.WINECANDANCE}
        };
    }

}
