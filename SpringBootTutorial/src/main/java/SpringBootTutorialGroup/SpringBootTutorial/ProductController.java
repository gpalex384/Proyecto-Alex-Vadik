package SpringBootTutorialGroup.SpringBootTutorial;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;
 
@RestController
public class ProductController {
 
    @Autowired
    private ProductService service;
     
    // RESTful API methods for Retrieval operations
    
    //curl http://localhost:8080/products
    @GetMapping("/products")
    public List<Product> list() {
        return service.listAll();
    }
    
    //curl http://localhost:8080/products/{1}
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> get(@PathVariable Integer id) {
        try {
            Product product = service.get(id);
            return new ResponseEntity<Product>(product, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }      
    }
    
    @GetMapping(value = "/welcome", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String welcomeAsHTML() {
        return "<html>\n" + "<header><title>Welcome</title></header>\n" +
          "<body>\n" + "Hello world\n" + "</body>\n" + "</html>";
    }
    
     
    // RESTful API method for Create operation
    
//    curl --header "Content-Type: application/json" \
//    --request POST \
//    --data '{"id":3,"name":"testname","price":24.7}' \
//    http://localhost:8080/products
//    
    @PostMapping("/products")
    public void add(@RequestBody Product product) {
        service.save(product);
    }
     
    // RESTful API method for Update operation
    	
    //curl -X PUT -H "Content-Type: application/json" -d '{"id":6,"name":"name6","price":666.66}' localhost:8080/products/{6}
    //El {id} lo utiliza para comprobar si existe ese registro. Si no existe marca error
    //Si existe el registro le pasa el Json completo.
    @PutMapping("/products/{id}")
    public ResponseEntity<?> update(@RequestBody Product product, @PathVariable Integer id) {
        try {
            Product existProduct = service.get(id);
            service.save(product);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
     
    // RESTful API method for Delete operation
    
    //curl -X DELETE localhost:8080/products/{8}
    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}