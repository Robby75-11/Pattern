package adapter;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main (String [] args){

Info info = new  Info();
info.setNome("Giulia");
info.setCognome("Poggi");
info.setDataDiNascita(LocalDate.of (1990, 5, 15));

UserData user = new UserData();
DataSource adapter = new InfoAdapter(info);

        user.getData(adapter);
        user.stampaDati();

    }
}
