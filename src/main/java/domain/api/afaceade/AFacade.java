package domain.api.afaceade;

import domain.api.afaceade.request.ARequest;
import domain.api.afaceade.response.AResponse;

public interface AFacade {

    AResponse getA(ARequest request);

}
