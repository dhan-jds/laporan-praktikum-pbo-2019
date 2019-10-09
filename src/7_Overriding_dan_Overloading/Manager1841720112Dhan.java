/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet7;

/**
 *
 * @author Wildhan Juniar
 */
public class Manager1841720112Dhan extends Karyawan1841720112Dhan {
    
    private double tunjangan;
    private String bagian;
    private Staff1841720112Dhan st[];
    
    public void setTunjanganDhan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    public double getTunjanganDhan() {
        return tunjangan;
    }
    
    public void setBagianDhan(String bagian) {
        this.bagian = bagian;
    }
    
    public String getBagianDhan() {
        return bagian;
    }
    
    public void setStaffDhan(Staff1841720112Dhan st[]) {
        this.st = st;
    }
    
    public void viewStaffDhan() {
        int i;
        System.out.println("-------------------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfoDhan();    
        }
        System.out.println("-------------------------");
    }
    
    public void lihatInfoDhan() {
        System.out.println("Manager : " + this.getBagianDhan());
        System.out.println("NIP : " + this.getNipDhan());
        System.out.println("Nama : " + this.getNamaDhan());
        System.out.println("Golongan : " + this.getGolonganDhan());
        System.out.printf("Tunjangan : %.0f\n", this.getTunjanganDhan());
        System.out.printf("Gaji : %.0f\n",this.getGajiDhan());
        System.out.println("Bagian : " + this.getBagianDhan());
        this.viewStaffDhan();
    }

    @Override
    public double getGajiDhan() {
        return super.getGajiDhan() + tunjangan;
    }    
}