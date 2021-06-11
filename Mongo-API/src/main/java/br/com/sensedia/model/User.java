package br.com.sensedia.model;

import br.com.sensedia.config.Routers;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Document(collection = Routers.USER_BASE_ROUTE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    private String id;

    @NotNull
    @NotBlank
    private String username;

    @NotNull
    @NotBlank
    private String email;
}
