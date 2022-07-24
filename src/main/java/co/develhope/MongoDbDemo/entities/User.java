package co.develhope.MongoDbDemo.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Tania Ielpo
 */

@Data
@Document
public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;

    private String email;
}
