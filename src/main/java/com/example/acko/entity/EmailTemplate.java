package com.example.acko.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmailTemplate {
    String templateName;
    String TemplateData;
}
