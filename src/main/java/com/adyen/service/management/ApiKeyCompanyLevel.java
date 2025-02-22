/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.service.management;

import com.adyen.ApiKeyAuthenticatedService;
import com.adyen.Client;
import com.adyen.constants.ApiConstants;
import com.adyen.model.management.JSON;
import com.adyen.model.management.GenerateApiKeyResponse;
import com.adyen.model.management.RestServiceError;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.ManagementResource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ApiKeyCompanyLevel extends ApiKeyAuthenticatedService {
    public ApiKeyCompanyLevel(Client client) {
        super(client);
        new JSON();
    }

    /**
     * Generate new API key
     *
     * @param companyId The unique identifier of the company account. (required)
     * @param apiCredentialId Unique identifier of the API credential. (required)
     * @return GenerateApiKeyResponse
     * @throws ApiException if fails to make API call
     */
    public GenerateApiKeyResponse postCompaniesCompanyIdApiCredentialsApiCredentialIdGenerateApiKey(String companyId, String apiCredentialId) throws ApiException, IOException {
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId'", 400);
        }
        if (apiCredentialId == null) {
            throw new ApiException("Missing the required parameter 'apiCredentialId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("companyId", companyId);
        pathParams.put("apiCredentialId", apiCredentialId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/companies/{companyId}/apiCredentials/{apiCredentialId}/generateApiKey");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.POST, pathParams);
        return GenerateApiKeyResponse.fromJson(jsonResult);
    }
    
}
