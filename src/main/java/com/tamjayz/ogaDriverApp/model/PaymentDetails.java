package com.tamjayz.ogaDriverApp.model;

import com.tamjayz.ogaDriverApp.model.domain.PaymentStatus;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PaymentDetails {

    private String paymentId;
    private String payStackLinkId;
    private String payStackReferenceId;
    private String payStackStatus;
    private String payStackPaymentId;
    private PaymentStatus paymentStatus;
}
