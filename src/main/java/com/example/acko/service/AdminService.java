package com.example.acko.service;

import com.example.acko.entity.EmailTemplate;
import com.example.acko.localDB.TemplateDB;
import com.example.acko.request.CreateTemplateRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AdminService {

    public final TemplateDB templateDB;

    public String addEmailTemplate(CreateTemplateRequest createTemplateRequest) throws Exception {

        EmailTemplate emailTemplate = EmailTemplate.builder()
                .TemplateData(createTemplateRequest.getTemplateData())
                .templateName(createTemplateRequest.getTemplateName())
                .build();

        templateDB.addEmailTemplate(emailTemplate, createTemplateRequest.getTemplateName());
        return "template added";
    }

    public EmailTemplate getEmailTemplate(String templateName) throws Exception {

       return templateDB.getEmailTemplate(templateName);
    }

    public void updateEmaiTemplate(String templateName, EmailTemplate emailTemplate) throws Exception {

        templateDB.updateEmailTemplate(templateName, emailTemplate);
    }


}
