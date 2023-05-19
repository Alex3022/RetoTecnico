
package co.com.sofka.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListaUser {


    private Integer page;
    @JsonProperty("per_page")
    private Integer perPage;

    private Integer total;
    @JsonProperty("total_pages")
    private Integer totalPages;

    private List<UserCreac> data;

    private Support support;

    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();


    public Integer getPage() {
        return page;
    }


    public void setPage(Integer page) {
        this.page = page;
    }


    public Integer getPerPage() {
        return perPage;
    }


    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }


    public Integer getTotal() {
        return total;
    }


    public void setTotal(Integer total) {
        this.total = total;
    }


    public Integer getTotalPages() {
        return totalPages;
    }


    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }


    public List<UserCreac> getData() {
        return data;
    }


    public void setData(List<UserCreac> data) {
        this.data = data;
    }


    public Support getSupport() {
        return support;
    }


    public void setSupport(Support support) {
        this.support = support;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "{" +
                "page:" + page +
                "per_page:"+perPage +
                "total:" + total +
                "total_pages:" + totalPages +
                "data:" + data +
                "support:" + support + '\'' +
                '}';
    }

}
