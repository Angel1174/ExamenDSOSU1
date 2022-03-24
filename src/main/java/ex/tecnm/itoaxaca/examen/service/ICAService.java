package ex.tecnm.itoaxaca.examen.service;

import ex.tecnm.itoaxaca.examen.models.ICAModel;
import java.util.List;

/**
 *
 * @author angel
 */
public interface ICAService {
    public void createICA(ICAModel ica);
    public List getAlumno();
    public ICAModel getICA(String numControl);
    public void updateIca(ICAModel icaModel,String numControl);
    public void deleteAlumn(String numControl);
}
