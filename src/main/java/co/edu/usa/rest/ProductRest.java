package co.edu.usa.rest;

import co.edu.usa.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/chocolate/")
public class ProductRest {

    @Autowired
    private co.edu.usa.service.ProductService ProductService;

    @GetMapping("all")
    @ResponseStatus(HttpStatus.OK)
    private List<Product> allProduct() {
        return ProductService.getProduct();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("new")
    private void createPrduct(@RequestBody Product product) {
        ProductService.createProduct(product);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("update")
    private void updateProduct(@RequestBody Product product) {
        ProductService.updateProduct(product);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    private void removeProduct(@PathVariable("id") String id) {
        ProductService.deleteProduct(id);
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    private Product getProduct(@PathVariable("id") String id) {
       return ProductService.getProductById(id);
    }


}
