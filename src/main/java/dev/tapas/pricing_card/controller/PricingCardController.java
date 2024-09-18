package dev.tapas.pricing_card.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dev.tapas.pricing_card.service.PricingCardService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class PricingCardController {
    public final PricingCardService service;

    @GetMapping
    public String home(Model model) {
        model.addAttribute("cards", service.getCards());
        return "index" ;
    }
}
