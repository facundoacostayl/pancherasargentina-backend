package com.pancherasargentina.server.pancherasargentinaserver.mercadoPago;

import com.mercadopago.MercadoPagoConfig;
import com.mercadopago.client.preference.PreferenceBackUrlsRequest;
import com.mercadopago.client.preference.PreferenceClient;
import com.mercadopago.client.preference.PreferenceItemRequest;
import com.mercadopago.client.preference.PreferenceRequest;
import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.preference.Preference;
import com.pancherasargentina.server.pancherasargentinaserver.mercadoPago.ModelEntity.UserBuyer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/mp")
public class MercadoPagoController
{
    @Value("${code.mercadoPago}")
    private String mercadoPagoToken;

    @PostMapping
    public String getList (@RequestBody UserBuyer userBuyer) {
        if(userBuyer == null) {return "error papá";}
        String title = userBuyer.getTitle();
        int quantity = userBuyer.getQuantity();
        int price = userBuyer.getUnit_price();

        try {
            MercadoPagoConfig.setAccessToken(mercadoPagoToken);
            //PREFERENCE CREATION
            // 1 - SALE PREFERENCE
            PreferenceItemRequest itemRequest = PreferenceItemRequest.builder()
                    .title(title)
                    .quantity(quantity)
                    .unitPrice(new BigDecimal(price))
                    .currencyId("ARS")
                    .build();

            List<PreferenceItemRequest> items = new ArrayList<>();
            items.add(itemRequest);

            // 2 - REDIRECTIONS PREFERENCE
            PreferenceBackUrlsRequest backUrls = PreferenceBackUrlsRequest
                    .builder()
                    .success("https://proviamoalmacengourmet.com")
                    .pending("https://proviamoalmacengourmet.com")
                    .failure("https://proviamoalmacengourmet.com")
                    .build();

            // GROUP OF PREFERENCES
            PreferenceRequest preferenceRequest = PreferenceRequest
                    .builder()
                    .items(items)
                    .backUrls(backUrls)
                    .build();

            //NEW CLIENT CREATION
            PreferenceClient client = new PreferenceClient();
            //SETTING PREFERENCES TO NEW CLIENT
            Preference preference = client.create(preferenceRequest);

            //RETURN PREFERENCE ID
            return preference.getId();
        }catch (MPException | MPApiException e) { return e.toString(); }
    }
}
