package pt.ipleiria.estg.dei.ei.dae.academics.ejbs;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;

@Startup
@Singleton
public class ConfigBean {
    @EJB
    StudentBean studentBean;

    @PostConstruct
    public void populateDB() {
        studentBean.create("Pedro", "123", "Pedro", "Pedro@Pedro.com");
    }
} 