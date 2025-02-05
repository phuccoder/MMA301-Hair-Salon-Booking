package com.example.hairsalon.responses;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ComboDetailResponse {
    private Integer comboDetailID;
    private Integer serviceID;
    private String serviceName;
    private BigDecimal servicePrice;
    private String serviceImage;
}