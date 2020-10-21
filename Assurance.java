/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Jerry
 */
public class Assurance {

    private String prenom;
    private String nom;
    private char sexe;
    private String ddn;
    private int age;
    private String telNum;
    private String adresse;
    private String email;
    private String vecYear;
    private int vecYI;
    private String vecMake;
    private String vecMod;
    private String kmPerYr;
    private int kmPerI;
    private Boolean[] driverSit = new Boolean[6];
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
     * @return the ddn
     */
    public String getDdn() {
        return ddn;
    }

    /**
     * @param ddn the ddn to set
     */
    public void setDdn(String ddn) {
        this.ddn = ddn;
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
    public String getVecYear() {
        return vecYear;
    }

    /**
     * @param vecYear the vecYear to set
     */
    public void setVecYear(String vecYear) {
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
    public String getKmPerYr() {
        return kmPerYr;
    }

    /**
     * @param kmPerYr the kmPerYr to set
     */
    public void setKmPerYr(String kmPerYr) {
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
     * @return the kmPerI
     */
    public int getKmPerI() {
        return kmPerI;
    }

    /**
     * @param kmPerI the kmPerI to set
     */
    public void setKmPerI(int kmPerI) {
        this.kmPerI = kmPerI;
    }

    /**
     * @return the vecYI
     */
    public int getVecYI() {
        return vecYI;
    }

    /**
     * @param vecYI the vecYI to set
     */
    public void setVecYI(int vecYI) {
        this.vecYI = vecYI;
    }

    /**
     *
     */
    public void calcPrime() {
        double ini;
        double pSexe = 0.0;
        double pAntiV;
        double pSit = 0.0;
        double pKM;
        double pHabi = 0.0;

        if (this.age <= 20) {
            ini = 500.0;
        } else if (this.age <= 25) {
            ini = 450.0;
        } else if (this.age <= 30) {
            ini = 400.0;
        } else if (this.age <= 40) {
            ini = 350.0;
        } else if (this.age <= 50) {
            ini = 300.0;
        } else if (this.age <= 60) {
            ini = 250;
        } else if (this.age <= 70) {
            ini = 200.0;
        } else {
            ini = 100.0;
        }

        if (this.getSexe() == 'm') {
            pSexe = ini * 0.15;
        }

        Boolean[] antiVol = this.getSysAntiVol();
        if (antiVol[5] == true) {
            pAntiV = 0.0;
        } else {
            int c = 0;
            for (int i = 0; i < 5; i++) {
                if (antiVol[i] == true) {
                    c++;
                }
            }
            pAntiV = ini * (0.05 * c);
        }

        Boolean[] sit = this.getDriverSit();
        for (int i = 0; i < 5; i++) {
            if (sit[i] == true) {
                pSit = ini * 0.3;
                break;
            }
        }

        pKM = ini * (this.getKmPerI() * 10.0 / 100.0);
        
        if(this.getVecYI() != 5){
            
        }
        
        ini = ini + pSexe + pKM + pSit - pAntiV;
        
        if(this.getBundle() == true){
            ini *= 0.8;
        }        
        
        this.setPrime(ini);
    }

    /**
     *
     */
    public void print() {
        System.out.print("Soumission du ");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        System.out.println("");
        System.out.printf("Prenom : %s\n", this.getPrenom());
        System.out.printf("Nom : %s\n", this.getNom());
        if (this.getSexe() == 'm') {
            System.out.println("Sexe : Homme");
        } else {
            System.out.println("Sexe : Femme");
        }
        System.out.printf("Date de naissance : %s\n", this.getDdn());
        System.out.printf("Age : %d\n", this.getAge());
        System.out.printf("# Tele : %s\n", this.getTelNum());
        System.out.printf("Adresse : %s\n", this.getAdresse());
        System.out.printf("Courriel : %s\n", this.getEmail());
        System.out.println("");
        System.out.println("Info du vechicule");
        System.out.printf("Annee : %s\n", this.getVecYear());
        System.out.printf("Marque : %s\n", this.getVecMake());
        System.out.printf("Model : %s\n", this.getVecMod());
        System.out.printf("KM : %s\n", this.getKmPerYr());
        System.out.println("Systems antivols");
        Boolean[] antiVol = this.getSysAntiVol();
        System.out.printf("Alarme: %b\n", antiVol[0]);
        System.out.printf("AntiDem: %b\n", antiVol[1]);
        System.out.printf("Marquage: %b\n", antiVol[2]);
        System.out.printf("System: %b\n", antiVol[3]);
        System.out.printf("Autre: %b\n", antiVol[4]);
        System.out.printf("Aucun: %b\n", antiVol[5]);
        System.out.println("");
        System.out.println("Situations");
        Boolean[] sit = this.getDriverSit();
        System.out.printf("3 c/v: %b\n", sit[0]);
        System.out.printf("Suspension: %b\n", sit[1]);
        System.out.printf("Dossier: %b\n", sit[2]);
        System.out.printf("Refusee: %b\n", sit[3]);
        System.out.printf("Apprenti: %b\n", sit[4]);
        System.out.printf("$100k+: %b\n", sit[5]);
        System.out.println("");
        System.out.printf("Bundle: %b\n", this.getBundle());

        System.out.println("");
        System.out.printf("Prime total : %f\n", this.getPrime());

    }

}
