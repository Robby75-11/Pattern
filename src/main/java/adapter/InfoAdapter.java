package adapter;

import java.time.LocalDate;
import java.time.Period;

public class InfoAdapter implements DataSource{

private Info info;

public InfoAdapter(Info info) {
    this.info = info;
}



    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }



    @Override
    public int getEta() {
        LocalDate oggi = LocalDate.now();
        LocalDate nascita = info.getDataDiNascita();

        return Period.between(nascita, oggi).getYears();
    }


    }

