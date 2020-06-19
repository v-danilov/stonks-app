package app.stonks.provider.kontolos;

import app.stonks.provider.bisness.IStonksOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stonks")
public class StonksProviderController {

    @Autowired
    private IStonksOrderService stonksOrderService;

    @GetMapping("/random")
    public void provideStonks() {
        stonksOrderService.orderRandomStonk();
    }
}
