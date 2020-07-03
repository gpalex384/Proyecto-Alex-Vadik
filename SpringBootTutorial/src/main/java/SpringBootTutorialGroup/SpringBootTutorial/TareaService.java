package SpringBootTutorialGroup.SpringBootTutorial;

import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
@Transactional
public class TareaService {
 
    @Autowired
    private TareaRepository repo;
     
    public List<Tarea> listAll() {
        return repo.findAll();
    }
     
    public void save(Tarea tarea) {
        repo.save(tarea);
    }
     
    public Tarea get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
