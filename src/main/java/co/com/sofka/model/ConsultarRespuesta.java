
package co.com.sofka.model;

import java.util.LinkedHashMap;
import java.util.Map;


import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsultarRespuesta {

    @JsonProperty("data")
    private UserCreac data;
    @JsonProperty("support")
    private Support support;


    @JsonProperty("data")
    public UserCreac getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(UserCreac data) {
        this.data = data;
    }

    @JsonProperty("support")
    public Support getSupport() {
        return support;
    }

    @JsonProperty("support")
    public void setSupport(Support support) {
        this.support = support;
    }



    @Override
    public String toString() {
        return "{" +
                "data:" + data +
                "support:" + support + '\'' +
                '}';
    }
}
