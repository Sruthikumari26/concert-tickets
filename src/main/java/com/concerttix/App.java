package com.concerttix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Controller
public class App {

    // Simple in-memory data store
    private static class Ticket {
        int id;
        String concert;
        String buyer;

        Ticket(int id, String concert) {
            this.id = id;
            this.concert = concert;
            this.buyer = "Available";
        }
    }

    private static List<Ticket> tickets = new ArrayList<>();

    static {
        tickets.add(new Ticket(1, "Rock Fest 2024"));
        tickets.add(new Ticket(2, "Jazz Night"));
        tickets.add(new Ticket(3, "Pop Extravaganza"));
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tickets", tickets);
        return "index";
    }

    @PostMapping("/buy")
    public String buyTicket(@RequestParam int id, @RequestParam String buyer) {
        for (Ticket t : tickets) {
            if (t.id == id && "Available".equals(t.buyer)) {
                t.buyer = buyer;
                break;
            }
        }
        return "redirect:/";
    }
}
