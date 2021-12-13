package NTTDATA.mscustomer_bank.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;

@Document("customerType")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerType {
    @Id
    private String id;

    @NotEmpty
    private String type;

    private CustomerTypeTwo customerTypeTwo;
}
