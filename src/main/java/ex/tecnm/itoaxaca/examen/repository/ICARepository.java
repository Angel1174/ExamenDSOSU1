package ex.tecnm.itoaxaca.examen.repository;

import org.springframework.stereotype.Repository;
import ex.tecnm.itoaxaca.examen.models.ICAModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author angel
 */
@Repository
public interface ICARepository extends JpaRepository<ICAModel, String> {
    public ICAModel findBynumControl(String nunControl);
}
