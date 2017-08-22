package de.cofinpro.hackaton.registration.api;

public class DepotResponse {

    private String uuid;

    public DepotResponse() {
    }

    public DepotResponse(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
