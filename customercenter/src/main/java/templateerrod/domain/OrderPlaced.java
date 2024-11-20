package templateerrod.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import templateerrod.infra.AbstractEvent;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productName;
    private String userId;
    private Integer qty;
    private String status;
}
