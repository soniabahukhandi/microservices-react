package com.samsunggrowth.license.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Configuration
public class LicenseLanguageConfig {
    @Bean
    public LocaleResolver LocaleResolver()
    {
        SessionLocaleResolver sessionLocaleResolver=new SessionLocaleResolver();
        sessionLocaleResolver.setDefaultLocale(Locale.US);
        return sessionLocaleResolver;
    }
    @Bean
    public ResourceBundleMessageSource messageSource()
    {
        ResourceBundleMessageSource message=new ResourceBundleMessageSource();
        message.setUseCodeAsDefaultMessage(true);
        message.setBasename("messages");
        return message;
    }
}
