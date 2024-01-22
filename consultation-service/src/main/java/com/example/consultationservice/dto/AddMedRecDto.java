package com.example.consultationservice.dto;

public class AddMedRecDto {

    private String privateKey;

    private MedRecDto medRecDto;

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public MedRecDto getMedRecDto() {
        return medRecDto;
    }

    public void setMedRecDto(MedRecDto medRecDto) {
        this.medRecDto = medRecDto;
    }
}
