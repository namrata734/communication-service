package com.example.acko.rest;

import com.example.acko.entity.EmailTemplate;
import com.example.acko.request.CreateTemplateRequest;
import com.example.acko.service.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    public  AdminService adminService;

    @PostMapping("/addTemplate")
    public ResponseEntity<String> addEmailTemplate(@RequestBody CreateTemplateRequest createTemplateRequest) throws Exception {
        return ResponseEntity.ok(adminService.addEmailTemplate(createTemplateRequest));
    }

    @GetMapping("/getTemplate/{templatename}")
    public ResponseEntity<EmailTemplate> getEmailTemplate(@PathVariable (name = "templatename") String templateName) throws Exception {
        return ResponseEntity.ok(adminService.getEmailTemplate(templateName));
    }
}
