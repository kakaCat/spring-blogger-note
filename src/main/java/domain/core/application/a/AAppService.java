package domain.core.application.a;

import domain.core.application.a.model.AModel;
import domain.core.application.a.query.Aquery;

public interface AAppService {


    AModel getA(Aquery aquery);
}
