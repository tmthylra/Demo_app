package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiController {
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
    private Prices prices = new Prices();

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/api/prices")
    public Prices sayHelloWorld(){
        return prices;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            log.info("New price request...");

            //Eth buy price from coinbase
            CoinbaseResponse cr = restTemplate.getForObject("https://api.coinbase.com/v2/prices/ETH-USD/buy", CoinbaseResponse.class);
            prices.setEth1Buy(cr.getData().getAmount());

            //Eth sell price from coinbase
            cr = restTemplate.getForObject("https://api.coinbase.com/v2/prices/ETH-USD/sell", CoinbaseResponse.class);
            prices.setEth1Sell(cr.getData().getAmount());

            //BTC buy price from coinbase
            cr = restTemplate.getForObject("https://api.coinbase.com/v2/prices/BTC-USD/buy", CoinbaseResponse.class);
            prices.setBtc1Buy(cr.getData().getAmount());

            //BTC sell price from coinbase
            cr = restTemplate.getForObject("https://api.coinbase.com/v2/prices/BTC-USD/sell", CoinbaseResponse.class);
            prices.setBtc1Sell(cr.getData().getAmount());

            //BTC prices from gemini
            GeminiPrice gp = restTemplate.getForObject("https://api.gemini.com/v1/pubticker/btcusd", GeminiPrice.class);
            prices.setBtc2Buy(gp.getAsk());
            prices.setBtc2Sell(gp.getBid());

            //ETH prices from gemini
            gp = restTemplate.getForObject("https://api.gemini.com/v1/pubticker/ethusd", GeminiPrice.class);
            prices.setEth2Buy(gp.getAsk());
            prices.setEth2Sell(gp.getBid());

        };
    }
}
