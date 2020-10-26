/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Class primaire pour entree les donnees de l'interface
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
     * Methode pour retourner le prenom
     *
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Methode pour assigner le prenom
     *
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Methode pour retourner le nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Methode pour assigner le nom
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Methode pour retourner le sex, soit m ou f
     *
     * @return the sexe
     */
    public char getSexe() {
        return sexe;
    }

    /**
     * Methode pour assigner le sexe
     *
     * @param sexe the sexe to set
     */
    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    /**
     * Methode pour retourner la date de naissance
     *
     * @return the ddn
     */
    public String getDdn() {
        return ddn;
    }

    /**
     * Methode pour assigner la date de naissance, yyyy-mm-dd
     *
     * @param ddn the ddn to set
     */
    public void setDdn(String ddn) {
        this.ddn = ddn;
    }

    /**
     * Methode pour retourner le numero de telephone
     *
     * @return the telNum
     */
    public String getTelNum() {
        return telNum;
    }

    /**
     * Methode pour assigner le numero de telephone, ###-###-####
     *
     * @param telNum the telNum to set
     */
    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    /**
     * Methode pour retourner l'adresse
     *
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Methode pour assigner l'adresse
     *
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Methode pour retourner l'adresse courriel
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Methode pour assigner l'adresse courriel
     *
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Methode pour retourner l'annee du vehicule
     *
     * @return the vecYear
     */
    public String getVecYear() {
        return vecYear;
    }

    /**
     * Methode pour assigner l'annee du vehicule
     *
     * @param vecYear the vecYear to set
     */
    public void setVecYear(String vecYear) {
        this.vecYear = vecYear;
    }

    /**
     * Methode pour retourner la marque du vehicule
     *
     * @return the vecMake
     */
    public String getVecMake() {
        return vecMake;
    }

    /**
     * Methode pour assigner la marque du vehicule
     *
     * @param vecMake the vecMake to set
     */
    public void setVecMake(String vecMake) {
        this.vecMake = vecMake;
    }

    /**
     * Methode pour retourner le model du vehicule
     *
     * @return the vecMod
     */
    public String getVecMod() {
        return vecMod;
    }

    /**
     * Methode pour assigner le model du vehicule
     *
     * @param vecMod the vecMod to set
     */
    public void setVecMod(String vecMod) {
        this.vecMod = vecMod;
    }

    /**
     * Methode pour reyourner le nombre de KM/annee
     *
     * @return the kmPerYr
     */
    public String getKmPerYr() {
        return kmPerYr;
    }

    /**
     * Methode pour assigner le nombre de KM/annee
     *
     * @param kmPerYr the kmPerYr to set
     */
    public void setKmPerYr(String kmPerYr) {
        this.kmPerYr = kmPerYr;
    }

    /**
     * Methode pour retourner un array[6] de bool pour la situation du
     * conducteur
     *
     * @return the driverSit
     */
    public Boolean[] getDriverSit() {
        return driverSit;
    }

    /**
     * Methode pour assigner un array[6] de bool pour la situation du conducteur
     *
     * @param driverSit the driverSit to set
     */
    public void setDriverSit(Boolean[] driverSit) {
        this.driverSit = driverSit;
    }

    /**
     * Methode pour retourner un array[6] de bool pour les systems antivols de
     * vehicule
     *
     * @return the sysAntiVol
     */
    public Boolean[] getSysAntiVol() {
        return sysAntiVol;
    }

    /**
     * Methode pour assigner un array[6] de bool pour les systems antivols de
     * vehicule
     *
     * @param sysAntiVol the sysAntiVol to set
     */
    public void setSysAntiVol(Boolean[] sysAntiVol) {
        this.sysAntiVol = sysAntiVol;
    }

    /**
     * Methode pour retourner le rabais
     *
     * @return the bundle
     */
    public Boolean getBundle() {
        return bundle;
    }

    /**
     * Methode pour assigner le rabais
     *
     * @param bundle the bundle to set
     */
    public void setBundle(Boolean bundle) {
        this.bundle = bundle;
    }

    /**
     * Methode pour retourner la prime d'assurance
     *
     * @return the prime
     */
    public double getPrime() {
        return prime;
    }

    /**
     * Methode pour assigner la prime d'assurance
     *
     * @param prime the prime to set
     */
    public void setPrime(double prime) {
        this.prime = prime;
    }

    /**
     * Methode pour retourner l'age
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Methode pour retourner l'age
     *
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Methode pour retourner l'index du KM/annee
     *
     * @return the kmPerI
     */
    public int getKmPerI() {
        return kmPerI;
    }

    /**
     * Methode pour assigner l'index du KM/annee
     *
     * @param kmPerI the kmPerI to set
     */
    public void setKmPerI(int kmPerI) {
        this.kmPerI = kmPerI;
    }

    /**
     * Methode pour retourner l'index de l'annee du vehicule
     *
     * @return the vecYI
     */
    public int getVecYI() {
        return vecYI;
    }

    /**
     * Methode pour assigner l'index de l'annee du vehicule
     *
     * @param vecYI the vecYI to set
     */
    public void setVecYI(int vecYI) {
        this.vecYI = vecYI;
    }

    /**
     * Methode pour calculer la prime d'assurance. Quand calcule, on met le
     * montant dans la prime
     */
    public void calcPrime() {
        double pIni;
        double pSexe = 0.0;
        double pAntiV;
        double pSit = 0.0;
        double pKM;
        double pVec = 0.0;

        if (this.age <= 20) {
            pIni = 500.0;
        } else if (this.age <= 25) {
            pIni = 450.0;
        } else if (this.age <= 30) {
            pIni = 400.0;
        } else if (this.age <= 40) {
            pIni = 350.0;
        } else if (this.age <= 50) {
            pIni = 300.0;
        } else if (this.age <= 60) {
            pIni = 250;
        } else if (this.age <= 70) {
            pIni = 200.0;
        } else {
            pIni = 100.0;
        }

        if (this.getSexe() == 'm') {
            pSexe = pIni * 0.15;
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
            pAntiV = pIni * (0.05 * c);
        }

        Boolean[] sit = this.getDriverSit();
        for (int i = 0; i < 5; i++) {
            if (sit[i] == true) {
                pSit = pIni * 0.3;
                break;
            }
        }

        pKM = pIni * (this.getKmPerI() * 10.0 / 100.0);

        if (this.getVecYI() < 5) {

            String toL = this.getVecMake().toLowerCase();
            String oFile = "voitures/" + toL + "_modeles.txt";

            InputStream is = null;
            BufferedReader br = null;

            ArrayList<String> inp = new ArrayList<String>();
            String str[] = null;
            is = Assurance.class.getResourceAsStream(oFile);
            br = new BufferedReader(new InputStreamReader(is));
            String line;
            try {
                while (null != (line = br.readLine())) {
                    inp.add(line);
                    for (String st : inp) {
                        str = st.split(" ");
                    }
                    int i = 0;
                    for (String st : str) {
                        if (st.matches(this.getVecMod())) {
                            pVec = Double.parseDouble(str[i + 1]);
                            break;
                        }
                        i++;
                    }
                }
            } catch (IOException ex) {
                System.out.println(ex);
            }

            pVec *= ((10 - (2 * this.getVecYI())) / 100.0);
            try {
                br.close();
                is.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }

        }

        double pTotal;
        pTotal = pIni + pSexe + pVec + pKM + pSit - pAntiV;

        if (this.getBundle() == true) {
            pTotal *= 0.8;
        }

        this.setPrime(pTotal);
    }

    /**
     * Methode pour imprimer les donnees dans un ficher "soumission.txt"
     */
    public void print() {

        String iFile = "soumission.txt";

        try {
            FileWriter outP = new FileWriter(iFile, false);
            PrintWriter outPrint = new PrintWriter(outP);

            outPrint.print("Soumission du ");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDateTime now = LocalDateTime.now();
            outPrint.println(dtf.format(now));
            outPrint.println("");
            outPrint.printf("Prenom : %s\n", this.getPrenom());
            outPrint.printf("Nom : %s\n", this.getNom());
            if (this.getSexe() == 'm') {
                outPrint.println("Sexe : Homme");
            } else {
                outPrint.println("Sexe : Femme");
            }
            outPrint.printf("Date de naissance : %s\n", this.getDdn());
            outPrint.printf("Age : %d\n", this.getAge());
            outPrint.printf("# Tele : %s\n", this.getTelNum());
            outPrint.printf("Adresse : %s\n", this.getAdresse());
            outPrint.printf("Courriel : %s\n", this.getEmail());
            outPrint.println("");
            outPrint.println("Info du vechicule");
            outPrint.printf("Annee : %s\n", this.getVecYear());
            outPrint.printf("Marque : %s\n", this.getVecMake());
            outPrint.printf("Model : %s\n", this.getVecMod());
            outPrint.printf("KM par annee : %s\n", this.getKmPerYr());
            outPrint.println("Systems antivols");
            Boolean[] antiVol = this.getSysAntiVol();
            outPrint.printf("Alarme: %b\n", antiVol[0]);
            outPrint.printf("AntiDem: %b\n", antiVol[1]);
            outPrint.printf("Marquage: %b\n", antiVol[2]);
            outPrint.printf("System: %b\n", antiVol[3]);
            outPrint.printf("Autre: %b\n", antiVol[4]);
            outPrint.printf("Aucun: %b\n", antiVol[5]);
            outPrint.println("");
            outPrint.println("Situations");
            Boolean[] sit = this.getDriverSit();
            outPrint.printf("3 c/v: %b\n", sit[0]);
            outPrint.printf("Suspension: %b\n", sit[1]);
            outPrint.printf("Dossier: %b\n", sit[2]);
            outPrint.printf("Refusee: %b\n", sit[3]);
            outPrint.printf("Apprenti: %b\n", sit[4]);
            outPrint.printf("$100k+: %b\n", sit[5]);
            outPrint.println("");
            outPrint.printf("Bundle: %b\n", this.getBundle());
            outPrint.println("");
            outPrint.printf("Prime total : %.2f\n", this.getPrime());

            outPrint.close();
            outP.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * Methode pour informer utilisateur le prime calculer
     */
    public void displayPrime() {
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, "Avec l'information, votre prime d'assurance est $" + this.getPrime());
    }

}
