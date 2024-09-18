package dev.tapas.pricing_card.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import dev.tapas.pricing_card.model.PricingCard;

@Repository
public class PricingCardRepository {
    public PricingCard card1() {
        return new PricingCard(  "Basic Plan",
        "For individuals",
        10,
        List.of("1 GB Storage", "Basic Support", "Single User"));
    }

    public PricingCard card2() {
        return new PricingCard( "Standard Plan",
        "For small teams",
        25,
        List.of("10 GB Storage", "Priority Support", "Up to 5 Users"));
    }

    public PricingCard card3() {
        return new PricingCard( "Premium Plan",
        "For large teams",
        50,
        List.of("Unlimited Storage", "24/7 Support", "Unlimited Users"));
    }
}
