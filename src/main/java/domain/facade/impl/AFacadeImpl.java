package domain.facade.impl;

import domain.api.afaceade.AFacade;
import domain.api.afaceade.request.ARequest;
import domain.api.afaceade.response.AResponse;
import domain.core.application.a.AAppService;
import domain.core.application.a.model.AModel;
import domain.core.application.a.query.Aquery;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AFacadeImpl implements AFacade {


    @Autowired
    private AAppService aAppService;

    @Override
    public AResponse getA(ARequest request) {

        Aquery aq = new Aquery();
        BeanUtils.copyProperties(request,aq);
        AModel a = aAppService.getA(aq);

        AResponse ar = new AResponse();
        BeanUtils.copyProperties(a,ar);

        return ar;
    }
}
