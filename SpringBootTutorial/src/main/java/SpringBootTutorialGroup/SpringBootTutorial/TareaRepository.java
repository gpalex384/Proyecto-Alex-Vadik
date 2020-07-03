package SpringBootTutorialGroup.SpringBootTutorial;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Integer> {
 
}
