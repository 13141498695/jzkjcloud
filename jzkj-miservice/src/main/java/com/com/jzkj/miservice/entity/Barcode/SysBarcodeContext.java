package com.com.jzkj.miservice.entity.Barcode;

public class SysBarcodeContext {
    private String id;

    private String barcodeName;

    private String barcodeUrl;

    private String barcodeCount;

    private String barcodeIp;

    private String barcodeAddress;

    private String ermId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBarcodeName() {
        return barcodeName;
    }

    public void setBarcodeName(String barcodeName) {
        this.barcodeName = barcodeName == null ? null : barcodeName.trim();
    }

    public String getBarcodeUrl() {
        return barcodeUrl;
    }

    public void setBarcodeUrl(String barcodeUrl) {
        this.barcodeUrl = barcodeUrl == null ? null : barcodeUrl.trim();
    }

    public String getBarcodeCount() {
        return barcodeCount;
    }

    public void setBarcodeCount(String barcodeCount) {
        this.barcodeCount = barcodeCount == null ? null : barcodeCount.trim();
    }

    public String getBarcodeIp() {
        return barcodeIp;
    }

    public void setBarcodeIp(String barcodeIp) {
        this.barcodeIp = barcodeIp == null ? null : barcodeIp.trim();
    }

    public String getBarcodeAddress() {
        return barcodeAddress;
    }

    public void setBarcodeAddress(String barcodeAddress) {
        this.barcodeAddress = barcodeAddress == null ? null : barcodeAddress.trim();
    }

    public String getErmId() {
        return ermId;
    }

    public void setErmId(String ermId) {
        this.ermId = ermId == null ? null : ermId.trim();
    }
}