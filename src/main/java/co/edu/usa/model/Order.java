package co.edu.usa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

import java.util.Date;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "order")
public class Order {

    @Id
    private Long id;

    private Date registerDay;

    private String status;

    private User salesMan;

    private Map<String, Product> products;

    private Map<String, Integer> quantities;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getRegisterDay() {
        return registerDay;
    }

    public void setRegisterDay(Date registerDay) {
        this.registerDay = registerDay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getSalesMan() {
        return salesMan;
    }

    public void setSalesMan(User salesMan) {
        this.salesMan = salesMan;
    }

    public Map<String, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Product> products) {
        this.products = products;
    }

    public Map<String, Integer> getQuantities() {
        return quantities;
    }

    public void setQuantities(Map<String, Integer> quantities) {
        this.quantities = quantities;
    }

    
}
