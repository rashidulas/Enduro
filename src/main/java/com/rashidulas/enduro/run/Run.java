package com.rashidulas.enduro.run;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        String title,
        LocalDateTime StartedOn,
        LocalDateTime completion,
        Integer miles,
        Location location
) {
}
