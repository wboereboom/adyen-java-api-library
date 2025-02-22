package com.adyen.service;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.model.legalEntityManagement.JSON;
import com.adyen.service.LegalEntityManagement.BusinessLineService;
import com.adyen.service.LegalEntityManagement.Documents;
import com.adyen.service.LegalEntityManagement.HostedOnboarding;
import com.adyen.service.LegalEntityManagement.LegalEntities;
import com.adyen.service.LegalEntityManagement.TransferInstruments;

public class LegalEntityManagementService extends Service {
    public LegalEntityManagementService(Client client) {
        super(client);
        new JSON();
    }

    public LegalEntities legalEntities = new LegalEntities(this.getClient());

    public TransferInstruments transferInstruments = new TransferInstruments(this.getClient());

    public BusinessLineService businessLineService = new BusinessLineService(this.getClient());

    public Documents documents = new Documents(this.getClient());

    public HostedOnboarding hostedOnboarding = new HostedOnboarding(this.getClient());
}
