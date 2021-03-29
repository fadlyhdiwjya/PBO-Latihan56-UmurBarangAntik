/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo5.pkg2022431708.latihan56.umur_barang_cantik;

/**
 *
 * @author HP
 */
public class Radio extends BarangAntik{
    
    private String name;
    
    public Radio(int umur){
        super(umur);
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
}
