package cinema;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CinemaController {
    Cinema cinema = new Cinema(9, 9);

    @GetMapping("/seats")
    public Cinema seats() {
        return cinema;
    }
}
