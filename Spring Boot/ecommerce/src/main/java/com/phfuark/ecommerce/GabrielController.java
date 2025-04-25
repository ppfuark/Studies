    package com.phfuark.ecommerce;

    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    import java.util.List;
    @RestController
    @RequestMapping("api/gabriel")
    public class GabrielController {

        @GetMapping
        public List<Gabriel> getGabriels() {
            return List.of(
                    new Gabriel(1, "Gabriel Bosco", true),
                    new Gabriel(2, "Gabriel Bosco", true),
                    new Gabriel(3, "Gabriel Bosco")
            );
        }

    }
