package io.berkel.genericqueries.model;

public class City {

    private String name;
    private String countryCode;
    private String district;
    private Integer population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Override
    public String toString() {

        final StringBuffer sb = new StringBuffer("City{");
        sb.append("name='").append(name).append('\'');
        sb.append(", countryCode='").append(countryCode).append('\'');
        sb.append(", district='").append(district).append('\'');
        sb.append(", population=").append(population);
        sb.append('}');
        return sb.toString();

    }

}
