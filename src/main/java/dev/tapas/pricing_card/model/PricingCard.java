package dev.tapas.pricing_card.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //for getter method
@Setter //for setter method
@NoArgsConstructor //for non-parameterised constructor
@AllArgsConstructor //for parameterised constructor

public class PricingCard {
    private String title;
    private String subTitle;
    private int price;
    private List<String> features;
}
