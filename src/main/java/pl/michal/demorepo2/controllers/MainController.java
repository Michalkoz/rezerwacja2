package pl.michal.demorepo2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.michal.demorepo2.models.ReservationModel;
import pl.michal.demorepo2.models.forms.ReservationForm;
import pl.michal.demorepo2.models.repositories.ReservationRepository;
import pl.michal.demorepo2.models.services.StringService;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;

@Controller
    public class MainController{

    @Autowired
    StringService stringService;

    @Autowired
    ReservationRepository reservationRepository;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("reservationForm", new ReservationForm());
        return "index";
        }

    @PostMapping("/")
    public  String index(@ModelAttribute("reservationForm") ReservationForm form) {
        reservationRepository.save(new ReservationModel(form));
            return "index";
    }
}

