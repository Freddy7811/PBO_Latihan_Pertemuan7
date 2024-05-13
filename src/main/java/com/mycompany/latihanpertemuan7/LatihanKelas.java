/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.latihanpertemuan7;

import com.person.Person;

/**
 *
 * @author A-13
 */
public class LatihanKelas {
    public static void main(String[] args) {
        System.out.println("Latihan Kelas");
        String judulbuku1 = "Java 1";
        String authorbuku1 = "joko";
        String judulbuku2 = "Java 2";
        String authorbuku2 = "Andi";
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        buku1.judul = "Java 1";
        buku1.author.nama = "Joko dari buku 1";
        buku2.judul = "Java 2";
        buku2.author.nama = "Andi dari buku 2";
        
        System.out.println(buku1.judul);
        buku1.author.sebutNama();
        buku2.author.sebutNama();
        System.out.println(buku1.author);
        System.out.println(buku2.judul);
        buku2.author.sebutNama();
        System.out.println(buku2.author);
        System.out.println(buku2.tahunoenerbitan);
        System.out.println(buku2.harga.beli);
        System.out.println(buku2.penerbit.nama);
    }
    
}
class Buku {
    String judul;
    Person author = new Person();
    int tahunoenerbitan = 2024;
    Harga harga = new Harga();
    PerusahanBuku penerbit = new PerusahanBuku();
}

class Harga{
    double jual = 100000;
    double beli = 85000;
}

        
        