package Ejercicio_Programa;

import java.time.LocalDate;

public class Software {
    private String name, version, empresaDesarrollo;
    private FuncionSoftware function;
    private Licence licence;
    private LocalDate lunchYear;
    private int softwarePrice;

    /**
     * @param name
     * @param version
     * @param empresaDesarrollo
     * @param funcion
     * @param lunchYear
     * @param licence
     * @param softwarePrice
     */
    public Software(String name, String version, FuncionSoftware function, LocalDate lunchYear,
                    String empresaDesarrollo, Licence licence, int softwarePrice) {
        super();
        this.name = name;
        this.version = version;
        this.empresaDesarrollo = empresaDesarrollo;
        this.function = function;
        this.lunchYear = lunchYear;
        this.licence = licence;
        this.softwarePrice = softwarePrice;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the empresaDesarrollo
     */
    public String getEmpresaDesarrollo() {
        return empresaDesarrollo;
    }

    /**
     * @param empresaDesarrollo the empresaDesarrollo to set
     */
    public void setEmpresaDesarrollo(String empresaDesarrollo) {
        this.empresaDesarrollo = empresaDesarrollo;
    }

    /**
     * @return the function
     */
    public FuncionSoftware getFunction() {
        return function;
    }

    /**
     * @param function the function to set
     */
    public void setFunction(FuncionSoftware function) {
        this.function = function;
    }

    /**
     * @return the licence
     */
    public Licence getLicence() {
        return licence;
    }

    /**
     * @param licence the licence to set
     */
    public void setLicence(Licence licence) {
        this.licence = licence;
    }

    /**
     * @return the lunchYear
     */
    public LocalDate getLunchYear() {
        return lunchYear;
    }

    /**
     * @param lunchYear the lunchYear to set
     */
    public void setLunchYear(LocalDate lunchYear) {
        this.lunchYear = lunchYear;
    }

    /**
     * @return the softwarePrice
     */
    public int getSoftwarePrice() {
        return softwarePrice;
    }

    /**
     * @param softwarePrice the softwarePrice to set
     */
    public void setSoftwarePrice(int softwarePrice) {
        this.softwarePrice = softwarePrice;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "; Version: " + version + "; Empresa Desarrollo: " + empresaDesarrollo
                + "; Funcion: " + function + "; Licencia: " + licence + "; Fecha de lanzamiento: " + lunchYear
                + "; Precio: " + softwarePrice + " $";

    }

    public boolean compareLicences(String licenceSearch) {
        boolean bandera = String.valueOf(licence).equalsIgnoreCase(licenceSearch);
        return bandera;
    }

    public boolean comparefunctions(String functionSearch) {
        boolean bandera = String.valueOf(function).equalsIgnoreCase(functionSearch);
        return bandera;
    }

    public boolean comparefunctionsWithTwoParametres(String functionSearch, String functionSearch2) {
        boolean bandera = String.valueOf(function).equalsIgnoreCase(functionSearch)
                || String.valueOf(function).equalsIgnoreCase(functionSearch2);
        return bandera;
    }
}
