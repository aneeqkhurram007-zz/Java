package com.bitspedia.Student;

public class PhoneNumber {
    public int countryCode;
    public int cityCode;
    public int lineNumber;

    public int getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getCityCode() {
        return this.cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public PhoneNumber(int countryCode, int cityCode, int lineNumber) {
        setCountryCode(countryCode);
        setCityCode(cityCode);
        setLineNumber(lineNumber);
    }

    public String toString() {
        return countryCode + "-" + cityCode + "-" + lineNumber;
    }
}
