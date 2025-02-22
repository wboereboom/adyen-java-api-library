package com.adyen.service.LegalEntityManagement;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.legalEntityManagement.Document;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.LegalEntityManagementResource;

import java.io.IOException;

public class Documents extends Service {
    public Documents(Client client) {
        super(client);
    }

    public Document create(Document request) throws IOException, ApiException {
        String jsonRequest = request.toJson();
        LegalEntityManagementResource resource = new LegalEntityManagementResource(this, "/documents");
        String jsonResult = resource.request(jsonRequest);
        return Document.fromJson(jsonResult);
    }

    public Document retrieve(String documentId) throws IOException, ApiException {
        LegalEntityManagementResource resource = new LegalEntityManagementResource(this, String.format("/documents/%s", documentId));
        String jsonResult = resource.request(null, ApiConstants.HttpMethod.GET);
        return Document.fromJson(jsonResult);
    }

    public Document update(String documentId, Document request) throws IOException, ApiException {
        String jsonRequest = request.toJson();
        LegalEntityManagementResource resource = new LegalEntityManagementResource(this, String.format("/documents/%s", documentId));
        String jsonResult = resource.request(jsonRequest, ApiConstants.HttpMethod.PATCH);
        return Document.fromJson(jsonResult);
    }

    public void delete(String documentId) throws IOException, ApiException {
        LegalEntityManagementResource resource = new LegalEntityManagementResource(this, String.format("/documents/%s", documentId));
        resource.request(null, ApiConstants.HttpMethod.DELETE);
    }
}
