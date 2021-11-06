package Condos;

import Condos.Config.ComponentConfig;
import Condos.services.POService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testText {
    private static POService service;

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentConfig.class);
        service = context.getBean(POService.class);
        System.out.println(service.getAll().get(0).getAddress_PO());
    }
}
