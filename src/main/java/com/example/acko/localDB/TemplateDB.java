package com.example.acko.localDB;

import com.example.acko.entity.EmailTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TemplateDB {
    Map<String, EmailTemplate> emailTemplateMap = new HashMap<>();

    public void addEmailTemplate(EmailTemplate emailTemplate, String templateName) throws Exception {
        if(emailTemplateMap.containsKey(templateName)){
            throw new Exception("already having template");
        }
        emailTemplateMap.put(templateName, emailTemplate);
    }

    public  EmailTemplate getEmailTemplate(String templateName) throws Exception {
        if(emailTemplateMap.containsKey(templateName)){
            return emailTemplateMap.get(templateName);
        }
        throw new Exception("template not found");
    }

    public void updateEmailTemplate(String templateName, EmailTemplate emailTemplate) throws Exception {
        if(emailTemplateMap.containsKey(templateName)){
            emailTemplateMap.put(templateName, emailTemplate);
        }
        throw new Exception("template not found");
    }
}
