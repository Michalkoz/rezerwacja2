package pl.michal.demorepo2.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.michal.demorepo2.models.forms.ReservationForm;

import javax.persistence.*;
import java.sql.Date;


@Data // to jest użycie lomboka czyli automatyczne tworzenie
      // geterów seterówi kontstruktora
@Entity // encja
@Table(name = "reservation") // zmiana na inną nazwę tabeli
@NoArgsConstructor // konstruktor bezargumentowy
public class ReservationModel {
    @Id //hibenate wie, że to pole id to klucz główny
    @GeneratedValue(strategy = GenerationType.AUTO)
    // wie, że id generuje się automatycznie
    private int id;
    // @Column(name="name1") w przypadku innej nazwy kolumny
    private String name;
    private String lastname;
    private Date date;
    private String adres;

    public ReservationModel (ReservationForm form) {
        name = form.getName();
        lastname = form.getLastname();
        date = form.getFormatedDate();
        adres = form.getAdres();
    }
}
