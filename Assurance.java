/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author Jerry
 */
public class Assurance {
    private String prenom;
    private String nom;
    private char sexe;
    private int age;
    private String telNum;
    private String adresse;
    private String email;
    private int vecYear;
    private String vecMake;
    private String vecMod;
    private int kmPerYr;
    private Boolean[] driverSit = new  Boolean[6];
    private Boolean[] sysAntiVol = new Boolean[6];
    private Boolean bundle;
    private double prime;

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the sexe
     */
    public char getSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the telNum
     */
    public String getTelNum() {
        return telNum;
    }

    /**
     * @param telNum the telNum to set
     */
    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the vecYear
     */
    public int getVecYear() {
        return vecYear;
    }

    /**
     * @param vecYear the vecYear to set
     */
    public void setVecYear(int vecYear) {
        this.vecYear = vecYear;
    }

    /**
     * @return the vecMake
     */
    public String getVecMake() {
        return vecMake;
    }

    /**
     * @param vecMake the vecMake to set
     */
    public void setVecMake(String vecMake) {
        this.vecMake = vecMake;
    }

    /**
     * @return the vecMod
     */
    public String getVecMod() {
        return vecMod;
    }

    /**
     * @param vecMod the vecMod to set
     */
    public void setVecMod(String vecMod) {
        this.vecMod = vecMod;
    }

    /**
     * @return the kmPerYr
     */
    public int getKmPerYr() {
        return kmPerYr;
    }

    /**
     * @param kmPerYr the kmPerYr to set
     */
    public void setKmPerYr(int kmPerYr) {
        this.kmPerYr = kmPerYr;
    }

    /**
     * @return the driverSit
     */
    public Boolean[] getDriverSit() {
        return driverSit;
    }

    /**
     * @param driverSit the driverSit to set
     */
    public void setDriverSit(Boolean[] driverSit) {
        this.driverSit = driverSit;
    }

    /**
     * @return the sysAntiVol
     */
    public Boolean[] getSysAntiVol() {
        return sysAntiVol;
    }

    /**
     * @param sysAntiVol the sysAntiVol to set
     */
    public void setSysAntiVol(Boolean[] sysAntiVol) {
        this.sysAntiVol = sysAntiVol;
    }

    /**
     * @return the bundle
     */
    public Boolean getBundle() {
        return bundle;
    }

    /**
     * @param bundle the bundle to set
     */
    public void setBundle(Boolean bundle) {
        this.bundle = bundle;
    }

    /**
     * @return the prime
     */
    public double getPrime() {
        return prime;
    }

    /**
     * @param prime the prime to set
     */
    public void setPrime(double prime) {
        this.prime = prime;
    }
       
}
